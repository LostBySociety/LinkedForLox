package src;


public class Main {
    public static void main(String[] args) {
        LinkedForLox<String> list = new LinkedForLox<>();
        list.add("list");
        list.remove(0);
        System.out.println(list.getSize());


    }
}