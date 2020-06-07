package com.ascending.training.afternoon;

import org.checkerframework.checker.units.qual.K;

import java.io.*;
import java.util.*;

// Java Collection
// https://www.geeksforgeeks.org/collections-in-java-2/
public class JavaCollection {
    // Java program to show why collection framework was needed
    public static void main (String[] args)
    {
        // Creating instances of array, vector and hashtable
        int arr[] = new int[] {1, 2, 3, 4};
        Vector<Integer> v = new Vector();
        Hashtable<Integer, String> h = new Hashtable();
        v.addElement(1);
        v.addElement(2);
        h.put(1,"geeks");
        h.put(2,"4geeks");

        // Array instance creation requires [], while Vector
        // and hastable require ()
        // Vector element insertion requires addElement(), but
        // hashtable element insertion requires put()

        // Accessing first element of array, vector and hashtable
        System.out.println(arr[0]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(1));

        // Array elements are accessed using [], vector elements
        // using elementAt() and hashtable elements using get()
    }

    public void approachInterview(){

          // Interface
//        public interface List<T>{
//            T.get(Integer i);
//        }

        // Array vs ArrayList
        // Array must give its size when initialization.
        String[] arr = new String[10];
        arr[1] = String.valueOf(10);
        // ArrayList is part of the collection framework in Java.
        // Dynamic sized arrays, don't need to initialize its size at the beginning.
        // ArrayList will resize its size.
        ArrayList<Integer> arrayList = new ArrayList<>();
        List<String> arrlist = new ArrayList<>();
        // Array can contain both primitive data types and generic types, but arrayList can't.
        // In ArrayList, the actual objects will never store at contiguous locations,
        // it stores memeory address, the references of the actual objects.

        // LinkedList vs ArrayList vs Vector
        // ArrayList is implemented as a resizable array.
        // It's a better choice if the program is thread-safe.
        // LinkedList is implemented as a double linked list. Its performance on add and remove
        // is better
        // Vector is similiar with ArrayList, but it is synchronized.

        // Set
        Set<Integer> s = new HashSet<>();
        // HashSet
        // Backed by a HashMap
//        Map map = new HashMap<>();
//        map.put("key", "dummy");
        // hashcode() and equals()
        // TreeSet(Set, SortedSet)
        // TreeSet<Comparator<? super E>comparator)

        // Map
        // HashMap
        Map<String,String> map = new HashMap<>();
        // Map.Entry<key,value>
        // TreeMap
        // TreeMap<Comparator<? super K>comparator)

        // Exercise
        // Write an object with hashcode() and equals(),





    }
}
