package com.rzschool.infosys.db.repository;


import com.rzschool.infosys.db.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Integer> {
}
