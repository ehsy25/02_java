package com.lhw.section03.users;

import java.io.*;

public class Application2 {

    public static void main(String[] args) {

        /*
        * tr
        * */
        try (BufferedReader in = new BufferedReader(new FileReader("test.dat"))){

            String s;

            while((s = in.readLine()) != null){
                System.out.println(s);
            }

        } catch (FileNotFoundException | EOFException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
