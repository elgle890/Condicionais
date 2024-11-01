import java.util.ArrayList;


public class App {
    private ArrayList<Double> notas = new ArrayList<Double>();
    

    public void SetNotas(double nota) {
        notas.add(nota);
    }

    public String CalculaMedia() {
        double media = 0;
        for(int i = 0; i < notas.size(); i++) {
            media += notas.get(i);
    
        }

        media /= notas.size();

        if(media >= 7) {
            return "Aprovado";
        } else if(media >= 5) {
            return "Recuperação";
        } else {
            return "reprovado";
        }

    }


}