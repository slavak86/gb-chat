package ru.gb.chat.server;


public interface AuthService {
    String getNickByLoginAndPass(String login, String password);

}

