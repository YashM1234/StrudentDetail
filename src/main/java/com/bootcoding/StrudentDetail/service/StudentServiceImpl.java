package com.bootcoding.StrudentDetail.service;
import com.bootcoding.StrudentDetail.model.Student;
import com.bootcoding.StrudentDetail.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepo studentRepo;

    //<--------insert student-------->
    @Override
    public String insertStudent(Student student) {
        return studentRepo.insertStudent(student);
    }

    //<--------get student by roll number-------->
    @Override
    public Object getStudent(int roll_no) {
        return studentRepo.getStudent(roll_no);
    }

    //<--------gat student by branch name-------->
    @Override
    public List<Student> getStudentByBranch(String branch) {
        return studentRepo.getStudentByBranch(branch);
    }

    //<------get all student------->
    @Override
    public List<Student> getAllStudent() {
        return studentRepo.getAllStudent();
    }

    //<--------update student data-------->
    @Override
    public Student updateStudent(int roll_no, Student student) {
        return studentRepo.updateStudent(roll_no, student);
    }

    //<---------delete student--------->
    @Override
    public String deleteStudent(int roll_no) {
       return studentRepo.deleteStudent(roll_no);
    }

}
