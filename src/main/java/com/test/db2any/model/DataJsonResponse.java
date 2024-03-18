package com.test.db2any.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Builder
public class DataJsonResponse {

    private Data data;
    private HttpStatus status;
    private String requestParam;

    @Override
    public String toString() {
        return "{\"data\"" + ":\"" +
                data.toString() +
                "\",\"response\"" + ":\"" + status.getReasonPhrase() +
                "\",\"request\"" + ":\"" + requestParam +
                "\"}";
    }
}