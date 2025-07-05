import java.util.Scanner;
public class Alpha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a = sc.next().charAt(0);
        char c= sc.next().charAt(0);
    if(a<c){
            System.out.println(a+" "+c);
        }
        else{
            System.out.println(c+" "+a);
        }
    }
}
