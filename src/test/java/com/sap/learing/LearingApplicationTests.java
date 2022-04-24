package com.sap.learing;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.sap.learing.java8.FlagEqual.FLAG_1;

@SpringBootTest
class LearingApplicationTests {

    @Test
    void contextLoads() {
        if (FLAG_1.equals(1)) {
            Integer a = FLAG_1;
            System.out.println(FLAG_1.longValue() + "*************************" + a);
        }
    }

}
