package com.igeekhome.springboot_mybatis.mapper;

import com.igeekhome.springboot_mybatis.pojo.Items;
import org.apache.ibatis.annotations.*;

import java.util.List;

/*
* @Mapper声明当前类是一个mapper接口
* */
//@Mapper
public interface ItemMapper {

    //@Select("select * from items")
    List<Items> queryItems();

    //@Select("select * from items where id = #{id}")
    Items queryItem(int id);

    //@Insert("insert into items(name,price,detail,pic,createtime) values(#{name},#{price},#{detail},#{pic},#{createtime})")
    int insertItem(Items item);

    //@Update("update items set name=#{name},price=#{price},detail=#{detail},pic=#{pic},createtime=#{createtime} where id = #{id}")
    int updateItem(Items item);

    //@Delete("delete from items where id = #{id}")
    int deleteItem(int id);


}
