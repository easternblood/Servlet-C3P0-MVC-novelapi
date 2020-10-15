package com.novel.service;

import com.novel.eneity.NovelInfo;

import java.util.List;

public interface BookService {
    public List<NovelInfo> findAllBook();
    public NovelInfo findBookById(String id);
    public List<NovelInfo> findBookByKind(String kindid);
}