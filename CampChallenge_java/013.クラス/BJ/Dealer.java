/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.BJ;

import java.util.ArrayList;
import java.util.Random;
import java.util.*;

/**
 *
 * @author guest1Day
 */
//抽象class[Human]を継承
class Dealer extends Human {
    
        
//ArrayListの変数[cards]を用意
    ArrayList<Integer>cards=new ArrayList<Integer>();

//全てのカード(・13*4 ・10以上の数は10とみなす）を持たせる初期処理)
    Dealer(){
        for(int i = 1;i<= 4; i++){
            for(int q =1;q<=13; q++){ 
                if(q >=10){
                    cards.add(10);
                } else {
                    cards.add(q);
                }
            }
        }
    }
    public ArrayList<Integer> deal(){
        Random rand = new Random();

        //メソッド(cardsからランダムで2枚を戻り値とする)[deal]を用意
        ArrayList<Integer>Arraydeal = new ArrayList();
            //2回繰り返す
            //山札から1枚取得したデータを変数に代入(ランダム)
            //取得した数字をArrayDealに追加
            //山札から取得したデータを排除
        
        for (int i = 1;i <= 2; i++){
            int j =rand.nextInt(this.cards.size());
            Arraydeal.add(this.cards.get(j));
            this.cards.remove(j);
        }
    return Arraydeal;
}
//公開メソッド(cardsからランダムで1枚を戻り値とする)[hit]を用意
ArrayList<Integer> hit(){
    ArrayList<Integer>Arrayhit = new ArrayList();
    Random rand = new Random();
       
    int y =rand.nextInt(this.cards.size());
    Arrayhit.add(this.cards.get(y));
    this.cards.remove(y);
        
    return Arrayhit;
}
    //abstractなメソッド[open]を用意
    public int open(){
        //myCardsのカードの合計値を返却
        int Total = 0;
        for(int value : myCards){
            Total = Total + value;
        }
        return Total;
    }
    //abstructな公開メソッドでArrayList(setCards)を引用としている[setCard]を用意
        public void setCard(ArrayList<Integer>setCards){
        //ArrayListで貰ったカード情報をmyCardsに追加
        //setCardsで所得した値[s]をmyCardsに追加
            for(int s = 0; s < setCards.size(); s++){
                myCards.add(setCards.get(s));
            }
        }
    //abstructな公開メソッド
        public boolean checkSum(){
            if(open() <17){
                return true;
            }else{
                return false;
            }
        }
}


