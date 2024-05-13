public class ControleRemoto implements Controlador {

    private int volume ;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }


    @Override
    public void ligar() {
        this.setLigado(true);
        System.out.println("TV ligada");
    }

    @Override
    public void desligado() {
        this.setLigado(false);
        System.out.println("TV desligada");
    }

    @Override
    public void abrirMenu() {
    if (this.getLigado()) {
        System.out.println("Esta ligado " + this.getLigado());
        System.out.println("Esta Tocando ? " + this.getTocando());
        System.out.print("Volume " + this.getVolume());
        for(int i = 0; 1 <= this.getVolume(); i+=10) {
            System.out.println("@");
        }
    } else {
        System.out.println("Sua Tv Esta Desligada");
    }
    }

    @Override
    public void fecharMenu() {
    if (this.getLigado()) {
        System.out.println("Menu aberto");
    }
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
    if (this.getLigado() && this.getVolume() > 0 ) {
        this.setVolume(0);
        System.out.println("Mudo Ligado");
    } else {
        System.out.println("ja esta sem som");
    }
    }

    @Override
    public void desligarMudo() {
    if(this.getLigado() && this.getVolume() == 0) {
        this.setVolume(50);
        System.out.println("Mudo Desligado");
    }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
            System.out.println("A sua musica esta Tocando");
        }
    }

    @Override
    public void pausa() {
    if (this.getLigado() && this.getTocando()) {
        this.setTocando(false);

    }
    }
}
