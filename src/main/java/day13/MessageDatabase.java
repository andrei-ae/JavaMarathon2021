package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    public static List<Message> messageList = new ArrayList<>();

    /**
     * “Отправляет” новое сообщение от пользователя u1 пользователю u2 с текстом text.
     * Отправка в нашем контексте означает добавление сообщения в нашу “базу данных”
     */
    public static void addNewMessage(User u1, User u2, String text) {
        Message message = new Message(u1, u2, text);
        messageList.add(message);
    }

    public static List<Message> getMessages() {
        return messageList;
    }

    /**
     * Выводит цепочку сообщений (диалог) пользователей u1 и u2
     */
    public static void showDialog(User u1, User u2) {
        for (Message message : messageList) {
            if ((message.getSender() == u1 && message.getReceiver() == u2)
                    || message.getSender() == u2 && message.getReceiver() == u1) {
                System.out.println(message.getSender().getUsername() + ": " + message.getText());
            }
        }
    }
}
