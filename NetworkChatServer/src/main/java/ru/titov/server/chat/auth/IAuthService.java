package ru.titov.server.chat.auth;

public interface IAuthService {

    default void start(){

    }

    String getUserNameByLoginAndPassword(String login, String password);

    default void stop(){

    }
    void upDateUsername(String currentUsername, String newUsername);
}
