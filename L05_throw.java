import java.util.*;

public class L05_throw {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");

        try{
            int age=sc.nextInt();
            if(age>100){
                throw new TheAbhishekException("My error is this");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    
}

// Custom exception
class TheAbhishekException extends Exception{

    public TheAbhishekException(String message){
        super(message);
    }
}
