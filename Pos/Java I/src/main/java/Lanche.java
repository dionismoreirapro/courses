public class Lanche extends Point implements Verifica {
    String prato = "";


    public String getPrato() {
        return prato;
    }

    public void setPrato(String prato) {
        this.prato = prato;
    }

    @Override
    void calVal() {
        if(getValConta() % 2 == 0){
            System.out.println("“Valor par!");
        }else{
            System.out.println("“Valor ímpar!");
        }

    }

    @Override
    public void validar() {
      String primeiraLetra = this.prato.substring(0,1);
      System.out.println(primeiraLetra);
    }
}
