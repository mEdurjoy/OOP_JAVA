/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author nrdna
 */
public class Teacher {
    String name, gender;
    int age;
    
    Teacher(){
        System.out.println("---No Information---");
    }
    // constractorn with parameters
    Teacher(String n, String g, int a){
        name = n;
        gender = g;
        age = a;
        System.out.println("---Parametraise Constractor---");
    }
     
    
    //method without parameter
    void display(){
           System.out.println("Name: "+name);
           System.out.println("Name: "+gender);
           System.out.println("Name: "+age);
                     
           System.out.println("--------------------------");
    }
    
}
