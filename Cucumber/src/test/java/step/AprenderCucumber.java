package step;


import io.cucumber.java.en.*;

public class AprenderCucumber {
    @Given("que criei o arquivo corretamente")
    public void que_criei_o_arquivo_corretamente() throws Throwable{
        System.out.println("given");

    }
    @When("executá-lo")
    public void executá_lo() throws Throwable{
        System.out.println("when");

    }
    @Then("a expecificação deve finalizar com sucesso")
    public void a_expecificação_deve_finalizar_com_sucesso() throws Throwable{
        System.out.println("then");

    }

}
