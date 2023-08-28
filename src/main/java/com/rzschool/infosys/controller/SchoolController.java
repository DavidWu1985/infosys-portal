package com.rzschool.infosys.controller;

import com.rzschool.infosys.db.entity.School;
import com.rzschool.infosys.result.RtnResult;
import com.rzschool.infosys.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/school/**")
public class SchoolController {


    @Autowired
    private SchoolService schoolService;

    @GetMapping("list")
    public RtnResult<List<School>> getSchoolList(){
//        List<School> schools = new ArrayList<>();
//        School s1 = new School();
//        School s2 = new School();
//        s1.setId(1);
//        s1.setAddress("address1");
//        s1.setSchoolName("name1");
//        s2.setId(2);
//        s2.setSchoolName("name2");
//        s2.setAddress("address2");
//        schools.add(s1);
//        schools.add(s2);
        return RtnResult.success(schoolService.getSchoolList());
    }

    @PostMapping("add")
    public RtnResult<Boolean> addSchool(@RequestBody School school){
        return RtnResult.success(schoolService.addSchool(school));
    }
}
