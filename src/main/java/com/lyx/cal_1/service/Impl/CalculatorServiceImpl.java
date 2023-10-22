package com.lyx.cal_1.service.Impl;

import com.lyx.cal_1.bean.Calculator;
import com.lyx.cal_1.mapper.CalculatorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lyx.cal_1.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Autowired
    private CalculatorMapper calculatorMapper;
    @Override
    public void save(Calculator calculator) {
        calculatorMapper.save(calculator);
    }

    @Override
    public Calculator getLast() {
        Calculator calculator = calculatorMapper.getLast();
        return calculator;
    }
}
