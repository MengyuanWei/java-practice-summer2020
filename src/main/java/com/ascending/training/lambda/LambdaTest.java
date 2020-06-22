package com.ascending.training.lambda;

import com.ascending.training.Collection.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaTest {
    @FunctionalInterface
    interface MyString{
        String myStringFunction(String str);
    }

    static class MyStringImpl implements MyString{

        @Override
        public String myStringFunction(String str) {
            return "Good morning " + str + "!";
        }
    }

    public static void main(String[] args){
        MyString classString = new LambdaTest.MyStringImpl();
        System.out.println(classString.myStringFunction("Alex"));

        MyString value1 = (str) -> "Good Morning " + str + "!";
        System.out.println(value1.myStringFunction("Luis"));

        MyString value2= (str) -> "Good Morning " + str + "!";
        System.out.println(value1.myStringFunction("Ryo"));

        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");
        for(String item: items){
            System.out.println(item);
        }

        items.forEach((str) ->{
            System.out.println(str);
        });

        Comparator<Employee> ageComparator = (e1, e2) ->{
            // logic xxxx above.
            return (int) (e1.getAge() - e2.getAge());
        };
    }
}
