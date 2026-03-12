public class Main {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

        //testar add
        lista.add("Helen");
        lista.add("Felipe");
        lista.add("Salaminha");

        //testar set
        lista.set(0, "Helenzinha");

        //testar index e contains
        System.out.println(lista.contains("Salami")); // FALSOOOOOOO
        System.out.println(lista.indexOf("Felipe")); // 1

        //testando remove
        lista.remove(0);

        //testando o to array e depois printando o array
        Object[] array = lista.toArray();

        System.out.println("Sua lista ficou assim: ");
        for (Object item : array) {
            System.out.println(item);
        }
    }
}