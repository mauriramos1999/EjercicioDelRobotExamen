package Robots;

public class Principal {
    public static void main(String[] args) {
        //Se crea el robot 1 y se le asigna un cuerpo domestico.
        Robot robot1 = new Robot(1);
        Cuerpo cuerpoDomestico = new CuerpoDomestico();
        robot1.setCuerpo(cuerpoDomestico);

        System.out.println("Robot 1: \n" + robot1.getCuerpo().tareaEspecifica());

        //Se le cambia el cuerpo al robot 1.
        Cuerpo cuerpoCombateAcuatico = new CuerpoCombateAcuatico();
        robot1.setCuerpo(cuerpoCombateAcuatico);

        System.out.println("Robot 1: \n" + robot1.getCuerpo().tareaEspecifica());

        //Se crea robot 2 y se le asigna un cuerpo de combate aereo.
        Robot robot2 = new Robot(2);
        robot2.setCuerpo(new CuerpoCombateAereo());

        System.out.println("\nRobot 2: \n" + robot2.getCuerpo().tareaEspecifica());

        Robot robot3 = new Robot(3);
        robot3.setCuerpo(new CuerpoOtroTipo());

        System.out.println("\nRobot 3: \n" + robot3.getCuerpo().tareaEspecifica());

    }
}
