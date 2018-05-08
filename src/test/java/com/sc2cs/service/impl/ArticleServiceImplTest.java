package com.sc2cs.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.sc2cs.entity.Article;
import com.sc2cs.service.ArticleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:conf/spring-aop.xml",
        "classpath:conf/spring-mybatis.xml",
        "classpath:conf/spring-mvc.xml"})
public class ArticleServiceImplTest {
    @Autowired
    ArticleService articleService;
    @Test
    public void getArticlesByTypeAndPage() {
       PageInfo<Article> pageInfo=articleService.getArticlesByTypeAndPage(2, 1, 5);
       List<Article> list = pageInfo.getList();
       for(Article article:list){
           System.out.println(article);
       }
    }
}