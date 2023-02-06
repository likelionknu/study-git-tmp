package com.git.studygittmp.data.dao.impl;

import com.git.studygittmp.data.dao.SunDAO;
import com.git.studygittmp.data.entity.Sun;
import com.git.studygittmp.data.repository.SunRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
@Component
@Service
public class SunDAOImpl implements SunDAO {

    private final SunRepository sunRepository;

    @Autowired
    public SunDAOImpl(SunRepository sunRepository) {
        this.sunRepository = sunRepository;
    }

    @Override
    public Sun createSun(Sun sun) {
        Sun savedSun = sunRepository.save(sun);

        return savedSun;
    }

    @Override
    public Sun selectSun(Long number) {
        Sun selectedSun = sunRepository.getById(number);

        return selectedSun;
    }

    @Override
    public Sun updateSunName(Long number, String name) throws Exception{
        Optional<Sun> selectedSun = sunRepository.findById(number);

        Sun updatedSun;
        if (selectedSun.isPresent()) {
            Sun sun = selectedSun.get();

            sun.setName(name);
            sun.setUpdatedAt(LocalDateTime.now());

            updatedSun = sunRepository.save(sun);
        }else{
            throw new Exception();
        }
        return updatedSun;
    }

    @Override
    public void deleteSun(Long number) throws Exception{
        Optional<Sun> selectedSun = sunRepository.findById(number);

        if(selectedSun.isPresent()) {
            Sun sun = selectedSun.get();

            sunRepository.delete(sun);
        }else{
            throw new Exception();
        }
    }
}