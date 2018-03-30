package com.bevixtech.hdvod.controller;

import com.bevixtech.hdvod.dto.RequestHead;
import com.bevixtech.hdvod.dto.ResponseHead;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class AccessTokenCotroller {
    Logger ptr = LoggerFactory.getLogger(this.getClass());

    @ResponseBody
    @RequestMapping("/getToken.do")
    public ResponseHead getToken( RequestHead requestHead ){
        ResponseHead responseHead = new ResponseHead();
        requestHead.setRequestJson( "{\"token\":\"222222\",}" );
        return responseHead;
    }
}
