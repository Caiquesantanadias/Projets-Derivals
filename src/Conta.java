public class Conta {

    private int numConta ;
    private String tipo;
    private String nomedono;
    private int saldo;
    private Boolean status;




    public Conta(int numConta, String tipo, String nomedono, int saldo, Boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.nomedono = nomedono;
        this.saldo = saldo;
        this.status = status;
        abrirConta();
        System.out.println("Meu numero e : " + numConta + " Meu saldo e : " + this.saldo);
    }


    public void abrirConta () {
        setStatus(true);
        if (this.getTipo() == "CC") {
            this.setSaldo(this.getSaldo() + 50) ;
            System.out.println("Sua Conta e " + this.getTipo() + " por esse motivo voce acabou de ganhar " +
                    this.getSaldo() + " Reais");
        } else if ( this.getTipo() == "CP") {
            this.setSaldo(this.getSaldo() + 150);
            System.out.println("Sua Conta e " + this.getTipo() + " por esse motivo voce acabou de ganhar " +
                    this.getSaldo() + " Reais");

        }


    }



    public void fecharConta () {
    if (this.getSaldo() != 0) {
        System.out.println("Impossivel encerrar a sua Conta, voce ainda tem " + this.getSaldo() +
                " Reais na Conta ,e necessario sacar");
    } else if (this.getSaldo() == 0 ) {
        System.out.println("agora  voce esta apto a encerrar a sua conta ");
    }

    }

    public void depositar (int depositar) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + depositar);
            System.out.println("voce acabou de depositar " + depositar + " Reais." +
                    "Seu novo saldo e " + this.getSaldo() );
        }
    }



    public void sacar (int sacar) {
    if (this.getStatus() && saldo >= sacar) {
        saldo -= sacar ;
        System.out.println("voce acabou de sacar " + sacar +" Reais de sua conta. Seu novo " +
                "Saldo e de : " + saldo + " Reais");
    }else if (saldo <= sacar || saldo <= -1) {
        System.out.println("seu saldo e insuficiente");
    }


    }

    public void pagarMenal(){


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

    public String getNomedono() {
        return nomedono;
    }

    public void setNomedono(String nomedono) {
        this.nomedono = nomedono;
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
