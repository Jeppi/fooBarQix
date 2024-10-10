package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FooBarQixTest {

    @Test
    public void foobarqix() {

        assertThat(FooBarQix.execute(1)).isEqualTo("1");
        assertThat(FooBarQix.execute(2)).isEqualTo("2");
        assertThat(FooBarQix.execute(3)).isEqualTo("FooFoo");
        assertThat(FooBarQix.execute(101)).isEqualTo("1*1");
        assertThat(FooBarQix.execute(101)).isEqualTo("1*1");
        assertThat(FooBarQix.execute(101)).isEqualTo("1*1");
        assertThat(FooBarQix.execute(101)).isEqualTo("1*1");
        assertThat(FooBarQix.execute(53)).isEqualTo("BarFoo");
        assertThat(FooBarQix.execute(303)).isEqualTo("FooFoo*Foo");
        assertThat(FooBarQix.execute(105)).isEqualTo("FooBarQix*Bar");
        assertThat(FooBarQix.execute(10101)).isEqualTo("FooQix**");
    }

}
