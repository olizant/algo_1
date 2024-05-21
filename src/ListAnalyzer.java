import java.util.ArrayList;
import java.util.List;

public class ListAnalyzer {

    public static int contadorImpares(List<Integer> miLista) {
        int contador = 0;
        for(int nro: miLista){
            if(nro % 2 != 0) {
                contador++;
            }
        }
        return contador;
    }

    public static List<Integer> numerosConsecutivos(List<Integer> miLista) {
        List<Integer> consecutivos = new ArrayList<Integer>();
        int key = 0;
        for (int i = 0; i < miLista.size(); i++){
            if (i > 0) {
                if (miLista.get(i) == miLista.get(i-1) + 1 ) {
                    if (!consecutivos.isEmpty()) {
                        if (miLista.get(i-1) != consecutivos.get(key)) {
                            consecutivos.add(miLista.get(i-1));
                        }
                    }
                    else {
                        consecutivos.add(miLista.get(i-1));

                    }
                    consecutivos.add(miLista.get(i));
                    key++;
                }
            }
        }
        return consecutivos;
    }

}

