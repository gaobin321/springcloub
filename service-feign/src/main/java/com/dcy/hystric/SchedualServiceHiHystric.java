package com.dcy.hystric;

import com.dcy.service.SchedualServiceHi;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2018/5/11.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(@RequestParam(value = "name") String name) {
        return "sorry "+name;
    }
}
