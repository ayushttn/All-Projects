package com.data.api;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class HamcrestMatchersTest {
    @Test
    public void test(){
        List<Integer> Scores = Arrays.asList(99, 34, 5, 4, 2);
        assertThat(Scores, hasSize(5));
        assertThat(Scores, hasItems(99,5));

        assertThat(Scores, everyItem(greaterThan(1)));
    }
}
