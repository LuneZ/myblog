package com.sc2cs.dao;

import com.sc2cs.entity.Article;

import java.util.List;

public interface ArticleDao {

    int addArticle(Article article);

    int updataArticle(Article article);

    Article findArticleById(Integer id);

    List<Article> findArticlesByType(Integer typeId);


}
