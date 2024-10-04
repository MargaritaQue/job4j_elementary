package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenStart1Finish5sum15() {
        int expected = 15;
        int start = 1;
        int finish = 5;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart5Finish1sum0() {
        int expected = 0;
        int start = 5;
        int finish = 1;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }
}