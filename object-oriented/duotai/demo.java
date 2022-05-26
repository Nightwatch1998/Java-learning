public class Test {
    public static void main(String[] args) {
        show(new Cat());
        show(new Dog());

        Animal a = new Cat(); //转为父类对象
        a.eat();
        Cat c = (Cat) a; //转为子类对象
        c.work();
    }
    public static void show(Animal a){
        a.eat();
        // 类型判断
        if(a instanceof Cat){
            Cat c = (Cat) a;
            c.work();
        } else if (a instanceof  Dog) {
            Dog c = (Dog) a;
            c.work();
        }
    }
}

abstract class Animal {
    abstract void eat();
}

// 猫类
class Cat extends Animal{
    public void eat(){
        System.out.println("吃鱼");
    }
    public void work(){
        System.out.println("抓老鼠");
    }
}

// 狗类
class Dog extends Animal{
    public void eat(){
        System.out.println("吃骨头");
    }
    public void work(){
        System.out.println("看家");
    }
}