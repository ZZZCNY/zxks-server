package com.zcy.zxks.services.impl;

import com.zcy.zxks.models.Paper;
import com.zcy.zxks.repositories.PaperRepository;
import com.zcy.zxks.services.PaperService;
import java.util.Optional;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class PaperServiceImpl implements PaperService {

    @Resource
    private PaperRepository repository;

    @Override
    public Optional<Paper> getById(Long id) {
        return repository.findById(id);
    }
}
