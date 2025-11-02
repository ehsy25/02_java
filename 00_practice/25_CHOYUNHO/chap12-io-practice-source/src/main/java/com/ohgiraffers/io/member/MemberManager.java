package com.ohgiraffers.io.member;

import java.io.*;

public class MemberManager {
    private Member[] members;


    public void readMembers(){

        ObjectInputStream ois = null;
        try{
            File file = new File("src/main/java/com/ohgiraffers/io/member/members.ser");
            if(file.exists()&&file.length()>0){
                ois = new ObjectInputStream(new FileInputStream("src/main/java/com/ohgiraffers/io/member/members.ser"));
                Member member = (Member)ois.readObject();
                System.out.println(member);
            }
            else{
                System.out.println("파일이 비어있거나 없습니다.");
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(ois!=null){
                try {
                    ois.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void addMember(Member member) {
        ObjectOutputStream oos = null;
        members = new Member[]{member};
        try{
            oos = new ObjectOutputStream(new FileOutputStream("src/main/java/com/ohgiraffers/io/member/members.ser"));
            for(int i=0;i<members.length;i++){
                oos.writeObject(members[i]);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}