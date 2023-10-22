package com.lyx.cal_1.controller;

import com.lyx.cal_1.bean.Dep;
import com.lyx.cal_1.service.DepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class DepController {
    @Autowired
    private DepService depService;
    @PostMapping("/cal1")
    public Float get_int(@RequestBody Dep dep){
        List<Float> rate = depService.get_rate();
        Float time = dep.getDep_time()*12;
        Float amount = dep.getDep_amount();
        Float count = time;
        Float dep_int = null;
        if(time<=3){
            dep_int = amount* rate.get(0)/100;
        } else if (time<=6) {
            dep_int = amount*rate.get(1)/100;
        } else if (time<=12) {
            dep_int=amount*rate.get(2)/100;
        } else if (time<=24) {
            dep_int=amount*rate.get(3)/100;
        } else if (time<=36) {
            dep_int=amount*rate.get(4)/100;
        } else {
            dep_int=amount*rate.get(5)/100;
        }
        return dep_int;
    }
}
