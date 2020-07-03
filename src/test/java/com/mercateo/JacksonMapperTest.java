package com.mercateo;

import static org.assertj.core.api.Java6Assertions.assertThat;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.Test;

public class JacksonMapperTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    private final String serialization = "{\"name\":\"John\",\"x\":\"1\",\"y\":\"2\"}";

    /*
     * jackson 2.8.10: passed
     *
     * jackson 2.11.1: failed
     */
    @Test
    public void unwrapping1_jsonCreator_and_JsonProperty() throws Exception {

        // given
        Unwrapping1 expected = new Unwrapping1("John", new Location(1, 2));

        // when
        Unwrapping1 res = objectMapper.readValue(serialization, Unwrapping1.class);

        // then
        assertThat(res).isEqualTo(expected);

    }

    /*
     * jackson 2.8.10: failed
     *
     * jackson 2.11.1: failed
     */
    @Test
    public void unwrapping2_constructorProperties() throws Exception {

        // given
        Unwrapping2 expected = new Unwrapping2("John", new Location(1, 2));

        // when
        Unwrapping2 res = objectMapper.readValue(serialization, Unwrapping2.class);

        // then
        assertThat(res).isEqualTo(expected);

    }

    /*
     * jackson 2.8.10: passed
     * 
     * jackson 2.11.1: passed
     */
    @Test
    public void unwrapping3_setter() throws Exception {

        // given
        Unwrapping3 expected = new Unwrapping3();
        expected.setName("John");
        expected.setLocation(new Location(1, 2));

        // when
        Unwrapping3 res = objectMapper.readValue(serialization, Unwrapping3.class);

        // then
        assertThat(res).isEqualTo(expected);

    }

    /*
     * jackson 2.8.10: passed
     *
     * jackson 2.11.1: failed
     */
    @Test
    public void unwrapping4_constructor_with_JsonUnwrapped() throws Exception {

        // given
        Unwrapping4 expected = new Unwrapping4("John", new Location(1, 2));

        // when
        Unwrapping4 res = objectMapper.readValue(serialization, Unwrapping4.class);

        // then
        assertThat(res).isEqualTo(expected);

    }

    /*
     * jackson 2.8.10: passed
     *
     * jackson 2.11.1: failed
     */
    @Test
    public void unwrapping5_ReadOnly() throws Exception {

        // given
        Unwrapping5 expected = new Unwrapping5("John", new Location(1, 2));

        // when
        Unwrapping5 res = objectMapper.readValue(serialization, Unwrapping5.class);

        // then
        assertThat(res).isEqualTo(expected);

    }

}
