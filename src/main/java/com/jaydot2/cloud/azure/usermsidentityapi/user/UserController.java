package com.jaydot2.cloud.azure.usermsidentityapi.user;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String,String> serviceUp() {
        Map<String,String> result = new HashMap<>();
        result.put("data","success");
        return result;
    }
}
