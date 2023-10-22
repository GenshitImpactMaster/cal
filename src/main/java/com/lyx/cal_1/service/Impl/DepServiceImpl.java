package com.lyx.cal_1.service.Impl;

import com.lyx.cal_1.mapper.DepMapper;
import com.lyx.cal_1.service.DepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepServiceImpl implements DepService {
    @Autowired
    private DepMapper depMapper;
    @Override
    public List<Float> get_rate() {
        List<Float> rate = depMapper.get_rate();
        return rate;
    }
}
