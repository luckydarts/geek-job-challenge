/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.HC;

/**
 *
 * @author guest1Day
 */
public class Syutoku {
    
    public static void main(String[]args){
        
        String address ="abc@yahoo.co.jp";
        String add = address.substring(address.indexOf("@")+1);
        
        System.out.println(add.length());
    }
    
}
