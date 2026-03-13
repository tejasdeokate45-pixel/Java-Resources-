package com.jpa.Jpa03.Repo;

import com.jpa.Jpa03.Entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepo extends JpaRepository<Laptop,Long> {

}
