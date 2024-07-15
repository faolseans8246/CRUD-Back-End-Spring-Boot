package org.example.backend.rootServices;

import org.example.backend.dto.AddStudentDto;

import java.util.List;

/**
 *  Service uchun vazifa modelini tayyorlash
 * */
public interface AddStudentRootServoce {

    // Kerakli method shabloni
    public AddStudentDto saveStudents(AddStudentDto addStudentDto);
    public List<AddStudentDto> takeStudents();
}
