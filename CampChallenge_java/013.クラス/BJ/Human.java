/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.BJ;

import java.util.ArrayList;

/**
 *
 * @author guest1Day
 */
abstract class Human {
//ArrayListの変数[myCards]を用意
    ArrayList<Integer>myCards=new ArrayList<Integer>();

//abstractな公開メソッド[open]を用意
    abstract public int open();

//abstractな公開メソッドでArrayList[setCard]
    abstract public void setCard(ArrayList<Integer> setCards);

//abstractな公開メソッド[checkSum]を用意
    abstract public boolean checkSum();   
}