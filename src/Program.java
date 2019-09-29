public class Program {


    public static void main(String[] args) {

        Expressao esquerda = new Subtracao(new Soma(new Numero(30), new Numero(50)), new Numero(20));
        Expressao direita = new Soma(new Numero(30), new Numero(20));

        Expressao soma = new Soma(esquerda , direita);

        int resultado = soma.avalia();

        System.out.println(resultado);

    }
}
