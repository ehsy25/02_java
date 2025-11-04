package com.E.hw2.model.comparator;

import com.E.hw2.model.dto.BoardDTO;
import java.util.Comparator;

public class AscBoardTitle implements Comparator<BoardDTO> {

    /**
     * @param b1 첫 번째 BoardDTO 객체
     * @param b2 두 번째 BoardDTO 객체
     * @return b1.boardTitle과 b2.boardTitle을 비교하여 오름차순으로 정렬 결과를 반환
     */
    @Override
    public int compare(BoardDTO b1, BoardDTO b2) {
        // String.compareTo()를 사용하여 문자열을 비교 (오름차순)
        return b1.getBoardTitle().compareTo(b2.getBoardTitle());
    }
}