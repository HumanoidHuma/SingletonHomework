import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Logger logger = Logger.getInstance();
        logger.log("запускаем программу");

        System.out.println("Привет, пользователь!");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");
        int size = scanner.nextInt();
        System.out.println();
        System.out.print("Введите верхнюю границу для значений: ");
        int maxValue = scanner.nextInt();
        System.out.println();

        logger.log("Создаём и наполняем список");
        List<Integer> list = generateRandomArray(size, maxValue);
        System.out.println("Вот случайный список: " + list.toString());

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int treshold = scanner.nextInt();
        System.out.println();

        Filter filter = new Filter(treshold);
        List<Integer> newFilteredList = filter.filterOut(list);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + newFilteredList.toString());

        logger.log("Завершаем программу");

    }

    public static List<Integer> generateRandomArray(int size, int maxValue) {
        Random random = new Random();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(maxValue));
        }

        return list;
    }
}
