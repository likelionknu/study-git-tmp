package com.git.studygittmp.controller;

import com.git.studygittmp.data.dto.ChangeSunNameDto;
import com.git.studygittmp.data.dto.SunDto;
import com.git.studygittmp.data.dto.SunResponseDto;
import com.git.studygittmp.sevice.SunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sun")
public class SunController {
    private final SunService sunService;

    @Autowired
    public SunController(SunService sunService){
        this.sunService = sunService;
    }

    @GetMapping()
    public ResponseEntity<SunResponseDto>getSun(Long number){
        SunResponseDto sunResponseDto = sunService.getSun(number);

        return ResponseEntity.status(HttpStatus.OK).body(sunResponseDto);
    }
    @PostMapping()
    public ResponseEntity<SunResponseDto> createSun(@RequestBody SunDto sunDto){
        SunResponseDto sunResponseDto = sunService.saveSun(sunDto);

        return ResponseEntity.status(HttpStatus.OK).body(sunResponseDto);
    }

    @PutMapping()
    public ResponseEntity<SunResponseDto>changeSunName(
            @RequestBody ChangeSunNameDto changeSunNameDto) throws Exception{
        SunResponseDto sunResponseDto = sunService.changeSunName(
                changeSunNameDto.getNumber(),
                changeSunNameDto.getName());

        return ResponseEntity.status(HttpStatus.OK).body(sunResponseDto);
    }

    @DeleteMapping()
    public ResponseEntity<String>delete(Long number)throws Exception{
        sunService.deleteSun(number);

        return ResponseEntity.status(HttpStatus.OK).body("삭제됨");
    }
}
