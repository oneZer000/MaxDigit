import java.util.Scanner;

public class MaxDigit {
    private static int maxDigit;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = in.nextInt();
        int maxDigit = MaxDigit.findLargestDigit(num);
        System.out.println(maxDigit);
    }
    private static int findLargestDigit(int num_int){

        String num_str = String.valueOf(num_int);
        char[] num_ch_arr = num_str.toCharArray();

        char firstDigitCh = num_ch_arr[0];
        int firstDigitInt = Character.getNumericValue(firstDigitCh);
        MaxDigit.maxDigit = firstDigitInt;

        for (char char_ch: num_ch_arr){
            int char_int = Character.getNumericValue(char_ch);
            if (char_int > MaxDigit.maxDigit){
                MaxDigit.maxDigit = char_int;
            }
        }
//        System.out.println(MaxDigit.maxDigit);
        return MaxDigit.maxDigit;
    }
}