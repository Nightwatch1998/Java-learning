import java.util.ArrayList;

public class RunoobTest {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites.get(1));
        sites.set(2,"wiki");
        System.out.println(sites);
        sites.remove(3);
        System.out.println(sites);
    }
}