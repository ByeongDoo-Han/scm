package com.example.scm.service;

import com.scm.model.Product;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    // 제품 목록 조회
    public List<Product> getAllProducts() {
        // 데이터베이스에서 모든 제품을 조회하는 로직을 구현합니다.
        return null; // 실제 구현 필요
    }

    // 제품 추가
    public Product addProduct(Product product) {
        // 데이터베이스에 제품을 추가하는 로직을 구현합니다.
        return null; // 실제 구현 필요
    }

    // 제품 삭제
    public void deleteProduct(Long id) {
        // 데이터베이스에서 제품을 삭제하는 로직을 구현합니다.
    }
} 