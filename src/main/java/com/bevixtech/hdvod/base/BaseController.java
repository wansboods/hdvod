package com.bevixtech.hdvod.base;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseController<T> {
        @Autowired
        protected T baseService;
}
