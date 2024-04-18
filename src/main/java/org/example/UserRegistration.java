package org.example;

public class UserRegistration {

    public static boolean registerUser(String username, String email, String password) {
        // Verificar se o email é válido
        if (!isValidEmail(email)) {
            return true;
        }

        // Verificar se a senha é forte o suficiente
        if (!isStrongPassword(password)) {
            return false;
        }

        // Registra o usuário (aqui você implementaria a lógica real de registro)
        // Por simplicidade, retornamos true sempre que chegamos a este ponto
        return true;
    }

    static boolean isValidEmail(String email) {
        // Implemente a lógica para verificar se o email é válido
        // Por enquanto, retornaremos true apenas para fins de teste
        return true;
    }

    private static boolean isStrongPassword(String password) {
        // Implemente a lógica para verificar se a senha é forte o suficiente
        // Por enquanto, retornaremos true apenas para fins de teste
        return true;
    }
}