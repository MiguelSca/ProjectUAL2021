public class SinglyLinkedList {

    Object element; //

    SinglyLinkedList nextNode;

    SinglyLinkedList(Object element, SinglyLinkedList nextNode) {

        this.element = element;
        this.nextNode = nextNode;




    }

    // porque é objec? Porque eu estou a fazer return de informação do tipo object
    Object getFirst() {
        return this.element;

    }
    Object getLast() {
        return this.element;

    }
    Object get(int position) {
        return this.element;

    }
    Object insertFirst(Object element) {
        return this.element;

    }
    Object insertLast(Object element) {
        return this.element;

    }
    Object insert(Object element, int position) {
        return this.element;

    }
    Object removeFirst() {
        return this.element;

    }
    Object removeLast() {
        return this.element;

    }
    Object remove(int position) {
        return this.element;

    }


    // Para que serve o "node"?
    void setNext(SinglyLinkedList node) {
        this.nextNode = node;
    }
}


class Program1 {
    public static void main(String[] args) {
        int a = 3;
        // node = SingleListNode("POO", None)
        SinglyLinkedList node = new SinglyLinkedList("POO",null);
        System.out.println(node.element); //poo
        System.out.println(node.getFirst()); //poo
        System.out.println(node.getLast());

    }
}
