package main;
import controller.ManagerCandidate;
import view.Menu;


public class Main {
    public static void main(String[] args) {
//        String title= "PROGRAMING MANAGEMENT CANDIDATE";
//        String[] s= new String[] {"Experience", "Fresher", "Intern", "Searching", "Exit"};       
//        Menu<String> menu= new ManagerCandidate(title, s);
//        menu.run();
        new ManagerCandidate().run();
    }
               
}
