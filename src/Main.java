package src;


public class Main {
    public static void main(String[] args) {
        LinkedForLox<String> list = new LinkedForLox<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.remove(5);
        list.print();
    }
}