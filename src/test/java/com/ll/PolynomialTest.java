package com.ll;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledForJreRange;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class PolynomialTest {

    @Test
    @DisplayName("1+1=2")
    void T1() {
        assertThat(new Polynomial("3 + 3").calc()).isEqualTo(6);
    }
    @Test
    @DisplayName("1+1=2")
    void T2() {
        assertThat(new Polynomial("2 + 2").calc()).isEqualTo(4);
    }
    @Test
    @DisplayName("50 - 30 =20")
    void T3() {
        assertThat(new Polynomial("50 - 30").calc()).isEqualTo(20);
    }
}