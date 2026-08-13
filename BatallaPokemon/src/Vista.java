public class Vista {

    public void mostrarInicio(String nombreTorneo) {

        System.out.println("==========================");
        System.out.println("     " + nombreTorneo);
        System.out.println("==========================");
    }


    public void mostrarRonda(int ronda) {

        System.out.println("\n--- RONDA " + ronda + " ---");
    }


    public void mostrarEnfrentamiento(
            String entrenadorAtacante,
            String pokemonAtacante,
            String entrenadorDefensor,
            String pokemonDefensor) {

        System.out.println(
            entrenadorAtacante
            + " ataca con "
            + pokemonAtacante + "."
        );

        System.out.println(
            entrenadorDefensor
            + " defiende con "
            + pokemonDefensor + "."
        );
    }


    public void mostrarAtaque(
            String pokemon,
            int potenciador,
            double ataqueEfectivo) {

        if (potenciador > 0) {

            System.out.println(
                pokemon
                + " activa su habilidad especial (+"
                + potenciador
                + "%), alcanzando un ataque de "
                + ataqueEfectivo + "."
            );

        } else {

            System.out.println(
                pokemon
                + " no activa su habilidad especial. "
                + "Su ataque es "
                + ataqueEfectivo + "."
            );
        }
    }


    public void mostrarDefensa(
            String pokemon,
            int potenciador,
            double defensaEfectiva) {

        if (potenciador > 0) {

            System.out.println(
                pokemon
                + " activa su habilidad especial (+"
                + potenciador
                + "%), alcanzando una defensa de "
                + defensaEfectiva + "."
            );

        } else {

            System.out.println(
                pokemon
                + " no activa su habilidad especial. "
                + "Su defensa es "
                + defensaEfectiva + "."
            );
        }
    }


    public void mostrarBonoTipo(int bonoTipo) {

        System.out.println(
            "Bono por tipo: " + bonoTipo
        );
    }


    public void mostrarAtaqueTotal(double ataqueTotal) {

        System.out.println(
            "Ataque total: " + ataqueTotal
        );
    }


    public void mostrarResultadoRonda(String resultado) {

        System.out.println(
            "\nResultado: " + resultado + "."
        );
    }


    public void mostrarPuntuacion(
            String entrenador1,
            int puntos1,
            String entrenador2,
            int puntos2) {

        System.out.println("\nPuntuacion:");

        System.out.println(
            entrenador1 + ": " + puntos1
        );

        System.out.println(
            entrenador2 + ": " + puntos2
        );
    }


    public void mostrarGanador(String ganador) {

        System.out.println("\n==========================");
        System.out.println("Ganador: " + ganador);
        System.out.println("==========================");
    }


    public void mostrarEmpate() {

        System.out.println(
            "\nLa batalla termino en empate."
        );
    }
}