package com.bridgelabz.clinicops.model;

public class Doctor {

    private String id;
    private String name;
    private String specialization;
    private int experience;
    private String shift;

    public Doctor(String id, String name, String specialization,
                  int experience, String shift) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
        this.shift = shift;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getExperience() {
        return experience;
    }

    public String getShift() {
        return shift;
    }

    @Override
    public String toString() {
        return "Doctor ID      : " + id +
                "\nName          : " + name +
                "\nSpecialization: " + specialization +
                "\nExperience    : " + experience + " Years" +
                "\nShift         : " + shift;
    }
}
