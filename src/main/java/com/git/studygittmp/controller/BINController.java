package com.git.studygittmp.controller;

import com.git.studygittmp.data.dto.BINDto;
import com.git.studygittmp.data.dto.BINResponseDto;
import com.git.studygittmp.data.dto.ChangeBINDto;
import com.git.studygittmp.service.BINService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/BIN")
public class BINController {

    private final BINService binService;

    @Autowired
    public BINController(BINService binService){
        this.binService = binService;
    }

    @GetMapping()
    public ResponseEntity<BINResponseDto> getBIN(Long number){
        BINResponseDto binResponseDto = binService.getBIN(number);
        return ResponseEntity.status(HttpStatus.OK).body(binResponseDto);
    }

    @PostMapping()
    public ResponseEntity<BINResponseDto> createBIN(@RequestBody BINDto binDto){
        BINResponseDto binResponseDto = binService.saveBIN(binDto);
        return ResponseEntity.status(HttpStatus.OK).body(binResponseDto);
    }

    @PutMapping()
    public ResponseEntity<BINResponseDto> changeBIN(@RequestBody ChangeBINDto changeBINDto)
            throws Exception{
        BINResponseDto binResponseDto = binService.changeBIN(
                changeBINDto.getNumber(),
                changeBINDto.getName());
        return ResponseEntity.status(HttpStatus.OK).body(binResponseDto);
    }
    @DeleteMapping()
    public ResponseEntity<String> deleteBIN(Long number) throws Exception{
        binService.deleteBIN(number);
        return ResponseEntity.status(HttpStatus.OK).body("정상적으로 삭제되었습니다");
    }
}
