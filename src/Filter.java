import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        int successCount = 0;

        logger.log("Запускаем фильтрацию");
        for (int i = 0; i < source.size(); i++) {
            int n = source.get(i);
            if (n < treshold) {
                logger.log("Элемент \"" + n + "\" не проходит");
            } else {
                logger.log("Элемент \"" + n + "\" проходит");
                result.add(n);
                successCount++;
            }
        }
        logger.log("Прошло фильтр " + successCount + " элемента из " + source.size());
        return result;
    }
}
