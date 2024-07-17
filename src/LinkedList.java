public class LinkedList {
    private int num;
    LinkedList next;
    LinkedList prev;
    public LinkedList(int n){
        this.num=n;
        this.next=null;
        this.prev=null;
    }
    public int getNum(){
     return this.num;
    }
}
