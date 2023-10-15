package com.bootcoding.StrudentDetail.controller;
import com.bootcoding.StrudentDetail.model.Student;
import com.bootcoding.StrudentDetail.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/student")
    public String insertStudent(@RequestBody Student student){
        return studentService.insertStudent(student);
    }

    @GetMapping("/student/{roll_no}")
    public Object getStudent(@PathVariable int roll_no){
        try{
            return studentService.getStudent(roll_no);
        }catch (Exception ex){
            return ex.getMessage();
        }
    }

    @GetMapping("/student")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @PutMapping("/student/{roll_no}")
    public Student updateStudent(@PathVariable int roll_no, @RequestBody Student student){
        return studentService.updateStudent(roll_no, student);
    }

    @DeleteMapping("/student/{roll_no}")
    public String deleteStudent(@PathVariable int roll_no){
        return studentService.deleteStudent(roll_no);
    }

    @GetMapping("/student/branch/{branch}")
    public List<Student> getStudentByBranch(@PathVariable String branch){
        return studentService.getStudentByBranch(branch);
    }
}
