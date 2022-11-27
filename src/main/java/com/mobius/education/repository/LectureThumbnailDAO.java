package com.mobius.education.repository;

import com.mobius.education.mapper.LectureThumbnailMapper;
import com.mobius.education.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class LectureThumbnailDAO {
    private final LectureThumbnailMapper lectureThumbnailMapper;

}
