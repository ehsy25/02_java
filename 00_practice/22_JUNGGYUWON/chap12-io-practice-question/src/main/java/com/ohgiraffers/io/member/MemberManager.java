package com.ohgiraffers.io.member;

import java.io.*;

public class MemberManager {

    private Member[] members = null;


    public void readMembers() {
        ObjectInputStream ois = null;
        int count = 0;

        try{
            ois = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream("src/main/java/com/ohgiraffers/io/member/member.ser")
                    )
            );
            while(true){
                System.out.println(ois.readObject());
                count++;
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (IOException e){
            this.members = new Member[++count];

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void addMember(Member member) {

         ObjectOutputStream objOut = null;
        try {
            objOut = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream("src/main/java/com/ohgiraffers/io/member/member.ser")));
            objOut.writeObject(member);
            objOut.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(objOut != null){
                    objOut.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
