package org.example.backend.models;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

/**
 * Baza bilan hosil qilinuvchi jadval va bu dto bilan integratsiya qiladi
 * */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Entity         // Baza bilan bog;lanuvchi qism
@Table(name = "Students") // Jadval nomi
public class AddStudentTable implements Serializable {

    // Shakllantirilgan jadval qismlari
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long ids;

    @Column
    private String firstname;

    @Column
    private String lastname;

    @Column
    private int day;

    @Column
    private String month;

    @Column
    private int year;

    @Column
    private String address;

    @Column
    private String gender;
}
