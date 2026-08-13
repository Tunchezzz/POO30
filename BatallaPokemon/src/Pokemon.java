public class Pokemon {

    private String nombrePokemon;
    private String tipo;
    private int ataque;
    private int defensa;
    private HabilidadEspecial habilidadEspecial;
    private int ultimoPotenciadorAtaque;
    private int ultimoPotenciadorDefensa;

    public Pokemon(String nombrePokemon, String tipo, int ataque, int defensa, String nombreHabilidadEspecial, int probabilidadActivacion){
        this.nombrePokemon=nombrePokemon;
        this.tipo=tipo;
        this.ataque=ataque;
        this.defensa=defensa;
        this.habilidadEspecial=new HabilidadEspecial(nombreHabilidadEspecial, probabilidadActivacion);
    }

    public double calcularAtaqueEfectivo() {

        ultimoPotenciadorAtaque = habilidadEspecial.calcularActivacion();

        double ataqueEfectivo = ataque + (ataque * ultimoPotenciadorAtaque / 100.0);

        return ataqueEfectivo;
    }

    public double calcularDefensaEfectiva() {

        ultimoPotenciadorDefensa = habilidadEspecial.calcularActivacion();

        double defensaEfectiva = defensa + (defensa * ultimoPotenciadorDefensa / 100.0);

        return defensaEfectiva;
    }

    public String getNombrePokemon() {
        return nombrePokemon;
    }

    public String getTipo() {
        return tipo;
    }

    public int getUltimoPotenciadorAtaque() {
        return ultimoPotenciadorAtaque;
    }

    public int getUltimoPotenciadorDefensa() {
        return ultimoPotenciadorDefensa;
    }

}