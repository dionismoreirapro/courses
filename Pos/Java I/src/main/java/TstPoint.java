import java.security.spec.RSAOtherPrimeInfo;

public class TstPoint {
    public static void main(String[] args) {
        Cine cine = new Cine();
        Endereco endereco = new Endereco();
        Lanche lanche = new Lanche();

        endereco.setRua("Avenida Brasil");
        endereco.setNum(11111);
        lanche.setValConta(45);
        cine.setNome("cinemark");

        cine.setEnder(endereco);
        cine.setLanche(lanche);


        System.out.println(cine.getNome());
        System.out.println(cine.getEnder().getRua());
        cine.validar();
        System.out.println(cine.getEnder().getNum());
        System.out.println(cine.getLanche().getValConta());
    }
}
