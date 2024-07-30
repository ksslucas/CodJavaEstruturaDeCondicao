package MainPrimitivos.EstruturasCondicionais.EstrutuasCondicionaisEReeticoes;
/*
Usei o continue para substituir o break. Tive que criar outra lógica para isso.
ultilizando o exercicio da quantidade de parcelas de um carro.
 */
public class CondicionalContinue {
    public static void main(String[] args) {
        double valorTotal = 30000;

        for (int i = (int) valorTotal; i >= 1; i--) {
            double valorParcela = valorTotal / i;
            if(valorParcela < 1000){
             continue;
            }
            System.out.println(i+") Parcela "+ valorParcela);
        }
    }
}
