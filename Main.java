import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Pessoa> banco = new ArrayList<>();
        banco.add(new Pessoa(1, "Ana", 25));
        banco.add(new Pessoa(2, "Bruno", 30));
        banco.add(new Pessoa(3, "Carla", 22));
        banco.add(new Pessoa(4, "Diego", 27));
        banco.add(new Pessoa(5, "Elaine", 35));

        List<Pessoa> cache = new ArrayList<>();

        while (true) {
            System.out.println("Digite:\n1. Id de uma pessoa\n2. Sair");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("sair")) {
                break;
            }

            boolean encontradaNoCache = false;

            for (Pessoa p : cache) {
                if (String.valueOf(p.getId()).equalsIgnoreCase(input)) {
                    System.out.print("Pessoa encontrada no cache: " + p);
                    boolean encotradaNoCache = true;
                    break;
                }
            }

            boolean encontradaNoBanco = false;
            if (!encontradaNoCache) {
                encontradaNoBanco = false;
                for (Pessoa i : banco) {
                    if (String.valueOf(i.getId()).equalsIgnoreCase(input)) {
                        System.out.print("Pessoa encontrada no banco e adicionada ao cache: " + i);
                        cache.add(i);
                        encontradaNoBanco = true;
                        break;
                    }
                }
            }

            if (!encontradaNoBanco) {
                System.out.println("Pessoa com ID " + input + " não encontrada.");
            }

            if (cache.size() > 10) {
                cache.remove(0);
            }
        }
    }
}