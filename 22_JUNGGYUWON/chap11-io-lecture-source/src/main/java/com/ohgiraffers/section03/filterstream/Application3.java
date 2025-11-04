package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class Application3 {


    public static void main(String[] args) {
        /*
         * 외부 데이터로부터 읽ㄷ어오는 데이터를 바이ㅡㅌ형 정수, 문자, 문자열로만 읽어오면
         * 여러 데이터 타입을 취급하는 경우 별도로 처리를 해줘야한다.
         * 예) 정수 입력받아 처리하려면 parsing을 해줘야한다.
         * "1"================> 1 : parsing
         *
         * */

        DataOutputStream dout = null;

        try {
            dout = new DataOutputStream(new FileOutputStream("src/main/java/com/ohgiraffers/section03/filterstream/score.txt"));

            dout.writeUTF("홍길동");
            dout.writeInt(95);
            dout.writeChar('A');
            dout.writeUTF("이순신");
            dout.writeInt(85);
            dout.writeChar('B');
            dout.writeUTF("김철수");
            dout.writeInt(65);
            dout.writeChar('C');
            dout.writeUTF("신사임당");
            dout.writeInt(100);
            dout.writeChar('A');
        } catch (FileNotFoundException e) {

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dout != null) {
                try {
                    dout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        DataInputStream din = null;

        try {
            din = new DataInputStream(new FileInputStream("src/main/java/com/ohgiraffers/section03/filterstream/score.txt"));
            while(true){
                System.out.println(din.readUTF());
                System.out.println(din.readInt());
                System.out.println(din.readChar());
            }

        }
        catch(EOFException e){
            System.out.println("파일 읽기 완료");
        }
        catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (din != null) {
                try {
                    din.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
