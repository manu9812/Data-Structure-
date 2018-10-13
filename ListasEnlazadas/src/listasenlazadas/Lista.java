package listasenlazadas;

public class Lista {

    private Nodo inicio, fin;

    public Lista() {
        inicio = null;
    }

    public void AgregarNodo(int dato) {
        inicio = new Nodo(dato, inicio);
        if (inicio == null) {
            fin = inicio;
        } else {
        }
    }

    public void mostrar() {
        Nodo rec = inicio;
        while (rec != null) {
            System.out.print(rec.getDato() + " > ");
            rec = rec.getSiguiente();
        }
    }

    public void promedio() {
        if (inicio != null) {
            int sum = 0, c = 0, r;
            Nodo P = inicio;
            while (P != null) {
                sum += P.getDato();
                P = P.getSiguiente();
                c++;
            }
            r = sum / c;
            System.out.println("promedio es : " + r);
        } else {
            System.out.println(" No hay elementos ");
        }
    }

    public void Medio() {
       if (inicio != null) {
            int sum = 0, r;
            Nodo P = inicio;
            while (P != null) {
                sum += P.getDato();
                P = P.getSiguiente();
            }
            r = sum / 2;
            System.out.println("promedio es : " + r);
        }else{
            System.out.println(" No hay elementos ");
        }
    }

    public void eliminar() {
        inicio = inicio.getSiguiente();
        System.out.println(" Nodo eliminado ");
    }
}
