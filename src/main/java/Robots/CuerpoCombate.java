package Robots;

public abstract class CuerpoCombate implements Cuerpo{

    public String tareaComunCombate(){
        return "Esta es una tarea comun a todos los cuerpos de combate.";
    }
    public abstract String tareaEspecifica();

}
