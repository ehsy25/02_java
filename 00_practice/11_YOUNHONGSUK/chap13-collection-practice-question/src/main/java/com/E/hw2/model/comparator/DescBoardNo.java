package com.E.hw2.model.comparator;

import com.E.hw2.model.dto.BoardDTO;
import java.util.Comparator;

public class DescBoardNo implements Comparator<BoardDTO> {

    /**
     * @param b1 첫 번째 BoardDTO 객체
     * @param b2 두 번째 BoardDTO 객체
     * @return b1.boardNo와 b2.boardNo를 비교하여 내림차순으로 정렬 결과를 반환
     */
    @Override
    public int compare(BoardDTO b1, BoardDTO b2) {
        // Integer.compare()의 순서를 바꿔 b1이 크면 음수, 같으면 0, 작으면 양수를 반환하여 내림차순 정렬
        return Integer.compare(b2.getBoardNo(), b1.getBoardNo());
    }
}