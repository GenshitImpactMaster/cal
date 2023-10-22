package com.lyx.cal_1.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DepMapper {
    @Select("select dep_rate from cal.dep")
    List<Float> get_rate();
}
