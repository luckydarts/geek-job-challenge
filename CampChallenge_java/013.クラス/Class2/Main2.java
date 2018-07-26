/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp;

/**
 *
 * @author guest1Day
 */
public class Main2 {
    public static void main(String[] args){
    Class2 hito=new Class2();
    
    //setProfile呼び出し
    hito.setProfile("新井善道",19,"埼玉県");
    hito.printProfile();
    //データをクリア
    hito.clearProfile();
    hito.printProfile();
    }
}
