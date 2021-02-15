package com.github.harshild;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class PairGeneratorController {

    @RequestMapping("/")
    public String index() {
        return "Pair Generator App";
    }

    @RequestMapping(value = "/generate", method = RequestMethod.POST)
    public String generate(@RequestParam Map<Integer, Developer> payload) {
        return "Pair Generator App";
    }
}
