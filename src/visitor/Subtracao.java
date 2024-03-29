package visitor;

public class Subtracao implements Expressao {
    private Expressao esquerda;
    private Expressao direita;

    public Subtracao(Expressao esquerda, Expressao direita){
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int avalia() {
        int valorEsquerda = this.esquerda.avalia();
        int valorDireita =  this.direita.avalia();
        return valorEsquerda - valorDireita;
    }

    @Override
    public void aceita(ImpressoraVisitor impressoraVisitor) {
        impressoraVisitor.visitaSubtracao(this);
    }

    public Expressao getEsquerda() {
        return esquerda;
    }

    public Expressao getDireita() {
        return direita;
    }
}
