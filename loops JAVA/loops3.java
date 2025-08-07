import java .util.*;
public class loops3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int range = sc.nextInt();

        System.out.println("Enter the counter");
        int counter = sc.nextInt();
       
        while(counter<=range){
            System.out.print(counter + " ");
            counter++;

        }
        

    }


    
}
