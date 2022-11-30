package com.mobius.education.repository;

import com.mobius.education.mapper.PlaceMapper;
import com.mobius.education.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class PlaceDAO {
    private final PlaceMapper placeMapper;

}
