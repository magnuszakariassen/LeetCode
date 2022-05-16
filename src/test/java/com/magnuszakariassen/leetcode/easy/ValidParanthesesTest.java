package com.magnuszakariassen.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ValidParanthesesTest {

    @ParameterizedTest
    @MethodSource("inputOutput")
    void isValid(String input,
                 boolean expectedResult) {
        boolean result = ValidParantheses.isValid(input);
        assertThat(result).isEqualTo(expectedResult);
    }

    public static Stream<Arguments> inputOutput() {
        return Stream.of(
                Arguments.of("()", true),
                Arguments.of("()[]{}", true),
                Arguments.of("(]", false),
                Arguments.of("()[}", false),
                Arguments.of("[)", false),
                Arguments.of("{[]}", true));
    }
}