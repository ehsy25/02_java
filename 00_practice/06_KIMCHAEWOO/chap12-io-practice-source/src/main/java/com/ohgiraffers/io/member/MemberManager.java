package com.ohgiraffers.io.member;

import java.io.*;

public class MemberManager {

    public int count = 0;
    Member[] members = null;
    String path = "src/main/java/com/ohgiraffers/io/member/members.ser";

    public void readMembers() {
        // 파일 읽어서 출력
        ObjectInputStream objIn = null;

        File file = new File(path);
        boolean exists = file.exists();

        try {

            if (exists) {

                objIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream(path)));

                while (true) {
                    objIn.readObject();
                    count++;
                }
            } else {
                file.createNewFile();
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("파일 다 읽음");
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

    public void addMembers(Member member) {

        ObjectOutputStream objOut = null;
        ObjectInputStream objIn = null;
        members = new Member[count+1];
        int memCount = 0;

        try {

                objIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream(path)));
                objOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(path)));

                for (int i = 0; i < members.length; i++) {

                    if (count != 0) {
                        members[i] = (Member) objIn.readObject();
                    }

                    if (members[0] == null) {
                        members[0] = member;
                        objOut.writeObject(members);
                        break;
                    }

                    if (memCount == i) {
                        members[i+1] = member;
                        objOut.writeObject(members);
                    }

                }



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("끝");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (objIn != null) {
                try {
                    objIn.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else if (objOut != null) {
                try {
                    objOut.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
