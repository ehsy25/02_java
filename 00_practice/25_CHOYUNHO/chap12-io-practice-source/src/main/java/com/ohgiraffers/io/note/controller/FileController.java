package com.ohgiraffers.io.note.controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileController {
    public void fileSave() {
        Scanner sc = new Scanner(System.in);
        System.out.println("내용을 입력하세요 : ");
        StringBuilder sb = new StringBuilder();
        String save;
        while(true){
            String str = sc.nextLine();
            if(str.equals("exit")){
                save = "y";
                break;
            }
            else{
                sb.append(str);
                sb.append("\n");
            }

        }

        if(save.equalsIgnoreCase("y")) {
            System.out.print("저장할 파일명을 입력하시오 : ");
            String fileName = sc.nextLine();
            BufferedWriter bw = null;
            try{
                bw = new BufferedWriter(new FileWriter(fileName));
                bw.write(sb.toString());
                System.out.println(fileName + ".txt 파일에 성공적으로 저장하였습니다.");
            }catch(IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
// ...
    }

}
