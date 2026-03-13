package com.Student.JpaCrudMapingAll.Repository;

import com.Student.JpaCrudMapingAll.Entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepo extends JpaRepository<Laptop,Long> {
}
