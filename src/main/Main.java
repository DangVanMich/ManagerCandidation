/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import common.Validation;
import controller.Manager;

/**
 *
 * @author admin
 */
public class Main {
   public static void main(String[] args) {
        Manager manager = new Manager();
        Validation validation= new Validation();
        while (true) {
            System.out.println("=======CANDIDATE MANAGEMENT SYSTEM======");
            System.out.println("||1. Experience                        ||");
            System.out.println("||2. Fresher                           ||");
            System.out.println("||3. Internship                        ||");
            System.out.println("||4. Searching                         ||");
            System.out.println("||5. Exit                              ||");
            System.out.println("========================================");
            int choice = validation.inputInt("Enter your choice: ",1, 5);
            switch (choice) {
                case 1:
                    manager.createCandidate(0);
                    break;
                case 2:
                    manager.createCandidate(1);
                    break;
                case 3:
                    manager.createCandidate(2);
                    break;
                case 4:
                    manager.searchCandidate();
                    break;
                case 5:
                    return;
            }
        }

    }

} 

