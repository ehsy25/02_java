package com.E.hw2.model.comparator;

import com.E.hw2.model.dto.BoardDTO;
import java.util.Comparator;

public class AscBoardNo implements Comparator<BoardDTO> {

    @Override
    public int compare(BoardDTO b1, BoardDTO b2) {
        // Integer.compare()를 사용하여 b1이 작으면 음수, 같으면 0, 크면 양수를 반환하여 오름차순 정렬
        return Integer.compare(b1.getBoardNo(), b2.getBoardNo());
    }
}