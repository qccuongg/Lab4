/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author ADMIN
 */
public class Collection {
    TreeMap <Integer, Integer> dictionary = new TreeMap<>();
    private static Random rd = new Random();
    private static Scanner sc = new Scanner(System.in);
    private int meaning;
    private int word;

    public Collection(int meaning, int word) {
        this.meaning = meaning;
        this.word = word;
    }

    public Collection() {
    }
    
    public void Input(){
        for (int i = 0; i < 20; i++){
            word = rd.nextInt(200);
            meaning = word + 1;
            dictionary.put(word, meaning);
        }
    }
    
    public void searchExistence() {
        System.out.print("Enter the word you want to search: ");
        int key = sc.nextInt();
        if (dictionary.containsKey(key))
            System.out.println("The word" + key + "do exist in the dictionary.");
        else
            System.out.println("The word" + key + "do not exist in the dictionary");
    }
    
    public void searchMeaning() {
        System.out.print("Enter the word you want to search: ");
        int key = sc.nextInt();
        if (dictionary.containsKey(key))
            System.out.println(dictionary.get(key));
        else
            System.out.println("The word" + key + "do not exist in the dictionary");
    }
    
    public void lookUp() {
        System.out.print("Enter the word you want to search: ");
        int key = sc.nextInt();
        if (dictionary.containsKey(key))
            System.out.println(key + ":" + dictionary.get(key));
        else
            System.out.println("The word" + key + "do not exist in the dictionary");

    }
}
