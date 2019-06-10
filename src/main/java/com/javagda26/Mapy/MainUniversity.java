package com.javagda26.Mapy;

public class MainUniversity {
    public static void main(String[] args) {
        University university =new University();

        university.addStudent("Jan","Kowalski");
        university.addStudent("Janina","Nowak");

        university.printAllStudent();
        System.out.println(university.containsStudent(3));
        System.out.println(university.studentsCount());
       // System.out.println((university.getStudent(3)));

        for(int i=0;i<5;i++){

            try {
                System.out.println((university.getStudent(i)));
            } catch (NoSuchStudentException e) {
                e.printStackTrace();
            }
        }
    }
}
