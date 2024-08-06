
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int giftValue = Integer.valueOf(scan.nextLine());
        int taxLimit;
        int minGiftRange;
        double taxRate;
        double giftTax;
        
        if(giftValue >= 5000 && giftValue <= 25000) {
            taxLimit = 100;
            minGiftRange = 5000;
            taxRate = 0.08;
            giftTax = (taxLimit + (giftValue - minGiftRange) * taxRate);
            System.out.println("Tax:" + giftTax);
        } else if (giftValue >= 25001 && giftValue <= 55000) {
            taxLimit = 1700;
            minGiftRange = 25000;
            taxRate = 0.10;
            giftTax = (taxLimit + (giftValue - minGiftRange) * taxRate);
            System.out.println("Tax:" + giftTax);
        } else if (giftValue >= 55001 && giftValue <= 200000) {
            taxLimit = 4700;
            minGiftRange = 55000;
            taxRate = 0.12;
            giftTax = (taxLimit + (giftValue - minGiftRange) * taxRate);
            System.out.println("Tax:" + giftTax);
        } else if (giftValue >= 200001 && giftValue <= 1000000) {
            taxLimit = 22100;
            minGiftRange = 200000;
            taxRate = 0.15;
            giftTax = (taxLimit + (giftValue - minGiftRange) * taxRate);
            System.out.println("Tax:" + giftTax);
        } else if (giftValue > 1000000) {
            taxLimit = 142100;
            minGiftRange = 1000000;
            taxRate = 0.17;
            giftTax = (taxLimit + (giftValue - minGiftRange) * taxRate);
            System.out.println("Tax:" + giftTax);
        } else {
            System.out.println("No tax!");
        }
    }
}
