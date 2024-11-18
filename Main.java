import service.PessoaService;
import service.Pessoa;
import java.util.Scanner;
import service.Professor;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa p = new Professor();
        PessoaService ps = new PessoaService();

        System.out.println("Digite o nome:");
        p.setNome(scanner.next());
        System.out.println("Digite a idade :");
        p.setIdade(scanner.nextInt());
        System.out.println("Historia");
        ps.cadastrarPessoa(p);
        System.out.println(ps.listar());
    }
}