package com.chaewookim.hw1.model.comparator;

import com.chaewookim.hw1.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Comparator;

public class DescCategory implements Comparator<BookDTO> {


    @Override
    public int compare(BookDTO o1, BookDTO o2) {

        int result = 0;

        if (o1.getCategory() < o2.getCategory()) {
            result = 1;
        } else if (o1.getCategory() > o2.getCategory()) {
            result = -1;
        }

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
