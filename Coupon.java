package Com.Demo;

import java.util.Random;

public class Coupon {
    public static void main(String[] args) {
        int numberOfCoupons = 4;
        int couponLength = 3;

        for (int i = 0; i < numberOfCoupons; i++) {
                String couponCode = generateCouponCode(couponLength);
                System.out.println("Coupon " + (i + 1) + ": " + couponCode);
            }
        }

        // Generates a random coupon code of the specified length
        public static String generateCouponCode(int length) {
            String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; // Characters to choose from
            StringBuilder couponCode = new StringBuilder();

            Random random = new Random();
            for (int i = 0; i < length; i++) {
                int randomIndex = random.nextInt(characters.length());
                char randomChar = characters.charAt(randomIndex);
                couponCode.append(randomChar);
            }

            return couponCode.toString();
        }
    }

