package com.api.eshop.repository;

import com.api.eshop.domain.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepository extends JpaRepository<Products , Long> {
    List<Products> findByIncredibleOffersIsTrue();
    List<Products> findByDailySuggestIsTrue();
    List<Products> findByNameContains(String searchText);
    List<Products> findByPriceGreaterThan(int p);
    List<Products> findByPriceBetween(int from , int to); // select * from products where price between from and to
    Products findByName(String name);
    @Query(value = "SELECT * FROM products  WHERE id = :myId",nativeQuery = true)
    List<Products> peydaKardanBaId(long myId);
   // derived Query

}

