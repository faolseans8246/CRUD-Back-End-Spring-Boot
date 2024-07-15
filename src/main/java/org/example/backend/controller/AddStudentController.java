package org.example.backend.controller;


import org.example.backend.dto.AddStudentDto;
import org.example.backend.rootServices.AddStudentRootServoce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * Asosiy bog'lanishni amalga oshiruvchi qism bilan ishlash
 * */
@CrossOrigin(origins = "http://localhost:3000")   // ReactJS manzili
@RestController
@RequestMapping("/addStudent")  // Asosiy bosh API
public class AddStudentController {

    // Ma'lumot jarayoni boshqarish qismi
    @Autowired
    private AddStudentRootServoce addStudentRootServoce;


    // Saqlash qismini amalga oshiruvchi function
    @PostMapping("/save")
    public ResponseEntity<AddStudentDto> saveAddStudents(@RequestBody AddStudentDto addStudentDto) {
        // Student jadvali bilan ishlash
        AddStudentDto savedStudents = addStudentRootServoce.saveStudents(addStudentDto);
        return ResponseEntity.ok(savedStudents);
    }
}
