# Java Basics Password Validation
A Java program to generate passwords according to a given security policy.

## Requirements
- Java 24
- Maven
- IntelliJ (optional)

## Password Policy

### Minimum Requirements
- Minimum 8 characters
- Must contain at least one letter (lowercase or uppercase)

### Additional Rules (at least 3 of the following 4 must be met)
- At least one digit (0–9)
- Uppercase and lowercase letters required
- Must not be one of the following passwords (case-insensitive): `password`, `Passwort1`, `123456789`, `Hallo`
- At least one special character (allowed: `^°*+#'-_.:,;!"§$%&/()=`)
