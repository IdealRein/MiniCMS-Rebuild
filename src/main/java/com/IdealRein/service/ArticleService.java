package com.IdealRein.service;

import com.IdealRein.pojo.Article;
import com.IdealRein.pojo.PageBean;

public interface ArticleService {
    void add(Article article);
    PageBean<Article> list(Integer pageNum, Integer pageSize, Integer categoryId, String state);
}
