import java.util.Random;
import java.util.ArrayList;

public class Entrenador {

    private String nombreEntrenador;
    private Pokemon[] pokemones;
    private int puntosEntrenador;
    Random random = new Random();
    private ArrayList<Integer> pokemonesUsados = new ArrayList<Integer>();

    public Entrenador(String nombreEntrenador, Pokemon[] pokemones){
        this.nombreEntrenador=nombreEntrenador;
        this.pokemones=pokemones;
    }

    public Pokemon seleccionarPokemon() {

    while (true) {

        int pokemonSeleccionado = random.nextInt(pokemones.length);

        if (!pokemonesUsados.contains(pokemonSeleccionado)) {

                pokemonesUsados.add(pokemonSeleccionado);

                return pokemones[pokemonSeleccionado];
            }
        }
    }

    public void sumarPunto(){
        puntosEntrenador++;
    }
    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public int getPuntosEntrenador() {
        return puntosEntrenador;
    }

}