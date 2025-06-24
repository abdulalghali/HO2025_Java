package com.sparta.aa.oop;

import java.util.*;

public class App {

    public static void main(String[] args) {
//        Member nish = new Member("Nish","Mandal", 2025, 1, 20);
//
//        Parrot Green = new Parrot("green", "walnuts", 2023, 3, 12);
//        System.out.println(Green.getFavouriteFood());
//
//        Rhino Horn = new Rhino("Horn", 1000, 2023, 2, 13);
//        System.out.println(Horn.getWeight());
//        System.out.println(nish.toString());
//
//        Circle circle1 = new Circle(5);
//        Rectangle rect = new Rectangle(5, 6);
//
//        Shape[] shapes = {circle1, rect};
//        for (Shape shape : shapes) {
//            System.out.println(shape);
//        }


//        Parrot birdy = new Parrot("birdy", "walnuts", 2023, 3, 12);
//        Rhino horn = new Rhino("horn", 1000, 2023, 2, 13);
//        Animal[] animals = {birdy, horn};
//
//           for (Animal animal : animals) {
//                System.out.println(animal.toString());
//            }


        System.out.println();
        //System.out.println(circle);
        //System.out.println(rect);


//        var m1 = new Member("Nish", "Mandal"); // Mem location 1
//        var m2 = new Member("Nish", "Mandal"); // Memory location 2
//        var m3 = m1;

        // By deafult - objects are compared based on their memory location
        // We can override the base implementation of equals() so that it comapres firstName and LastName
        // So that if they're the same, they are considered equal
//        System.out.println(m1.equals(m2));
//        System.out.println(m1.hashCode());
//        System.out.println(m2.hashCode());
//        System.out.println(m3.hashCode());

        // For two objects to be considered equal, .equals() must return true AND the hascodes msut be the same
        // Hascodes are used in some collections as a key

//        Parrot rocky = new Parrot("birdy", "walnuts", 2023, 3, 12);
//        System.out.println(rocky.equals(birdy));
//        System.out.println(birdy.hashCode());
//        System.out.println(rocky.hashCode());


        String[] names = {"Hiren", "Dev", "Supriya", "Dunstan"};
        double[] weights = {-22.0, 51.5};
        var paul = new Member("Paul", "Mcgregor");
        var jones = new Member("jones", "john");
        var zeep = new Member("zeep", "comes");
        var george = new Member("george", "comes");

        Member[] members = {paul, jones, zeep, george};

        for (Member member : members) {
            System.out.println(member.getFullName());
        }

        for (double d : weights) {
            System.out.println(d);
        }

        for (String s : names) {
            System.out.println(s);
        }


        ArrayList<Member> newMembers = new ArrayList<Member>();
        newMembers.add(jones);

        ArrayList<Member> newMembers2 = new ArrayList<Member>(List.of(paul, jones, zeep, george));

        var myList = Arrays.asList(members);

        HashSet<String> memberHs = new HashSet<String>();
        memberHs.add("Nish");
        memberHs.add("Nosh");
        memberHs.add("Nash");
        memberHs.add("Nush");
        System.out.println(memberHs);


        HashMap<String, Member> beatlesMap = new HashMap<>();
        beatlesMap.put("PAUL",paul);
        System.out.println(beatlesMap.get("PAUL").getFullName());

        var keys = beatlesMap.keySet();
        var values = beatlesMap.values();
        var kvp = beatlesMap.entrySet();
//        System.out.println(kvp);


    }


}
