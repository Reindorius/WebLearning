package com.reindorius.config;

import com.reindorius.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration //它也会被Spring容器托管，因为本质上就是个@Component
@ComponentScan("com.reindorius.pojo")
@Import(ReindoriusConfig2.class)//两个配置合成一个
public class ReindoriusConfig {

    //注册一个Bean，这个方法的名字相当于bean标签的ID，返回值相当于class
    @Bean
    public User getUser()
    {
        return new User();
    }
}
