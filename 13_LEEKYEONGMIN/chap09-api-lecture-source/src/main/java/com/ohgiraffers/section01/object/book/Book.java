package com.ohgiraffers.section01.object.book;

public class Book {
    /*필드 선언*/
    private int number;
    private String title;
    private String author;
    private int price;

    /* 기본생성자 */
    public Book() {
        super();
    }

    public Book(int number, String title, String author, int price) {
    }

    /* getter 및 setter */
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "[" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ']';
    }

    /* 2. equls() 오버라이딩 */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        Book other = (Book) obj;
        if (this.number != other.number) {
            return false;
        }
        if (this.title == null) {
            if (other.title != null) {
                return false;
            }
        }else if (!this.title.equals(other.title)) {
            return false;
        }
        return true;
    }
    /* 3. hashCode() 오버라이딩*/
    @Override
    public int hashCode() {
        /*곱셈 연산을 누적시켜야하므로 0이 아닌값으로 초기화*/
        int result = 1;
        /*필드마다 곱해줄 소수값을 선언
        31은 소수이기 때문에 연산시 동일한 hashCode값이 나오지 않을 확률을 증가시킨다.
         */
        final int PRIME = 31;
        result = PRIME * result + this.number;
        result = PRIME * result + ((title == null) ? 0 : title.hashCode());
        result = PRIME * result + ((author == null) ? 0 : author.hashCode());
        result = PRIME * result + this.price;
        return result;
    }
}



