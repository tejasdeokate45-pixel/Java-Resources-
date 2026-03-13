package com.jpa.Jpa03.Repo;

import com.jpa.Jpa03.Entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepo extends JpaRepository<Teacher,Long> {
}
