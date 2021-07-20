package com.reindorius.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/**
 * @Component
//等价于<bean id="user" class="com.reindorius.pojo.User"/>
 */

@Component
public class User {
    /**
     * @Value("myValue")
    //等价于<property name="name" value="myValue"/>
     */
    @Value("114514")
    public int name;
}
