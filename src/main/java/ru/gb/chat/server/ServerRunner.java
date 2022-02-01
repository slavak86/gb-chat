package ru.gb.chat.server;

public class ServerRunner {

    public static void main(String[] args) {
        final ChatServer server = new ChatServer();
        server.start();
    }
}
