public class Copo {

    int capacidade;
    Boolean cheio;
    String volume;
    boolean limpo;

    void beber () {

    }

    void encher () {
        if (capacidade <= 300 && limpo == true) {
            System.out.println(" Aproveita a sua agua para se hidratar");
        } else {
            System.out.println("o copo ja esta cheio, baba a agua primeiro ou esta sujo ,vai lavar");
        }
    }

    void lavar () {
        if (limpo == true) {
            System.out.println("Nao precisa lavar, ja esta limpo");
        } else {
            System.out.println("Exato, o copo esta sujo mesmo");
        }
    }


}
