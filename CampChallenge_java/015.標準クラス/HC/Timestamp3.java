/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.HC;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author guest1Day
 */
public class Timestamp3 {
    
    public static void main (String[]args){
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        
        c1.set(2015,0,1,0,0,0);
        c2.set(2015,11,31,23,59,59);
        Date date = c1.getTime();
        Date date2 = c2.getTime();
        
        System.out.println(date2.getTime()-date.getTime());
        
    }
}
