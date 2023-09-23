//1.有一个整数数组，其中存放着序列1，3，5，7，9，11，13，15，17，19。请将该序列倒序存放并输出。
public class t1 {
    public static void main(String[] args) {
        int[] arrays={1,3,5,7,9,11,13,15,17,19};
        for (int i=arrays.length-1;i>=0;i--){
            System.out.print(arrays[i]+"\t");
        }
    }
}
