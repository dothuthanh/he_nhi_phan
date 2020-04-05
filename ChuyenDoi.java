import java.util.Scanner;
import java.util.Stack;

public class ChuyenDoi {
    public static void main(String[] args) {
        int decimalNumber;
        Stack<String> binaryNymber = new Stack<>();
        String binaryNumberResult = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so can doi sang he nhi phan");
        decimalNumber = scanner.nextInt();
        while (decimalNumber !=  0){
            int rem = 0;
            rem = decimalNumber % 2;
            decimalNumber = decimalNumber/2;
            binaryNymber.push(rem + "");
        }
        for (int i =0 ; i < binaryNymber.size(); i++){
            binaryNumberResult += binaryNymber.get(i);
        }
        System.out.println("so sau khi doi sang he nhi phan" + binaryNumberResult);
    }
}
