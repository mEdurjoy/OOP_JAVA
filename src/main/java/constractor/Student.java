
package constractor;

public class Student {
    String name;
    int roll, Class;
    Student(){
        System.out.println("<<<<<---Without parameters--->>>>>");
    }
    Student(String n, int r, int c){
        name = n;
        roll = r;
        Class = c;
    }
    Student(String n, int c){
        name = n;
        Class = c;
    }
    void display(){
        System.out.println("Name :"+name);
        System.out.println("Class :"+Class);
        System.out.println("Roll :"+roll);
        
        System.out.println("___________________________________");
    }
}
