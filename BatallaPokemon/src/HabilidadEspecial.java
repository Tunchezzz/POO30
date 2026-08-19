import java.util.Random;

public class HabilidadEspecial {

    private String nombreHabilidad;
    private int probabilidadActivacion;
    Random random = new Random();

    public HabilidadEspecial(String nombreHabilidad, int probabilidadActivacion){
        this.nombreHabilidad = nombreHabilidad;
        this.probabilidadActivacion = probabilidadActivacion;
    }

    public int calcularActivacion(){

        int activacionRandom = random.nextInt(101);
        if (activacionRandom <= probabilidadActivacion){
            
            return activar();

        } else{
            return 0;
        }

    }

    private int activar(){

        return random.nextInt(26);

    }

}