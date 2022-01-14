public class AK47 extends Arma{
    @Override
    public String colocarTinta() {
        return "Ouro";
    }

    @Override
    public String verificaID() {
        if(this.getId()<10){
            return "Arma registrada";
        }
        else{
            return "Arma nao registrada";
        }
    }
}
