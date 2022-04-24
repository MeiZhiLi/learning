package com.sap.learing.java8.lambda;

import org.junit.jupiter.api.Test;

public class LambdaTest {
    final static String salutation = "Hello! ";

    @Test
    void java8() {
        GreetingService greetService1 = message ->
                System.out.println(salutation + message);
        greetService1.sayMessage("Runoob");
    }

    interface GreetingService {
        void sayMessage(String message);
    }
}
