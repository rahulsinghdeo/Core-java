import java.util.Scanner;
class ArmstrongOrNot {

    public static void main(String[] args) {

        int n, n1, temp, total = 0;
        System.out.println("Ënter 3 Digit Number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        n1 = n;

        for( ;n1!=0;n1 /= 10)
        {
            temp = n1 % 10;
            total = total + temp*temp*temp;
        }

        if(total == n)
            System.out.println(n + " is an Armstrong number");
        else
            System.out.println(n + " is not an Armstrong number");
    }
}
