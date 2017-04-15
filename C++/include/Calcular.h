#ifndef CALCULAR_H
#define CALCULAR_H
#include <iostream>

using namespace std;

class Calcular
{
    public:
        Calcular();
        virtual ~Calcular();
        void setTamano(int val);
        int getTamano();
        void setVector(int pos, int val);
        int getVector(int pos);
        void crearVector();
        int elementosAdyacentesProducto();
    protected:

    private:
        int tamano;
        int *vector;
};

#endif // CALCULAR_H
