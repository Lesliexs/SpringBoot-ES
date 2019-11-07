package cn.itcast.elasticsearch.service;

import cn.itcast.elasticsearch.dao.*;
import cn.itcast.elasticsearch.pojo.JtSelfRegisterDay;
import cn.itcast.elasticsearch.pojo.OrderImes;
import cn.itcast.elasticsearch.pojo.Register;
import cn.itcast.elasticsearch.pojo.Test;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestTimeService {
    @Autowired(required = false)
    private OrderImesRepository orderImesRepository;
    @Autowired(required = false)
    private ElasticsearchTemplate elasticsearchTemplate;
    @Autowired(required = false)
    private RegisterRepository registerRepository;
    public List<Register> testTimeQuery(){

      //  Iterable<OrderImes> Ot = this.orderImesRepository.findAll();
       // items.forEach(item-> System.out.println(item));
        NativeSearchQueryBuilder queryBuilder = new NativeSearchQueryBuilder();
        queryBuilder.withQuery(QueryBuilders.rangeQuery("order_time").gt("2016-11-01T00:00:00.000Z"));

        // 初始化分页参数
        int page =50;
        int size =3000;


        // 设置分页参数
        queryBuilder.withPageable(PageRequest.of(page, size));
        // 执行搜索，获取结果
        Page<OrderImes> Ot = this.orderImesRepository.search(queryBuilder.build());
        List<Register> Rt = new ArrayList<Register>();
        System.out.println(Ot.getTotalElements());
        // List<Page<Test>> Lt=new ArrayList<Page<Test> >();

        // Page<JtSelfRegisterDay> Jt = this.jtSelfRegisterDayRepository.search(queryBuilder.build());

        for (OrderImes O:Ot)
        {
            SearchQuery searchQuery1=new NativeSearchQueryBuilder().withQuery(QueryBuilders.matchQuery("meid",O.getImes())).build();
            //System.out.println(J.getRow_id().getClass());
            List<Register>  Te = elasticsearchTemplate.queryForList(searchQuery1, Register.class);
            //System.out.println(Te.size());
            for (int i = 0; i <Te.size() ; i++) {
                Rt.add(Te.get(i));
            }

        }
        System.out.println(Rt.size());


        return Rt;


    }


    public Page<OrderImes> testQuery(){
        NativeSearchQueryBuilder queryBuilder = new NativeSearchQueryBuilder();
        queryBuilder.withQuery(QueryBuilders.rangeQuery("order_time").gt("2017-03-01T14:12:18.000Z"));
        //queryBuilder.withQuery(QueryBuilders.matchQuery("order_time","2017-03-23T22:01:01.000Z"));


        // 初始化分页参数
       /* int page =50;
        int size =100;


        // 设置分页参数
        queryBuilder.withPageable(PageRequest.of(page, size));*/
        // 执行搜索，获取结果
        Page<OrderImes> Ot = this.orderImesRepository.search(queryBuilder.build());

        System.out.println(Ot.getTotalElements());

        return Ot;


    }
}
