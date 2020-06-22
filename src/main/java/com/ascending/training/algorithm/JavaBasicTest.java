package com.ascending.training.algorithm;

import java.util.HashMap;
import java.util.Map;

public class JavaBasicTest {
        public static void main(String[] args) {
            int[][] grades = {{1,90}, {2,89},{3,100}};

        }

        public void bestStudent(int[][] a){
            Map<Integer,Integer> grades = new HashMap<>();
            grades.put(1, 90);
            grades.put(2, 89);
            grades.put(3, 100);

            int key = 0;
            int maxGrade = 0;
            for(int i : grades.keySet()){
                if(grades.get(i) > maxGrade ){
                    key = i;
                    maxGrade = grades.get(i);
                }
            }
            System.out.println("The best student's # is:" + key);
        }
    }

