import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Класс, реализующий интерфейс BlackListFilter
 */
public class CommentFilter implements BlackListFilter {
    public void filterComments(List<String> comments, Set<String> blackList) throws NullPointerException {
        Iterator<String> it = comments.iterator();
        while(it.hasNext()){    //проходим по списку комментариев
            String nextComment = it.next();
            for(String black: blackList){   //смотрим, содержится ли спам-слово в комментарии.
                if(nextComment.contains(black)){    //Если да, то удаляем комментарий из списка
                    it.remove();
                }
            }
        }
    }
}
