import java.util.Scanner;

public class t2 {
    //1)当给定一个数组和该数组中的某一元素的位置时，利用算法将该数组中的该位置的元素删除。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个数组的长度:");
        int x = scanner.nextInt();
        int[] y = new int[x];
        System.out.println("请输入数组的值：");
        for (int i=0;i<y.length;i++){
            y[i]=scanner.nextInt();
        }
        System.out.print("请输入欲删除值的索引：");
        int z = scanner.nextInt();
        int[] remove = remove(z, y);
        for (int i : remove) {
            System.out.print(i+"\t");
        }
    }
    public static int[] remove(int index,int[] s){
        if(index<s.length && index>=0){
            int[] q=new int[s.length-1];
            System.arraycopy(s,0,q,0,index);
            System.arraycopy(s,index+1,q,index,s.length-1-index);
            return q;
        }
        else{
            throw new IndexOutOfBoundsException("索引错误");
        }
    }
}
