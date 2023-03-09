import  java.util.Scanner;
public class SumEvenNumbers {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter startNo and endNo separated by a space: ");
        int startNo = input.nextInt();
        int endNo = input.nextInt();

        if (startNo < 0) {
            System.out.println("startNo cannot be less than 0");
            return;
        }

        if (endNo < 0) {
            System.out.println("endNo cannot be less than 0");
            return;
        }

        if (endNo > 9) {
            System.out.println("endNo cannot be greater than 9");
            return;
        }

        if (startNo > endNo) {
            System.out.println("startNo must NOT be greater than endNo");
            return;
        }

        int sum = 0;
        for (int i = startNo; i <= endNo; i++) {
            sum += i;
        }

        System.out.println("Sum of All Numbers = " + sum);
    }
}
