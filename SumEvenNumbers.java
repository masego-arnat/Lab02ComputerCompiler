import  java.util.Scanner;
public class SumEvenNumbers {
 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int startNo = scanner.nextInt();
        System.out.print("Enter end number: ");
        int endNo = scanner.nextInt();

        // Check if startNo is less than 0
        if (startNo < 0) {
            System.out.println("startNo cannot be less than 0");
            return;
        }

        // Check if endNo is less than 0
        if (endNo < 0) {
            System.out.println("endNo cannot be less than 0");
            return;
        }

        // Check if endNo is greater than 9
        if (endNo > 9) {
            System.out.println("endNo cannot be greater than 9");
            return;
        }

        // Check if startNo is greater than endNo
        if (startNo > endNo) {
            System.out.println("startNo must NOT be greater than endNo");
            return;
        }

        int sumEven = 0;
        for (int i = startNo; i <= endNo; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            }
        }
        System.out.println("Sum of Even Numbers = " + sumEven);
    }
}
