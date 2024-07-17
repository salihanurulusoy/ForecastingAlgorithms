public class Node {
    LinkedList head;
    LinkedList tail;
    public Node(){
        this.head=null;
        this.tail=null;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void insert(int num){
        if(isEmpty()){
            head=tail=new LinkedList(num);
        }else{
            LinkedList current=tail;
            tail.next=new LinkedList(num);
            tail=tail.next;
            tail.prev=current;
        }
    }
    public void insert(int num, int pos) {
        LinkedList data = new LinkedList(num);
        if (isEmpty()) {
            head = tail = data;
        } else {
            LinkedList current = getByPosition(pos);
            if (current.prev == null) {
                current.prev = data;
                data.next = current;
                this.head = data;
            } else {
                current = current.prev;
                LinkedList newPatient = current.next;
                data.next = newPatient;
                newPatient.prev = data;
                current.next = data;
                data.prev = current;
            }
        }
    }
    public int size() {
        int size = 0 ;
        LinkedList newHead = head;
        while (newHead!=null){
            size++;
            newHead=newHead.next;
        }
        return size;
    }
    public LinkedList deleteByName(int num) {
        LinkedList data = new LinkedList(num);
        int i = 0;
        while (i<size()){
            if(getByPosition(i).getNum()==num){
                getByPosition(i-1).next = data.next;
                getByPosition(i+1).prev = data.prev;
            }
            i++;
        }
        return data;
    }
    public LinkedList deleteByPosition(int pos) {
        if(pos == 0 ){
            LinkedList data3 = this.head;
            head = data3.next;
            return data3;
        }
        else{
            LinkedList data = getByPosition(pos);
            LinkedList data1 = getByPosition(pos-1);
            LinkedList data2 = getByPosition(pos+1);
            data1.next = data.next;
            data2.prev = data.prev;
            return data;
        }
    }

    public LinkedList getByPosition(int pos) {
        if (this.isEmpty())
            return new LinkedList(0);
        LinkedList current = this.head;
        int index = 0;

        while (current != null) {
            if (index++ == pos)
                break;
            current = current.next;
        }

        if (current == null)
            return new LinkedList(0);

        return current;
    }
    public void clear(){
        LinkedList trav=head;
        while (trav!=null){
            LinkedList next=trav.next;
            trav.prev=trav.next=null;
            trav=next;
        }
        head=tail=trav=null;
    }
    public void print(){
        if(this.isEmpty())
            return;
        LinkedList data = this.head;
        int index = 1;


        while (data != null) {
            System.out.println(index++ + ". " + data.getNum());

            data = data.next;
        }
    }
}
