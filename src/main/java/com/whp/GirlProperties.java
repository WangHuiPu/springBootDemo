package com.whp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by WHP on 2018-1-25.
 */
@Component
@ConfigurationProperties(prefix="girl")
//该注解可将prefix配置文件里的girl组下的内容，与该类的属性一一对应起来；
public class GirlProperties {
    private String cupSize;
    private Integer age;

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
