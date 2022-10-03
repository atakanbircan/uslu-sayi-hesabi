import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x,n,result=1;
        Scanner input = new Scanner(System.in);
        System.out.println("üslü sayının taban değeri: ");
        x=input.nextInt();
        System.out.println("üslü sayının üs değeri: ");
        n=input.nextInt();
        for (int i=1;i<=n;i++){
          result=result*x;
        }
        System.out.println("x üzeri n: "+result);
    }
}