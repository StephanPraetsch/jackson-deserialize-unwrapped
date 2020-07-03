package com.mercateo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
class Unwrapping5 {
    @Getter
    private String name;

    @JsonUnwrapped
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Getter
    private Location location;

    @JsonCreator
    public Unwrapping5(@JsonProperty("name") String name, @JsonProperty("x") int x, @JsonProperty("y") int y) {
        this.name = name;
        this.location = new Location(x, y);
    }
}
