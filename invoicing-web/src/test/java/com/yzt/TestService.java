package com.yzt;

import com.yzt.service.StockService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestService {
    @Autowired
    private StockService stockService;

    @Test
    public void Test() {
//        List<Map> maps = stockService.selOrder();
//        Integer integer = stockService.updOrder(maps);
//        System.out.println(integer);
    }

}
