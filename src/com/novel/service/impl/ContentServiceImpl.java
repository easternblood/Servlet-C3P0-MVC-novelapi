package com.novel.service.impl;

import com.novel.eneity.NovelContent;
import com.novel.repository.ContentRepository;
import com.novel.repository.impl.ContentRepositoryImpl;
import com.novel.service.ContentService;

import java.util.List;

public class ContentServiceImpl implements ContentService {
    private ContentRepository contentRepository=new ContentRepositoryImpl();
    @Override
    public List<NovelContent> findAllContent() {
        return contentRepository.findAllContent();
    }

    @Override
    public List<NovelContent> findContentByBook(String bookid) {
        return contentRepository.findContentByBook(bookid);
    }
}
