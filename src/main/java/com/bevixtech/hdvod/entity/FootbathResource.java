package com.bevixtech.hdvod.entity;

import java.util.Date;

public class FootbathResource {
    private String id;
    private String org_code;
    private String resource_name;
    private Integer resource_type;
    private String resource_path;
    private Long resource_size;
    private String resource_format;
    private String image_url;
    private Date create_time;
    private String create_by;
    private String res_path_json;
    private String res_version;
    private Date packing_time;
    private String res_describe;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrg_code() {
        return org_code;
    }

    public void setOrg_code(String org_code) {
        this.org_code = org_code;
    }

    public String getResource_name() {
        return resource_name;
    }

    public void setResource_name(String resource_name) {
        this.resource_name = resource_name;
    }

    public Integer getResource_type() {
        return resource_type;
    }

    public void setResource_type(Integer resource_type) {
        this.resource_type = resource_type;
    }

    public String getResource_path() {
        return resource_path;
    }

    public void setResource_path(String resource_path) {
        this.resource_path = resource_path;
    }

    public Long getResource_size() {
        return resource_size;
    }

    public void setResource_size(Long resource_size) {
        this.resource_size = resource_size;
    }

    public String getResource_format() {
        return resource_format;
    }

    public void setResource_format(String resource_format) {
        this.resource_format = resource_format;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public String getRes_path_json() {
        return res_path_json;
    }

    public void setRes_path_json(String res_path_json) {
        this.res_path_json = res_path_json;
    }

    public String getRes_version() {
        return res_version;
    }

    public void setRes_version(String res_version) {
        this.res_version = res_version;
    }

    public Date getPacking_time() {
        return packing_time;
    }

    public void setPacking_time(Date packing_time) {
        this.packing_time = packing_time;
    }

    public String getRes_describe() {
        return res_describe;
    }

    public void setRes_describe(String res_describe) {
        this.res_describe = res_describe;
    }
}
