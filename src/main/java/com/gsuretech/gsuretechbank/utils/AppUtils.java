package com.gsuretech.gsuretechbank.utils;

import java.util.Random;

public class AppUtils {
    public static String generateOtp(){
        StringBuilder otp = new StringBuilder();
        Random random = new Random();
        int count = 0;
        while (count < 5){
            otp.append(random.nextInt(10));
            ++count;
        }
        return otp.toString();
    }

}
