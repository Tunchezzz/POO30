public class Torneo {

    private String nombre;
    private Entrenador[] entrenadores;

    private Entrenador ultimoAtacante;
    private Entrenador ultimoDefensor;

    private Pokemon ultimoPokemonAtacante;
    private Pokemon ultimoPokemonDefensor;

    private double ultimoAtaqueEfectivo;
    private double ultimaDefensaEfectiva;

    private int ultimoBonoTipo;
    private double ultimoAtaqueTotal;

    public Torneo(String nombre, Entrenador[] entrenadores) {
        this.nombre = nombre;
        this.entrenadores = entrenadores;
    }

    public String jugarRonda(int ronda) {

        Entrenador atacante;
        Entrenador defensor;

        if (ronda % 2 != 0) {
            atacante = entrenadores[0];
            defensor = entrenadores[1];
        } else {
            atacante = entrenadores[1];
            defensor = entrenadores[0];
        }

        Pokemon pokemonAtacante =
            atacante.seleccionarPokemon();

        Pokemon pokemonDefensor =
            defensor.seleccionarPokemon();

        double ataqueEfectivo =
            pokemonAtacante.calcularAtaqueEfectivo();

        double defensaEfectiva =
            pokemonDefensor.calcularDefensaEfectiva();

        int bonoTipo = calcularEfectividad(
            pokemonAtacante.getTipo(),
            pokemonDefensor.getTipo()
        );

        double ataqueTotal =
            ataqueEfectivo
            + bonoTipo
            - defensaEfectiva;

        ultimoAtacante = atacante;
        ultimoDefensor = defensor;

        ultimoPokemonAtacante = pokemonAtacante;
        ultimoPokemonDefensor = pokemonDefensor;

        ultimoAtaqueEfectivo = ataqueEfectivo;
        ultimaDefensaEfectiva = defensaEfectiva;

        ultimoBonoTipo = bonoTipo;
        ultimoAtaqueTotal = ataqueTotal;

        if (ataqueTotal > 0) {

            atacante.sumarPunto();

            return atacante.getNombreEntrenador()
                + " gana con "
                + pokemonAtacante.getNombrePokemon();

        } else if (ataqueTotal < 0) {

            defensor.sumarPunto();

            return defensor.getNombreEntrenador()
                + " gana defendiendo con "
                + pokemonDefensor.getNombrePokemon();

        } else {

            return "Empate";
        }
    }

    private int calcularEfectividad(
            String atacante,
            String defensor) {

        if (atacante.equals("fuego")
                && defensor.equals("planta")) {
            return 20;
        }

        if (atacante.equals("fuego")
                && defensor.equals("agua")) {
            return -10;
        }

        if (atacante.equals("agua")
                && defensor.equals("fuego")) {
            return 20;
        }

        if (atacante.equals("agua")
                && defensor.equals("planta")) {
            return -10;
        }

        if (atacante.equals("planta")
                && defensor.equals("agua")) {
            return 20;
        }

        if (atacante.equals("planta")
                && defensor.equals("fuego")) {
            return -10;
        }

        if (atacante.equals("electrico")
                && defensor.equals("agua")) {
            return 20;
        }

        return 0;
    }

    public Entrenador getUltimoAtacante() {
        return ultimoAtacante;
    }

    public Entrenador getUltimoDefensor() {
        return ultimoDefensor;
    }

    public Pokemon getUltimoPokemonAtacante() {
        return ultimoPokemonAtacante;
    }

    public Pokemon getUltimoPokemonDefensor() {
        return ultimoPokemonDefensor;
    }

    public double getUltimoAtaqueEfectivo() {
        return ultimoAtaqueEfectivo;
    }

    public double getUltimaDefensaEfectiva() {
        return ultimaDefensaEfectiva;
    }

    public int getUltimoBonoTipo() {
        return ultimoBonoTipo;
    }

    public double getUltimoAtaqueTotal() {
        return ultimoAtaqueTotal;
    }
}