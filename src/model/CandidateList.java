/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Calendar;
import view.Validation;

/**
 *
 * @author This PC
 */
public class CandidateList {
    private static ArrayList<Candidate> list;
    private static ArrayList<Experience> listExperience;
    private static ArrayList<Fresher> listFresher;
    private static ArrayList<Intern> listIntern;
    private Validation validation;
    
    
    public CandidateList(){
        this.list= new ArrayList<>();
        this.listExperience= new ArrayList<>();
        this.listFresher= new ArrayList<>();
        this.listIntern= new ArrayList<>();
        this.validation= new Validation();
    }
    
    public void createCandidate(int type){
        while(true){
            System.out.println("Enter id: ");
            String id= Validation.checkInputString();
            if(Validation.checkIdExist(list, id)){
                return;
            }
            System.out.println("Enter first name: ");
            String firstName= Validation.checkInputString();
            System.out.println("Enter last name: ");
            String lastName= Validation.checkInputString();
            System.out.println("Enter birth date: ");
            int birthDate= Validation.checkInputIntLimit(1990, Calendar.getInstance().get(Calendar.YEAR));
            System.out.println("Enter address: ");
            String address= Validation.checkInputString();
            System.out.println("Enter phone: ");
            String phone= Validation.checkPhone();
            System.out.println("Enter email: ");
            String email= Validation.checkEmail();
            Candidate candidate= new Candidate(id, firstName, lastName, birthDate, address, phone, email, type);
            switch (type) {
                case 0:
                    createExperience(candidate);
                    break;
                case 1:
                    createFresher(candidate);
                    break;
                case 2:
                    createIntern(candidate);
                    break;
            }
            System.out.println("Do you want to continue (Y/N): ");
            if(!Validation.checkInputYesNo()){
                return;
            }
        }
    }
    
    public void createExperience(Candidate candidate) {
        System.out.println("Enter year of experience: ");
        int yearExperience = Validation.checkInputExperience(candidate.getBirthDate());
        System.out.println("Enter professional skill: ");
        String professionalSkill = Validation.checkInputString();
        list.add(candidate);
        Experience experience= new Experience(candidate.getId(), candidate.getFirstName(), candidate.getLastName(),
                candidate.getBirthDate(), candidate.getAddress(),
                candidate.getPhone(), candidate.getEmail(), candidate.getTypeCandidate(), yearExperience, professionalSkill);
        listExperience.add(experience);       
    }
    
    public void createFresher(Candidate candidate) {
        System.out.println("Enter graduation date: ");
        int graduationDate = Validation.checkInputGraduationDate(candidate.getBirthDate());
        System.out.println("Enter graduation rank: ");
        String graduationRank = Validation.checkRankOfGraduation();
        System.out.println("Enter university graduation: ");
        String nameUniversity= Validation.checkInputString();
        list.add(candidate);
        Fresher fresher= new Fresher(candidate.getId(), candidate.getFirstName(), candidate.getLastName(),
                candidate.getBirthDate(), candidate.getAddress(),
                candidate.getPhone(), candidate.getEmail(), candidate.getTypeCandidate(), graduationDate, graduationRank, nameUniversity);
        listFresher.add(fresher);
    }
    
    public void createIntern(Candidate candidate) {
        System.out.print("Enter major: ");
        String major = Validation.checkInputString();
        System.out.print("Enter semester: ");
        String semester = Validation.checkInputString();
        System.out.print("Enter university: ");
        String university = Validation.checkInputString();
        list.add(candidate);
        Intern intern= new Intern(candidate.getId(), candidate.getFirstName(), candidate.getLastName(),
                candidate.getBirthDate(), candidate.getAddress(),
                candidate.getPhone(), candidate.getEmail(), candidate.getTypeCandidate(),major, semester, university);
        listIntern.add(intern);
    }
    
