package com.ohgiraffers.hw1.model.dto;

public class AniBook extends Book{
    private int accessAge;

    public AniBook(){
        super();
        this.accessAge=0;
    }
    public AniBook(String tile, String author, String publisher, int accessAge){
        super(tile,author,publisher);
        this.accessAge=accessAge;
    }
    public String toString(){
        return super.toString()+" / "+this.accessAge;}

    public int getAccessAge() {
        return accessAge;
    }

    public void setAccessAge(int accessAge) {
        this.accessAge = accessAge;
    }
}
