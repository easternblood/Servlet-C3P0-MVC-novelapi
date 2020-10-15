package com.novel.service.impl;

import com.novel.eneity.NovelInfo;
import com.novel.repository.BookRepository;
import com.novel.repository.impl.BookRepositoryImpl;
import com.novel.service.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {
        private BookRepository bookRepository=new BookRepositoryImpl();
        @Override
        public List<NovelInfo> findAllBook() {
            return bookRepository.findAllBook();
        }

    @Override
    public NovelInfo findBookById(String id) {
        return bookRepository.findBookById(id);
    }

    @Override
    public List<NovelInfo> findBookByKind(String kindid) {
        return bookRepository.findBookByKind(kindid);
    }
}
