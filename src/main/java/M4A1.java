public class M4A1 extends Arma{
    @Override
    public String colocarTinta() {
        return "Prata";
    }

    @Override
    public String verificaID() {
        if(this.getId()>10){
            return "Arma registrada";
        }
        else{
            return "Arma nao registrada";
        }
    }
}
