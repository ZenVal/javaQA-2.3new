package ru.netology.sqr;

public class SQRService {
    public int HowManySqr(int lowerBorder, int upperBorder) {
        int amountSqr = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i >= lowerBorder) {
                if (i * i <= upperBorder) {
                    amountSqr++;

                }
            }
        }
        return amountSqr;
    }
}
