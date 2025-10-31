package com.ohgiraffers.io.member;

import java.io.*;

public class MemberManager {

    Member[] members;

    public void readMembers() {
        ObjectInputStream objIn = null;

        try {
            objIn = new ObjectInputStream(
                    new java.io.FileInputStream( "src/main/java/com/ohgiraffers/io/member/members.ser"));
            members = (Member[]) objIn.readObject();

            for (int i = 0;i<members.length;i++) {
                System.out.println(members[i]);
            }

        } catch (EOFException e) {
            System.out.println("정보 읽기 완료");
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (objIn != null) {
                try {
                    objIn.close();
                } catch (IOException e) {
                }
            }
        }

    }

    public void addMember(Member member) {
        int memLen = (members == null) ? 0 : members.length;

        Member memCopy[] = new Member[memLen+1];
        memCopy[memLen] = member;

        for (int i = 0;i<memLen;i++) {
            memCopy[i] = members[i];
        }
        members = memCopy;

        ObjectOutputStream objOut = null;

        try {
            objOut = new ObjectOutputStream(
                    new BufferedOutputStream(new FileOutputStream("src/main/java/com/ohgiraffers/io/member/members.ser")));

            objOut.writeObject(members);

            objOut.flush(); // 버퍼 안차도, 클로즈 안해도 나갈 수 있음
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}