public class Main {
    public static void main(String[] args) {
        LL<Integer> ll = new LL<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        //ll.delete(1);
        ll.addIndex(5, 3);
        ll.addIndex(4, 3);
        System.out.println(ll.getIndex(0));
        System.out.println(ll.getIndex(1));
        System.out.println(ll.getIndex(2));
        System.out.println(ll.getIndex(3));
        System.out.println(ll.getIndex(4));
    }
}