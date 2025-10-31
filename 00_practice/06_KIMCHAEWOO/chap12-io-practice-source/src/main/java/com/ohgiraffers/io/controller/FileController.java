package com.ohgiraffers.io.controller;

import java.io.*;
import java.util.Scanner;

public class FileController {

    public void fileSave() {

        Scanner sc = new Scanner(System.in);
        String input = "";
        StringBuilder stringBuilder = new StringBuilder();
        String save = "";

        // 입력 받기
        while (true) {
            System.out.print("내용 입력: ");
            input = sc.nextLine();

            if (input.equals("exit")) {
                save = "y";
                break;
            } else {
                stringBuilder.append(input + "\n");
            }
        }

        // 파일 쓰기
        if (save.equalsIgnoreCase("y")) {
            System.out.print("저장할 파일명 입력: ");
            String fileName = sc.nextLine();
            BufferedWriter bw = null;

            try {

                bw = new BufferedWriter(new FileWriter("src/main/java/com/ohgiraffers/io/controller/" + fileName + ".txt "));

                bw.write(stringBuilder.toString());
                bw.flush();

                System.out.println(fileName + ".txt 파일에 저장 완료");

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (bw != null) {
                    try {
                        bw.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

    public void fileOpen() {

        Scanner sc = new Scanner(System.in);
        String fileName = "";
        String content = null;

        BufferedReader br = null;

        System.out.print("열 파일명: ");
        fileName = sc.nextLine();

        try {
            br = new BufferedReader(new FileReader("src/main/java/com/ohgiraffers/io/controller/" + fileName + ".txt "));

            while ((content = br.readLine()) != null) {
                System.out.println(content);
            }

        }  catch (FileNotFoundException e) {
            System.out.println("파일 못 찾음");
        } catch (EOFException e) {
            System.out.println("파일 다 읽음");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void fileEdit() {

        Scanner sc = new Scanner(System.in);
        String fileName = "";
        String content = null;
        String save = "";

        System.out.print("수정할 파일명: ");
        fileName = sc.nextLine();

        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = null;
        FileWriter fileWriter = null;

        try {
            bufferedReader = new BufferedReader(new FileReader("src/main/java/com/ohgiraffers/io/controller/" + fileName + ".txt "));
            fileWriter = new FileWriter("src/main/java/com/ohgiraffers/io/controller/" + fileName + ".txt ", true);

            while ((content = bufferedReader.readLine()) != null) {
                System.out.println(content);
            }

            while (!save.equalsIgnoreCase("exit")) {
                System.out.print("추가할 내용 입력: ");
                save = sc.nextLine();

                if (save.equals("exit")) {
                    save = "y";
                    break;
                } else {
                    stringBuilder.append(save + "\n");
                }
            }

            if (save.equalsIgnoreCase("y")) {
                content = stringBuilder.toString();

                fileWriter.write(content);

                System.out.println(fileName + ".txt 파일의 내용 변경");
            } else {
                System.out.println("메뉴로 돌아갑니다.");
            }

        } catch (EOFException e) {
            System.out.println("다 읽음");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
