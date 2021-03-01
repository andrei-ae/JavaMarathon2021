package day8;

public class Task1 {
    public static void main(String[] args) {

        String strConcat = "";
        long startConcat = System.currentTimeMillis();
        long endConcat;

        final int NEED_COUNT = 20_000;

        for (int i = 0; i <= NEED_COUNT; i++) {
            strConcat += i + " ";
        }

        endConcat = System.currentTimeMillis();

        long concatTime = endConcat - startConcat;
        System.out.printf("Время на создание строки с помощью конкатенации: %d миллисекунд", concatTime);

        long startStrBuilder = System.currentTimeMillis();
        long endStrBuilder;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= NEED_COUNT; i++) {
            sb.append(i + " ");
        }

        endStrBuilder = System.currentTimeMillis();

        long strBuilderTime = endStrBuilder - startStrBuilder;
        System.out.printf("\nВремя на создание строки с помощью StringBuilder: %d миллисекунд", strBuilderTime);

        System.out.printf("\nВЫВОД: StringBuilder быстрее примерно в %d раз", concatTime / strBuilderTime);
    }
}
