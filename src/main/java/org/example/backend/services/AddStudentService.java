package org.example.backend.services;

import org.example.backend.dto.AddStudentDto;
import org.example.backend.models.AddStudentTable;
import org.example.backend.repositories.AddStudentRepos;
import org.example.backend.rootServices.AddStudentRootServoce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Asosiy service va bu bajariluvchi dastur harakatlarnini nazorat qiladi
 * */
@Service
public class AddStudentService implements AddStudentRootServoce {

    // Table harakat qismi
    @Autowired
    private AddStudentRepos addStudentRepos;


    // Bazaga saqlash qismi bilan ishlash
    @Override
    public AddStudentDto saveStudents(AddStudentDto addStudentDto) {
        AddStudentTable addStudentTable = convertTable(addStudentDto);
        AddStudentTable saveAddStudent = addStudentRepos.save(addStudentTable);
        return convertDto(saveAddStudent);
    }




    /**
     * Table conversation qismi bilan ishlash
     * */

    // Table convert to Dto
    private AddStudentDto convertDto(AddStudentTable addStudentTable) {
        AddStudentDto otherDto = new AddStudentDto();
        otherDto.setId(addStudentTable.getIds());
        otherDto.setNames(addStudentTable.getFirstname());
        otherDto.setSurname(addStudentTable.getLastname());
        otherDto.setDay(addStudentTable.getDay());
        otherDto.setMonth(addStudentTable.getMonth());
        otherDto.setYears(addStudentTable.getYear());
        otherDto.setAddress(addStudentTable.getAddress());
        otherDto.setPoll(addStudentTable.getGender());

        return otherDto;
    }


    // Dto convert to Table
    private AddStudentTable convertTable(AddStudentDto addStudentDto) {
        AddStudentTable otherTable = new AddStudentTable();
        otherTable.setIds(addStudentDto.getId());
        otherTable.setFirstname(addStudentDto.getNames());
        otherTable.setLastname(addStudentDto.getSurname());
        otherTable.setDay(addStudentDto.getDay());
        otherTable.setMonth(addStudentDto.getMonth());
        otherTable.setYear(addStudentDto.getYears());
        otherTable.setAddress(addStudentDto.getAddress());
        otherTable.setGender(addStudentDto.getPoll());

        return otherTable;
    }
}
