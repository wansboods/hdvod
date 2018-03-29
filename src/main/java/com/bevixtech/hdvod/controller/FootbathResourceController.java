package com.bevixtech.hdvod.controller;

import com.bevixtech.hdvod.entity.FootbathResource;
import com.bevixtech.hdvod.service.FootbathResourceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
//@RequestMapping(value = "/peakfortake")
public class FootbathResourceController {

    Logger ptr = LoggerFactory.getLogger( this.getClass() );
    @Resource
    private FootbathResourceService footbathResourceService;

//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
//    public String printHello(ModelMap model) {
//        model.addAttribute("msg", "Spring MVC Hello World");
//        model.addAttribute("name", "yuntao");
//        return "hello";
//    }

    //@RequestMapping( value = "/footbathResource.do", method = RequestMethod.GET )
    //@ResponseBody
    @RequestMapping(value = "/test.do",method = RequestMethod.GET)
    private Map<String,Object> getFoootbathResource(  ){
        long startTime = System.currentTimeMillis();
        ptr.info( "ssssssssssssssssssssssss" );
        Map<String,Object> modelMap = new HashMap<String, Object>();
        List<FootbathResource> list = new ArrayList<FootbathResource>();
        ptr.info( "ssssssssssssssssssssssss" );
        try{
            list = footbathResourceService.getAllFootbathResource();
            modelMap.put( "success", true );
            modelMap.put( "rows", list );
            modelMap.put( "total", list.size() );
        }catch (Exception e){
            e.printStackTrace();
            modelMap.put( "success", false );
            modelMap.put( "errMsg", e.toString() );
        }

        ptr.error( "test error!" );
        long endTime = System.currentTimeMillis();
        ptr.debug( "costTime:[{}ms]", endTime - startTime );
        System.out.print( ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" );
        ptr.info( "=== 结束运行{} ===", "测试数据" );
        return modelMap;
    }
}
