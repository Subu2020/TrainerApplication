package com.ust.TrainerApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="trainerInfo")
public class TrainerInfo {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private String skills;
    private String contactNumber;
    private String qualification;
    private String experience;
    public TrainerInfo() {
    }
    public TrainerInfo(Long id, String name, String email, String skills, String contactNumber, String qualification,
            String experience) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.skills = skills;
        this.contactNumber = contactNumber;
        this.qualification = qualification;
        this.experience = experience;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSkills() {
        return skills;
    }
    public void setSkills(String skills) {
        this.skills = skills;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    public String getQualification() {
        return qualification;
    }
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    public String getExperience() {
        return experience;
    }
    public void setExperience(String experience) {
        this.experience = experience;
    }
}
