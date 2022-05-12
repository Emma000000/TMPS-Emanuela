package com.company;

import java.util.Date;

class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}

class User {
    private String name;

    public String getName() {
        return name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
 class Mediator {

    public static void main(String[] args) {
        User Emanuela = new User("Emanuela");
        User Inga = new User("Inga");

        Emanuela.sendMessage("Hi! Inga!");
        Inga.sendMessage("Hello! Emanuela!");
    }

}