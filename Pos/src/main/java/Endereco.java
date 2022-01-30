public class Endereco {
    int num = 0;
    String rua = "";

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        NumException numException = new NumException();
        if (num <= 1000) {
            this.num = num;
        } else {
            numException.impMsg();
        }
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
}
