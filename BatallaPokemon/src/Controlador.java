public class Controlador {

    private Torneo torneo;
    private Vista vista = new Vista();
    private Pokemon[] pokemones1;
    private Pokemon[] pokemones2;
    private Entrenador[] entrenadores;

    public void iniciarTorneo() {

        crearPokemones();
        crearEntrenadores();

        torneo = new Torneo("Torneo Pokemon", entrenadores);

        vista.mostrarInicio("Torneo Pokemon");

        jugarTorneo();
    }

    private void jugarTorneo() {

        for (int ronda = 1; ronda <= 4; ronda++) {

            vista.mostrarRonda(ronda);

            String resultado = torneo.jugarRonda(ronda);


            Entrenador atacante =
                torneo.getUltimoAtacante();

            Entrenador defensor =
                torneo.getUltimoDefensor();

            Pokemon pokemonAtacante =
                torneo.getUltimoPokemonAtacante();

            Pokemon pokemonDefensor =
                torneo.getUltimoPokemonDefensor();


            vista.mostrarEnfrentamiento(
                atacante.getNombreEntrenador(),
                pokemonAtacante.getNombrePokemon(),
                defensor.getNombreEntrenador(),
                pokemonDefensor.getNombrePokemon()
            );


            vista.mostrarAtaque(
                pokemonAtacante.getNombrePokemon(),
                pokemonAtacante.getUltimoPotenciadorAtaque(),
                torneo.getUltimoAtaqueEfectivo()
            );


            vista.mostrarDefensa(
                pokemonDefensor.getNombrePokemon(),
                pokemonDefensor.getUltimoPotenciadorDefensa(),
                torneo.getUltimaDefensaEfectiva()
            );


            vista.mostrarBonoTipo(
                torneo.getUltimoBonoTipo()
            );


            vista.mostrarAtaqueTotal(
                torneo.getUltimoAtaqueTotal()
            );


            vista.mostrarResultadoRonda(resultado);


            vista.mostrarPuntuacion(
                entrenadores[0].getNombreEntrenador(),
                entrenadores[0].getPuntosEntrenador(),
                entrenadores[1].getNombreEntrenador(),
                entrenadores[1].getPuntosEntrenador()
            );
        }

        mostrarGanadorFinal();
    }

    private void crearEntrenadores(){
        entrenadores = new Entrenador[] {
            new Entrenador("Ash", pokemones1),
            new Entrenador("James", pokemones2)
        };
    }

    private void crearPokemones(){
        pokemones1 = new Pokemon[] {
            new Pokemon("Pikachu", "electrico", 65, 65, "habilidad especial", 15),
            new Pokemon("Bulbasaur", "planta", 35, 75, "habilidad especial", 30),
            new Pokemon("Squirtle", "agua", 55, 55, "habilidad especial", 30),
            new Pokemon("Charmander", "fuego", 75, 35, "habilidad especial", 30)
        };
        pokemones2 = new Pokemon[] {
            new Pokemon("Zapdos", "electrico", 65, 65, "habilidad especial", 15),
            new Pokemon("Chikorita", "planta", 35, 75, "habilidad especial", 30),
            new Pokemon("Mudkip", "agua", 55, 55, "habilidad especial", 30),
            new Pokemon("Fuecoco", "fuego", 75, 35, "habilidad especial", 30)
        };
    }

    private void mostrarGanadorFinal() {

        int puntos1 = entrenadores[0].getPuntosEntrenador();
        int puntos2 = entrenadores[1].getPuntosEntrenador();

        if (puntos1 > puntos2) {

            vista.mostrarGanador(
                entrenadores[0].getNombreEntrenador()
            );

        } else if (puntos2 > puntos1) {

            vista.mostrarGanador(
                entrenadores[1].getNombreEntrenador()
            );

        } else {

            vista.mostrarEmpate();
        }
    }

}