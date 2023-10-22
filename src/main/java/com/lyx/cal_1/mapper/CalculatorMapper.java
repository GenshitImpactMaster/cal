package com.lyx.cal_1.mapper;

import com.lyx.cal_1.bean.Calculator;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Mapper
public interface CalculatorMapper {
    @Insert("insert into cal.res (equation, result) VALUES (#{equation},#{result})")
    void save(Calculator calculator);
    @Select("SELECT * FROM cal.res ORDER BY id DESC LIMIT 1;")
    Calculator getLast();
}
