
public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(6);
        list.insertFirst(34);
        list.insertFirst(54);
        list.insertFirst(9);
        list.insertFirst(23);
        list.insertLast(46);
        list.insert(29,4);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        }
    }
