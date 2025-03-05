package com.example.SpringRestDemo.util.constants;

public enum Authority {
    READ,
    WRITE,
    UPDATE,
    USER, // user can update delete self object, read anything
    ADMIN // admin can update delete any object
}
