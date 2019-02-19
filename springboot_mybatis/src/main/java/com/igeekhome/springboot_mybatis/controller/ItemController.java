package com.igeekhome.springboot_mybatis.controller;

import com.igeekhome.springboot_mybatis.mapper.ItemMapper;
import com.igeekhome.springboot_mybatis.pojo.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemMapper itemMapper;

    @RequestMapping("/list")
    public List<Items> itemList(){
        return itemMapper.queryItems();
    }

    @RequestMapping("/get/{id}")
    public Items get(@PathVariable(name = "id") int id){
        return itemMapper.queryItem(id);
    }

    @RequestMapping("/delete/{id}")
    public int delete(@PathVariable(name = "id") int id){
        return itemMapper.deleteItem(id);
    }

    @RequestMapping("/add")
    public int add(Items item){
        try {
            item = new Items(4,"测试",200,"测试商品","",new Date());
        }catch (Exception e){

    }

        return itemMapper.insertItem(item);
    }

    @RequestMapping("/update")
    public int update(Items item){
        item = get(1);
        item.setName("更新商品后的名称");
        item.setPrice(666);
        return itemMapper.updateItem(item);
    }

}
