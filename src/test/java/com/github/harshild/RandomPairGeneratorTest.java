package com.github.harshild;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class RandomPairGeneratorTest {
    RandomPairGenerator randomPairGenerator = new RandomPairGenerator();

    @Test
    public void itShouldGeneratePairs(){

        int pairSize = 3;
        Map<Integer, Developer> devMap = new HashMap() {{
            put(1, new Developer("HD", false, false));
            put(2, new Developer("SK", false, false));
            put(3, new Developer("AH", false, false));
            put(4, new Developer("RS", false, false));
            put(5, new Developer("LW", false, false));
        }};

        List<List<Developer>> pairs = randomPairGenerator.generate(devMap, pairSize);

        for (int i = 0; i < pairs.size(); i++) {
            if(pairs.size() == i + 1){
                assertTrue(pairs.get(i).size() <= pairSize);
            } else {
                assertEquals(pairs.get(i).size(), pairSize);
            }
        }

    }

}