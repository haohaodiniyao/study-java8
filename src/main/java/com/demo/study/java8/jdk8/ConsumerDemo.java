package com.demo.study.java8.jdk8;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.demo.study.java8.stream.Student;
public class ConsumerDemo {
   public static void main(String[] args) {
        List<Student> list = new ArrayList();
        list.add(new Student("Ram",20));
        list.add(new Student("Shyam",22));
        list.add(new Student("Kabir",18));
        //Creating instance of Consumer functional interface
        Consumer<Student> style = (Student s) -> System.out.println("Name:"+s.getName() +" and Age:"+s.getAge());
        //first way using Consumer
        list.forEach(style);
        //second way using method reference 
        list.forEach(Student::printData);
        //third way using lambda expression
        list.forEach(s -> s.printData());
   }
} 