package com.ascending.training.lambda;

import com.ascending.training.Collection.Employee;
import com.ascending.training.WheelShape;
import com.ascending.training.domain.Bike;

import java.util.*;
import java.util.stream.Collectors;

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

        List<Bike> bikes = new ArrayList<>();
        Bike b1 = new Bike();
        b1.setWheelShape(WheelShape.SQUARE);
        Bike b2 = new Bike();
        b2.setWheelShape(WheelShape.ROUND);
        bikes.add(b1);
        bikes.add(b2);

        List<Bike> result = new ArrayList<>();
        for(Bike b: bikes){
            if(b.getWheelShape() == WheelShape.ROUND){
                result.add(b);
            }
        }

        List<Bike> result1 = bikes.stream().filter(b -> b.getWheelShape() != WheelShape.SQUARE).
                collect(Collectors.toList());
        System.out.println(result1);

        List<WheelShape> result2 = bikes.stream().map(b -> b.getWheelShape()).collect(Collectors.toList());
        System.out.println(result2);

        String joined = bikes.stream()
                .map(Objects::toString)
                .collect(Collectors.joining(", "));
        // 立体的array打扁成String对象
        System.out.println(joined);

//        String joinedUsingForLoop = "";
//        for(Bike b: bikes){
//            joinedUsingForLoop = joinedUsingForLoop + ", " + b.toString();
//        }

        Map<WheelShape, List<Bike>> byWheelShape = bikes.stream()
        .collect(Collectors.groupingBy(Bike::getWheelShape)); // Bike::getWheelShape is method reference.
        System.out.println(byWheelShape);
        // The key in this map is WheelShape using group by. Changing the data structure.
    }
}
