package ru.galymbay.spring.email;

public interface EmailSender {
    void send(String to, String email);
}
