package Percobaan1.MotorEncapsulation;

public class MotorDemo {//Andreagazy Iza Amerianto
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.printStatus();
        motor.kecepatan = 50;
        motor.printStatus();
    }
}
