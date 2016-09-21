/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.Serializable;

/**
 *
 * @author alice
 */
public class EnrollForm implements Serializable{
    private String name;
    private String supportClass;
    private String province;
    private int contact;
    
    public EnrollForm(){
        name = new String();
        supportClass = new String();
        province = new String();
        contact = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSupportClass() {
        return supportClass;
    }

    public void setSupportClass(String supportClass) {
        this.supportClass = supportClass;
    }
    
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }
    
}
