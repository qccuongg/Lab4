/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BankFactory {
    static Scanner sc = new Scanner(System.in);
    String bankName;

    public BankFactory() {
    }

    public BankFactory(String bankName) {
        this.bankName = bankName;
    }
    
    public static void getBank() {
        System.out.println("Choose bank:");
        System.out.println("1.TPbank");
        System.out.println("2.Vietcombank");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                TPbank tp = new TPbank();
                System.out.println(tp.getBankName());
                break;
            case 2:
                Vietcombank vc = new Vietcombank();
                System.out.println(vc.getBankName());
                break;
        }
    }
}
