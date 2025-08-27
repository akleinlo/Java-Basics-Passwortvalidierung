package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JavaBasicPasswordsTests {
    @Test
        void hasMinLength_shouldReturnTrue_whenStringHas8Characters() {
        // GIVEN
        String password = "12345678";
        int min = 8;
        boolean expected = true;

        // WHEN
        boolean actual = PasswordValidator.hasMinLength(password, min);

        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void containsDigit_shouldReturnTrue_whenStringIsA1() {
        // GIVEN
        String password = "A1";
        boolean expected = true;

        // WHEN
        boolean actual = PasswordValidator.containsDigit(password);

        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void containsUpperAndLower_shouldReturnTrue_whenStringIsXy() {
        // GIVEN
        String password = "Xy";
        boolean expected = true;

        // WHEN
        boolean actual = PasswordValidator.containsUpperAndLower(password);

        // THEN
        assertEquals(expected, actual);

    }



}