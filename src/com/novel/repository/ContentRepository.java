package com.novel.repository;

import com.novel.eneity.NovelContent;

import java.util.List;

public interface ContentRepository {
    public List<NovelContent> findAllContent();
    public List<NovelContent> findContentByBook(String  bookid);
}
