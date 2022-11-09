import java.util.Objects;

public class LL<T> {
    Node<T> root;

    public void add(T v) {
        if (Objects.isNull(root)) {
            root = new Node<T>(v);
            return;
        }
        Node<T> tempNode = root;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = new Node<T>(v);
    }

    public T getIndex(int index) {
        Node<T> tempNode = root;
        int counter = 0;
        while (counter != index) {
            tempNode = tempNode.next;
            counter++;
        }
        return tempNode.value;
    }

    public void delete(int index) {
        Node<T> tempNode = root;
        Node<T> previous = root;
        int counter = 0;
        while (counter != index) {
            previous = tempNode;
            counter++;
            tempNode = tempNode.next;
        }
        previous.next = tempNode.next;
    }

    public void addIndex(T v, int index) {

        if (Objects.isNull(root)||Objects.isNull(root.next)) {
            add(v);
            return;
        }

        Node<T> tempNode = root;
        Node<T> previous = root;
        int counter = 0;

        while (counter != index) {
            previous = tempNode;
            tempNode = tempNode.next;
            counter++;
        }
        previous.next = new Node<>(v);
        previous.next.next = tempNode;
    }
}
