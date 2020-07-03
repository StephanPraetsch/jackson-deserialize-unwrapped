package com.mercateo;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
class Unwrapping3 {
    @Getter
    @Setter
    private String name;

    @JsonUnwrapped
    @Getter
    @Setter
    private Location location;
}
