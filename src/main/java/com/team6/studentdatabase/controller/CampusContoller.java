package com.team6.studentdatabase.controller;

import com.team6.studentdatabase.entity.Campus;
import com.team6.studentdatabase.service.CampusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CampusContoller {
    @Autowired
    CampusService campusService;

    @GetMapping("/campuses")
    private List<Campus> getAllCampuses() {
        return campusService.findAll();
    }

    @GetMapping("/campuses/{id}")
    private Campus getCampus(@PathVariable("id") long id) {
        return campusService.getCampusById(id);
    }

    @DeleteMapping("/campuses/{id}")
    private Campus deleteCampus(@PathVariable("id") long id) {
        campusService.delete(id);
        return null;
    }

    @PostMapping("/campuses")
    private long saveCampus(@RequestBody Campus campus) {
        campusService.saveOrUpdate(campus);
        return campus.getId();
    }
}
