package com.bootcoding.StrudentDetail.repository;
import com.bootcoding.StrudentDetail.model.Student;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentRepoImpl implements StudentRepo{
    Map<Integer, Student> studentMap = new HashMap<>();

    //<--------insert student-------->
    @Override
    public String insertStudent(Student student) {
        if(existStudent(student)){
            return "Student Already Exist!";
        }
        studentMap.put(student.getRoll_no(), student);
        return "Student Inserted Successfully!";
    }

    //<--------get student by roll number-------->
    @Override
    public Object getStudent(int roll_no) throws RuntimeException{
        if(existStudent(roll_no)){
            return studentMap.get(roll_no);
        }
        throw new RuntimeException("Student not Exist!");
    }

    //<--------gat student by branch name-------->
    @Override
    public List<Student> getStudentByBranch(String branch) {
        List<Student> studentList = new ArrayList<>();
        for(int student: studentMap.keySet()){
            if(branch.equals(studentMap.get(student).getBranch())){
                studentList.add(studentMap.get(student));
            }
        }
        return studentList;
    }

    //<------get all student------->
    @Override
    public List<Student> getAllStudent(){
        List<Student> studentList = new ArrayList<>();
        for (Integer roll_no: studentMap.keySet()) {
            studentList.add(studentMap.get(roll_no));
        }
            return studentList;
    }

    //<--------update student data-------->
    @Override
    public Student updateStudent(int roll_no, Student student) {
        if(studentMap.containsKey(roll_no)){
            studentMap.put(roll_no, student);
             return student;
        }
        return null;
    }

    //<---------delete student--------->
    @Override
    public String deleteStudent(int roll_no) {
        if(existStudent(roll_no)) {
            studentMap.remove(roll_no);
            return "Student Remove Successfully...";
        }
        return "Student Doesn't Exist!";
    }

    //<---------helper method-------->
    private boolean existStudent(Student student){
        return existStudent(student.getRoll_no());
    }

    private boolean existStudent(int roll_no){
        if(studentMap.containsKey(roll_no)){
            return true;
        }
        return false;
    }
}
