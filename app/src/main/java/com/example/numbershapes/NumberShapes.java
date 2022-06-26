package com.example.numbershapes;

public class NumberShapes {

    public int number;

    public boolean isTriangleNumber (int number) {

        int counter = 0 , sum = 0;

        while (sum < number) {

            sum = sum + counter;
            counter++;

            if (sum == number) {
                return true;
            }

        }

        return  false;

    }

    public boolean isSquareNumber (int number) {

        int counter = 1 , square = 1;

        while (square <= number) {

            square = counter * counter;
            counter++;

            if (square == number) {
                return true;
            }

        }

        return false;
    }

}
