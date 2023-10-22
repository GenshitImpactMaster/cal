package com.lyx.cal_1.service.Impl;

import com.lyx.cal_1.mapper.LoanMapper;
import com.lyx.cal_1.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanSeerviceImpl implements LoanService {
    @Autowired
    private LoanMapper loanMapper;
    @Override
    public List<Float> get_rate() {
        List<Float> rate = loanMapper.get_rate();
        return rate;
    }
}
