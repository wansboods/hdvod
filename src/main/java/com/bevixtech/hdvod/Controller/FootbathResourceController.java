package com.bevixtech.hdvod.Controller;

import com.bevixtech.hdvod.service.FootbathResourceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class FootbathResourceController {
    @Resource
    private FootbathResourceService footbathResourceService;

    @RequestMapping( "/showFootbathResource" )
    public String getFoootbathResource(  ){
        return null;
    }
}
