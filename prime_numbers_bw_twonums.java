import java.util.Scanner;

public class prime_numbers_bw_twonums{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int lower = sc.nextInt();
        int higher = sc.nextInt();
        
        for(int i=lower;i<=higher;i++){
            int count=0;
            for(int div=2;div*div<=i;div++){
                if(i%div==0){
                    count++;
                    break;
                }
            }
        if(count==0){
            System.out.println(i);
            }    
            

        }
        

    }
    
}
