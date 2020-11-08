/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrdenamientoBusqueda.Agenda;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jacQu
 */
public class Modelo<T extends Comparable> {
   
    
    //Metodo para mostrar datos en la tabla 
   
    public void mostrar2(JTable JTContactos, Contact[] contactos) {
        String matriz[][] = new String[contactos.length][3];
        for (int i = 0; i < contactos.length; i++) {
            matriz[i][0] = contactos[i].getLastName();
            matriz[i][1] = contactos[i].getFirstName();
            matriz[i][2] = contactos[i].getPhone();
        }
        JTContactos.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "apellido", "nombre", "telefono"
                }
        ));
    }

    //Metodos de ordenamiento
    public void seleccion(Contact[] contactos) {
        Sort<Contact> b = new Sort<>();
        b.selectionSort(contactos);
    }

    public void incersion(Contact[] contactos) {
        Sort<Contact> b = new Sort<>();
        b.insercionSort(contactos);
    }

    public void burbuja(Contact[] contactos) {
        Sort<Contact> b = new Sort<>();
        b.burbuja(contactos);
    }

    public void rapida(Contact[] contactos) {
        Sort<Contact> b = new Sort<>();
        b.quickSort(contactos, 0, contactos.length - 1);
    }

    public void mezcla(Contact[] contactos) {
        Sort<Contact> b = new Sort<>();
        b.mergeSort(contactos, 0, contactos.length - 1);
    }
    //Metodos de busqueda 
    public String busquedalineal(Contact[] contactos,String valor){
        Search<Contact> a= new Search<>();
         String respuesta;
        int s = a.busqueda(contactos, valor);
        if(s>=0){
          respuesta = contactos[s].getPhone();
      }else{
         respuesta="no";
          
      }
      return respuesta;
    }
    public String busquedabinaria(Contact[]contactos,String valor){
        Search<Contact> a = new Search<>();
        String respuesta;
        int s= a.busquedaBinaria(contactos, valor);
        if(s>=0){
            respuesta = contactos[s].getPhone();
        }else{
            respuesta="desordenada";
        }
        return respuesta;
    }
    
    
     //Metodo para llenar el arreglo que viene de vista
    public void llenado2(Contact[] contactos){
    contactos[0]=new Contact("juan", "sanchez", "23812201920");
    contactos[1]= new Contact("carlos", "alvarez", "2381991029");
    contactos[2]= new Contact("lalo", "castillo", "2382992910");
    contactos[3]= new Contact("juana", "morales", "2382992029");
    contactos[4]=new Contact("maria", "hernandez", "2392992019");
    contactos[5]= new Contact("lizet", "perez", "2381001920");
    contactos[6]=new Contact("miriam", "cruz", "2391881028");
    contactos[7]= new Contact("roberto", "martinez", "2392882019");
    contactos[8]= new Contact("normal", "cruz", "2839229102");
    contactos[9]= new Contact("norma", "santacruz", "2391001763");
    contactos[10]= new Contact("mario", "robles", "2392774530");
            
    }
    
    //PRUEBA BINARIA
    public String BinariaPrueba(Contact[] contactos,String nombre){
        String numero="";
        for (int i = 0; i < contactos.length; i++) {
            if(contactos[0].getFirstName()=="juan"){
                JOptionPane.showMessageDialog(null, "Lista desordenada");
                break;
            }else{
                if(nombre.equals(contactos[i].getFirstName())){
                numero=contactos[i].getPhone();
            }
            }
        }
            
        return numero;
    }
  
    
    
  
}
