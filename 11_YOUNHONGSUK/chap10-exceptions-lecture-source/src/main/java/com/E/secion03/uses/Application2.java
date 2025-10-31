package com.E.secion03.uses;

import java.io.*;

public class Application2 {

    public static void main(String[] args) {

        /*try-with-resource*/

        try (BufferedReader br = new BufferedReader(
                new FileReader("test.txt")))
        {
            String s;
            while((s = br.readLine())!= null){
                System.out.println(s);
            }
        }catch (FileNotFoundException | EOFException e) {
            throw new RuntimeException(e);
        }catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
