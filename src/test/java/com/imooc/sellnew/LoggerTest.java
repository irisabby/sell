package com.imooc.sellnew;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administrator on 2019/2/18 17:32
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j

public class LoggerTest {


    @Test
    public void test1(){
        String name="imooc";
        String password="123456";
        log.info("info...");
        log.debug("debug...");
        log.error("error...");
        log.info("name: "+name+" ,password: "+password);
        log.info("name:{},password:{}",name,password);
    }

}
