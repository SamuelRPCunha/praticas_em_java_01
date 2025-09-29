public class Inicio {
    public static void main(String[] args) {
        IdadePessoa idade = new IdadePessoa();

        idade.setNome("Jailson");
        idade.setIdade(30);

        System.out.println("Nome: " + idade.getNome());
        System.out.println("Idade: " + idade.getIdade());
        idade.verificarIdade();
    }
}
