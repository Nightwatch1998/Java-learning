import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites);
        sites.addFirst("wiki");
        System.out.println(sites);
        sites.addLast("dish");
        System.out.println(sites);
        System.out.println(sites.getFirst());
        System.out.println(sites.getLast());
        for(String i : sites){
            System.out.println(i);
        }
    }
}
