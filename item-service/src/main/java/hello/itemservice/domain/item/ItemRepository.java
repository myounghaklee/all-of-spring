package hello.itemservice.domain.item;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class ItemRepository {

    //HashMap쓰면 멀티쓰레드 환경에서 문제 발생 함 -> ConcurrentHashMap 사용해야됨
    private static final Map<Long, Item> store = new ConcurrentHashMap<>(
    );

    //long도 멀티쓰레드에서 문제 발생 -> atomic?으로 변경
    private static long sequence= 0L;

    public Item save ( Item item){
        item.setId(++sequence);
        store.put(item.getId(), item);
        return item;
    }

    public Item findById(Long id){
        return store.get(id);
    }
}
