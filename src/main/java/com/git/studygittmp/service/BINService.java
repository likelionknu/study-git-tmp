package com.git.studygittmp.service;

import com.git.studygittmp.data.dto.BINDto;
import com.git.studygittmp.data.dto.BINResponseDto;

public interface BINService {
    BINResponseDto getBIN(Long number);

    BINResponseDto saveBIN(BINDto binDto);

    BINResponseDto changeBIN(Long number, String name) throws Exception;

    void deleteBIN(Long number) throws Exception;
}
