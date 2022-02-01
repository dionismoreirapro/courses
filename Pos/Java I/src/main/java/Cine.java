public class Cine extends Point implements Verifica {
    int qtdCad = 0;
    Lanche lanche;

    public int getQtdCad() {
        return qtdCad;
    }

    public void setQtdCad(int qtdCad) {
        this.qtdCad = qtdCad;
    }

    public Lanche getLanche() {
        return lanche;
    }

    public void setLanche(Lanche lanche) {
        this.lanche = lanche;
    }

    @Override
    void calVal() {
        setValConta(getValConta() + 10);
        System.out.println(getValConta());
    }

    public void validar() {
        int tamanho = super.getEnder().getRua().length();
        if ((tamanho > 9) && (tamanho < 36)) {
            System.out.println("Nome de rua VALIDO para Cine!");
        } else {
            System.out.println("“Nome de rua INVALIDO para Cine!");
        }
    }
}
