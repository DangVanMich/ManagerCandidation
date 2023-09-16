/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author This PC
 */
public class Experience extends Candidate{
    private int expInYear;
    private String proSkill;
    
    public Experience() {
        super();
    }
    
    public Experience(String id, String firstName, String lastName, int birthDate, String address, String phone, String email, int typeCadidate,
            int expInyear, String proSkill){
        super(id,firstName,lastName,birthDate,address,phone,email,typeCadidate);
        this.expInYear= expInyear;
        this.proSkill= proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }
    
    
    
    
}
