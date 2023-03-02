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
public class UjiSuperhero implements Superhero {
    public void superman(){
        System.out.println("superman");
    }
    public void spiderman(){
        System.out.println("spiderman");
    }
    public void Thor(){
        System.out.println("Thor");
    }
    
    public static void main(String[] args){
        UjiSuperhero obj = new UjiSuperhero();
        obj.superman();
        obj.spiderman();
        obj.Thor();
    }
}
