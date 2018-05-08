package com.sc2cs.service;

import com.github.pagehelper.PageInfo;
import com.sc2cs.entity.Article;

import java.util.List;

public interface ArticleService {

    int createArticle(Article article);

    Article getArticleById(Integer id);

    PageInfo<Article> getArticlesByTypeAndPage(Integer typeId, Integer currentPage , Integer pageSize);
}
