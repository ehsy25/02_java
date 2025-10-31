package com.E.hw1.model.comparator;

import com.E.hw1.model.dto.BookDTO;

import java.util.Comparator;

public class DescCategory implements Comparator<BookDTO> {

    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        if(o1.getCategory() < o2.getCategory()){
            return 1;
        }else if (o1.getCategory() > o2.getCategory()){
            return -1;
        } else {
            return 0;
        }
    }
}
