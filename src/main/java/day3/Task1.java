package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city;
        String output;
        String stopWord = "Stop";

        while (true) {
            city = scanner.nextLine();

            if (city.equals(stopWord)) {
                System.out.println("*программа завершила работу*");
                break;
            }

            switch (city) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    output = "Россия";
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    output = "Италия";
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    output = "Англия";
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    output = "Германия";
                    break;
                default:
                    output = "Неизвестная страна";
            }
            System.out.println(output);
        }
    }
}
