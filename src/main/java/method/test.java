package method;

public class test {
    public static void main(String[] args){
       returnDemo obj = new returnDemo();
       int p = obj.square(5);

       System.out.println("Square is: "+ p);
        System.out.println("Square is: "+ obj.square(10));
    }
}
