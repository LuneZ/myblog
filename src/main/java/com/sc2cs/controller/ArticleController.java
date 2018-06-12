package com.sc2cs.controller;

import com.github.pagehelper.PageInfo;
import com.sc2cs.entity.Article;
import com.sc2cs.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/category")
public class ArticleController {

    @Autowired @Qualifier(value = "ArticleService")
    ArticleService articleService;

    @RequestMapping(value = "/{typeId}")
    public String showArticleList(@PathVariable Integer typeId,
                                  @RequestParam(required = true,defaultValue = "1") Integer page,
                                  Model model){
        PageInfo<Article> pageInfo = articleService.getArticlesByTypeAndPage(typeId,page,3);
        model.addAttribute("articleList",pageInfo.getList());
        model.addAttribute("pageInfo", pageInfo);
        return "articleList";
    }
}
