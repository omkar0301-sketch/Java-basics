import java.util.*;
public class Floops2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse");
        int num = sc.nextInt();

        while(num>0)
        {
            int lastdigit = num%10;
            System.out.print(lastdigit+ " ");
            num = num/10;
        }
        


    }
    
}
