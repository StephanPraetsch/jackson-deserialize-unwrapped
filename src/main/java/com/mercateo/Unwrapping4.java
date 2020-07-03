package com.mercateo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
class Unwrapping4 {
    @Getter
    private String name;

    @JsonUnwrapped
    @Getter
    private Location location;

    @JsonCreator
    public Unwrapping4(@JsonProperty("name") String name, @JsonUnwrapped Location location) {
        this.name = name;
        this.location = location;
    }
}
