public abstract class Arma {

    private int id;
    protected String nome;
    private String bala;
    private int pente;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBala() {
        return bala;
    }

    public void setBala(String bala) {
        this.bala = bala;
    }

    public int getPente() {
        return pente;
    }

    public void setPente(int pente) {
        this.pente = pente;
    }

    public String colocarMunicao() {
        return "Arma recarregada";
    }

    public abstract String colocarTinta();

    public abstract String verificaID();

    public String getInfoArma() {
        return "{" +
                "Nome=" + this.nome +
                ", Bala='" + this.bala + '\'' +
                ", Pente=" + this.pente +
                ", id=" + this.id +
                '}';
    }


}
