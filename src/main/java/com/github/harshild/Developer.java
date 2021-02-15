package com.github.harshild;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Developer {
    String devName;
    boolean isPivot;
    boolean isNew;
}
