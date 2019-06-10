package com.javagda26.Mapy;

public interface IUniversity {
void addStudent(String name,String surname);
boolean containsStudent(long indexNumber);
Student getStudent(long indexNumber) throws NoSuchStudentException;
int studentsCount();
void printAllStudent();
//dodaj wyjątek NoSuchStudentException(RuntimeException do metody getStudent
}
