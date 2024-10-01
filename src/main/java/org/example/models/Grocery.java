package org.example.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Grocery {
    public static ArrayList <String> groceryList = new ArrayList<String>();
    Scanner scanner = new Scanner(System.in);


    public void startGrocery(){
        System.out.println("Enter number:");
        int value = scanner.nextInt();


        switch (value){
            case 0:
                break;
            case 1:
                System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                String addItems = scanner.nextLine();
                addItems(addItems);
                break;
            case 2:
                System.out.println("Cıkarılmasını istediğiniz elemanları giriniz.");
                break;
        }


    }
    public static void addItems(String addItems){
        String[] items = addItems.split(",");
        for(String i : items){
            if(!groceryList.contains(i)){
                groceryList.add(i);
            }
        }
        Collections.sort(groceryList);
    }
    public static void removeItems(String removeItems){
        String[] items = removeItems.split(",");
        for(String i: items){
            if(groceryList.contains(i)){
                groceryList.remove(i.trim());
            }
        }
        Collections.sort(groceryList);
    }
    public static boolean checkItemIsInList(String product){
        if(groceryList.contains(product)){
            Collections.sort(groceryList);
            return true;
        }
        Collections.sort(groceryList);
        return false;
    }
    public static void printSorted(){
        Collections.sort(groceryList);
        System.out.println(groceryList);
    }
}
