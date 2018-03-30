package com.bevixtech.hdvod.dto;

import java.io.Serializable;

public class RequestHead implements Serializable {

    private String uuid;
    private String aceessFlag;
    private String accessToken;
    private String pageSize;
    private String pageNum;
    private String requestJson;


    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getAceessFlag() {
        return aceessFlag;
    }

    public void setAceessFlag(String aceessFlag) {
        this.aceessFlag = aceessFlag;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getPageNum() {
        return pageNum;
    }

    public void setPageNum(String pageNum) {
        this.pageNum = pageNum;
    }

    public String getRequestJson() {
        return requestJson;
    }

    public void setRequestJson(String requestJson) {
        this.requestJson = requestJson;
    }
}
