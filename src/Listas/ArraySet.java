/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

/**
 *
 * @author jacQu
 */
public class ArraySet<T> implements SetADT<T>{
    private static Random rand= new Random();
    private final int DEFAULT_CAPACITY=100;
    private final int NOT_FOUND= -1;
    private int count;
    private T[] contents; 
    //Constructor 
    public ArraySet(){
        count=0;
        contents= (T[]) (new Object[DEFAULT_CAPACITY]);
        
    }
    //Constructor con diferentes parametros 
    public ArraySet(int initalCapacity){
        count=0;
        contents=(T[])(new Object[initalCapacity]);
    }
            
            
            
            
    @Override
    //agregar elemento
    public void add(T element) {
        if(!(contains(element))){
    }        
    if(size()==contents.length){
        expandCapacity();
    }
    contents[count]= element;
    count++;
    }
    
    private void expandCapacity(){
        T[] large = (T[]) (new Object[contents.length*2]);
        for(int i=0; i< contents.length;i++){
            large[i]=contents[i];
        }
        contents= large;
    }

    @Override
    //Aññade los elementos de un conjunto a otro
    public void addAll(SetADT<T> set) {
       Iterator<T> scan = set.iterator();
        while (scan.hasNext()) {            
            add(scan.next());
        }
    }

    @Override
    //extrae elemento de la colleccion y  Elimina un elemento aleatorio del conjunto
    public T RemoveRandom() { 
        if(isEmpty()){
            throw new EmptyStackException(); // no puede remover cuando esta vacio
        }
        int choice = rand.nextInt(count); //si hay elementos obtenen numero aleatorio
        T result = contents[choice];
        contents[choice]=contents[count-1];
        contents[count-1]=null;
        count--;
        return result;
    }

    @Override
    //  Elimina un elemento concreto del conjunto
    public T Remove(T elemento) {
        int search = NOT_FOUND;
        if(isEmpty()){
            throw  new EmptyStackException();
        }
        for(int i=0; i< count && search == NOT_FOUND; i++) {
            if(contents[i].equals(elemento)){
                search=i;
            }
        }
        if(search==NOT_FOUND){
            throw new NoSuchElementException();
        }
        T result= contents[search];
        contents[search]= contents[count-1];
        contents[count-1]=null;
        count--;
        return  result;
    }

    @Override
    // Combina los elementos de dos conjuntos para crear un tercerco
    public SetADT<T> union(SetADT<T> set) {
        ArraySet<T> both = new ArraySet<>();
        for (int i = 0; i < count; i++) {
                both.add(contents[i]);
        }
        Iterator<T> scan= set.iterator();
        while (scan.hasNext()) {            
            both.add(scan.next());
        }
        return both;
    }

    @Override
    //Determina si un elemento se encuentra dentro del conjunto devuelve False o True
    public boolean contains(T target) {
        int search = NOT_FOUND;
        boolean estado=false;
        for (int i = 0; i < count && search== NOT_FOUND; i++) {
            if(contents[i].equals(target)){
                search=1;
                estado=true;
            }
        }
        return estado;
    }

    @Override
    //Determina si dos conjuntos contienen los mismos elementos
    public boolean equals(SetADT<T> set) {
        boolean result=false;
        ArraySet<T> templ = new ArraySet<>();
        ArraySet<T> temp2= new ArraySet<>();
        T obj;
        if(size()== set.size()){
            templ.addAll(this);
            temp2.addAll(set);
            Iterator<T> scan = set.iterator();
            while (scan.hasNext()) {                
                obj = scan.next();
                if(templ.contains(obj)){
                    templ.Remove(obj);
                    temp2.Remove(obj);
                }
            }
            result = (templ.isEmpty() && temp2.isEmpty());
        }
        return result;
    }

    @Override
    //Determina si el conjunto esta vacio
    public boolean isEmpty() {
        return size() == 0;
      
    }
    // Determina el numero de elementos del conjunto
    @Override
    public int size() {
        return count;
    }

    @Override
    //Proporciona un iterador para un conjunto
    public Iterator<T> iterator() {
            return new ArrayIterator<T> (contents,count);
    }
    //Proporciona una representacion del conjunto en forma de cadena de caracteres
    public String toString(){
        String array=" ";
        for (int i = 0; i < size(); i++) {
            array += " ," + contents[i];
        }
        return array;
    }
}
