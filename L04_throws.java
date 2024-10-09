public class L04_throws {
    public static void main(String[] args) {
        int a[]=new int[5];

        System.out.println("-----Hello All-----");

       try{
            getNumberFromArray(a);
       }
       catch(Exception e){
            System.out.println(e);
       }


        System.out.println("-----Bye all-----");
    }
    
    static int getNumberFromArray(int a[]) throws Exception
    {
        return a[8];
    }
    
}
