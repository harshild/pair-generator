package com.github.harshild;

import java.util.*;

public class RandomPairGenerator {
    public static void main(String[] args) {
        int pairSize = 2;
        Map<Integer, String> devMap = new HashMap() {{
            put(1, "HD");
            put(2, "SK");
            put(3, "AH");
            put(4, "RS");
            put(5, "LW");
        }};

        Random random = new Random();
        while (!devMap.isEmpty()) {
            for (int j = 0; j < pairSize && !devMap.isEmpty(); j++) {
                List<Integer> list = new ArrayList<>(devMap.keySet());
                int i = list.get(random.nextInt(list.size()));
                System.out.print(devMap.get(i)+" ");
                devMap.remove(i);
            }
            System.out.println();
        }
    }
}
