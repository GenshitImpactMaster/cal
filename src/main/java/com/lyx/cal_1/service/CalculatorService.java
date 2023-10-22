package com.lyx.cal_1.service;

import com.lyx.cal_1.bean.Calculator;

public interface CalculatorService {
    void save(Calculator calculator);

    Calculator getLast();
}
