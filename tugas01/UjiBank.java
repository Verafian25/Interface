/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas01;

/**
 *
 * @author HP 240 G8
 */
public class UjiBank implements Bank {
     public void menabung(){
        System.out.println("menabung");
    }
    public void Transfer(){
        System.out.println("transfer");
    }
    public void Menarik(){
        System.out.println("menarik");
    }
    
    public static void main(String[] args){
        UjiBank obj = new UjiBank();
        obj.menabung();
        obj.Transfer();
        obj.Menarik();
    }
}
