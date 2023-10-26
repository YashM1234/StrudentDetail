package com.bootcoding.StrudentDetail.service;
import com.bootcoding.StrudentDetail.model.Student;
import java.util.List;

public interface StudentService {
    String insertStudent(Student student);

    Object getStudent(int roll_no);

    List<Student> getStudentByBranch(String branch);

    List<Student> getAllStudent();

    Student updateStudent(int roll_no, Student student);

    String deleteStudent(int roll_no);

}
