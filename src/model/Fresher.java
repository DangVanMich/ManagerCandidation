/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;



/**
 *
 * @author This PC
 */
public class Fresher extends Candidate{
    private int dateGraduation;
    private String rankGraduation;
    private String university;
    
    public Fresher() {
        super();
    }
    
    public Fresher(String id, String firstName, String lastName, int birthDate, String address, String phone, String email, int typeCadidate,
            int dateGraduation,String rankGraduation,String university){
        super(id,firstName,lastName,birthDate,address,phone,email,typeCadidate);
        this.dateGraduation= dateGraduation;
        this.rankGraduation= rankGraduation;
        this.university= university;
    }

    public int getDateGraduation() {
        return dateGraduation;
    }

    public void setDateGraduation(int dateGraduation) {
        this.dateGraduation = dateGraduation;
    }

    public String getRankGraduation() {
        return rankGraduation;
    }

    public void setRankGraduation(String rankGraduation) {
        this.rankGraduation = rankGraduation;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
    
    
   
}