package MainPrimitivos.EstruturasCondicionais.EstrutuasCondicionaisEReeticoes;
/*
Criei um exercicio que criar uma quantidade de parcelas de um carro, de acordo com
seu valor, utilizando break.
 */
public class exercicioBreak {
    public static void main(String[] args) {
        double valorParcelaCarro = 30000;
        for (int parcela = 1; parcela <= valorParcelaCarro; parcela++) {
         double valorParcela = valorParcelaCarro / parcela;

         if(valorParcela >= 1000){
             System.out.println("Parcela "+valorParcela+ " R$ " + valorParcela);
         } else {
             break;
         }
            System.out.println("A percela é "+ parcela);
        }
    }
}
