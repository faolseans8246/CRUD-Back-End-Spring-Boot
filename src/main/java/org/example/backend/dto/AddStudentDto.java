package org.example.backend.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
* Back-end dastur ichida vaqtinchalik jadvalni shakllantirish
* */
@Getter
@Setter
@Data
public class AddStudentDto {

    // Vaqtincha shakllantirilgan jadval qismining column qiymatlari
    private long id;
    private String names;
    private String surname;
    private int day;
    private String month;
    private int years;
    private String address;
    private String poll;
}
