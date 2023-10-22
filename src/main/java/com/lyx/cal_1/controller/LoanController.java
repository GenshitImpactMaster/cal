package com.lyx.cal_1.controller;

import com.lyx.cal_1.bean.Loan;
import com.lyx.cal_1.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class LoanController {
    @Autowired
    private LoanService loanService;
    @PostMapping("/cal2")
    public Float get_int(@RequestBody Loan loan){
        List<Float> rate = loanService.get_rate();
        Float time = loan.getLoan_time()*12;
        Float amount = loan.getLoan_amount();
        Float loan_int = null;
        if(time<=6){
            loan_int = amount* rate.get(0)/100;
        } else if (time<=12) {
            loan_int = amount*rate.get(1)/100;
        } else if (time<=36) {
            loan_int=amount*rate.get(2)/100;
        } else if (time<60) {
            loan_int=amount*rate.get(3)/100;
        } else {
            loan_int=amount*rate.get(4)/100;

    } return loan_int;
}}
