/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.HC;

import java.util.Date;
import java.io.*;
import java.text.SimpleDateFormat;

/**
 *
 * @author guest1Day
 */
public class Filecontrol3 {
    
    public static void main(String[]args){
        try{
            File fp = new File("log.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(fp,true));
//            FileWriter fw = new FileWriter(fp,true);

        
            Date now = new Date ();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss 開始");
        
            String dataString1 = sdf.format(now);
            System.out.println(dataString1);
        
        
            for(int i = 1; i < 10; i++){
                for(int x = 1; x <10; x++){
                    //1～9までの数字を1～9で累乗
                    System.out.println("「"+ i +"」の「"+ i +"」乗は");
                    System.out.println("「"+ Math.pow(i,x) +"」です。");
                }
            }
            Date now2 = new Date();
            SimpleDateFormat sdf2 =new SimpleDateFormat("yyyy-MM-DD HH:mm:ss 終了");

            String dataString2 = sdf2.format(now2);
            System.out.println(dataString2);
            bw.write(dataString1);
            bw.newLine();
            bw.write(dataString2);
            bw.close();
        }catch(IOException e){
            e.printStackTrace();
        
        }
    }
}
