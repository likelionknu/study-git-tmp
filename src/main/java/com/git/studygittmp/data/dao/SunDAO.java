package com.git.studygittmp.data.dao;

import com.git.studygittmp.data.entity.Sun;

public interface SunDAO {

    Sun createSun(Sun sun);
    Sun selectSun(Long number);
    Sun updateSunName(Long number, String name) throws Exception;

    void deleteSun(Long number)throws Exception;
}
