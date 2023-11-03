package com.team6.studentdatabase.service;

import com.team6.studentdatabase.entity.Campus;
import com.team6.studentdatabase.repository.CampusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampusService {
    @Autowired
    CampusRepository campusRepository;
    public List<Campus> findAll() {
        return (List<Campus>) campusRepository.findAll();
    }
    public Campus getCampusById(long id) { return campusRepository.findById(id).get(); }

    public void saveOrUpdate(Campus campus) {
        campusRepository.save(campus);
    }

    public void delete(long id) {
        campusRepository.deleteById(id);
    }
}
