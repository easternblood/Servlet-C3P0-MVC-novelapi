package com.novel.service;

import com.novel.eneity.NovelContent;

import java.util.List;

public interface ContentService {
    public List<NovelContent> findAllContent();
    public List<NovelContent> findContentByBook(String  bookid);
}
