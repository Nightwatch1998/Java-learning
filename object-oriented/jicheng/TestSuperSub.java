class SuperClass {
    private  int n;
    SuperClass(){
        System.out.println("SuperClass");
    }
    SuperClass(int n){
        System.out.println("SuperClass(int n)");
        this.n = n;
    }
}

// 子类1
class  SubClass1 extends  SuperClass{
    private  int n;
    SubClass1(){ //自动调用父类无参构造器
        System.out.println("SubClass1");
    }
    public SubClass1(int n){
        super(300);
        System.out.println("SubClass1(int n)："+n);
        this.n = n;
    }
}

// 子类2
class SubClass2 extends SuperClass{
    private int n;
    SubClass2(){
        super(300);
        System.out.println("SubClass2");
    }
    public SubClass2(int n){
        System.out.println("SubClass2(int n):"+n);
        this.n = n;
    }
}

public class TestSuperSub{
    public static void main(String[] args) {
        System.out.println("----------SubClass1类继承-----------");
        SubClass1 sc1 = new SubClass1();
        SubClass1 sc2= new SubClass1(100);
        System.out.println("----------SubClass2类继承-----------");
        SubClass2 sc3 = new SubClass2();
        SubClass2 sc4 = new SubClass2(200);
    }
}