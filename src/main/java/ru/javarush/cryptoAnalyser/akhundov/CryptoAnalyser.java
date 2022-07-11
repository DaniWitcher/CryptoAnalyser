package ru.javarush.cryptoAnalyser.akhundov;

import java.util.Scanner;

public class CryptoAnalyser {

    private static final Encryptor encryptor = new Encryptor();
    private static final Decryptor decryptor = new Decryptor();
    public static int key;
    public static Scanner sc = new Scanner(System.in);

    public static void start(int caseNumber){
        switch(caseNumber)
        {
            case 1 : {
                encryptor.init();
                encryptor.encrypt();
                break;
            }
            case 2 : {
                System.out.println("Введите ключ : ");
                key = sc.nextInt();
                decryptor.init();
                decryptor.decryptByKey(key);
                break;
            }
            case 3 :
            case 4 :
                break;
        }
    }
}
