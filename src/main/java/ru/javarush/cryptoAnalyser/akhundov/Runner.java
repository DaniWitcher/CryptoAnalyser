package ru.javarush.cryptoAnalyser.akhundov;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int caseNumber;

        while(true) {
            CryptoMenu.printMenu();
            caseNumber = sc.nextInt();
            if(caseNumber > 4)
                    break;
            CryptoAnalyser.start(caseNumber);
        }
    }
}
