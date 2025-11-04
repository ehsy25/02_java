package com.ohgiraffers.io.controller;

import java.io.*;
import java.util.Scanner;

public class FileController {

    Scanner sc = new Scanner(System.in);

    /*
    * 1. 내용 입력 "exit" 입력 전까지 모든 내용을 StringBuilder 에 누적. 각 줄 끝에 \n 추가.
       2. 파일 쓰기 BufferedWriter 를 열어 sb 의 내용을 파일에 작성합니다.
       3. 자원 해제 finally 블록에서 bw.close() 를 호출하여 스트림을 안전하게 닫습니다.
    * */
    public void fileSave() {

        System.out.print("파일을 만드시겠습니까? (y 혹은 Y를 입력해주세요. ");
        String save = sc.nextLine();

        if (save.equalsIgnoreCase("y")) {
            System.out.print("저장할 파일명을 입력하시오 : ");
            String fileName = sc.nextLine();

            String filePath = "src/main/java/com/ohgiraffers/io/" + fileName;
            BufferedWriter bw = null;

            try {
                bw = new BufferedWriter(new FileWriter(filePath));
                String content = "";
                System.out.print("일기를 입력해주세요. ");

                while (!content.equals("exit")) {
                    content = sc.nextLine();
                    if(!content.equals("exit")) {
                        bw.write(content + "\n");
                    }
                }
                System.out.println(fileName + ".txt 파일에 성공적으로 저장하였습니다.");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    bw.close();
                } catch (IOException e) {
                }
            }
        }
    }

    /*
    * 1. 파일 읽기 BufferedReader 를 열어 파일 내용을 읽을 준비를 합니다.
       2. 내용 출력 br.readLine() 을 사용하여 파일 내용을 한 줄씩 읽어 콘솔에 출력합니다. null 반환 시 종료.
       3. 예외 처리 파일이 없을 경우 FileNotFoundException 처리.
    * */
    public void fileOpen() {

        String content = null;

        BufferedReader br = null;

        System.out.print("읽을 파일을 입력하세요. ");
        String fileName = sc.nextLine();
        String filePath = "src/main/java/com/ohgiraffers/io/" + fileName;
        boolean exists = new File(filePath).exists();
        if(exists) {
            try {
                br = new BufferedReader(new FileReader(filePath));

                String temp;

                System.out.println("파일 읽기 시작! \n");
                while((temp = br.readLine()) != null) {
                    System.out.println(temp);
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    br.close();
                } catch (IOException e) {}
            }
        } else {
            System.out.println("해당 파일이 존재하지 않습니다.");
        }
    }


    /*
    * 1. 이어쓰기 모드 설정 FileWriter 에 true 를 전달하여 이어쓰기 스트림을 준비합니다.
      2. 기존 내용 출력 br.readLine() 으로 기존 파일 내용을 모두 읽어 콘솔에 출력합니다.
      3. 파일에 추가 사용자 확인("y") 후, bw.write() 를 사용하여 파일 끝에 새로운 내용을 추가합니다.
      4. 자원 해제 finally 에서 br.close() 와 bw.close() 두 스트림을 모두 닫습니다.
    * */

    public void fileEdit() {
        java.io.BufferedReader br = null;
        BufferedWriter bw = null;
        Scanner sc = new Scanner(System.in);

        System.out.print("수정할 파일명 : ");
        String fileName = sc.nextLine();
        String filePath = "src/main/java/com/ohgiraffers/io/" + fileName;
        boolean exists = new File(filePath).exists();

        if(exists) {
            try {
                br = new BufferedReader(new FileReader(filePath));

                String temp;

                System.out.println("파일 읽기 시작! \n");
                while((temp = br.readLine()) != null) {
                    System.out.println(temp);
                }

                System.out.print("수정하시겠습니까? (y 혹은 Y) : ");
                String save = sc.nextLine();
                if(save.equalsIgnoreCase("y")) {
                    bw = new BufferedWriter(new FileWriter(filePath, true));
                    String content = "";
                    System.out.println("수정 할 내용을 입력하세요. (exit 입력하면 끝)");

                    while(!content.equals("exit")) {
                        content = sc.nextLine();
                        if(!content.equals("exit")) {
                            bw.write(content + "\n");
                        }
                    }

                    System.out.println(fileName + ".txt 파일의 내용이 변경되었습니다.");
                }

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    br.close();
                    bw.close();
                } catch (IOException e) {

                }
            }
        } else {
            System.out.println("해당 파일이 존재하지 않습니다.");
        }
    }
}
