/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.Class;

/**
 *
 * @author guest1Day
 */
public class Class1 {
    public String name=null;
    public int age =0;
    public String address=null;


    public void setProfile(String n,int a,String add){
            this.name=n;
            this.age=a;
            this.address=add;
    }

    public void printProfile(){

    System.out.print(name+age+address);
    }

}