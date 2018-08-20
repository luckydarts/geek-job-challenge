/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.HC;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author guest1Day
 */
public class HClass_2 {

    public static void  main(String[]args){
        Calendar c = Calendar.getInstance();
        //カレンダーで指定した日時をタイムスタンプに変換
        c.set(2016,10,4,10,0,0);
        Date date = c.getTime();
        //タイムスタンプを出力
        System.out.println(date.getTime());
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        String dataString = sdf.format(date);
        System.out.println(dataString);
    }
}
