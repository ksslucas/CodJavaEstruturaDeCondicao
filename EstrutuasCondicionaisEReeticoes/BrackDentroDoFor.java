package MainPrimitivos.EstruturasCondicionais.EstrutuasCondicionaisEReeticoes;

public class BrackDentroDoFor {
    public static void main(String[] args) {
        int valueMax = 50;
        for (int i = 0; i < valueMax; i++) {
            if(i > 25){
                break;
            }
                System.out.println(i);
        }
    }
}
