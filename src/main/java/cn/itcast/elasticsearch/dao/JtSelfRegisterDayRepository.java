package cn.itcast.elasticsearch.dao;

import cn.itcast.elasticsearch.pojo.JtSelfRegisterDay;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface JtSelfRegisterDayRepository extends ElasticsearchRepository<JtSelfRegisterDay,Long> {
    List<JtSelfRegisterDay> findByCityAndMonth(String s1, String s2);
    /*List<JtSelfRegisterDay> findByCityAndGather_day(String s1, long s2);*/


    // List<JtSelfRegisterDay> findByMeid(String s1);


}
