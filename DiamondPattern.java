import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 2*n-1;
        int star = 1;
        int space = n-1;
        
        for(int i=1;i<=x;i++){

            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            if(i<n){
                space--;
                star+=2;
            } else {
                space++;
                star-=2;
            }
            System.out.println();
        }
        sc.close();
    }
}
