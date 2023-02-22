package ru.natology.sqr;

public class SQRService {
    public int calc(int min, int max) {
        int result = 0;
        for (int i = 10; i <= 99; i++) {
            int Square = i * i;
            if (Square >= min) {
                if (Square <= max) {
                    result++;
                }
            }
        }
        return result;
    }
}
