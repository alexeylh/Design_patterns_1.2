import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Logger logger = Logger.getInstance();

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");
        String input = in.nextLine();
        int listSize = Integer.parseInt(input);
        System.out.print("Введите верхнюю границу для значений: ");
        input = in.nextLine();
        int listMax = Integer.parseInt(input);

        logger.log("Создаём и наполняем список");
        List<Integer> intList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < listSize; i++) {
            intList.add(random.nextInt(listMax));
        }
        logger.log("Вот случайный список: " + intList);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        input = in.nextLine();
        int listMin = Integer.parseInt(input);

        Filter filter = new Filter(listMin);
        List<Integer> filteredList = filter.filterOut(intList);
        logger.log("Выводим результат на экран");
        logger.log("Отфильтрованный список: " + filteredList);
        logger.log("Завершаем программу");
    }
}
