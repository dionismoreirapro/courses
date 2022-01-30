abstract public class Point {
    String nome = "";
    int valConta = 0;
    Endereco ender;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValConta() {
        return valConta;
    }

    public void setValConta(int valConta) {
        this.valConta = valConta;
    }

    public Endereco getEnder() {
        return ender;
    }

    public void setEnder(Endereco ender) {
        this.ender = ender;
    }

    abstract void calVal();
}
