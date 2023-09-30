和HashMap的区别
1.都是实现Map接口
2.Hashtable是基于陈旧的Dictionary类的，在jdk1.0时加入。HashMap是jdk1.2时加入的
3.Hashtable是线程安全的，HashMap是非线程安全的
4.HashMap可以将null作为key或者value，而Hashtable不允许key或value为null值
5.HashMap的初始容量16，Hashtable初始容量为11，加载因子都是0.75
6.HashMap扩容时是capacity*2，Hashtable扩容是capacity *2+1
7.HashMap数据结构：数组+链表+红黑树(当链表长度大于8时，转换为红黑树的结构);Hashtable数据结
构:数组+链表
8.计算hash的方法不同,Hashtable计算直接使用key的hashcode对table数组的长度进行取模，
hashMap计算hash对key的hashcode进行了二次hash，以获得更好的散列值，然后再对table数组长度
取模
