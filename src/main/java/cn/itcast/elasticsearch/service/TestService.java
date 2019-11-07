package cn.itcast.elasticsearch.service;

import cn.itcast.elasticsearch.dao.JtSelfRegisterDayRepository;
import cn.itcast.elasticsearch.dao.OrderDataRepository;
import cn.itcast.elasticsearch.dao.RegisterRepository;
import cn.itcast.elasticsearch.dao.TestRepository;
import cn.itcast.elasticsearch.pojo.JtSelfRegisterDay;
import cn.itcast.elasticsearch.pojo.Register;
import cn.itcast.elasticsearch.pojo.Test;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.assertj.core.util.Lists;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@Service
public class TestService {
    @Autowired(required = false)
    private TestRepository testRepository;
    @Autowired(required =false)
    private JtSelfRegisterDayRepository jtSelfRegisterDayRepository;
    @Autowired(required = false)
    private ElasticsearchTemplate elasticsearchTemplate;
    @Autowired(required = false)
    private OrderDataRepository orderDataRepository;
    @Autowired(required = false)
    private RegisterRepository registerRepository;




    public List<Test> testDoubleQuery(){
        NativeSearchQueryBuilder queryBuilder = new NativeSearchQueryBuilder();
        // 添加基本的分词查询
        //queryBuilder.withQuery(QueryBuilders.termQuery("gather_day", "20170727"));

     /*    组合查询
        must(QueryBuilders) :   AND
        mustNot(QueryBuilders): NOT
        should:                  : OR*/
        queryBuilder.withQuery(QueryBuilders.boolQuery().must(QueryBuilders.termQuery("gather_day", "20170727"))
                .must(QueryBuilders.matchQuery("city","无锡")).filter(QueryBuilders.matchQuery("month","07")));



        //queryBuilder.withQuery(QueryBuilders.matchQuery("city", "无锡"));
        //queryBuilder.withQuery(QueryBuilders.moreLikeThisQuery({);

        // 初始化分页参数
     /*   int page1 = 0;
        int size1 = 10;*/
        int page =50;
        int size =100;


        // 设置分页参数
        queryBuilder.withPageable(PageRequest.of(page, size));

        // 执行搜索，获取结果
        Page<JtSelfRegisterDay> Jt = this.jtSelfRegisterDayRepository.search(queryBuilder.build());
        List<Test> Lt = new ArrayList<Test>();
        System.out.println(Jt.getTotalElements());
       // List<Page<Test>> Lt=new ArrayList<Page<Test> >();

       // Page<JtSelfRegisterDay> Jt = this.jtSelfRegisterDayRepository.search(queryBuilder.build());

        for (JtSelfRegisterDay J:Jt)
        {
           /*  System.out.println(J.getRow_id());
            List<Test> Te=this.testRepository.findAllByrowId(J.getRow_id());
            if(Te.size()==1){
                Lt.add(Te.get(0).toString());
            }*/
          //  queryBuilder.withQuery(QueryBuilders.matchQuery("row_id",J.getRow_id()));
           //  SearchQuery searchQuery = (SearchQuery) new NativeSearchQueryBuilder().withQuery(QueryBuilders.matchQuery("row_id",J.getRow_id()));
            SearchQuery searchQuery1=new NativeSearchQueryBuilder().withQuery(QueryBuilders.matchQuery("row_id",J.getRow_id())).build();
            //System.out.println(J.getRow_id().getClass());
            List<Test>  Te = elasticsearchTemplate.queryForList(searchQuery1, Test.class);
            System.out.println(Te.size());
            for (int i = 0; i <Te.size() ; i++) {
                Lt.add(Te.get(i));
            }

        }
        System.out.println(Lt);
        return Lt;


    }


    public void fortestQuery(){
        NativeSearchQueryBuilder queryBuilder = new NativeSearchQueryBuilder();
        queryBuilder.withQuery(QueryBuilders.boolQuery().must(QueryBuilders.termQuery("order_num", "20171023132310164")));

        // 初始化分页参数
       /* int page =50;
        int size =100;*/

        // 设置分页参数
      //  queryBuilder.withPageable(PageRequest.of(page, size));

        // 执行搜索，获取结果
        Page<Register> Jt = this.registerRepository.search(queryBuilder.build());
        List<Test> Lt = new ArrayList<Test>();
        System.out.println(Jt.getTotalElements());


    }



    public Iterable<Test> testQuery(){
        // 词条查询
        // MatchQueryBuilder queryBuilder = QueryBuilders.matchQuery("gather_day","20170727");
        MatchQueryBuilder queryBuilder = QueryBuilders.matchQuery("city","无锡");
        // 执行查询
        Iterable<Test> Jt = this.testRepository.search(queryBuilder);
        Jt.forEach(System.out::println);
        return Jt;
    }
    //   Page<Test> Te = this.testRepository.search(queryBuilder.build());
    //  List<Test> T1=Te.getContent();




           /* System.out.println(T1.size());
            if(T1.size()==1){
                Lt.add(T1.get(0));
            }*/
    // System.out.println(Te.getTotalElements());
           /* while(Te.hasNext()){
                Lt.add(Te.iterator().toString());
            }*/




          /*  if(Te.getTotalElements()==1){
               // Test T1=Te.iterator().next();
                //Lt.add(Te.stream().toString());
                Lt.add(Te);

            }*/



           /* if(Te.getTotalElements()==1L){
                List<Test> Te1=Te.getContent();
                System.out.println(Te1.size());
                Lt.add(Te1.get(0));
                //System.out.println(Te.iterator().next());

            }*/

           /* Iterable<Test> Te = this.testRepository.search(queryBuilder.build());
            System.out.println(Te.toString());

            Iterator<Test> Te1 = Te.iterator();
            List<Test> myList = Lists.newArrayList(Te1);
            System.out.println(myList.size());
            for (int i = 0; i <myList.size() ; i++) {
                Lt.add(myList.get(i));
            }*/


    //System.out.println(Te.);

    //Page<Test> Te =  this.testRepository.search(queryBuilder.build());
          /*  while(Te.iterator().hasNext()){
                Lt.add(Te.iterator().next());
            }*/
    //Lt.add(Te);


}
