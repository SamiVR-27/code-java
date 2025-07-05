import java.util.*;
public class Integer{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(a==0){
            System.out.println("zero");
        }else if(a>0){
            System.out.println("Positve number");
        }else{
            System.out.println("Negative number");
        }
    }
}
