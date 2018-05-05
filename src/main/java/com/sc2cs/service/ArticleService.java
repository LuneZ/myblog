package com.sc2cs.service;

import com.sc2cs.entity.Article;

import java.util.List;

public interface ArticleService {

    int createArticle(Article article);

    int getArticleById(Integer id);

    List<Article> getArticlesByType(Integer typeId);
}
