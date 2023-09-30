package 递归;

public class Test {
    public static void main(String[] args) {
        int sum=recursion(1,10);
        System.out.println("sum = " + sum);
        System.out.println("----------------------");
        System.out.println("mutiple(1,4) = " + mutiple(1, 4));
    }

    public static int recursion(int begin,int end){
        if (begin==end)
            return end;
        return begin+recursion(begin+1,end);
    }

    public static int mutiple(int begin,int end){
        if(begin==end)
            return end;
        return begin*mutiple(begin+1,end);
    }

    public static int sum(int begin,int end){
        int sum=0;
        for(int i=0;i<=end;i++){
            sum+=i;
        }
        return sum;
    }
}
