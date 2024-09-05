package com.api.eshop.repository;

import com.api.eshop.domain.Cars;
import org.springframework.data.jpa.repository.JpaRepository;




public interface CarsRepository extends JpaRepository<Cars, Integer> {
Cars findByName(String name);
}
