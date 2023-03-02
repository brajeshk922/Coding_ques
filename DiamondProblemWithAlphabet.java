//      A
//     B  B
//    C    C
//   D      D
//  E        E
// F          F
//  E        E
//   D      D
//    C    C
//     B  B
//      A
import java.util.Scanner;
public class DiamondProblemWithAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        char alphabet = 'A';
        int n = (int)(ch - 'A') + 1;
        int x = 2*n-1;
        int space = n-1;

        for(int i=1;i<=x;i++){

            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }

            int space2 = 2*(int)(alphabet - 'A') - 1;
            if(alphabet == 'A'){
                System.out.print(alphabet);
            } else {
                System.out.print(alphabet);
                for(int k=0;k<=space2;k++){
                    System.out.print(" ");
                }
                System.out.print(alphabet);
            }

            System.out.println();

            if(i<n){
                space -= 1;
                alphabet++;
            } else {
                space += 1;
                alphabet--;
            }
        }
        sc.close();
    }
    
}

