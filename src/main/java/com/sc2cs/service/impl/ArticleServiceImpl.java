package com.sc2cs.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc2cs.dao.ArticleDao;
import com.sc2cs.entity.Article;
import com.sc2cs.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleDao articleDao;

    @Override
    public int createArticle(Article article) {
        return 0;
    }

    /**
     * 阅读博客内容
     * @param id
     * @return
     */
    @Override
    public Article getArticleById(Integer id) {
        return articleDao.findArticleById(id);
    }

    /**
     * 根据类别和分页信息获取
     * @param typeId
     * @return
     */
    @Override
    public PageInfo<Article> getArticlesByTypeAndPage(Integer typeId, Integer currentPage, Integer pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<Article> list = articleDao.findArticlesByType(typeId);
        return new PageInfo<>(list);
    }
}
