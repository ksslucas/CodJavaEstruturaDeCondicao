package MainPrimitivos.EstruturasCondicionais.EstrutuasCondicionaisEReeticoes;

public class EstruturasDeRepeticoes {
    public static void main(String[] args) {
        int contador = 0;
        while (contador < 10){
            contador+=1;
            System.out.println(contador);
        }
        int var = 0;
        do {
            System.out.println("VAI COMEÇAR A CONTAGEM...");
             var++;

        }  while ( var < 10); {

            System.out.println("Contador: "+var);


        }

        for (int i = 0; i < 10; ++i) {
            System.out.println("Seu número agora é: "+ i);

        }
    }
}
