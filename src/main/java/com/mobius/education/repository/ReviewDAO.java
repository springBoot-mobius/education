package com.mobius.education.repository;

import com.mobius.education.mapper.PlaceMapper;
import com.mobius.education.mapper.ReviewMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ReviewDAO {
    private final ReviewMapper reviewMapper;

}
