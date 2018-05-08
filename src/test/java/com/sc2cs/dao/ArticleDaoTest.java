package com.sc2cs.dao;

import com.sc2cs.entity.Article;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:conf/spring-aop.xml",
        "classpath:conf/spring-mybatis.xml",
        "classpath:conf/spring-mvc.xml"})
public class ArticleDaoTest {

    @Autowired
    ArticleDao articleDao;
    @Test
    public void addArticle() {
        Date day = new Date();
        Article article2= new Article("测试2",2,"大师傅*dsn**",1,0,"/img2",
                day,day);
        articleDao.addArticle(article2);

    }

    @Test
    public void updateArticle() {
        Article article3=articleDao.findArticleById(1);
        article3.setTypeId(2);
        articleDao.updateArticle(article3);
    }

    @Test
    public void findArticleById() {
        Article article4 = articleDao.findArticleById(1);
        System.out.println(article4.getContent());
    }

    @Test
    public void findArticlesByType() {
        List<Article> list = articleDao.findArticlesByType(2);
        for(Article a1:list){
            System.out.println(a1);
        }
    }
    @Test
    public void countArticleByType(){
        int a= articleDao.countArticleByType(2);
        System.out.println(a);
    }
    @Test
    public void countArticleAll(){
        int b=articleDao.countArticleAll();
        System.out.println(b);
    }

    @Test
    public void findNewestArticle(){
        List<Article> list2 = articleDao.findNewestArticle();
        for(Article a:list2){
            System.out.println(a);
        }
    }
}