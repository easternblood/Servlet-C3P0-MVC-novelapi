package com.novel.repository;

import com.novel.eneity.NovelInfo;

import java.util.List;

public interface BookRepository {
    public List<NovelInfo> findAllBook();
    public NovelInfo findBookById(String id);
    public List<NovelInfo> findBookByKind(String kindid);
}
