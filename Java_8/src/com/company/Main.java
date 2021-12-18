package com.company;

import java.io.*;

public class Main {
    static void First(String str) throws IOException {
        FileWriter fw = new FileWriter("Text1.txt", false);
        fw.write(str);
        fw.flush();
    }
    static void Second() throws IOException {
        FileReader fr = new FileReader("Text1.txt");
        int c;
        while((c = fr.read()) != -1){
            System.out.print((char) c);
        }

    }
    static void Fourth(String str) throws IOException {
        FileWriter fw = new FileWriter("Text1.txt", true);
        fw.write(str);
        fw.close();
    }
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str = br.readLine();

        First(str);
        Second();
        str = br.readLine();
        Fourth(str);
        Second();
    }
}