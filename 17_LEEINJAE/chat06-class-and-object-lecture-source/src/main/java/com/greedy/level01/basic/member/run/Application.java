package com.greedy.level01.basic.member.run;

public class Application {

        // 1. 필드 (Fields)
        private String id;
        private String pwd;
        private String name;
        private int age;
        private char gender;
        private String phone;
        private String email;

        // 2. 생성자 (Constructor)
        public MemberDTO() {
            // 기본 생성자
        }

        // 3. Setter/Getter 메소드

        // id
        public void setId(String id) {
            this.id = id;
        }
        public String getId() {
            return this.id;
        }

        // pwd
        public void setPwd(String pwd) {
            this.pwd = pwd;
        }
        public String getPwd() {
            return this.pwd;
        }

        // name
        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return this.name;
        }

        // age
        public void setAge(int age) {
            this.age = age;
        }
        public int getAge() {
            return this.age;
        }

        // gender
        public void setGender(char gender) {
            this.gender = gender;
        }
        public char getGender() {
            return this.gender;
        }

        // phone
        public void setPhone(String phone) {
            this.phone = phone;
        }
        public String getPhone() {
            return this.phone;
        }

        // email
        public void setEmail(String email) {
            this.email = email;
        }
        public String getEmail() {
            return this.email;
        }
    }
}
