package org.joseph.hello;

import org.joseph.hello.util.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {


    @Autowired
    RedisUtil redisUtil;

    @Test
    public void setAndGet() {
        redisUtil.set("a", 111);
        assert redisUtil.get("a").equals(111);
    }
}
