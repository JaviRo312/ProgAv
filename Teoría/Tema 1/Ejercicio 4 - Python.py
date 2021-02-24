""" Escribir un programa que permita determinar si un número entero 
    es primo o no.
"""

def es_primo(entero):
    """int -> bool
    OBJ: determinar si un número entero es primo o no.
    """
    if entero < 1:
        return False
    elif entero == 2:
        return True
    else:
        for i in range (2,entero):
            if entero % i == 0:
                return False
        return True


#Probador:
try:
    numero = int(input('Introduce un número entero: '))
except:
    print('El valor introducido no es un número entero.')
else:
    print(es_primo(numero))