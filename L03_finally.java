public class L03_finally {

    public static void main(String[] args) {
        int a[]=new int[5];

        System.out.println("-----Hello All-----");

        try{
            System.out.println(a[99]);
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("Handling all the exception");
        }
        finally{
            System.out.println("It will always run");
        }


        System.out.println("-----Bye all-----");
    }
    
}
