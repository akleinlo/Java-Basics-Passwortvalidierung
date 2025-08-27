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
    void containsDigit_shouldReturnTrue_whenStringIs1() {
        // GIVEN
        String password = "1";
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

    @Test
    void isCommonPassword_shouldReturnTrue_whenStringIs123456789() {
        // GIVEN
        String password = "123456789";
        boolean expected = true;

        // WHEN
        boolean actual = PasswordValidator.isCommonPassword(password);

        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void containsSpecialCharacter_shouldReturnTrue_whenStringContainsSpecialChar() {
        // GIVEN
        String password = "!";
        String allowed = "!\"§";
        boolean expected = true;

        // WHEN
        boolean actual = PasswordValidator.containsSpecialChar(password, allowed);

        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void isValid_shouldReturnTrue_whenChecksAboveAreCombined() {
        // GIVEN
        String password = "1Aa!b5T§2w";
        boolean expected = true;

        // WHEN
        boolean actual = PasswordValidator.isValid(password);

        // THEN
        assertEquals(expected, actual);
    }



}