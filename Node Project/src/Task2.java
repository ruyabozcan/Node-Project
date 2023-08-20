package com.company;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        ArrayList<String> aray1 = new ArrayList<String>();

        System.out.print("Enter a int: ");
        int n = scan.nextInt();
        int count = 0;
        while(true){

            System.out.print("Enter a String: ");
            String st1 = scan1.nextLine();
            count++;
            aray1.add(st1);
            if(count == n){
                break;
            }
        }

        printArrayList(aray1);
        addToArrayList(aray1, "Istanbul");
        addToArrayList(aray1, "Ankara");
        System.out.println();
        System.out.println("After adding Istanbul and Ankara: ");
        printArrayList(aray1);
        System.out.println();
        System.out.println(checkExistance(aray1, "Antalya") + "  Antalya");
        System.out.println(checkExistance(aray1, "Ankara") + "  Ankara");
        sortArrayList(aray1);
        System.out.println();
        System.out.print("After Sort: ");
        printArrayList(aray1);
        System.out.println();
        removeArrayList(aray1, 4);
        System.out.print("After Remove Index 4: ");
        printArrayList(aray1);
        replaceArrayList(aray1, 0);
        System.out.println();
        System.out.print("After Change Index 0: ");
        printArrayList(aray1);
        System.out.println();
        System.out.print("After Reversed: ");
        reverseArrayList(aray1);
        System.out.println();
        System.out.println();
        System.out.println("isPalindrome: ");
        System.out.println(isPalindrome(aray1));
    }

    private static void printArrayList(ArrayList<String> list) {
        System.out.printf("%nList: ");

        for (String st : list) {
            System.out.printf("%s ", st);
        }

        System.out.println();
    }

    public static void addToArrayList(ArrayList<String> list, String String) {
        list.add(String);
    }

    public static boolean checkExistance(ArrayList<String> list, String String) {
        for (String st : list) {
            if (st.equals(String)) {
                return true;
            }
        }
        return false;
    }

    public static void sortArrayList(ArrayList<String> list) {
        Collections.sort(list);
    }

    public static void reverseArrayList(ArrayList<String> list) {
        ArrayList<String> reversedList = new ArrayList<String>();

        System.out.printf("%nReversed List: ");

        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }

        for (String st : reversedList) {
            System.out.printf("%s ", st);
        }
    }

    public static void replaceArrayList(ArrayList<String> list,int n){
        list.set(n, "Antalya");
    }

    public static void removeArrayList(ArrayList<String> list,int n){
        list.remove(n);
    }


    //Task 3
    public static boolean isPalindrome(ArrayList<String> list){
        int start = 0;
        int end = list.size() - 1;

        while(start < end){
            if(list.get(start++).equals(list.get(end--))){
                return true;
            }
        }
        return false;
    }
}
