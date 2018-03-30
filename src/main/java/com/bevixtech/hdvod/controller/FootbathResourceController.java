package com.bevixtech.hdvod.controller;

import com.bevixtech.hdvod.base.BaseController;
import com.bevixtech.hdvod.entity.FootbathResource;
import com.bevixtech.hdvod.service.FootbathResourceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/vm")
public class FootbathResourceController extends BaseController<FootbathResourceService> {
    Logger ptr = LoggerFactory.getLogger( this.getClass() );


    @RequestMapping(value = "/test.do",method = RequestMethod.GET)
    @ResponseBody
    private Map<String,Object> getFoootbathResource(  ){
        long startTime = System.currentTimeMillis();
        Map<String,Object> modelMap = new HashMap<String, Object>();
        List<FootbathResource> list = new ArrayList<FootbathResource>();
        try{
            list = baseService.getAllFootbathResource();
            modelMap.put( "success", true );
            modelMap.put( "total", list.size() );
            modelMap.put( "jsondata", list );
        }catch (Exception e){
            e.printStackTrace();
            modelMap.put( "success", false );
            modelMap.put( "errMsg", e.toString() );
        }

        long endTime = System.currentTimeMillis();
        ptr.debug( "costTime:[{}ms]", endTime - startTime );
        ptr.info( "=== 结束运行{} ===", "测试数据" );
        return modelMap;
    }
}
