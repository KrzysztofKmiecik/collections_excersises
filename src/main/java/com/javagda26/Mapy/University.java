package com.javagda26.Mapy;

import java.util.HashMap;
import java.util.Map;

public class University implements IUniversity {
    static Long indexNumber=0L;
    Map<Long, Student> studentUniversityMap = new HashMap<>();

    @Override
    public void addStudent(String name, String surname) {
        long indexNumber = ++University.indexNumber;
        studentUniversityMap.put(indexNumber, new Student(indexNumber, name, surname));
    }


    @Override
    public boolean containsStudent(long indexNumber) {
         return studentUniversityMap.containsKey(indexNumber);
    }

    @Override
    public Student getStudent(long indexNumber) throws NoSuchStudentException {

        if( studentUniversityMap.get(indexNumber)!=null){
            return studentUniversityMap.get(indexNumber);
       }else{
            throw new NoSuchStudentException("Nie ma takiego studenta o indeksie "+indexNumber);
        }

    }
    //dodaj wyjątek NoSuchStudentException(RuntimeException do metody getStudent

    @Override
    public int studentsCount() {
        return studentUniversityMap.size();
    }

    @Override
    public void printAllStudent() {
        System.out.println( studentUniversityMap.values());
    }
}
