package com.ohgiraffers.io.member;

import java.io.*;

public class MemberManager {

    private Member[] members;

    public void readMembers() {
        ObjectInputStream ois = null;
        boolean exists = new File("src/main/java/com/ohgiraffers/io/member/member.ser").exists();
        if (exists) {
            try {
                ois = new ObjectInputStream(
                        new BufferedInputStream(
                                new FileInputStream("src/main/java/com/ohgiraffers/io/member/member.ser")
                        )
                );
                while(true) {
                    members = (Member[]) ois.readObject();
                }

            } catch (EOFException e) {
                for (Member member : members) {
                    System.out.println(member.toString());
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void addMember(Member member) {
        Member[] arr ;
        ObjectOutputStream oos = null;
        if(members == null){
            arr = new Member[]{member};
        }else {
            arr = new Member[members.length+1];

            for (int i = 0; i < members.length; i++) {
                arr[i] = members[i];
            }
            arr[members.length] = member;
        }
        try {
            oos = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream("src/main/java/com/ohgiraffers/io/member/member.ser")
                    )
            );

            oos.writeObject(arr);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
