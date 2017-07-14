package com.courses;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int perimetr;
        int storona;
        System.out.println("Введите заранее известные периметр квадрата: ");
        perimetr = in.nextInt();
        storona = perimetr / 4;
        System.out.println("Сторона квадрата по зиданному периметру - " + perimetr + " = " + storona);
    }
}
