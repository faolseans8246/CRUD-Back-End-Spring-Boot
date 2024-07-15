package org.example.backend.repositories;

import org.example.backend.models.AddStudentTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Shakllangan jadvalga vazifalarini beruvchi dastur qismi
 * */
@Repository
public interface AddStudentRepos extends JpaRepository<AddStudentTable, Long>, CrudRepository<AddStudentTable, Long> {
}
