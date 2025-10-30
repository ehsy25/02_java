package com.ohgiraffers.io.member;

import java.io.*;

public class MemberManager {

    public Member[] members = new Member[1];

    public void readMembers() {

        ObjectInputStream objIn = null;

        try {

            objIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream("src/main/java/com/ohgiraffers/io/member/members.ser ")));

            while (true) {
                System.out.println(objIn.readObject());
            }

        } catch (EOFException e) {
            System.out.println("다 읽음");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("못 찾음");
        } finally {
            if (objIn != null) {
                try {
                    objIn.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void addMember(Member member) {

        ObjectOutputStream objOut = null;
        members[0] = member;

        try {
            objOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("src/main/java/com/ohgiraffers/io/member/members.ser ")));

            for (int i = 0; i < members.length; i++) {
                objOut.writeObject(members[i]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (objOut != null) {
                try {
                    objOut.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
