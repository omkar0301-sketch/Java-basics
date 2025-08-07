import java.util.*;

public class dwloop {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number that is not multiple of 10");
         
        

        do{
            int num = sc.nextInt();
            
            if(num%10==0){
                break;
            }
            
            System.out.println(num);
        }while(true);
    }
    
}
