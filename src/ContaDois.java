public class ContaDois {

    private int numConta ;
    protected String tipo;
    private String dono;
    private int saldo;
    private Boolean status;
    private int getSaldo;


    public ContaDois(int numConta, String tipo, String dono, int saldo, Boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;


    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);

        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
    }

    public void fecharConta(){
    if (this.getSaldo() > 0 ){
        System.out.println("Conta nao pode ser fechada , ainda tem dinheiro");
    } else if (this.getSaldo() < 0) {
        System.out.println("Conta nao pode ser fechada , pois tem debito");
    } else {
        this.setStatus(false);
        System.out.println("Conta fechada com sucesso");
    }
    }
    public void depositar(int v){
     if (getStatus()) {
         this.setSaldo(this.getSaldo + v);
     }
    }
    public void sacar(){
        if (this.getStatus()) {

        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
