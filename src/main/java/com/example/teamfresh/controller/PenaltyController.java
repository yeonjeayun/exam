package com.example.teamfresh.controller;

import com.example.teamfresh.model.Penalty;
import com.example.teamfresh.model.PenaltyCheckChange;
import com.example.teamfresh.model.PenaltyObject;
import com.example.teamfresh.service.PenaltyService;
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
public class PenaltyController {

    @Autowired
    PenaltyService service;

    @GetMapping("/penalty")
    @ApiOperation(value = "모든 penalty 정보를 반환한다.", response = List.class)
    public ResponseEntity<List<Penalty>> findAllPenalty() {
        List<Penalty> penalty = null;
        try {
            penalty = service.findAllPenalty();
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(penalty, HttpStatus.OK);
    }

    @PostMapping("/penalty")
    @ApiOperation(value = "penalty 정보를 입력한다.", response = String.class)
    public ResponseEntity<String> registryPenalty(@RequestBody Penalty penalty) {
        try {
            if (service.registry(penalty) != 0)
                return new ResponseEntity<>("successfully registered", HttpStatus.CREATED);
            else
                return new ResponseEntity<>("등록 실패했습니다.", HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>("등록 실패했습니다.", HttpStatus.BAD_REQUEST);
    }

    @PutMapping("/penalty/penaltyCheck")
    @ApiOperation(value = "penalty_check 정보를 수정한다.", response = String.class)
    public ResponseEntity<String> modifyPenaltyCheck(@RequestBody PenaltyCheckChange penalty) {
        try {
            if (service.modifyPenaltyCheck(penalty) != 0)
                return new ResponseEntity<>("successfully modified", HttpStatus.OK);
            else
                return new ResponseEntity<>("수정 실패했습니다.", HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>("수정 실패했습니다.", HttpStatus.BAD_REQUEST);
    }

    @PutMapping("/penalty/penaltyObject")
    @ApiOperation(value = "이의제기 정보를 수정한다.", response = String.class)
    public ResponseEntity<String> modifyObjectCheck(@RequestBody PenaltyObject penalty) {
        try {
            if (service.modifyPenaltyObject(penalty) != 0)
                return new ResponseEntity<>("successfully modified", HttpStatus.OK);
            else
                return new ResponseEntity<>("수정 실패했습니다.", HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>("수정 실패했습니다.", HttpStatus.BAD_REQUEST);
    }
}