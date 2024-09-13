import java.util.Scanner;
class Demo{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 1;
        int product = n*n;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(count < 10){
                    System.out.print("0");
                }
                System.out.print(count++ + " ");
        }
        System.out.println();
    }
    }
}