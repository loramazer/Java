import br.com.alura.lauraflix.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("A média de avaliações deste filme é: " + meuFilme.pegaMedia());
        System.out.println("A quantidade de avaliações foi: " + meuFilme.getTotalDeAvaliacoes());
    }
}
