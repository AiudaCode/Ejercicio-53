
import javax.swing.JOptionPane;

public class Main
{
    // método para llenar el vector
    public static void llenar(Calcular obj)
    {
        // recorremos cada posicion del vector con el ciclo for
        for (int i = 0; i < obj.getTamaño(); i++)
        {
            // pedimos el numero
            int dato = Integer.parseInt(JOptionPane.showInputDialog("Digite numero de la posicion " + i)); 
            // le asignamos el dato que se haya ingresado en la posicion i del vector
            obj.setVector(i, dato);
        }
    }
    
    // método para mostrar el vector
    public static void mostrar(Calcular obj)
    {
        String datos = "Vector: [";
        // recorremos el vector con el ciclo for
        for (int i = 0; i < obj.getTamaño(); i++)
        {
            // si llegamos a la ultimo posicion
            if (i == obj.getTamaño()-1)
            {
                // cerramos con el corchete
                datos += obj.getVector(i) + "]";
            }
            else
            {
                // sino, entonces separamos cada valor con una ,
                datos += obj.getVector(i) + ", ";
            }
        }
    }
    
    public static void main(String[] args)
    {
        // se crea un objeto de la clase Calcular (Instanciación)
        Calcular obj = new Calcular();
        // pedimos el tamaño del vector
        int tam = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del vector:"));
        // encapsulamos la variable tam
        obj.setTamaño(tam);
        // creamos el vector
        obj.crearVector();
        // llenamos el vector
        llenar(obj);
        // mostramos el vector
        mostrar(obj);
        // mostramos el producto mayor del par de elementos adyacentes
        JOptionPane.showMessageDialog(null, "El producto es: " + obj.elementosAdyacentesProducto());
    }
}
