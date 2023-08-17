public class App {
    public static void main(String[] args) throws Exception {
        Produto omo = new Produto("Omo", 0.5f, "Sabões e Barras", "0010000101111010", "Produto de Limpeza");
        Alimento banana  = new Alimento("Banana", 2, "Fazenda Feliz", "0101101000100000", "Frutas", "09/12/23", 25.0f);

        System.out.println(omo.getNome());
        System.out.println(banana.getCategoria());
        System.out.println(banana.getValidade());
    }
}
