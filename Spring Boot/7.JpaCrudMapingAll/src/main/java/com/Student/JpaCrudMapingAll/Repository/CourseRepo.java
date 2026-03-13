package com.Student.JpaCrudMapingAll.Repository;

import com.Student.JpaCrudMapingAll.Entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Courses,Long> {
}
