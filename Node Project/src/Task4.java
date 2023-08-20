// RÜYA BOZCAN
// COMPUTER ENGINEERING 
// ABU

package com.company;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] names = {"atahan", "ruya", "alp", "eray"};
        ArrayList<String> removeNames = new ArrayList<String>();
        removeNames.add("atahan"); removeNames.add("mustafa"); removeNames.add("eray"); removeNames.add("alp"); removeNames.add("derin");

        System.out.print("Enter a Name: ");
        String st = scan.nextLine();

        ArrayList<String> list = new ArrayList<String>();
        list = fromArrayToList(names);

        printArrayList(list);

        for(String nm : list){
            if(nm.equals(st)){
                list.remove(list.indexOf(nm));
                break;
            }
            else{
                System.out.println("Error");
                break;
            }
        }
        printArrayList(list);
    }

    public static ArrayList<String> fromArrayToList(String[] array){
        ArrayList<String> namesList = new ArrayList<String>();

        for(String st : array){
            namesList.add(st);
        }
        return namesList;
    }

    private static void printArrayList(ArrayList<String> list) {
        System.out.printf("%nList: ");

        for (String st : list) {
            System.out.printf("%s ", st);
        }

        System.out.println();
    }
}

// RÜYA BOZCAN
// COMPUTER ENGINEERING 
// ABU
