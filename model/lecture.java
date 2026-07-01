/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class lecture extends person {

    private String nidn;
    private String expertise;

    public lecture(String idCard,
                   String name,
                   String nidn,
                   String expertise) {

        super(idCard, name);

        this.nidn = nidn;
        this.expertise = expertise;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public String getExpertise() {
        return expertise;
    }
    
    public String getCardID() {
    return idCard;
}

public String getName() {
    return name;
}

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    @Override
    public String toString() {
        return this.name;
    }
}