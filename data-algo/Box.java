public class Box<T> {

    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<String>();

        stringBox.add(new String("菜鸟教程"));

        System.out.printf("字符串为 :%s\n", stringBox.get());
    }
}