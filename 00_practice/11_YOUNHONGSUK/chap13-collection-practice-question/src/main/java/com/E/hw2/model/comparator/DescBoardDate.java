package com.E.hw2.model.comparator;

import com.E.hw2.model.dto.BoardDTO;
import java.util.Comparator;

public class DescBoardDate implements Comparator<BoardDTO> {

    /**
     * @param b1 첫 번째 BoardDTO 객체
     * @param b2 두 번째 BoardDTO 객체
     * @return b1.boardDate와 b2.boardDate를 비교하여 내림차순으로 정렬 결과를 반환
     */
    @Override
    public int compare(BoardDTO b1, BoardDTO b2) {
        // Date 객체의 compareTo() 순서를 바꿔 날짜를 비교 (내림차순)
        return b2.getBoardDate().compareTo(b1.getBoardDate());
    }
}