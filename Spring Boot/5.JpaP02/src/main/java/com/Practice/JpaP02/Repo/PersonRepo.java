package com.Practice.JpaP02.Repo;

import com.Practice.JpaP02.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person, Long> {
}
