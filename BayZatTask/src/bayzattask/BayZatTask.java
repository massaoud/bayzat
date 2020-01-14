/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bayzattask;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Masioudi GBADAMASSI
 */
public class BayZatTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println("Input Number of Balls in a Bag: ");
            Scanner scanner = new Scanner(System.in);
            int numberOfBalls = scanner.nextInt();
            if (numberOfBalls <= 0) {
                throw new IllegalArgumentException("Number of Balls in the Bag can't be 0 or Negative.");
            } else {
                System.out.println("TOTAL NUMBER OF WAYS : " + getResult(numberOfBalls));
            }
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Only Numbers are accepted for Input of Balls in a Bag");
        }
    }

    private static int getResult(int numberOfBalls) {
        if (numberOfBalls == 1) {
            return numberOfBalls;
        }
        return ways(numberOfBalls - 1) + ways(numberOfBalls - 2);

    }

    private static int ways(int numberOfBalls) {
        switch (numberOfBalls) {
            case 0:
                throw new IllegalArgumentException("Number of Balls in the Bag are 0 cannot remove anything.");
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                return (numberOfBalls - 1) + (numberOfBalls - 2);
        }
    }
}
