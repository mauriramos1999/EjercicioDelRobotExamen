package Robots;

public class Robot {

    private int id;
    private Cuerpo cuerpo;

    public Robot(int id) {
        this.id = id;
    }

    public String tareaComun() {
        return "Se está realizando una tarea común a todos los tipos de cuerpos de robots.";
    }

    public Cuerpo getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(Cuerpo cuerpo) {
        this.cuerpo = cuerpo;
    }
}
