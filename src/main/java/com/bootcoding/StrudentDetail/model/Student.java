package com.bootcoding.StrudentDetail.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int roll_no;
    private String name;
    private String gender;
    private int age;
    private String branch;
    private int year;
    private int semester;

}
