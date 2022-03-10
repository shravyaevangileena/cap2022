package com.demo.productrepositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.pojo.Product;

public interface ProductRepositary extends JpaRepository<Product,Long>{

}



