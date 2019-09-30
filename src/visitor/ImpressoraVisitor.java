package visitor;

public class ImpressoraVisitor {

    public void visitaSoma(Soma soma){
        System.out.print("(");

        soma.getEsquerda().aceita(this);

        System.out.print(" + ");

        soma.getDireita().aceita(this);

        System.out.print(")");
    } public void visitaSubtracao(Subtracao subtracao){
        System.out.print("(");

        subtracao.getEsquerda().aceita(this);

        System.out.print(" - ");

        subtracao.getDireita().aceita(this);

        System.out.print(")");
    }
    public void visitaNumero(Numero n){
        System.out.print(n.getNumero());
    }
}
