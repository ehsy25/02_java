package com.ohgiraffers.io.note.controller;

import java.io.*;
import java.util.Scanner;

public class FileController {
    Scanner sc = new Scanner(System.in);
    public void fileSave(){
        boolean flag = true;

        StringBuilder text = new StringBuilder(); // 입력할 내용에 대한 스트링빌더 객체

        while(flag){
            System.out.print("입력할 문장을 입력해주세요 (끝내시려면 exit을 입력해주세요) : ");
            String input = sc.nextLine();

            if(input.equals("exit")){
                flag = false;
                System.out.print("저장하시겠습니까? (y or no): ");
                String save = sc.nextLine();
                if(save.equalsIgnoreCase("y")){
                    System.out.print("저장할 파일명을 입력하시오 : ");
                    String fileName = sc.nextLine();
                    BufferedWriter bw = null;
                    try{
                        bw = new BufferedWriter(new FileWriter(fileName+".txt"));
                        for(int i = 0; i < text.length(); i++){
                            bw.write(text.charAt(i));
                        }
                    }
                    catch (IOException e){
                    e.printStackTrace();
                    }
                    finally {
                        try {
                            bw.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                }
                else if(save.equalsIgnoreCase("n")){
                    flag = false;
                }
            }

            else{
                text.append(input+"\n");
            }
        }


    }

    public void filOpen(){
        System.out.print("열기 할 파일명 : ");
        String fileName = sc.nextLine();
        String content = null;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(fileName +".txt"));
            while(true){
                content = br.readLine();
                if(content == null){
                    break;
                }
                System.out.println(content);
            }
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (EOFException e){

        }
        catch(IOException e){
            e.printStackTrace();
        }finally {
            try {
                if(br != null){
                br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void fileEdit(){
        System.out.print("열기 할 파일명 : ");
        String fileName = sc.nextLine();
        String content = null;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(fileName +".txt"));
            while(true){
                content = br.readLine();
                if(content == null){
                    break;
                }
                System.out.println(content);
            }
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (EOFException e){

        }
        catch(IOException e){
            e.printStackTrace();
        }finally {
            try {
                if(br != null){
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        boolean flag = true;

        StringBuilder text = new StringBuilder(); // 입력할 내용에 대한 스트링빌더 객체

        while(flag){
            System.out.print("입력할 문장을 입력해주세요 (끝내시려면 exit을 입력해주세요) : ");
            String input = sc.nextLine();

            if(input.equals("exit")){
                flag = false;
                System.out.print("저장하시겠습니까? (y or no): ");
                String save = sc.nextLine();
                if(save.equalsIgnoreCase("y")){
                    BufferedWriter bw = null;
                    try{
                        bw = new BufferedWriter(new FileWriter(fileName+".txt",true));
                        for(int i = 0; i < text.length(); i++){
                            bw.write(text.charAt(i));
                        }
                    }
                    catch (IOException e){
                        e.printStackTrace();
                    }
                    finally {
                        try {
                            bw.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                }
                else if(save.equalsIgnoreCase("n")){
                    flag = false;
                }
            }

            else{
                text.append(input+"\n");
            }
        }

    }
}
