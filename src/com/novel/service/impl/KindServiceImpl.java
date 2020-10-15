package com.novel.service.impl;

import com.novel.eneity.NovelKind;
import com.novel.repository.KindRepository;
import com.novel.repository.impl.KindRepositoryImpl;
import com.novel.service.KindService;

import java.util.List;

public class KindServiceImpl implements KindService {
    private KindRepository kindRepository=new KindRepositoryImpl();
    @Override
    public List<NovelKind> findAllKind() {
        return kindRepository.findAllKind();
    }
}
