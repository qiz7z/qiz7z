package lambda语法;

public class Test {
    public static void main(String[] args) {
        MathInterFace interFace=(i)->{return i*10;};
        System.out.println(interFace.expand10(10));
        /*MathInterFace interFace=new MathInterFace() {
            @Override
            public Integer expand10(Integer i) {
                return i*10;
            }
        };
        System.out.println(interFace.expand10(20));*/
    }
}
