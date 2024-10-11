package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.example.FooBarQixF.execute;

class FooBarQixFTest {

    @Test
    public void foobarqixF() {

        assertThat(execute(1)).isEqualTo("1");
        assertThat(execute(2)).isEqualTo("2");
        assertThat(execute(3)).isEqualTo("FooFoo");
        assertThat(execute(101)).isEqualTo("1*1");
        assertThat(execute(53)).isEqualTo("BarFoo");
        assertThat(execute(303)).isEqualTo("FooFoo*Foo");
        assertThat(execute(105)).isEqualTo("FooBarQix*Bar");
        assertThat(execute(10101)).isEqualTo("FooQix**");
    }

}
