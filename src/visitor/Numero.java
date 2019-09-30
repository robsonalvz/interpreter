package visitor;

public class Numero implements Expressao {
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    @Override
    public int avalia() {
        return numero;
    }

    @Override
    public void aceita(ImpressoraVisitor impressoraVisitor) {
        impressoraVisitor.visitaNumero(this);
    }

    public int getNumero() {
        return numero;
    }
}
