#include <iostream>
#include "Calcular.h"
#include "stdlib.h"

using namespace std;

// método para llenar el vector
void llenar(Calcular *obj)
{
    // recorremos cada posicion del vector con el ciclo for
    for (int i = 0; i < obj->getTamano(); i++)
    {
        cout << "Digite numero de la posicion " << i << endl;
        cout << ">> ";
        cin >> dato;
        // le asignamos el dato que se haya ingresado en la posicion i del vector
        obj->setVector(i, dato);
    }
    // limpiamos pantalla
    system("cls");
}

// método para mostrar el vector
void mostrar(Calcular *obj)
{
    cout << "Vector: [";
    // recorremos el vector con el ciclo for
    for (int i = 0; i < obj->getTamano(); i++)
    {
        // si llegamos a la ultimo posicion
        if (i == obj->getTamano()-1)
        {
            // cerramos con el corchete
            cout << obj->getVector(i) << "]" << endl;
        }
        else
        {
            // sino, entonces separamos cada valor con una ,
            cout << obj->getVector(i) << ", ";
        }
    }
}

int main(void)
{
    // se crea un objeto de la clase Calcular (Instanciación)
    Calcular *obj = new Calcular();
    // se declaran dos variables de tipo entero
    int tam, dato;
    // pedimos el tamaño del vector (el valor 164 representa el caracter ñ en la tabla ascii)
    cout << "Digite el tama" << (char) 164 << "o del vector" << endl;
    cout << ">> ";
    cin >> tam;
    // encapsulamos la variable tam
    obj->setTamano(tam);
    // creamos el vector
    obj->crearVector();
    // llenamos el vector
    llenar(obj);
    // mostramos el vector
    mostrar(obj);
    // mostramos el producto mayor del par de elementos adyacentes
    cout << "El producto es: " << obj->elementosAdyacentesProducto() << endl;
}
