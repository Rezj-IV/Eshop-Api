package com.api.eshop.repository;

import com.api.eshop.domain.Products;
import com.api.eshop.domain.Sellers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellersRepository extends JpaRepository<Sellers, Integer> {



}

