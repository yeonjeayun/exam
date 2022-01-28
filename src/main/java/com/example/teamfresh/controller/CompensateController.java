package com.example.teamfresh.controller;

import com.example.teamfresh.model.Compensate;
import com.example.teamfresh.service.CompensateService;
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
public class CompensateController {

    @Autowired
    CompensateService service;

    @GetMapping("/compensate")
    @ApiOperation(value = "모든 배상 정보를 반환한다.", response = List.class)
    public ResponseEntity<List<Compensate>> findAllCompensate() {
        List<Compensate> compensate = null;
        try {
            compensate = service.findAllCompensate();
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(compensate, HttpStatus.OK);
    }

    @PostMapping("/compensate")
    @ApiOperation(value = "배상 정보를 입력한다.", response = String.class)
    public ResponseEntity<String> registryCompensate(@RequestBody Compensate compensate) {
        try {
            if (service.registry(compensate) != 0)
                return new ResponseEntity<>("successfully registered", HttpStatus.CREATED);
            else
                return new ResponseEntity<>("등록 실패했습니다.", HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>("등록 실패했습니다.", HttpStatus.BAD_REQUEST);
    }
}