package com.ohgiraffers.io.note.controller;

import java.io.*;
import java.util.Scanner;

public class FileController {
    private String base = "src/main/java/com/ohgiraffers/io/note/";

    public void filesave() {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.print("입력 : ");
        while (true) {
            String input = sc.nextLine();
            if (input.equals("exit")) {
                break;
            }
            else{
                sb.append(input + "\n");
            }
        }

        System.out.print("저장하시겠습니까? : ");
        String save = sc.nextLine();
        if (save.equalsIgnoreCase("y")) {
            System.out.print("저장할 파일명을 입력하시오 : ");
            String fileName = sc.nextLine();
            BufferedWriter bw = null;
            try {
                String path = base + fileName + ".txt";
                bw = new BufferedWriter(new FileWriter(path));
                bw.write(sb.toString());
                System.out.println(fileName + ".txt 파일에 성공적으로 저장하였습니다.");
                bw.flush();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (bw != null) {
                    try {
                        bw.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        } else {
            System.out.println("다시 메뉴로 돌아갑니다.");
        }
    }

    public void fileopen() {
        Scanner sc = new Scanner(System.in);

        System.out.print("열기 할 파일명 : ");
        String fileName = sc.nextLine();
        String content = null;

        BufferedReader br = null;
        try {
            String path = base + fileName + ".txt";
            br = new BufferedReader(new FileReader(path));

            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                } else {
                    System.out.println(line);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public void fileEdit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 파일명 : ");
        String fileName = sc.nextLine();

        BufferedWriter bw = null;
        BufferedReader br = null;
        try {
            String path = base + fileName + ".txt";
            bw = new BufferedWriter(new FileWriter(path, true));
            br = new BufferedReader(new FileReader(path));

            // 기존 출력
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                } else {
                    System.out.println(line);
                }
            }

            // 이어쓰기
            StringBuilder sb = new StringBuilder();
            while (true) {
                String input = sc.nextLine();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                } else {
                    sb.append(input + "\n");
                }
            }

            System.out.print("저장하겠습니까? : ");
            String save = sc.nextLine();
            if (save.equalsIgnoreCase("y")) {
                bw.write(sb.toString());
                bw.flush();
                System.out.println(fileName + ".txt 파일의 내용이 변경되었습니다.");
            } else {
                System.out.println("다시 메뉴로 돌아갑니다.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
