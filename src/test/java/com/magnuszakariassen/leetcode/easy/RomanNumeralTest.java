package com.magnuszakariassen.leetcode.easy;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class RomanNumeralTest {


    @ParameterizedTest
    @MethodSource("inputOutput")
    void romanToInt(String romanNumber,
                    int expectedResult) {

        int result = RomanNumeral.romanToInt(romanNumber);

        assertThat(result).isEqualTo(expectedResult);
    }

    public static Stream<Arguments> inputOutput() {
        return Stream.of(
                Arguments.of("V", 5),
                Arguments.of("XI", 11),
                Arguments.of("XIV", 14),
                Arguments.of("MCMXCIV", 1994));
    }
}