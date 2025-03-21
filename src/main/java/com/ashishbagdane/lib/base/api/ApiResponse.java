package com.ashishbagdane.lib.base.api;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiResponse<T> {

    private boolean success;

    private T data;

    private String message;
}
