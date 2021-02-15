package com.github.harshild;


import java.util.*;

public class RandomPairGenerator {
    public List<List<Developer>> generate(Map<Integer, Developer> devMap, int pairSize) {
        List<List<Developer>> pairs =  new ArrayList<>();

        Random random = new Random();
        while (!devMap.isEmpty()) {
            List<Developer> pair = new ArrayList<>();
            for (int j = 0; j < pairSize && !devMap.isEmpty(); j++) {
                List<Integer> list = new ArrayList<>(devMap.keySet());
                int i = list.get(random.nextInt(list.size()));
                pair.add(devMap.get(i));
                devMap.remove(i);
            }
            pairs.add(pair);
        }
        return pairs;
    }
}
