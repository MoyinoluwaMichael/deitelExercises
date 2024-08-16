package leetcode.numberSystemCalculator;

import org.junit.platform.commons.util.StringUtils;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        String binary = scanner.nextLine();

        if (!StringUtils.isBlank(binary)) {
            int answer = 0;
            System.out.println();
            for (int i = binary.length() - 1; i > -1; i--) {
                skip();
                int bit = Integer.parseInt(String.valueOf(binary.charAt(i)));
                String superScript = getSuperscript(i);
                String additionSign = i != 0 ? "+ " : "";
                System.out.printf("%-9s" + additionSign, "(" + bit + " x 2" + superScript + ")");
            }

            System.out.println();
            for (int i = binary.length() - 1; i > -1; i--) {
                skip();
                int bit = Integer.parseInt(String.valueOf(binary.charAt(i)));
                String additionSign = i != 0 ? "+ " : "";
                double poweredNumber = Math.pow(2, i);
                int maxSpace = String.valueOf(poweredNumber).length() + 5;
                System.out.printf("%-"+maxSpace+"s" + additionSign, "(" + bit + " x " + removeDecimal(poweredNumber) + ")");
            }

            System.out.println();
            for (int i = binary.length() - 1; i > -1; i--) {
                skip();
                int bit = Integer.parseInt(String.valueOf(binary.charAt(i)));
                String additionSign = i != 0 ? "+ " : "";
                double poweredNumberTimesBit = Math.pow(2, i) * bit;
                answer += (int) poweredNumberTimesBit;
                int maxSpace = String.valueOf(poweredNumberTimesBit).length() - 1;
                System.out.printf("%-"+maxSpace+"s" + additionSign, removeDecimal(poweredNumberTimesBit));
            }
            System.out.println("\n"+binary+"\u2082"+" = " + answer+"\u2081"+"\u2080");
        }
    }

    private static void skip() throws InterruptedException {
        Thread.sleep(500);
    }

    private static String removeDecimal(double number) {
        return String.format("%.0f", number);
    }

    private static String getSuperscript(int i) {
        switch (i) {
            case 1:
                return "\u00B9";
            case 2:
                return "\u00B2";
            case 3:
                return "\u00B3";
            case 4:
                return "\u2074";
            case 5:
                return "\u2075";
            case 6:
                return "\u2076";
            case 7:
                return "\u2077";
            case 8:
                return "\u2078";
            case 9:
                return "\u2079";
            case 0:
                return "\u2070";
            case 10:
                return "\u00B9" + "\u2070";
            case 11:
                return "\u00B9" + "\u00B9";
            case 12:
                return "\u00B9" + "\u00B2";
            case 13:
                return "\u00B9" + "\u00B3";
            case 14:
                return "\u00B9" + "\u00B4";
            case 15:
                return "\u00B9" + "\u00B5";
            case 16:
                return "\u00B9" + "\u00B6";
            case 17:
                return "\u00B9" + "\u00B7";
            case 18:
                return "\u00B9" + "\u00B8";
            case 19:
                return "\u00B9" + "\u00B9";
            case 20:
                return "\u00B2" + "\u2070";
        }
        throw new RuntimeException("Invalid superscript number passed");
    }
}
