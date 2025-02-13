package com.example.project.Student;
import java.util.ArrayList;
import java.util.Arrays;

public class Utility {

    public static ArrayList<Student> sortStudents(ArrayList<Student> list){
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (shouldSwap(list.get(j), list.get(j + 1))) {
                    //swaps
                    Student temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        return list;
    }
    private static boolean shouldSwap(Student s1, Student s2) {
        int lastNameComparison = s1.getLastName().compareTo(s2.getLastName());
        if (lastNameComparison > 0) {
            return true;
        } else if (lastNameComparison < 0) {
            return false;
        }

        int firstNameComparison = s1.getFirstName().compareTo(s2.getFirstName());
        if (firstNameComparison > 0) {
            return true;
        } else if (firstNameComparison < 0) {
            return false;
        }

        return s1.getGpa() < s2.getGpa();
    }
}
