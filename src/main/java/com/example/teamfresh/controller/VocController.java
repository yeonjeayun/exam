package com.example.teamfresh.controller;

import com.example.teamfresh.model.Voc;
import com.example.teamfresh.service.VocService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@Api(value="teamFresh")
public class VocController {

    @Autowired
    VocService service;

    @GetMapping("/voc")
    @ApiOperation(value = "모든 voc 정보를 반환한다.", response = List.class)
    public ResponseEntity<List<Voc>> findAllVoc() {
        List<Voc> voc = null;
        try {
            voc = service.findAllVoc();
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(voc, HttpStatus.OK);
    }

    @PostMapping("/voc")
    @ApiOperation(value = "voc 정보를 입력한다.", response = String.class)
    public ResponseEntity<String> registryVoc(@RequestBody Voc voc) {
        try {
            if (service.registry(voc) != 0)
                return new ResponseEntity<>("successfully registered", HttpStatus.CREATED);
            else
                return new ResponseEntity<>("등록 실패했습니다.", HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>("등록 실패했습니다.", HttpStatus.BAD_REQUEST);
    }

}