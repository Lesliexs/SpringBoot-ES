package cn.itcast.elasticsearch.dao;

import cn.itcast.elasticsearch.pojo.Register;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface RegisterRepository extends ElasticsearchRepository<Register,Long> {
}
