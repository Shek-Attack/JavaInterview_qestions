package OOPs;


class college{
    public void move(){
        System.out.println("college is open");
    }
}

class university extends college{
    public void move(){
        System.out.println("University is open too");
    }
}
public class stud {
    public static void main(String[] args) {
        college a = new college();
        college b = new college();
        a.move();
        b.move();
    }
}
