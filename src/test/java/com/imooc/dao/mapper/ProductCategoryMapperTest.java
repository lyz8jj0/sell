package com.imooc.dao.mapper;

import com.imooc.entity.ProductCategory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 李新宇
 * 2019-04-02 11:22
 */
//@SpringBootTest
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
@RunWith(SpringRunner.class)
public class ProductCategoryMapperTest {

    @Autowired
    private ProductCategoryMapper categoryMapper;

    @Test
    public void insertByMap() throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("category_name", "师兄最不爱");
        map.put("category_type", 101);
        int result = categoryMapper.insertByMap(map);
        Assert.assertEquals(1, result);
    }

    @Test
    public void insertByObject() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("师兄最不爱");
        productCategory.setCategoryType(102);
        int result = categoryMapper.insertByObject(productCategory);
        Assert.assertEquals(1, result);
    }

    @Test
    public void findByCategoryType() {
        ProductCategory result = categoryMapper.findByCategoryType(102);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByCategoryName() {
        List<ProductCategory> result = categoryMapper.findByCategoryName("师兄最不爱");
        Assert.assertNotEquals(0, result.size());
    }

    @Test
    public void updateByCategoryType() {
        int result = categoryMapper.updateByCategoryType("师兄最不爱的分类", 102);
        Assert.assertEquals(1, result);
    }

    @Test
    public void updateByCategoryObject() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("师兄最不爱");
        productCategory.setCategoryType(102);
        categoryMapper.updateByCategoryObject(productCategory);
    }

    @Test
    public void selectByCategoryType() {
        ProductCategory productCategory = categoryMapper.selectByCategoryType(101);
        Assert.assertNotNull(productCategory);
    }

}