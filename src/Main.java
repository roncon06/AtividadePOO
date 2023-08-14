import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Lucas", LocalDate.of(2002, 12, 30));
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Data de Nascimento: " + pessoa1.getDataNascimento());
        System.out.println("Idade: " + pessoa1.getIdade() + " anos");


    }
}