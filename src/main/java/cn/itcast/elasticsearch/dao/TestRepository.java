package cn.itcast.elasticsearch.dao;

import cn.itcast.elasticsearch.pojo.Test;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface TestRepository extends ElasticsearchRepository<Test,Long> {



}