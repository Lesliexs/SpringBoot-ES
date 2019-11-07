package cn.itcast.elasticsearch.dao;

import cn.itcast.elasticsearch.pojo.OrderData;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface OrderDataRepository extends ElasticsearchRepository<OrderData,Long> {
}
