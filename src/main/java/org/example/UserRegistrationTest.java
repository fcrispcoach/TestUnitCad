package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    public void testRegisterUserWithValidData() {
        // Dados de teste válidos
        String username = "john_doe";
        String email = "john@example.com";
        String password = "StrongPassword123";

        // Verifica se o registro do usuário é bem-sucedido
        assertTrue(UserRegistration.registerUser(username, email, password));
    }

    @Test
    public void testRegisterUserWithInvalidEmail() {
        // Dados de teste com email inválido
        String username = "john_doe";
        String email = "johnexample.com"; // email inválido
        String password = "StrongPassword123";

        // Verifica se o registro do usuário falha devido ao email inválido
        assertTrue(UserRegistration.registerUser(username, email, password));
    }

    @Test
    public void testRegisterUserWithWeakPassword() {
        // Dados de teste com senha fraca
        String username = "john_doe";
        String email = "john@example.com";
        String password = "weak"; // senha fraca

        // Verifica se o registro do usuário falha devido à senha fraca
        assertFalse(UserRegistration.registerUser(username, email, password));
    }
}