// Solution

public class L02_try_catch_solution {

    public static void main(String[] args) {
        int a[]=new int[5];

        System.out.println("-----Hello All-----");

        // try{
            

        //     int result=5/0;

        //     System.out.println(a[8]);

        // }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("Tried to access the out of bound elements");
        // }
        // catch(ArithmeticException e){
        //     System.out.println(e.getStackTrace());
        //     System.out.println(e.getMessage());
        //     System.out.println(e);
        // }

        
        // Handle all exception in one
        try{
            System.out.println(a[10]);
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("Handling all the exception");
        }


        System.out.println("-----Bye all-----");
    }
    
}
