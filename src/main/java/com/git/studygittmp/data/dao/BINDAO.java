package com.git.studygittmp.data.dao;

import com.git.studygittmp.data.entity.BIN;

public interface BINDAO {

    BIN insertBIN(BIN bin);

    BIN selectBIN(Long number);

    BIN updateBIN(Long number, String name) throws Exception;

    void deleteBIN(Long number) throws Exception;

}
