public class pattern2 {
    public static void main(String args[]){
        int n=7;
        for(int line=1; line<=7; line++){
            for(int star=1; star<=7-line+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
