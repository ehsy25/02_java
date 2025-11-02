package com.ohgiraffers.io.controller;

import java.io.*;
import java.util.*;

public class FileController {
    private String save;
    private Scanner sc = new Scanner(System.in);

    public void fileSave() {
        StringBuilder sb = new StringBuilder();
        System.out.println("파일에 저장할 내용을 입력하세요. (exit 입력시 종료)");
        while (true) {
            String line = sc.nextLine();
            if ("exit".equalsIgnoreCase(line)) {
                break;
            }
            sb.append(line).append("\n");
        }

        System.out.print("저장하시겠습니까?(y/n) : ");
        save = sc.nextLine();

        if (save.equalsIgnoreCase("y")) {
            System.out.print("저장할 파일명을 입력하시오 : ");
            String fileName = sc.nextLine();
            BufferedWriter bw = null;
            try {
                bw = new BufferedWriter(new java.io.FileWriter(fileName + ".txt"));
                bw.write(sb.toString());

                System.out.println(fileName + ".txt 파일에 성공적으로 저장하였습니다.");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (bw != null) {
                    try {
                        bw.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public void fileOpen() {
        System.out.print("열기 할 파일명 : ");
        String fileName = sc.nextLine();
        String content = null;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(fileName + ".txt"));
            String line = null;
            while ((line = br.readLine()) != null) {
                if(content == null) {
                    content = line;
                } else {
                    content += "\n" + line;
                }
            }
            if (content != null) {
                System.out.println("===== 파일 내용 =====");
                System.out.println(content);
            } else {
                System.out.println("파일이 비어 있습니다.");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void fileEdit() {
        System.out.print("수정할 파일명 : ");
        String fileName = sc.nextLine();
        String content = null;
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader(fileName + ".txt"));
            String line = null;
            while ((line = br.readLine()) != null) {
                if(content == null) {
                    content = line;
                } else {
                    content += "\n" + line;
                }
            }
            if (content != null) {
                System.out.println("===== 파일 내용 =====");
                System.out.println(content);
            } else {
                System.out.println("파일이 비어 있습니다.");
            }
            System.out.print("추가로 작성할 내용을 입력해주세요 (exit 입력시 종료) : ");
            StringBuilder sb = new StringBuilder();
            while (true) {
                String input = sc.nextLine();
                if ("exit".equalsIgnoreCase(input)) {
                    break;
                }
                sb.append(input).append("\n");
            }
            System.out.println("저장하시겠습니까? (y/n) : ");
            save = sc.nextLine();

            if (save.equalsIgnoreCase("y")) {
                bw = new BufferedWriter(new FileWriter(fileName + ".txt",true));
                bw.write(sb.toString());
                bw.flush();
                System.out.println(fileName + ".txt 파일의 내용이 변경되었습니다.");
            } else {
                System.out.println("다시 메뉴로 돌아갑니다.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (bw != null){
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
