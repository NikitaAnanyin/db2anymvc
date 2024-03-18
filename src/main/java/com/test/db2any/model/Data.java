package com.test.db2any.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Data {
    private Long id;
    private String value;

    @Override
    public String toString() {
        return "{\"ID\":" + id +
                ",\"VALUE\":\"" + value + "\"}";
    }
}
