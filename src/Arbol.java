
import javax.swing.JOptionPane;

public class Arbol {

    public static void main(String[] args) {
        int opcion = 0, elemento;
        ArbolBinario arbolito = new ArbolBinario();
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.-Agregar un Nodo"
                        + "\n2.-Recorer el Árbol InOrden"
                        + "\n3.-Recorrer el Árbol en preOrden"
                        + "\n4.-Recorrer el Árbol en PostOrden"
                        + "\n5.-Buscar un Nodo en el Árbol"
                        + "\n6.-Eliminar un nodo del árbol"
                        + "\n7.-Salir"
                        + "\nElige una opción....", "Arboles Binarios", JOptionPane.QUESTION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Numero del Nodo...", "Agregando Nodo", JOptionPane.QUESTION_MESSAGE));
                        arbolito.agregarNodo(elemento);
                        break;
                    case 2:
                        if (!arbolito.estaVacio()) {
                            System.out.println();
                            arbolito.inOrden(arbolito.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "Árbol Vacio");
                        }
                        break;
                    case 3:
                        if (!arbolito.estaVacio()) {
                            System.out.println();
                            arbolito.preOrden(arbolito.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "Árbol Vacio");
                        }
                        break;
                    case 4:
                        if (!arbolito.estaVacio()) {
                            System.out.println();
                            arbolito.postOrden(arbolito.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "Árbol Vacio");
                        }
                        break;
                    case 5:
                        if (!arbolito.estaVacio()) {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero del Nodo buscado"));

                            if (arbolito.buscarNodo(elemento) == null) {
                                JOptionPane.showMessageDialog(null, "Nodo no encontrado");
                            } else {
                                System.out.println("Nodo Encotrado" + arbolito.buscarNodo(elemento));
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Árbol Vacio");
                        }
                        break;
                    case 6:
                        if (!arbolito.estaVacio()) {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero del Nodo a eliminar"));

                            if (arbolito.eliminar(elemento) == false) {
                                JOptionPane.showMessageDialog(null, "Nodo no encontrado");
                            } else {
                                System.out.println("\nNodo Eliminado: " + elemento);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Árbol Vacio");
                        }
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Programa Finalizada", "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                        break;
                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
            }
        } while (opcion != 7);
    }
}
