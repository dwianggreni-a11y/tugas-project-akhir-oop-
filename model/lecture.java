/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author User
 */
public class lecture extends person {

    private String nidn;
    private String expertise;

    public lecture(String idCard,
                    String name,
                    String nidn,
                    String expertisetv) {

        super(idCard, name);

        this.nidn = nidn;
        this.expertise = expertise;
    }
    public String toString(){
        return this.name;
    }

}
    

