package com.bevixtech.hdvod.service;

import com.bevixtech.hdvod.BastTest;
import com.bevixtech.hdvod.entity.FootbathResource;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class FootbathResourceServiceTest extends BastTest{
    private final Logger ptr = LoggerFactory.getLogger( this.getClass() );

    @Autowired
    private FootbathResourceService footbathResourceService;

    @Test
    public void getAllResource(){
        List<FootbathResource> mm  = footbathResourceService.getAllFootbathResource();
        for( FootbathResource fr : mm ){
            ptr.info( "code={}|resourceName={}|resourceType={}|resourcePath={}", fr.getOrgCode(), fr.getResourceName(), fr.getResourceType(), fr.getResourcePath() );
        }
    }

}
