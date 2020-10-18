public class SingleListNode {

    Object element; //

    SingleListNode nextNode;

    SingleListNode(Object element, SingleListNode nextNode) {

        this.element = element;
        this.nextNode = nextNode;


    }
    // porque é objec? Porque eu estou a fazer return de informação do tipo object
    Object getElement() {
        return this.element;

    }
    SingleListNode getNext() {
        return this.nextNode;

    }
    // Para que serve o "node"?
    void setNext(SingleListNode node) {
        this.nextNode = node;
    }
}


class Program {
    public static void main(String[] args) {
        int a = 3;
        // node = SingleListNode("POO", None)
        SingleListNode node = new SingleListNode("POO",null);
        System.out.println(node.element); //poo
        System.out.println(node.getElement()); //poo


    }
}
