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
    @Override
    public String insertStudent(Student student) {
        return studentRepo.insertStudent(student);
    }

    @Override
    public Object getStudent(int roll_no) {
        return studentRepo.getStudent(roll_no);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepo.getAllStudent();
    }

    @Override
    public Student updateStudent(int roll_no, Student student) {
        return studentRepo.updateStudent(roll_no, student);
    }

    @Override
    public String deleteStudent(int roll_no) {
       return studentRepo.deleteStudent(roll_no);
    }

    @Override
    public List<Student> getStudentByBranch(String branch) {
        return studentRepo.getStudentByBranch(branch);
    }

}
