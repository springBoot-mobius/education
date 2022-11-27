package com.mobius.education.repository;

import com.mobius.education.mapper.RequestCommentMapper;
import com.mobius.education.mapper.ReservePlaceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ReservePlaceDAO {
    private final ReservePlaceMapper reservePlaceMapper;

}
