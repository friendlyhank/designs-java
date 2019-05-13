package com.hank.mvcpatten;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name){
        model.setName(name);
    }

    public void getStudentName(){
        model.getName();
    }

    public void setStudentRollNo(String rollNo){
        model.setRollNo(rollNo);
    }

    public void getStudentRollNo(){
        model.getRollNo();
    }

    public void updateView(){
        view.printStudentDetails(model.getName(),model.getRollNo());
    }
}
