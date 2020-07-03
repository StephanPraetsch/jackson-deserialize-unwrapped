package com.mercateo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
class Unwrapping6 {
    @Getter
    private String name;

    @JsonUnwrapped
    @Getter
    @Setter
    private Location location;

    @JsonCreator
    public Unwrapping6(@JsonProperty("name") String name) {
        this.name = name;
    }
}
