import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> list) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем фильтрацию");

        List<Integer> result = new ArrayList<>();
        for (int num : list) {
            if (num < treshold) {
                logger.log("Элемент " + num + " не проходит");
                continue;
            }
            result.add(num);
            logger.log("Элемент " + num + " подходит");
        }

        logger.log("Прошло фильтр " + list.size() + " элемента из 7");

        return result;
    }
}
