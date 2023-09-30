package Stack;

import java.util.Stack;

public class testStack {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();//继承于vector
        stack.push("apple");//压栈
        stack.push("pear");
        stack.push("tangerine");
        System.out.println(stack);
        /*while(!stack.isEmpty()){
            String pop=stack.pop();//弹栈
            System.out.println("pop = " + pop);
        }
        System.out.println(stack);*/
        System.out.println("stack.peek() = " + stack.peek());
        stack.pop();
        System.out.println("stack.peek() = " + stack.peek());//获取栈顶元素
        System.out.println("stack.isEmpty() = " + stack.isEmpty());//判断是否为空
        System.out.println("stack.search(\"apple\") = " + stack.search("pear"));//查找一个元素在栈中的位置，如若没有返回-1
    }
}
