package com.git.studygittmp.service.Impl;

import com.git.studygittmp.data.dao.BINDAO;
import com.git.studygittmp.data.dto.BINDto;
import com.git.studygittmp.data.dto.BINResponseDto;
import com.git.studygittmp.data.entity.BIN;
import com.git.studygittmp.service.BINService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BINServiceImpl implements BINService {

    private final BINDAO binDAO;

    @Autowired
    public BINServiceImpl(BINDAO binDAO){
        this.binDAO = binDAO;
    }
    @Override
    public BINResponseDto getBIN(Long number){
        BIN bin = binDAO.selectBIN(number);

        BINResponseDto binResponseDto = new BINResponseDto();
        binResponseDto.setNumber(bin.getNumber());
        binResponseDto.setName(bin.getName());
        binResponseDto.setAge(bin.getAge());
        binResponseDto.setSid(bin.getSid());
        return binResponseDto;
    }
    @Override
    public BINResponseDto saveBIN(BINDto binDto){
        BIN bin = new BIN();
        bin.setName(binDto.getName());
        bin.setAge(binDto.getAge());
        bin.setSid(binDto.getSid());
        bin.setCreatedAt(LocalDateTime.now());
        bin.setUpdatedAt(LocalDateTime.now());

        BIN savedBIN = binDAO.insertBIN(bin);

        BINResponseDto binResponseDto = new BINResponseDto();
        binResponseDto.setNumber(savedBIN.getNumber());
        binResponseDto.setName(savedBIN.getName());
        binResponseDto.setAge(savedBIN.getAge());
        binResponseDto.setSid(savedBIN.getSid());

        return binResponseDto;
    }
    @Override
    public BINResponseDto changeBIN(Long number, String name)throws Exception{
        BIN changeBIN = binDAO.updateBIN(number,name);

        BINResponseDto binResponseDto = new BINResponseDto();
        binResponseDto.setNumber(changeBIN.getNumber());
        binResponseDto.setName(changeBIN.getName());
        binResponseDto.setAge(changeBIN.getAge());
        binResponseDto.setSid(changeBIN.getSid());

        return binResponseDto;
    }

    @Override
    public void deleteBIN(Long number) throws Exception{
        binDAO.deleteBIN(number);
    }
}
