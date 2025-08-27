package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JavaBasicPasswordsTests {
    // ----------------------------------------------------------------------------
    // ------------------------------- hasMinLength -------------------------------
    // ----------------------------------------------------------------------------

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
    void hasMinLength_shouldReturnFalse_whenStringHas7Characters() {
        // GIVEN
        String password = "1234567";
        // WHEN
        boolean actual = PasswordValidator.hasMinLength(password, 8);
        // THEN
        assertFalse(actual);
    }

    // ----------------------------------------------------------------------------
    // ------------------------------ containsDigits ------------------------------
    // ----------------------------------------------------------------------------
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
    void containsDigits_shouldReturnFalse_whenStringIsA() {
        // GIVEN
        String password = "A";
        // WHEN
        boolean actual = PasswordValidator.containsDigit(password);
        // THEN
        assertFalse(actual);
    }

    // ----------------------------------------------------------------------------
    // -------------------------- containsUpperAndLower --------------------------
    // ----------------------------------------------------------------------------
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
    void containsUpperAndLower_shouldReturnFalse_whenStringIsXY() {
        // GIVEN
        String password = "XY";
        //WHEN
        boolean actual = PasswordValidator.containsUpperAndLower(password);
        // THEN
        assertFalse(actual);
    }

    @Test
    void containsUpperAndLower_shouldReturnFalse_whenStringIsxy() {
        // GIVEN
        String password = "xy";
        // WHEN
        boolean actual = PasswordValidator.containsUpperAndLower(password);
        // THEN
        assertFalse(actual);
    }

    // ----------------------------------------------------------------------------
    // ----------------------------- isCommonPassword -----------------------------
    // ----------------------------------------------------------------------------
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
    void isCommonPassword_shouldReturnFalse_whenStringIs1() {
        // GIVEN
        String password = "1";
        // WHEN
        boolean actual = PasswordValidator.isCommonPassword(password);
        // THEN
        assertFalse(actual);
    }

    // ----------------------------------------------------------------------------
    // ------------------------- containsSpecialCharacter -------------------------
    // ----------------------------------------------------------------------------
    @Test
    void containsSpecialCharacter_shouldReturnTrue_whenStringContainsSpecialChar() {
        // GIVEN
        String password = "!";
        String allowed = "!";
        boolean expected = true;

        // WHEN
        boolean actual = PasswordValidator.containsSpecialChar(password, allowed);

        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void containsSpecialCharacter_shouldReturnFalse_whenStringIsAa1() {
        // GIVEN
        String password = "Aa1";
        String allowed = "!\"§$%&/()=?";
        // WHEN
        boolean actual = PasswordValidator.containsSpecialChar(password, allowed);
        // THEN
        assertFalse(actual);
    }

    // ----------------------------------------------------------------------------
    // ------------------------ everything above combined ------------------------
    // ----------------------------------------------------------------------------
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

    @Test
    void isValid_shouldReturnFalse_whenStringHas7Characters() {
        // GIVEN
        String password = "1Aa!b5T";
        // WHEN
        boolean actual = PasswordValidator.isValid(password);
        // THEN
        assertFalse(actual);
    }

    @Test
    void isValid_shouldReturnFalse_whenStringDoesntContainsDigits() {
        // GIVEN
        String password = "Aa!bT§wZ";
        // WHEN
        boolean actual = PasswordValidator.isValid(password);
        // THEN
        assertFalse(actual);
    }

    @Test
    void isValid_shouldReturnFalse_whenStringDoesntContainUppercase() {
        // GIVEN
        String password = "1aa!b5t§2w";
        // WHEN
        boolean actual = PasswordValidator.isValid(password);
        // THEN
        assertFalse(actual);
    }

    @Test
    void isValid_shouldReturnFalse_whenStringDoesntContainLowercase() {
        // GIVEN
        String password = "1AA!B5T§2W";
        // WHEN
        boolean actual = PasswordValidator.isValid(password);
        // THEN
        assertFalse(actual);
    }

    @Test
    void isValid_shouldReturnFalse_whenStringDoesntContainSpecialChar() {
        // GIVEN
        String password = "1Aab5T2w";
        // WHEN
        boolean actual = PasswordValidator.isValid(password);
        // THEN
        assertFalse(actual);
    }



}