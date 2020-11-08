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
public class LinkedSet <T> implements SetADT<T>{

    private static Random rand= new Random();
    private int count;
    private LinearNode<T> contents;
    private final int NOT_FOUND= -1;
  
    
    public LinkedSet(){ 
        count=0;
        contents=null;
    }
    
    
    @Override
    //Añadir un elemento al conjunto (funciona)
    public void add(T element) {
        if(!contains(element)){
            LinearNode <T> node = new LinearNode<>(element);
            node.setNext(contents);
            contents=node;
            count++;           
        }
    }

    @Override
    //Probar
    public void addAll(SetADT<T> set) {
        
        Iterator<T> scan = set.iterator();
        while (scan.hasNext()) {            
            add(scan.next());
        }
    }
    @Override
    // Elimina un elemento aleatorio del conjunto(funciona)
    public T RemoveRandom() {
        LinearNode <T> previous,current;
        T result = null;
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int choice = rand.nextInt(count)+1;
        if(choice==1){
            result = contents.getElement();
            contents=contents.getNext();
        }else{
            previous = contents;
            for (int skip=2; skip <choice; skip++) {
                previous= previous.getNext();
            }
            current = previous.getNext();
            result = current.getElement();
            previous.setNext(current.getNext());
        }
        count--;
        return result;
    }
    
    @Override
    // Elimina un elemento concreto del conjunto(funciona)
    public T Remove(T elemento) {
      boolean found = false;
      LinearNode<T> previous,current;
      T result = null;
      if(isEmpty()){
          throw new EmptyStackException();
          
      }
      if(contents.getElement().equals(elemento)){
          result = contents.getElement();
          contents = contents.getNext();
      }else{
          previous = contents;
          current = contents.getNext();
          for (int look = 1; look < count && !found; look++) {
              if(current.getElement().equals(elemento)){
                  found= true;
              }else{
                  previous=current;
                   current = current.getNext();
              }
          }
                if(!found){
                    throw new NoSuchElementException();
                }
                result = current.getElement();
                previous.setNext(current.getNext());
      }
      count--;
      return result;
    }

    @Override
    //probar
    public SetADT<T> union(SetADT<T> set) {
       LinkedSet<T> both = new LinkedSet<>();
        for (int i = 0; i < count; i++) {
                
              
        }
        Iterator<T> scan= set.iterator();
        while (scan.hasNext()) {            
            both.add(scan.next());
        }
        return both;
    }

    @Override
    //probar
    public boolean contains(T target) {
         LinearNode<T> previous,current;
         previous = contents;
         boolean found = false;
         
         current = contents.getNext();
          for (int look = 1; look < count && !found; look++) {
              if(current.getElement().equals(target)){
                  found= true;
              }else{
                  previous=current;
                   current = current.getNext();
              }
          }
          
          return found;
          
          
          
//        int search = NOT_FOUND;
//        boolean estado=false;
//        for (int i = 0; i < count && search== NOT_FOUND; i++) {
//            if(contents.getElement().equals(target)){
//                search=1;
//                estado=true;
//            }
//        }
     
        
        
        
    }

    @Override
    //probar
    public boolean equals(SetADT<T> set) {
          boolean result=false;
        LinkedSet<T> templ = new LinkedSet<>();
        LinkedSet<T> temp2= new LinkedSet<>();
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
    //Determina si el conjunto esta vacio(funciona)
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    // Determina el numero de elementos del conjunto (funciona)
    public int size() {
        return count;
    }

    @Override
    
    public Iterator<T> iterator() {
    return new LinkedIterator<T>(count, contents);
    }
    
     //Proporciona una representacion del conjunto en forma de cadena de caracteres
    public String toString(){
        String array=" ";
        for (int i = 0; i < size(); i++) {
            array += " ," + contents.getElement();
        }
        return array;
    }
}
