package com.example.backend_qlnh.repository;

import com.example.backend_qlnh.entity.HinhAnh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HinhAnhRepository extends JpaRepository<HinhAnh,Long> {
}