    public void update(int type){        
        System.out.println("Enter ID to update: ");
        String id = Validation.checkInputString();
        Candidate candidate_find = findIdCandidate(id);
        if (candidate_find != null) {
            System.out.println("Enter first name to update: ");
            String firstName= Validation.checkInputString();
            candidate_find.setFirstName(firstName);
            System.out.println("Enter last name to update: ");
            String lastName= Validation.checkInputString();
            candidate_find.setLastName(lastName);
            System.out.println("Enter birth date to update: ");
            int birthDate= Validation.checkInputIntLimit(1990, Calendar.getInstance().get(Calendar.YEAR));
            candidate_find.setBirthDate(birthDate);
            System.out.println("Enter address to update: ");
            String address= Validation.checkInputString();
            candidate_find.setAddress(address);
            System.out.println("Enter phone to update: ");
            String phone= Validation.checkPhone();
            candidate_find.setAddress(address);
            System.out.println("Enter email to update: ");
            String email= Validation.checkEmail();
            candidate_find.setEmail(email);
            switch (type) {
                case 0:                   
                    Experience experience_find= findIdExperience(id);
                    experience_find.setFirstName(firstName);
                    experience_find.setLastName(lastName);
                    experience_find.setBirthDate(birthDate);
                    experience_find.setAddress(address);
                    experience_find.setPhone(phone);
                    experience_find.setEmail(email);                   
                    System.out.println("Enter year of experience: ");
                    experience_find.setExpInYear(Validation.checkInputExperience(candidate_find.getBirthDate()));
                    System.out.println("Enter professional skill: ");
                    experience_find.setProSkill(Validation.checkInputString());
                    break;
                case 2:
                    Fresher fresher_find= findIdFresher(id);
                    fresher_find.setFirstName(firstName);
                    fresher_find.setLastName(lastName);
                    fresher_find.setBirthDate(birthDate);
                    fresher_find.setAddress(address);
                    fresher_find.setPhone(phone);
                    fresher_find.setEmail(email);
                    System.out.println("Enter graduation date: ");
                    fresher_find.setDateGraduation(Validation.checkInputGraduationDate(candidate_find.getBirthDate()));
                    System.out.println("Enter graduation rank: ");
                    fresher_find.setRankGraduation(Validation.checkRankOfGraduation());
                    System.out.println("Enter university graduation: ");
                    fresher_find.setUniversity(Validation.checkInputString());
                    break;
                case 3:
                    Intern intern_find= findIdIntern(id);
                    intern_find.setFirstName(firstName);
                    intern_find.setLastName(lastName);
                    intern_find.setBirthDate(birthDate);
                    intern_find.setAddress(address);
                    intern_find.setPhone(phone);
                    intern_find.setEmail(email);
                    System.out.print("Enter major: ");
                    intern_find.setMajor(Validation.checkInputString());
                    System.out.print("Enter semester: ");
                    intern_find.setSemester(Validation.checkInputString());
                    System.out.print("Enter university: ");
                    intern_find.setUniversity(Validation.checkInputString());
                    break;                  
            }
        }

    }
            
    public void delete(int type){
        System.out.println("Please enter id to delete: ");
        String id= Validation.checkInputString();
        Candidate candidate= findIdCandidate(id);
        if(candidate!=null){
            list.remove(candidate);
            switch (type) {
                case 0:
                    listExperience.remove(findIdExperience(id));
                    break;
                case 1:
                    listFresher.remove(findIdFresher(id));
                    break;
                case 2:
                    listIntern.remove(findIdIntern(id));
                    break;
            }
        }
    }    
        
    
    
    public Candidate findIdCandidate(String id){
        Candidate candidate_find=null;
        for (Candidate candidate : list) {
            if(candidate.getId().equalsIgnoreCase(id)){
                candidate_find= candidate;
                break;
            }
        }
        return candidate_find;
    }
    
    public Experience findIdExperience(String id){
        Experience experience_find=null;
        for (Experience experience : listExperience) {
            if(experience.getId().equalsIgnoreCase(id)){
                experience_find= experience;
                break;
            }
        }
        return experience_find;
    }
    
    public Fresher findIdFresher(String id){
        Fresher fresher_find=null;
        for (Fresher fresher : listFresher) {
            if(fresher.getId().equalsIgnoreCase(id)){
                fresher_find= fresher;
                break;
            }
        }
        return fresher_find;
    }
    
    public Intern findIdIntern(String id){
        Intern intern_find=null;
        for (Intern intern : listIntern) {
            if(intern.getId().equalsIgnoreCase(id)){
                intern_find= intern;
                break;
            }
        }
        return intern_find;
    }
    
    
    
    
    
    public void printListCandidate(){
        System.out.println("List of candidate:");
        System.out.println("===========EXPERIENCE CANDIDATE============");
        if (!listExperience.isEmpty()) {          
            for (Experience experience : listExperience) {
                System.out.println(experience.getFirstName() + " " + experience.getLastName());
            }
        }else System.out.println("Empty! No Candidate!");
        
        System.out.println("===========FRESHER CANDIDATE===============");
        if (!listFresher.isEmpty()) {     
            for (Fresher fresher : listFresher) {
                System.out.println(fresher.getFirstName() + " " + fresher.getLastName());
            }
        }else System.out.println("Empty! No Candidate!");
        
        System.out.println("===========INTERN CANDIDATE================");
        if (!listIntern.isEmpty()) {           
            for (Intern intern : listIntern) {
                System.out.println(intern.getFirstName() + " " + intern.getLastName());
            }
        }else System.out.println("Empty! No Candidate!");
    
    } 
    
    public void searchCandidate(){       
        if(list.isEmpty()){
            System.err.println("List is empty!");
        }else{
            int count=0;
            printListCandidate();
            System.out.print("Enter andidate name (First name or Last name): ");
            String nameSearch = Validation.checkInputString();
            System.out.print("Enter type of candidate: ");          
            int typeCandidate = Validation.checkInputIntLimit(0, 2);
            System.out.println();
            System.out.println("The candidates found: ");
            for(Candidate candidate: list){
                if(candidate.getTypeCandidate()==typeCandidate &&
                        (candidate.getFirstName().contains(nameSearch)||candidate.getLastName().contains(nameSearch))){
                    System.out.println(candidate.toString());
                    count++;               
                }
            }
            if(count==0) System.out.println("No Found Information Candidate!");    
        }
    }
}
