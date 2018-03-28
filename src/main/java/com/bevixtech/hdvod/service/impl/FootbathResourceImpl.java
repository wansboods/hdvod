package com.bevixtech.hdvod.service.impl;

import com.bevixtech.hdvod.dao.FootbathResourceDao;
import com.bevixtech.hdvod.model.FootbathResource;
import com.bevixtech.hdvod.service.FootbathResourceService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class FootbathResourceImpl implements FootbathResourceService{
    @Resource
    private FootbathResourceDao footbathResourceDao;

    public List<FootbathResource> getAllFootbathResource() {
        return footbathResourceDao.selectAllFootbathResource();
    }
}
