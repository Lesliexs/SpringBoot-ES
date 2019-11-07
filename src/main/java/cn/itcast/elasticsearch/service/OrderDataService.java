package cn.itcast.elasticsearch.service;

import cn.itcast.elasticsearch.dao.OrderDataRepository;
import cn.itcast.elasticsearch.pojo.OrderData;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.bucket.terms.StringTerms;
import org.elasticsearch.search.aggregations.metrics.sum.InternalSum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.aggregation.AggregatedPage;
import org.springframework.data.elasticsearch.core.query.FetchSourceFilter;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDataService {
    @Autowired
    private OrderDataRepository orderDataRepository;
    public String testSubAgg(){

        NativeSearchQueryBuilder queryBuilder = new NativeSearchQueryBuilder();
        // 不查询任何结果
        queryBuilder.withSourceFilter(new FetchSourceFilter(new String[]{""}, null));
        // 1、添加一个新的聚合，聚合类型为terms，聚合名称为brands，聚合字段为brand
        queryBuilder.addAggregation(
                AggregationBuilders.terms("name").field("factory_name")
                        .subAggregation(AggregationBuilders.sum("nums").field("num")) // 在品牌聚合桶内进行嵌套聚合，求总数
        );
        // 2、查询,需要把结果强转为AggregatedPage类型
        AggregatedPage<OrderData> aggPage = (AggregatedPage<OrderData>) this.orderDataRepository.search(queryBuilder.build());
        // 3、解析
        // 3.1、从结果中取出名为brands的那个聚合，
        // 因为是利用String类型字段来进行的term聚合，所以结果要强转为StringTerm类型
        StringTerms agg = (StringTerms) aggPage.getAggregation("name");
        // 3.2、获取桶
        List<StringTerms.Bucket> buckets = agg.getBuckets();
        // 3.3、遍历
        for (StringTerms.Bucket bucket : buckets) {
            // 3.4、获取桶中的key，即品牌名称  3.5、获取桶中的文档数量
            System.out.println(bucket.getKeyAsString() + "，共" + bucket.getDocCount() + "单");

            // 3.6.获取子聚合结果：
            InternalSum sum = (InternalSum) bucket.getAggregations().asMap().get("nums");
            System.out.println("总台数：" + sum.getValue());
        }
        return agg.toString();

    }
}
