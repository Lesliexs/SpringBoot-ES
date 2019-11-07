package cn.itcast.elasticsearch.service;

import cn.itcast.elasticsearch.dao.ItemRepository;
import cn.itcast.elasticsearch.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    @Autowired
    private ItemRepository itemRepository;

    public List<Item> queryByPriceBetween(){
        return this.itemRepository.findByPriceBetween(2000.00, 3500.00);

    }
}
