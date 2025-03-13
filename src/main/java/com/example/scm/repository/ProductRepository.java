package com.example.scm.repository;

import com.example.scm.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // 추가적인 쿼리 메서드를 여기에 정의할 수 있습니다.
} 