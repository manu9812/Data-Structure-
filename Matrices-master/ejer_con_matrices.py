from VALID import ns, OKI
import subprocess

def VALE():
    while True:
        opcion=input("Escribe aquí tu opción: ")
        if opcion==("A") or opcion==("B") or opcion==("END") or opcion==("C"):
            break
    return opcion

while True:
    print("ESCOJE OPCIÓN:")
    print("A)EJERCICIO1: MATRIZ IDENTIDAD")
    print("B)EJERCICIO2: CREANDO MATRICES")
    print("C)EJERCICIO3: SUMANDO MATRICES")
    print("Escriba \'END\' para finalizar")
    

    opci=VALE()
    subprocess.call(["cmd.exe","/C","cls"])

    if opci==("A"):
        while True:
            print("EJERCICIO1: MATRIZ IDENTIDAD")
            fil_col=OKI(input("Escriba el número de filas y columnas: "))
            M=[]
            for i in range(fil_col):
                M.append([0]*fil_col)
            n=0
            for j in M:
                M[n][n]=1
                print(M[n])
                n+=1
            conti=ns(input("¿Desea continuar con este ejercicio?: "))
            if conti==("n"):
                break
            else:
                subprocess.call(["cmd.exe","/C","cls"])
        
    subprocess.call(["cmd.exe","/C","cls"])

    if opci==("B"):
        while True:
            print("EJERCICIO2: CREANDO MATRICES")
            filas=OKI(input("Escriba el número de filas: "))
            colum=OKI(input("Escriba el número de columnas: "))
            M=[]
            for i in range(filas):
                M.append([0]*colum)
            for i in range(filas):
                for j in range(colum):
                    M[i][j]=OKI(input('Dame el componente (%d,%d): '%(i,j)))
            n=0
            for i in range(filas):
                print(M[n])
                n+=1
            conti=ns(input("¿Desea continuar con este ejercicio?: "))
            if conti==("n"):
                break
            else:
                subprocess.call(["cmd.exe","/C","cls"])

    subprocess.call(["cmd.exe","/C","cls"])

    if opci==("C"):
        while True:
            print("EJERCICIO3: SUMANDO MATRICES")
            filas=OKI(input("Escriba el número de filas: "))
            colum=OKI(input("Escriba el número de columnas: "))
            A=[]
            for i in range(filas):
                A.append([0]*colum)
            B=[]
            for i in range(filas):
                B.append([0]*colum)
            print("Lectura Matriz")
            for i in range(filas):
                for j in range(colum):
                    A[i][j]=OKI(input('Dame el componente (%d,%d): '%(i,j)))
            for i in range(filas):
                for j in range(colum):
                    B[i][j]=OKI(input('Dame el componente (%d,%d): '%(i,j)))

            C=[]
            for i in range(filas):
                C.append([0]*colum)
            for i in range(filas):
                for j in range(colum):
                    C[i][j]=A[i][j]+B[i][j]
            print("SUMA")
            for i in range(filas):
                R=[]
                for j in range(colum):
                    R.append(C[i][j])
                print(R)
            conti=ns(input("¿Desea continuar con este ejercicio?: "))
            if conti==("n"):
                break
            else:
                subprocess.call(["cmd.exe","/C","cls"])
    subprocess.call(["cmd.exe","/C","cls"])

    if opci==("END"):
        break


        
        

