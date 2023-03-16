import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int opciones = 0;
        do {
            opciones = Integer.parseInt(JOptionPane.showInputDialog("Seleciona la pizzeria : \n1 Telepizza  \n2 DominoPizza \n3 Salir"));
            switch (opciones) {
                case 1:
                    Telepizza telepizza = new Telepizza();
                    cocinarPizza(telepizza);
                    break;
                case 2:
                    DominosPizza dominosPizza=new DominosPizza();
                    cocinarPizza(dominosPizza);
                    break;

                default:

                    System.out.println(" ********* Fin del programa ******** ");

            }

        } while (opciones < 3);


    }

    private static void cocinarPizza(IPizzeria pizzeria) {


        System.out.println("El tiempo d e espera es : " + pizzeria.prepararPizza());

        System.out.println("Estamos preparando tu pizza ...");

        Pizza miPizza = null;
        do {
            miPizza = pizzeria.pizzaLista();
        }
        while (miPizza == null);

        System.out.println("Tu pizza esta lista: \n" + miPizza);

    }


}






