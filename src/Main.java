import java.util.*;

/**
 * Программа для проверки работы метода filterComments
 */
public class Main {
    public static void main(String[] args) {
        //Создаем список и добавлям в него комментарии
        List<String> comments = new LinkedList<>();
        comments.add("Выйграйте приз!");
        comments.add("Обычный коммент");
        comments.add("Получайте бонусы");

        //Создаем множество и добавляем в него спам-слова
        Set<String> blackList = new HashSet<>();
        blackList.add("бесплатно");
        blackList.add("бонусы");
        blackList.add("приз");
        blackList.add("заработать");
        blackList.add("доход");
        blackList.add("скидки");

        //Создаем экземпляр класса CommentFilter
        CommentFilter filter = new CommentFilter();

        //Убераем спам-комментарии с помощью метода filterComments
        filter.filterComments(comments,blackList);

        //смотрим содержание списка
        for(String comment: comments){
            System.out.println(comment);
        }
    }
}