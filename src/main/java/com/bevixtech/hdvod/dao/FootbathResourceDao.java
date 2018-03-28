package com.bevixtech.hdvod.dao;

import com.bevixtech.hdvod.model.FootbathResource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface FootbathResourceDao {
    List<FootbathResource> selectAllFootbathResource();
}
