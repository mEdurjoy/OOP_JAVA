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
    
    
    // constractor
    Teacher(){
        System.out.println("This is constractor. No need to call me. I am automaticly called when you create object");
    }
    
    // method with parameter
    void setinfo(String n, String g, int a){
        name = n;
        gender = g;
        age = a;
    }
    
    
    //method without parameter
    void display(){
           System.out.println("Name: "+name);
           System.out.println("Name: "+gender);
           System.out.println("Name: "+age);
                     
           System.out.println("--------------------------");
    }
    
}
