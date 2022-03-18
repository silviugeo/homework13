package com.endava.calculator;

import com.endava.calculator.basic.Basic;
import com.endava.calculator.basic.BasicOperations;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTestAssertJ {

    private BasicOperations basic = new Basic();

    @Test
    public void shouldAdd1Operands() {

        //WHEN
        Integer result = basic.add(167);

        //THEN
        assertThat(result).isBetween(100, 200)
                .isGreaterThan(150)
                .isEqualTo(168)
                .isNotNegative()
                .isNull();
    }
}
