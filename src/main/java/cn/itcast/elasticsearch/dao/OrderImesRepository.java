package cn.itcast.elasticsearch.dao;

import cn.itcast.elasticsearch.pojo.OrderImes;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface OrderImesRepository extends ElasticsearchRepository<OrderImes,Long> {
}
