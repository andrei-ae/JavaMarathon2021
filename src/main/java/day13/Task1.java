package day13;

public class Task1 {
    public static void main(String[] args) {
        User u1 = new User("Аристарх");
        User u2 = new User("Алкид");
        User u3 = new User("Фемистоклюс");

        u1.sendMessage(u2, "Здорово. Как вообще?");
        u1.sendMessage(u2, "Ты тут?");

        u2.sendMessage(u1, "Привет.");
        u2.sendMessage(u1, "Да всё супер.");
        u2.sendMessage(u1, "Тестю вот задачу по дню 13.");

        u3.sendMessage(u1, "Добрый день!");
        u3.sendMessage(u1, "Можно вопрос?");
        u3.sendMessage(u1, "Лучше использовать класс Date или Calendar?");

        u1.sendMessage(u3, "Добрый.");
        u1.sendMessage(u3, "Ну, смотря для чего...");
        u1.sendMessage(u3, "Для 13 дня марафона, думаю, Date хватит");

        u3.sendMessage(u1, "Ясно, спасиб");

        MessageDatabase.showDialog(u1, u3);
    }
}
