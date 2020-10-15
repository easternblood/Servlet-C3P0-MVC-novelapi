package com.novel.repository;

import com.novel.eneity.NovelKind;

import java.util.List;

public interface KindRepository {
    public List<NovelKind> findAllKind();
}
