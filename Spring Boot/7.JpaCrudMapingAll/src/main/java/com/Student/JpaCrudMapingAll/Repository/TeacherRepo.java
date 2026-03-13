package com.Student.JpaCrudMapingAll.Repository;

import com.Student.JpaCrudMapingAll.Entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher,Long> {
}
