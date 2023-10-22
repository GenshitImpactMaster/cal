package com.lyx.cal_1.controller;

import com.lyx.cal_1.bean.Calculator;
import com.lyx.cal_1.bean.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.lyx.cal_1.service.CalculatorService;
@CrossOrigin
@Slf4j
@RestController
public class CalculatorController {
    @Autowired
    private CalculatorService calculatorService;
    @PostMapping("/save")
    public Result save(@RequestBody Calculator calculator){
        calculatorService.save(calculator);
        log.info("save success");
        return Result.success();
    }
    @GetMapping("/getLast")
    public Result getLast() {
        Calculator calculator = calculatorService.getLast();
        log.info("getLast success");
        return Result.success(calculator);
    }
}
