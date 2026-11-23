import java.util.Random;
/**
 * Clase Pokemon: un pokemon con su tipo, vida, energía y tres poderes.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pokemon
{
    // TODO: declara los atributos (todos private):
    //   - nombre (String): nombre del pokemon. Ejemplo: "Squirtle".
    //   - tipo (String): "Agua", "Fuego" o "Tierra".
    //   - vida (int): puntos de vida. Cuando llega a 0, el pokemon pierde el combate.
    //   - energia (int): energía disponible para usar poderes.
    //   - poder1, poder2, poder3 (Poder): los tres poderes del pokemon.
    //     Recuerda: NO se pueden usar arrays, usa tres atributos separados.
    private String nombre;
    private String tipo;
    private int vida;
    private int energia;
    private Poder poder1;
    private Poder poder2;
    private Poder poder3;
    /**
     * Constructor con los cuatro datos del pokemon.
     */
    public Pokemon(String nombre, String tipo, int vida, int energia){
        // TODO: asigna los cuatro atributos con los valores recibidos.
        // TODO: al final, llama al método obtenerPoderes().
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = vida;
        this.energia = energia;
        obtenerPoderes();
    }

    /**
     * Constructor sin energía.
     */
    public Pokemon(String nombre, String tipo, int vida){
        // TODO: asigna nombre, tipo y vida con los valores recibidos.
        // TODO: la energía vale cuatro quintos de la vida (4 * vida / 5).
        // TODO: al final, llama al método obtenerPoderes().
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = vida;
        this.energia = (4 * vida/5);
        obtenerPoderes();
    }

    /**
     * Constructor solo con nombre y tipo.
     */
    public Pokemon(String nombre, String tipo){
        // TODO: asigna nombre y tipo con los valores recibidos.
        // TODO: la vida vale 100 y la energía vale 80.
        // TODO: al final, llama al método obtenerPoderes().
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = 100;
        this.energia = 80;
        obtenerPoderes();
    }

    /**
     * Crea los tres poderes del pokemon según su tipo.
     */
    public void obtenerPoderes(){
        // TODO: crea un objeto Random.
        // TODO: usa un switch sobre el atributo tipo para crear poder1, poder2 y poder3.
        //       Usa el constructor de Poder con tres parámetros (nombre, tipo, potencia).
        //       La potencia es aleatoria:
        //
        //       Tipo     | poder1 (51 a 100) | poder2 (71 a 100) | poder3 (86 a 100)
        //       ---------+-------------------+-------------------+------------------
        //       "Fuego"  | Llamarada         | Lanzallamas       | Lluvia Ígnea
        //       "Agua"   | Empapar           | Chorro de vapor   | Hidrocañón
        //       "Tierra" | Ataque arena      | Disparo lodo      | Bomba fango
        //
        //       Pista: random.nextInt(50) + 51 devuelve un número entre 51 y 100.
        // TODO: en el default del switch, muestra un mensaje de error por consola
        //       indicando que el tipo no está disponible.
        Random random = new Random();
        switch (tipo) {
            case "Fuego":
                poder1 = new Poder("Llamarada", tipo, random.nextInt(50) + 51);
                poder2 = new Poder("Lanzallamas", tipo, random.nextInt(70) + 71);
                poder3 = new Poder("Lluvia Ígnea", tipo, random.nextInt(85) + 86);
                break;
            case "Agua":
                poder1 = new Poder("Empapar", tipo, random.nextInt(50) + 51);
                poder2 = new Poder("Chorro de vapor", tipo, random.nextInt(70) + 71);
                poder3 = new Poder("Hidrocañón", tipo, random.nextInt(85) + 86);
                break;
            case "Tierra":
                poder1 = new Poder("Ataque arena", tipo, random.nextInt(50) + 51);
                poder2 = new Poder("Disparo lodo", tipo, random.nextInt(70) + 71);
                poder3 = new Poder("Bomba fango", tipo, random.nextInt(85) + 86);
                break;
            default:
                System.out.println("Error: el tipo " + tipo + " no está disponible.");
                break;
        }
    }

    public String getNombre(){
        // TODO: devuelve el nombre del pokemon.
        return nombre;
    }

    public String getTipo(){
        // TODO: devuelve el tipo del pokemon.
        return tipo;
    }

    public int getVida(){
        // TODO: devuelve la vida del pokemon.
        return vida;
    }

    public int getEnergia(){
        // TODO: devuelve la energía del pokemon.
        return energia;
    }

    public Poder getPoder1(){
        // TODO: devuelve el primer poder.
        return poder1;
    }

    public Poder getPoder2(){
        // TODO: devuelve el segundo poder.
        return poder2;
    }

    public Poder getPoder3(){
        // TODO: devuelve el tercer poder.
        return poder3;
    }

    /**
     * Resta vida al pokemon. La vida nunca baja de 0.
     */
    public void recibirDanio(int danio){
        // TODO: resta el daño a la vida.
        // TODO: si la vida queda por debajo de 0, déjala en 0.
        vida -= danio;
        if (vida<0){
            vida = 0;
        }
    }

    /**
     * Resta al pokemon la energía que consume el poder usado.
     */
    public void consumirEnergia(int cantidad){
        // TODO: resta la cantidad a la energía.
        energia -= cantidad;
    }

    /**
     * Suma energía al pokemon.
     */
    public void ganarEnergia(int cantidad){
        // TODO: suma la cantidad a la energía.
        energia += cantidad;
    }

    /**
     * Devuelve true si el pokemon se ha quedado sin vida.
     */
    public boolean estaDebilitado(){
        // TODO: devuelve true si la vida es 0 o menos, y false en caso contrario.
        
        return vida <= 0;
    }
}
