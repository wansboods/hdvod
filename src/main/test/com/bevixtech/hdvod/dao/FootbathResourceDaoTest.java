package com.bevixtech.hdvod.dao;

import com.bevixtech.hdvod.BastTest;
import org.junit.Test;

import javax.annotation.Resource;

public class FootbathResourceDaoTest extends BastTest {
    @Resource
    private FootbathResourceDao footbathResourceDao;

    @Test
    public void select_all(){
        System.out.print( footbathResourceDao.selectAllFootbathResource() );
    }
}
