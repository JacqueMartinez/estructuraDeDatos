/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrdenamientoBusqueda;
import OrdenamientoBusqueda.Agenda.Contact;
import OrdenamientoBusqueda.Agenda.Search;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author jacQu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //**************************************************************************
//        // Se crea un objeto de arreglos y se llama al metodo buscar arreglo que 
//        //devuelve los 1 que encuentre en los arreglos "grid" y "arreglo"
//        Arreglos a = new Arreglos();
//        a.buscarArreglo();

        //**************************************************************************
        // Se crea un arreglo se instancia a Search de tipo Integer tipo T que es un objeto
        //se le manda el valor a buscar y desvuelve false o true si lo encuentra
//        Integer[] arreglo ={1,2,6,4,9,7}; //solo acepta de tipo Objeto
//        Search<Integer> search = new Search<>();//cuando se pone int marca error `porque solo acepta tipo objeto.
//        System.out.println(search.linearSearch(arreglo, 0, 5,4));//se manda el min,max y el valor a buscar
        //**************************************************************************    
//    //Se crea un objeto de Search ahora de tipp String y un arreglo, en este se va a buscar un nombre
//    //devuelve true o false si lo encuentra
//    
//        String[] arreglo2 ={"juan","david","maria","luis"}; //solo acepta de tipo Objeto
//        Search<String> search = new Search<>();//cuando se pone int marca error `porque solo acepta tipo objeto.
//        System.out.println(search.linearSearch(arreglo2, 0, 3,"maria"));//Se busca a maria 
        //**********************************************************************ç
//        //Se utiliza una clase alumno, donde instanciaremos creando un arreglo de 
//        //nuevos alumnos. Despues Se crea un objeto de search tipo Alumno 
//        //Se creara un nuevo alumno que sera ab el valor a buscar y se le pasara al
//        //metodo de linearSearch para buscarlo, devuelve true o false
//        Alumno[] arreglo ={ new Alumno(3, "juan"),
//                           new Alumno(2, "david"),
//                           new Alumno(1, "maria")};
//        
//        Search<Alumno> search = new Search<>();
//        Alumno ab=new Alumno(3,"maria");
//        System.out.println(search.linearSearch(arreglo, 0, 2,ab));
        //*********************************************************
        //Se crea un arreglo de enteros y se utiliza el metodo de binariasearch,
        //trabajo entrgado, detalle,no funciona del lado izquierdo
//        Integer arreglos[] ={3,5,4,6,1};
//        Arrays.sort(arreglos);
//        BinariaSearch<Integer> a = new BinariaSearch<Integer>();
//        int valor=a.busquedaBinaria2(arreglos,1);
//        if(valor==-1){
//            System.out.println("Elemento no encontrado");
//        }else{
//            System.out.println("elemento encontrado en la posicion"+
//                    valor);
//        }
        //********************************************************************
        //Metodo busqueda binaria explicado por el prof.
        //Solo devuelve false o true si encuentra el numero a buscar
//        Search<Integer> search = new Search<>();
//        Integer arreglo[] ={ 2,4,6,8,9,12,15,18,22 };
//        System.out.println(search.binarySearch(arreglo, 0, 10,1));
        //**********************************************************************
        
        //prueba sort ordenamiento (por seleccion)
//        Search<Integer> search = new Search<>();
//        Sort<Integer> sort = new Sort<>();
//        Integer arreglo[] = {21, 4, 56, 18, 79, 10, 5, 6, 2};
//        sort.selectionSort(arreglo);
//        for (int i = 0; i < arreglo.length; i++) {
//            System.out.println(arreglo[i]);
//        }

        //**********************************************************************
        
      //Ordenar contactos
//       ArrayList<Contact> lista = new ArrayList<Contact>();
//      lista.add(new Contact("Ana", "martinez", "2391889271"));
//      lista.add(new Contact("Marco", "sanchez", "2391889271"));
//      lista.add(new Contact("Luis", "Lopez", "2391889271"));
//      lista.add(new Contact("Maria", "Cruz", "2391889271"));
//      lista.add(new Contact("Angel", "Hernandez", "2391889271"));
//      lista.add(new Contact("Rosa", "Estrada", "2391889271"));
//      lista.add(new Contact("Rocio", "Castro", "2391889271"));
//      lista.add(new Contact("Marco", "Gonzalez", "2391889271"));
//      lista.add(new Contact("Jesus", "Perez", "2391889271"));
//      lista.add(new Contact("Roberto", "Escobar", "2391889271"));
//      
      
//     Contact[] contactos = new Contact[5];
//     contactos[0]= new Contact("sna", "martinez", "237-19192-99");
//     contactos[1]= new Contact("maria", "alvarez", "238-122-01-23");
//     contactos[2]= new Contact("rober", "sanchez", "238-122-01-23");
//     contactos[3]= new Contact("ana", "lendez", "238-122-01-23");
//     contactos[4]= new Contact("maria", "perez", "238-122-01-23");
     
    
//     Sort<Contact>sort = new Sort<>();
//     sort.mergeSort(contactos, 0, contactos.length-1);
//     
//        for (Contact contacto: contactos) {
//            System.out.println(contacto);
//        }

//Search<String> s= new Search<>();
//s.linearSearch(contactos, 0, contactos.length-1, "maria");
        //**********************************************************************
        //Prueba del otro metodo de ordenamiento (por mezcla)
//        Search<String> search = new Search<>();
//        Sort<Contact> sort = new Sort<>();
//        Integer arreglo[] = {30,40,28,11,0,2,18};
//        sort.quickSort(lista, 0, lista.size()-1);
//        for (int i = 0; i < arreglo.length; i++) {
//            System.out.println(arreglo[i]);
//        }


     Contact[] arreglo2 ={new Contact("juan", "luz", "333"),
    new Contact("jose", "ma", "222")
};
String arreglo []= new String[2];
arreglo[0]="norma";
arreglo[1]="juan";
//        for (int i = 0; i < arreglo.length; i++) {
//            System.out.println(arreglo[i]);   
//        }

        
 Integer arreglo5[]= new Integer[2];
 arreglo5[0]=4;
 arreglo5[1]=6;

     
   
      
}  
 }

