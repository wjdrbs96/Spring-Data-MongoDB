package me.gyun.mongo.controller;

import lombok.RequiredArgsConstructor;
import me.gyun.mongo.domain.Account;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by jg 2021/04/07
 */
@RequiredArgsConstructor
@RestController
public class MongoController {

    private final MongoTemplate mongoTemplate;

    @GetMapping("/")
    public void test() {
        Account account = new Account("1", "Gyunny", "wjdrbs996@naver.com");
        mongoTemplate.insert(account);
    }
}
