package org.example.module2.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        File file = new File("F://MyFile/fetisova");
        FileWriter writer = new FileWriter(file, true);
        for(int i=0; i>=0; i++) {
            System.out.print("Вводите данные для записи: ");
            String text = input.nextLine();
            if (text.equals("0")) {
                writer.close();
                System.out.println("Файл создан.");
                break;
            }
            writer.write(text + "\n");
        }
    }
}
