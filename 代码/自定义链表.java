package 链表;

import java.util.NoSuchElementException;

public class MyLinkedList<E> {
    private class Node<E>{//创建节点
        Node<E> next;//后继节点
        E data;//数据元素
        Node<E> previous;//前驱节点

        public Node(Node<E> next, E data, Node<E> previous) {//构造函数
            this.next = next;
            this.data = data;
            this.previous = previous;
        }
    }
    private Node<E> first;//头结点
    private Node<E> last;//尾结点
    private int size;//有效元素个数

    public MyLinkedList() {//构造方法无参
    }

    public MyLinkedList(Node<E> first, Node<E> last, int size) {//构造方法有参
        this.first = first;
        this.last = last;
        this.size = size;
    }
    public boolean add(E e){//将元素加到链表的尾部
        Node<E> l=last;//将尾结点赋值给l
        Node<E> newNode=new Node<>(null,e,l);//新创建一个节点
        last=newNode;//将新创建的节点设置为尾结点
        if(l==null){//判断，如果尾结点为空。则新创建的节点就是第一个节点
            first=newNode;
        }else {
            l.next=newNode;
        }
        size++;
        return  true;
    }

    public void add(int index,E e){//将指定索引元素插入链表中
        if(index==0){//在链表的头部插入数据
            first=new Node<>(first,e,null);
        }else {
            Node<E> prev=node(index-1);//获取上一个节点
            Node<E> next=prev.next;//获取下一个节点
            Node<E> newNode=new Node<>(next,e,prev);
            prev.next=newNode;
        }
        size++;
    }

    Node<E> node(int index){//优化，判断查找的index和size的关系，找到索引对应的节点
        Node<E> x=first;
        for(int i=0;i<index;i++){
            x=x.next;
        }
        return x;
    }

    public E get(int index){//调用node（）传入索引返回对应索引data
        return node(index).data;
    }

    public int size(){//返回当前链表中元素个数
        return size;
    }

    public E getFirst(){//获取头部元素
        if(first==null){
            throw new NoSuchElementException();
        }
        return first.data;
    }

    public E getLast(){//获取尾部元素
        if(last==null){
            throw new NoSuchElementException();
        }
        return last.data;
    }

    public E remove(int index){//移除节点
        Node<E> node=first;
        if(index==0){
            first=first.next;
        }else {
            Node<E> prev=node(index-1);//待删除元素的上一位
            node=prev.next;//待删除元素
            prev.next=node.next;//上一位的后继节点指向待删除节点的下一位
            node.next=prev;//待删除节点的下一位指向上一位
        }
        size--;
        return node.data;
    }
}
