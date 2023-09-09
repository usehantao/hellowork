@SuppressWarnings({"all"})
public class HashSetStructure {
    public static void mian(String[] args) {
        //模拟HashMap底层
        //创建一个数组.数组的类型是node
        Node[] table = new Node[16];
        //创建结点
        Node john = new Node("john", null);
        table[2] = john;
        Node jack = new Node("jack",null);
        john.next=jack;//将jack点 挂载到john
        Node rose = new Node("rose",null);
        jack.next =rose;//将rose点挂载到jack
        Node lucy =new Node("lucy" ,null);
        table[3]=lucy;
        System.out.println("table= " +table);



    }
}

class Node{
    //代表结点，存储数据，可以指向下一个结点，从而形成链表
    Object item; //存放数据
    Node next;//指向下一个结点
    public Node(Object item,Node next){
        this.item=item;
        this.next=next;

    }

}
