package cn.itcast.elasticsearch.service;

import cn.itcast.elasticsearch.dao.JtSelfRegisterDayRepository;
import cn.itcast.elasticsearch.pojo.JtSelfRegisterDay;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExService {
    @Autowired
    private JtSelfRegisterDayRepository jtSelfRegisterDayRepository;

    public List<JtSelfRegisterDay> queryByCityAndMonth() {
        return this.jtSelfRegisterDayRepository.findByCityAndMonth("南通","09");
    }
   /* public List<JtSelfRegisterDay> queryByMeid(){
        return this.jtSelfRegisterDayRepository.findByMeid("A0000078524EA9");

    }*/
  /* public List<JtSelfRegisterDay> queryByCityAndGather_day(){
       return this.jtSelfRegisterDayRepository.findByCityAndGather_day("南通",20170921);
   }*/

    public Iterable<JtSelfRegisterDay>  testQuery(){
        // 词条查询
       // MatchQueryBuilder queryBuilder = QueryBuilders.matchQuery("gather_day","20170727");
        MatchQueryBuilder queryBuilder = QueryBuilders.matchQuery("city","镇江");
        // 执行查询
        Iterable<JtSelfRegisterDay> Jt = this.jtSelfRegisterDayRepository.search(queryBuilder);
        Jt.forEach(System.out::println);
        return Jt;
    }

    public Page<JtSelfRegisterDay> testNativeQuery(){
        // 构建查询条件
        NativeSearchQueryBuilder queryBuilder = new NativeSearchQueryBuilder();
        // 添加基本的分词查询
        //queryBuilder.withQuery(QueryBuilders.termQuery("gather_day", "20170727"));

        /* 组合查询
         must(QueryBuilders) :   AND
        mustNot(QueryBuilders): NOT
        should:                  : OR*/
        queryBuilder.withQuery(QueryBuilders.boolQuery().must(QueryBuilders.termQuery("gather_day", "20170727"))
                .must(QueryBuilders.matchQuery("city","无锡")).filter(QueryBuilders.matchQuery("month","07")));

        //queryBuilder.withQuery(QueryBuilders.matchQuery("city", "无锡"));
        //queryBuilder.withQuery(QueryBuilders.moreLikeThisQuery({);

        // 初始化分页参数
        int page = 50;
        int size = 100;
        // 设置分页参数
        queryBuilder.withPageable(PageRequest.of(page, size));

        // 执行搜索，获取结果
        Page<JtSelfRegisterDay> Jt = this.jtSelfRegisterDayRepository.search(queryBuilder.build());
        // 打印总条数
        System.out.println(Jt.getTotalElements());
        // 打印总页数
        System.out.println(Jt.getTotalPages());
        // 每页大小
        System.out.println(Jt.getSize());
        // 当前页
        System.out.println(Jt.getNumber());
        Jt.forEach(System.out::println);
        return Jt;
    }


    public Page<JtSelfRegisterDay> testSort(){
        // 构建查询条件
        NativeSearchQueryBuilder queryBuilder = new NativeSearchQueryBuilder();
        // 添加基本的分词查询
        queryBuilder.withQuery(QueryBuilders.termQuery("gather_day", "20170727"));

        // 排序
        queryBuilder.withSort(SortBuilders.fieldSort("synchro_date").order(SortOrder.DESC));

        // 执行搜索，获取结果
        Page<JtSelfRegisterDay> Jt = this.jtSelfRegisterDayRepository.search(queryBuilder.build());
        // 打印总条数
        System.out.println(Jt.getTotalElements());
        Jt.forEach(System.out::println);
        return  Jt;
    }

   /* public void testDoubleQuery(){
        NativeSearchQueryBuilder queryBuilder = new NativeSearchQueryBuilder();
        // 添加基本的分词查询
        //queryBuilder.withQuery(QueryBuilders.termQuery("gather_day", "20170727"));

        *//* 组合查询
         must(QueryBuilders) :   AND
        mustNot(QueryBuilders): NOT
        should:                  : OR*//*
        queryBuilder.withQuery(QueryBuilders.boolQuery().must(QueryBuilders.termQuery("gather_day", "20170727"))
                .must(QueryBuilders.matchQuery("city","无锡")).filter(QueryBuilders.matchQuery("month","07")));

        //queryBuilder.withQuery(QueryBuilders.matchQuery("city", "无锡"));
        //queryBuilder.withQuery(QueryBuilders.moreLikeThisQuery({);

        // 初始化分页参数
        int page = 50;
        int size = 100;
        // 设置分页参数
        queryBuilder.withPageable(PageRequest.of(page, size));

        // 执行搜索，获取结果
        Page<JtSelfRegisterDay> Jt = this.jtSelfRegisterDayRepository.search(queryBuilder.build());

    }*/

}
