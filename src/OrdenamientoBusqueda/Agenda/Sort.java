/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrdenamientoBusqueda.Agenda;

/**
 *
 * @author jacQu
 */
public class Sort<T extends Comparable> {

    //Ordenamiento por seleccion con COMPARETO
    public void selectionSort(T[] data) {
        int min;
        T temp;
        for (int index = 0; index < data.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < data.length; scan++) {
                if (data[scan].compareTo(data[min]) < 0) {
                    min = scan;
                }
            }   
            temp = data[min];
            data[min] = data[index];
            data[index] = temp;
        }
    }

    //Ordenamiento por mezacla con COMPARE TO
    public void mergeSort(T[] data, int min, int max) {
        T[] temp;
        int index1, left, right;
        //encuentra una lista de longuitud uno
        if (min == max) {
            return;
        }
        //calcula la longuitud y punto medio de la lista
        int size = max - min + 1;
        int pivote = (min + max) / 2;
        temp = (T[]) (new Comparable[size]);
        //ordena la mitad izquierda
        mergeSort(data, min, pivote);
        //ordena la mitad derecha
        mergeSort(data, pivote + 1, max);
        //copia los datos ordenados al espacio de trabajo
        for (index1 = 0; index1 < size; index1++) {
            temp[index1] = data[min + index1];
        }
        //mezcla las 2 listas ordenadas
        left = 0;
        right = pivote - min + 1;
        for (index1 = 0; index1 < size; index1++) {
            if (right <= max - min) {
                if (left <= pivote - min) {
                    if (temp[left].compareTo(temp[right]) > 0) {
                        data[index1 + min] = temp[right++];
                    } else {
                        data[index1 + min] = temp[left++];
                    }
                } else {
                    data[index1 + min] = temp[right++];
                }
            } else {
                data[index1 + min] = temp[left++];
            }
        }
    }

    //ordenamiento  por incersion
    public static void insercion(int A[]) {
        int p, j;
        int aux;
        for (p = 1; p < A.length; p++) { // desde el segundo elemento hasta
            aux = A[p]; // el final, guardamos el elemento y
            j = p - 1; // empezamos a comprobar con el anterior
            while ((j >= 0) && (aux < A[j])) { // mientras queden posiciones y el
                // valor de aux sea menor que los
                A[j + 1] = A[j];       // de la izquierda, se desplaza a
                j--;                   // la derecha
            }
            A[j + 1] = aux; // colocamos aux en su sitio
        }
    }

    //ordenamiento por insercion con COMPARE TO
    public void insercionSort(T[] data) {

        for (int i = 1; i <= data.length - 1; i++) {
            T x = data[i];
            int j = i - 1;
            while (j >= 0 && x.compareTo(data[j]) < 0) {// auxiliar o los tipos T deben ser tratados como objetos
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = x;
        }
    }

    //ordenamiento por burbuja
    public static void burbuja(int arreglo[]) {

        for (int i = 0; i < arreglo.length - 1; i++) {

            for (int j = 0; j < arreglo.length - 1; j++) {

                if (arreglo[j] < arreglo[j + 1]) {

                    int tmp = arreglo[j + 1];

                    arreglo[j + 1] = arreglo[j];

                    arreglo[j] = tmp;

                }

            }

        }
    }

    //ordenamiento por burbuja COMPARE TO
    public void burbuja(T[] v) {
        boolean bandera = true;
        int superior = v.length;
        while (bandera) {
            bandera = false;
            superior--;
            for (int i = 0; i < superior; i++) {
                if (v[i].compareTo(v[i + 1]) > 0) {
                    T temp = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = temp;
                    bandera = true;
                }
            }
        }
    }
    // ordenamiento rapido 
    public static void ordenamientoRapido(int vec[], int inicio, int fin){ //fin-1
                if(inicio>=fin) return;
                int pivote=vec[inicio];
                int elemIzq=inicio+1;
                int elemDer=fin;
                while(elemIzq<=elemDer){
                        while(elemIzq<=fin && vec[elemIzq]<pivote){
                                elemIzq++;
                        }
                        while(elemDer>inicio && vec[elemDer]>=pivote){
                                elemDer--;
                        }
                        if(elemIzq<elemDer){
                                int temp=vec[elemIzq];
                                vec[elemIzq]=vec[elemDer];
                                vec[elemDer]=temp;
                        }
                }
                
                if(elemDer>inicio){
                        int temp=vec[inicio];
                        vec[inicio]=vec[elemDer];
                        vec[elemDer]=temp;
                }
                ordenamientoRapido(vec, inicio, elemDer-1);
                ordenamientoRapido(vec, elemDer+1, fin);
        }
    // ordenamiento rapido con COMPARE TO
    public  void quickSort(T[] data, int inicio, int fin){ //fin-1
                if(inicio>=fin) return;
                T pivote=data[inicio];
                int elemIzq=inicio+1;
                int elemDer=fin;
                while(elemIzq<=elemDer){
                        while(elemIzq<=fin && data[elemIzq].compareTo(pivote)<0){
                                elemIzq++;
                        }
                        while(elemDer>inicio && data[elemDer].compareTo(pivote)>0){
                                elemDer--;
                        }
                        if(elemIzq<elemDer){
                                T temp=data[elemIzq];
                                data[elemIzq]=data[elemDer]; 
                                data[elemDer]=temp;
                        }
                }
                
                if(elemDer>inicio){
                        T temp=data[inicio];
                        data[inicio]=data[elemDer];
                        data[elemDer]=temp;
                }
                quickSort(data, inicio, elemDer-1);
                quickSort(data, elemDer+1, fin);
        }
   

}
