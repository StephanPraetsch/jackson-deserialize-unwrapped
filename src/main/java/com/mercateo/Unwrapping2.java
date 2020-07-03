package com.mercateo;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
class Unwrapping2 {
    @Getter
    private final String name;

    @JsonUnwrapped
    @Getter
    private final Location location;

    @java.beans.ConstructorProperties({ "name", "location" })
    public Unwrapping2(String name, Location location) {
        this.name = name;
        this.location = location;
    }
}
