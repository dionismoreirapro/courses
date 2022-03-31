package Capitulo13;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iob;
        iob = new Gen<Integer>(88);

        iob.showType();

        int v = iob.getOb();
        System.out.println("Value: " + v);

        System.out.printf("");


        Gen<String> strOb = new Gen<String>("Generic text");

        strOb.showType();

        String str = strOb.getOb();
        System.out.println(str);
    }
}
