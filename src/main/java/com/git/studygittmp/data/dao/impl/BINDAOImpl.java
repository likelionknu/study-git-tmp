package com.git.studygittmp.data.dao.impl;

import com.git.studygittmp.data.dao.BINDAO;
import com.git.studygittmp.data.entity.BIN;
import com.git.studygittmp.data.repositiory.BINRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Optional;

@Component
public class BINDAOImpl implements BINDAO {

    private final BINRepository binRepository;

    @Autowired
    public BINDAOImpl(BINRepository binRepository){
        this.binRepository = binRepository;
    }

    @Override
    public BIN insertBIN(BIN bin){
        BIN savedBIN =binRepository.save(bin);
        return savedBIN;
    }

    @Override
    public BIN selectBIN(Long number){
        BIN selectedBIN = binRepository.getById(number);
        return selectedBIN;
    }

    @Override
    public BIN updateBIN(Long number, String name) throws Exception{
        Optional<BIN> selectedBIN = binRepository.findById(number);

        BIN updatedBIN;
        if(selectedBIN.isPresent()){
            BIN bin = selectedBIN.get();

            bin.setName(name);
            bin.setUpdatedAt(LocalDateTime.now());

            updatedBIN = binRepository.save(bin);
        }else{
            throw new Exception();
        }
        return updatedBIN;
    }

    @Override
    public void deleteBIN(Long number)throws Exception{
        Optional<BIN> selectedBIN = binRepository.findById(number);

        if(selectedBIN.isPresent()){
            BIN bin = selectedBIN.get();

            binRepository.delete(bin);
        }else{
            throw new Exception();
        }


    }
}
