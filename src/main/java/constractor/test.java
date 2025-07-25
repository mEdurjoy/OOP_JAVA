
package constractor;

public class test {
  public static void main(String[] args){
    Student std1 = new Student();
    
    Student std2 = new Student("Tanim Hasan",11,2);
    std2.display();
    Student std3 = new Student("Lazley Khatun",12);
    std3.display();
  }
}
