package com.git.studygittmp.sevice;

import com.git.studygittmp.data.dto.SunDto;
import com.git.studygittmp.data.dto.SunResponseDto;

public interface SunService {
    SunResponseDto getSun(Long number);
    SunResponseDto saveSun(SunDto sunDto);
    SunResponseDto changeSunName(Long number, String name)throws Exception;

    void deleteSun(Long number)throws Exception;
}
