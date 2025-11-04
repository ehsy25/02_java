package com.E.hw2.model.comparator;

import com.E.hw2.model.dto.BoardDTO;
import java.util.Comparator;

public class DescBoardTitle implements Comparator<BoardDTO> {

    /**
     * @param b1 첫 번째 BoardDTO 객체
     * @param b2 두 번째 BoardDTO 객체
     * @return b1.boardTitle과 b2.boardTitle을 비교하여 내림차순으로 정렬 결과를 반환
     */
    @Override
    public int compare(BoardDTO b1, BoardDTO b2) {
        // String.compareTo()의 순서를 바꿔 문자열을 비교 (내림차순)
        return b2.getBoardTitle().compareTo(b1.getBoardTitle());
    }
}