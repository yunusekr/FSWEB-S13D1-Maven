package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isCatPlaying(true,10));
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if(clock < 0 || clock > 23) {
            return false;
        }
        if ((clock < 8 || clock >= 20) && isBarking) {
            return true;
        }
        return false;

    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return 13 <= firstAge && firstAge <= 19 || 13 <= secondAge && secondAge <= 19 || 13 <= thirdAge && thirdAge <= 19;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if(isSummer){
            return 25 <= temp && temp <= 45;
        } else {
            return 25 <= temp && temp <= 35;
        }
    }

    public static double area(double width, double height) {
        if(width >= 0 && height >= 0) {
            return height*width;
        }
        return -1;

    }

    public static double area(double radius) {
        if(radius >= 0) {
            return radius*radius*Math.PI;
        }
        return -1;
    }
}