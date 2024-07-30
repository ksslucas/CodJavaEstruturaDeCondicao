package MainPrimitivos.EstruturasCondicionais.EstrutuasCondicionaisEReeticoes;

public class Exerciciofor {
    public static void main(String[] args) {
        int number = 100;
        for (number = 0; number < 1000; number+=2) {
            System.out.println(number);
        }

        while (number>10){
            System.out.println(number);
            number+=2;
        }
    }
}
