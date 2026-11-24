/**
 * Clase Poder: un ataque que puede usar un pokemon. Usarlo cuesta energía.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Poder
{
    // TODO: declara los atributos (todos private):
    //   - nombre (String): nombre del poder. Ejemplo: "Lanzallamas".
    //   - tipo (String): "Agua", "Fuego" o "Tierra".
    //   - potencia (int): fuerza del poder.
    //   - energiaConsumida (int): energía que gasta el pokemon al usar este poder.
    private String nombre;
    private String tipo;
    private int potencia;
    private int energiaConsumida;
    /**
     * Constructor con los cuatro datos del poder.
     */
    public Poder(String nombre, String tipo, int potencia, int energiaConsumida){
        // TODO: asigna los cuatro atributos con los valores recibidos.
        this.nombre = nombre;
        this.tipo = tipo;
        this.potencia = potencia;
        this.energiaConsumida = energiaConsumida;
    }

    /**
     * Constructor sin energía consumida.
     */
    public Poder(String nombre, String tipo, int potencia){
        // TODO: asigna nombre, tipo y potencia con los valores recibidos.
        // TODO: la energía consumida es la tercera parte de la potencia (potencia / 3).
        this.nombre = nombre;
        this.tipo = tipo;
        this.potencia = potencia;
        this.energiaConsumida = (potencia/3);
    }

    /**
     * Constructor solo con nombre y tipo.
     */
    public Poder(String nombre, String tipo){
        // TODO: asigna nombre y tipo con los valores recibidos.
        // TODO: la potencia vale 25 y la energía consumida vale 8.
        this.nombre = nombre;
        this.tipo = tipo;
        this.potencia = 25;
        this.energiaConsumida = 8;
    }

    public String getNombre(){
        // TODO: devuelve el nombre del poder.
        return nombre;
    }

    public String getTipo(){
        // TODO: devuelve el tipo del poder.
        return tipo;
    }

    public int getPotencia(){
        // TODO: devuelve la potencia del poder.
        return potencia;
    }

    public int getEnergiaConsumida(){
        // TODO: devuelve la energía que consume el poder.
        return energiaConsumida;
    }

    public void setPotencia(int nuevaPotencia){
        // TODO: cambia la potencia por la nueva potencia.
        this.potencia = nuevaPotencia;
    }

    public void setEnergiaConsumida(int nuevaEnergia){
        // TODO: cambia la energía consumida por la nueva energía.
        this.energiaConsumida = nuevaEnergia;
    }
    
    public String toString(){
        // TODO: Devuelve una cadena, ver muestra del enunciado.
        return "***" + this.nombre + "***\n" +
        "Tipo: " + this.tipo + "\n" +
        "Potencia: " + this.potencia + "\n" +
        "Energia: " + this.energiaConsumida + "\n";
    }
}
