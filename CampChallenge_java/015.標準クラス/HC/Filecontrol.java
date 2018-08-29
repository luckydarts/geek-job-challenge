/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.HC;

//パッケージを持ってくる
import java.io.*;

/**
 *
 * @author guest1Day
 */
public class Filecontrol {
    
    public static void main(String[]args){
        
        try{
            File fp = new File("file.txt");
            FileWriter fw = new FileWriter(fp,true);
            
            fw.write("私の名前はAraiYoshimichiです");
            fw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
