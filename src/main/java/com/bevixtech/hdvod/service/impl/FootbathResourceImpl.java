package com.bevixtech.hdvod.service.impl;

import com.bevixtech.hdvod.base.BaseService;
import com.bevixtech.hdvod.dao.FootbathResourceDao;
import com.bevixtech.hdvod.entity.FootbathResource;
import com.bevixtech.hdvod.service.FootbathResourceService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class FootbathResourceImpl extends BaseService<FootbathResourceDao> implements FootbathResourceService{

    public List<FootbathResource> getAllFootbathResource() {
        return baseEntityMapper.selectAllFootbathResource();
    }
}
