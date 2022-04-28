import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("bilibili");
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        sites.add("youtube");
        sites.add("zhihu");
        System.out.println(sites);
        sites.set(2,"w3cschool");
        System.out.println(sites);
        sites.remove(2);
        System.out.println(sites);
        Collections.sort(sites);
        for (String str : sites) {
            System.out.println(str);
        }
    }
}