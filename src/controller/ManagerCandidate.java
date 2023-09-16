
package controller;

import model.CandidateList;
import view.Menu;

public class ManagerCandidate extends Menu<String>{
    
    static String[] mc = {"Experience", "Fresher", "Intern", "Searching", "Exit"};
    
    CandidateList candidateList;
    public ManagerCandidate(String title, String[] s){
        super(title, s);
        candidateList= new CandidateList();
    }

    public ManagerCandidate() {
        super("MANAGER CANDIDATE PROGRAMING",mc);
        candidateList= new CandidateList();
    }
    
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                menuExperience();
                break;
            case 2:
                menuFresher();
                break;
            case 3:
                menuIntern();
                break;
            case 4:
                candidateList.searchCandidate();
                break;
            case 5:
                System.exit(0);
        }
    }
    
    public void menuExperience(){
        String title= "EXPERIENCE";
        String[] s= new String[] {"Create", "Updating", "deleting", "Exit"};       
        Menu<String> menu= new Menu(title, s) {
            @Override
            public void execute(int n) {
                switch (n) {
                    case 1:
                        candidateList.createCandidate(0);
                        break;
                    case 2:
                        candidateList.update(0);
                        break;
                    case 3: 
                        candidateList.delete(0);
                        break;                                                                 
                }
            }
        };
        menu.run();
    }
    
    public void menuFresher(){
        String title= "FRESHER";
        String[] s= new String[] {"Create", "Updating", "deleting", "Exit"};       
        Menu<String> menu= new Menu(title, s) {
            @Override
            public void execute(int n) {
                switch (n) {
                    case 1:
                        candidateList.createCandidate(1);
                        break;
                    case 2:
                        candidateList.update(1);
                        break;
                    case 3: 
                        candidateList.delete(1);
                        break;                                                                 
                }
            }
        };
        menu.run();
    }
    
    public void menuIntern(){
        String title= "Intern";
        String[] s= new String[] {"Create", "Updating", "deleting", "Exit"};       
        Menu<String> menu= new Menu(title, s) {
            @Override
            public void execute(int n) {
                switch (n) {
                    case 1:
                        candidateList.createCandidate(2);
                        break;
                    case 2:
                        candidateList.update(2);
                        break;
                    case 3: 
                        candidateList.delete(2);
                        break;                                                                 
                }
            }
        };
        menu.run();
    }
    
}
