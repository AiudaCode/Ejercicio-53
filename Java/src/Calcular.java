public class Calcular
{
    // se declaran los atributos privados de la clase
    private int tamaño;
    private int [] vector;
    
    public Calcular()
    {
        // se le asignan valores por defecto a los atributos en el contructor
        tamaño = 0;
        vector = null;
    }
    
    // metodos Setters y Getters de los atributos de la clase
    public void setTamaño(int val)
    {
        tamaño = val;
    }
    
    public int getTamaño()
    {
        return tamaño;
    }
    
    public void setVector(int pos, int val)
    {
        vector[pos] = val;
    }
    
    public int getVector(int pos)
    {
        return vector[pos];
    }
    
    // método para crear el vector
    public void crearVector()
    {
        // le asignamos al vector de tipo entero un nuevo tamaño y sera el valor de la variable tamano
        vector = new int[tamaño];
    }
    
    // método para calcular el producto mayor de dos elementos adyacentes
    public int elementosAdyacentesProducto()
    {
        // declaramos una variable de tipo entero llamada producto
        int producto;
        // si el tamaño del vector es de 1
        if (getTamaño() == 1)
        {
            // entonces, el producto obviamente sera solo el valor que haya en la posicion 0
            producto = getVector(0);
        }
        else
        {
            // sino, se le asigna a la variable producto el producto entre el valor de
            // la posicion 0 y el valor de la posicion 1 del vector
            producto = getVector(0) * getVector(1);
            // recorremos el vector con el ciclo for
            for (int i = 0; i < getTamaño(); i++)
            {
                // si estamos en la ultima posicion (significa que no otro valor despues del vector
                // por lo que no podemos multiplicar el valor que hay en posicion final con el
                // siguiente valor de la posicion final porque no existe)
                if (i == getTamaño()-1)
                {
                    // si el valor de ultima posicion es mayor al valor de la variable producto
                    if (getVector(i) > producto)
                    {
                        // entonces, le asignamos a la variable producto el valor que hay en la ultima posicion del vector
                        producto = getVector(i);
                    }
                }
                else
                {
                    // sino, si la multiplicacion del valor de la posicion i con el valor de la posicion i+1 (el que le sigue)
                    // es mayor al valor de la variable producto
                    if (getVector(i) * getVector(i+1) > producto)
                    {
                        // entonces le asignamos a la variable producto el valor de la posicion i por el valor de la posicion i+1 del vector
                        producto = getVector(i) * getVector(i+1);
                    }
                }
            }
        }
        // retornamos el valor del producto
        return producto;
    }
}