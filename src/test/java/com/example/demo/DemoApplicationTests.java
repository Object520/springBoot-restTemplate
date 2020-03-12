package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void testRestTemplateQuery() {
        String url = "http://localhost:8082/user/getList";
        String result = restTemplate.getForObject(url, String.class);
        System.out.println(result);
    }

}
