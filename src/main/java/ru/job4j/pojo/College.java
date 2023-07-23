package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Nikishin Oleg Andreevich");
        student.setGroupNumber("IDB-15-07");
        student.setDateOfReceipt(new Date());
        System.out.println("Студент: " + student.getFullName() + ", "
                + "учащийся в группе №" + student.getGroupNumber() + ", поступивший в "
                + student.getDateOfReceipt());
    }
}
