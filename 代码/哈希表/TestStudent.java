public class TestStudent {
    public static void main(String[] args) {
        HashSet<Student> set=new HashSet<>();
        Student student1=new Student("阿卡丽","女");
        Student student3=new Student("阿卡丽","女");
        //Student student2=new Student("易","男");
        set.add(student1);
        set.add(student3);
        System.out.println(set);
        System.out.println(student1.hashCode());
        System.out.println(student3.hashCode());
    }
}
