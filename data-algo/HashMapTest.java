// 引入 HashMap 类
import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        // 创建 HashMap 对象 Sites
        HashMap<Integer, String> Sites = new HashMap<Integer, String>();
        // 添加键值对
        Sites.put(1, "Google");
        Sites.put(2, "Runoob");
        Sites.put(3, "Taobao");
        Sites.put(4, "Zhihu");
        System.out.println(Sites);
<<<<<<< HEAD
        System.out.println(Sites.get(3));
        Sites.remove(4);
        System.out.println(Sites);
        System.out.println(Sites.size());
=======
>>>>>>> 2998d0f66f8516cbdaa2c9d9a29d41f3a242eb3c
    }
}
