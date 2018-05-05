package com.sc2cs.service.impl;

import com.sc2cs.dao.ArticleDao;
import com.sc2cs.entity.Article;
import com.sc2cs.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleDao articleDao;

    @Override
    public int createArticle(Article article) {
        return 0;
    }

    @Override
    public int getArticleById(Integer id) {
        return 0;
    }

    @Override
    public List<Article> getArticlesByType(Integer typeId) {
        return null;
    }
}
