package com.whp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by WHP on 2018-1-25.
 */
@RestController
public class HelloController {
    @Autowired
    private GirlProperties girlProperties;
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String say(){
        return girlProperties.getCupSize();
    }
}
