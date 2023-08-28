package com.rzschool.infosys.service;

import com.rzschool.infosys.db.entity.School;
import com.rzschool.infosys.db.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {

    @Autowired
    private SchoolRepository schoolRepository;

    public List<School> getSchoolList(){
        return schoolRepository.findAll();
    }


    public boolean addSchool(School school) {
        schoolRepository.save(school);
        return true;
    }
}
