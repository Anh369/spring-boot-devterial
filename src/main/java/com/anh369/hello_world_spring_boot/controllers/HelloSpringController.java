package com.anh369.hello_world_spring_boot.controllers;//   Định nghĩa package

import org.springframework.web.bind.annotation.GetMapping;//    Import annotation GET
import org.springframework.web.bind.annotation.RestController;//    Import annotation REST

@RestController //  Nói Với Spring: đây là Controller REST API
public class HelloSpringController {
    @GetMapping("/hello") //    Mapping đường dẫn /hello với phương thức(method) này
    String sayHello(){//    Method trả về chuỗi
        return "Hello World Spring Boot 3.5.5 SNAPSHOT";
    }
}
