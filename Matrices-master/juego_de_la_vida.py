#PROYECTO EN CURSO...
import time
import subprocess
from VALID import ns, OK, OKI, opt
def nval(n):
    while n<=0:
        n=OKI(input("Introduce un número mayor de 0: "))
    return n

while True:
    print("¿Que desea ver?: ")
    print("A) OSCILADOR")
    print("B) PLANEADOR")
    print("C) COLISION PLANEADORES")
    ver=opt(input("Escriba aquí su opción: "),["A","B","C"])
    vel=OK(input("Introduce segundos entre cada pulso: "))
    panel=(".")
    filas=22
    colum=22
    
    pul=nval(OKI(input("Introduce número de pulsos: ")))

    tablero=[]
    el=0
    subprocess.call(["cmd.exe","/C","cls"])

    for i in range(filas):
        tablero.append(([False])*colum)

    #for x in tablero:
        #print(x)

    if ver==("A"):
        tablero[4][5]=True
        tablero[5][5]=True
        tablero[6][5]=True
    if ver==("B"):
        tablero[2][2]=True
        tablero[3][3]=True
        tablero[3][4]=True
        tablero[2][4]=True
        tablero[1][4]=True
    if ver==("C"):
        tablero[2][2]=True
        tablero[3][3]=True
        tablero[3][4]=True
        tablero[2][4]=True
        tablero[1][4]=True
        tablero[20][20]=True
        tablero[19][19]=True
        tablero[19][18]=True
        tablero[20][18]=True
        tablero[21][18]=True

    print("JUEGO DE LA VIDA")
    print("PULSO: 0")
    for y in range(filas):
        for x in range (colum):
            if tablero[y][x]:
                print("*"+" ",end="")
            else:
                print(panel+" ",end="")
        print()
    time.sleep(1)
    subprocess.call(["cmd.exe","/C","cls"])

    pulsos=pul
    subprocess.call(["cmd.exe","/C","cls"])
    for t in range(pulsos):
        print("JUEGO DE LA VIDA")
        nuevo=[]
        for i in range(filas):
            nuevo.append([0]*colum)

        for y in range(filas):
            for x in range(colum):
                n=0
                if y>0 and x>0 and tablero[y-1][x-1]:
                    n+=1
                if x>0 and tablero[y][x-1]:
                    n+=1
                if y<filas-1 and x>0 and tablero[y+1][x-1]:
                    n+=1
                if y>0 and tablero[y-1][x]:
                    n+=1
                if y<filas-1 and tablero[y+1][x]:
                    n+=1
                if y>0 and x<colum-1 and tablero[y-1][x+1]:
                    n+=1
                if x<colum-1 and tablero[y][x+1]:
                    n+=1
                if y<filas-1 and x<colum-1 and tablero[y+1][x+1]:
                    n+=1
                if tablero[y][x] and (n==2 or n==3):
                    nuevo[y][x]=True
                elif not tablero[y][x] and n==3:
                    nuevo[y][x]=True
                else:
                    nuevo[y][x]=False
        tablero=nuevo
        
        #t+1
        print("PULSO: ",t+1)
        for y in range(filas):
            for x in range (colum):
                if tablero[y][x]:
                    print("*"+" ",end="")
                else:
                    print(panel+" ",end="")
            print()
        time.sleep(vel)
        if t<pulsos:
            subprocess.call(["cmd.exe","/C","cls"])
    conti=ns(input("¿Desea continuar?: "))
    if conti==("n"):
        break
    subprocess.call(["cmd.exe","/C","cls"])
