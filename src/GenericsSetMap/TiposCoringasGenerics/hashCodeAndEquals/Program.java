package GenericsSetMap.TiposCoringasGenerics.hashCodeAndEquals;

public class Program {
    public static void main(String[] args) {
        // Exemple One
        String a = "Clara";
        String b = "Paulo";
        System.out.println(a.equals(b));

        // Exemple Two
        String c = "Vera";
        String d = "Alex";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        // Exemple three
        Cliente c1 = new Cliente("Maria", "maria@gmail.com");
        Cliente c2 = new Cliente("João", "joao@gmail.com");
        Cliente c3 = new Cliente("João", "joao@gmail.com");

        String s1 = "teste";
        String s2 = "teste";

        System.out.println(c1.equals(c2));
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c2 == c3);

    }

}
