package ru.javarush.cryptoAnalyser.akhundov;

import java.io.*;
import java.util.Scanner;

import static ru.javarush.cryptoAnalyser.akhundov.Alphabet.ALPHABET;

public class Decryptor {

    private String fileIn;
    private String fileOut;
    public Scanner sc = new Scanner(System.in);

    public void init(){
        System.out.println("Введите корректный путь файла для чтения: ");
        fileIn = sc.nextLine();

        System.out.println("Введите корректный путь файла для записи: ");
        fileOut = sc.nextLine();
    }

    public void decryptByKey(int key){

        try(FileReader reader = new FileReader(fileIn);
            FileWriter writer = new FileWriter(fileOut, false))
        {
            int c;
            while((c=reader.read())!=-1){
                int index = ALPHABET.indexOf(Character.toLowerCase((char)c));
                    int newIndex = index - key;
                    if(newIndex < 0){
                        newIndex = newIndex + ALPHABET.size();
                    }
                    writer.append(ALPHABET.get(newIndex));
                }
        } catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
