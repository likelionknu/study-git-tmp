package com.git.studygittmp.sevice.impl;

import com.git.studygittmp.data.dao.SunDAO;
import com.git.studygittmp.data.dto.SunDto;
import com.git.studygittmp.data.dto.SunResponseDto;
import com.git.studygittmp.data.entity.Sun;
import com.git.studygittmp.sevice.SunService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class SunServiceImpl implements SunService {
    private final SunDAO sunDAO;

    @Autowired
    public SunServiceImpl(SunDAO sunDAO){
        this.sunDAO=sunDAO;
    }
    @Override
    public SunResponseDto getSun(Long number){
        Sun sun = sunDAO.selectSun(number);

        SunResponseDto sunResponseDto = new SunResponseDto();
        sunResponseDto.setNumber(sun.getNumber());
        sunResponseDto.setName(sun.getName());
        sunResponseDto.setAge(sun.getAge());
        sunResponseDto.setSid(sun.getSid());

        return sunResponseDto;
    }
    @Override
    public SunResponseDto saveSun(SunDto sunDto){
        Sun sun = new Sun();
        sun.setName(sunDto.getName());
        sun.setAge(sunDto.getAge());
        sun.setSid(sunDto.getSid());
        sun.setCreateAt(LocalDateTime.now());
        sun.setUpdatedAt(LocalDateTime.now());

        Sun savedSun = sunDAO.createSun(sun);

        SunResponseDto sunResponseDto = new SunResponseDto();
        sunResponseDto.setNumber(savedSun.getNumber());
        sunResponseDto.setName(savedSun.getName());
        sunResponseDto.setAge(savedSun.getAge());
        sunResponseDto.setSid(savedSun.getSid());

        return sunResponseDto;
    }
    @Override
    public SunResponseDto changeSunName(Long number, String name)throws Exception{
        Sun changedSun = sunDAO.updateSunName(number, name);

        SunResponseDto sunResponseDto = new SunResponseDto();
        sunResponseDto.setNumber(changedSun.getNumber());
        sunResponseDto.setName(changedSun.getName());
        sunResponseDto.setAge(changedSun.getAge());
        sunResponseDto.setSid(changedSun.getSid());

        return sunResponseDto;
    }
    @Override
    public void deleteSun(Long number)throws Exception{
        sunDAO.deleteSun(number);
    }
}
