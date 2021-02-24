/*  Escribir un programa que permita determinar
    si un número entero es primo o no.

    EN EL CASO DE C++, TRUE SE RETORNARÁ COMO 1
    Y FALSE COMO 0.
*/

#include <iostream>

using namespace std;

bool esPrimo(int entero)
{
    for (int i=2; i<entero;i++)
    {
        if (entero % i == 0)
        {
            return false;
        }
    }
    return true;
}

int main()
{
    int num;
    cout << "Introduce un número entero: ";
    cin >> num ;
    cout << esPrimo(num) << endl;
    return 0;
}
