public class TestLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> set=new LinkedHashSet<>();
        set.add("apple");
        set.add("pear");
        set.add("pear");
        set.add("tangerine");
        set.add("watermelon");
        set.add("watermelon");
        set.add("watermelon");
        System.out.println(set);
    }
}
//hashset与linkedhashset的区别在于后者有序
