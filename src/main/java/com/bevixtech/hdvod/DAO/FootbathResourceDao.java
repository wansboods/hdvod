package com.bevixtech.hdvod.DAO;

import com.bevixtech.hdvod.Model.FootbathResource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface FootbathResourceDao {
    List<FootbathResource> selectAllFootbathResource();
}
