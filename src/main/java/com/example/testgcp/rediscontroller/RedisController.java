package com.example.testgcp.rediscontroller;

import com.example.testgcp.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/redis")
public class RedisController {
    @Autowired
    private RedisService redisService;

    @PostMapping("/set")
    public ResponseEntity<Void> setKeyValue(@RequestParam String key, @RequestParam String value) {
        redisService.set(key, value);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/get")
    public ResponseEntity<String> getValue(@RequestParam String key) {
        String value = redisService.get(key);
        if (value != null) {
            return ResponseEntity.ok(value);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
