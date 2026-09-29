package Ej2;

import java.util.Stack;

public class PilaHomogenea {
    private Stack<Object> pila;

    public PilaHomogenea() {
        this.pila = new Stack<>();
    }

    public boolean push(Object elemento){
        if(elemento==null){
            throw new IllegalArgumentException("El elemento no puede ser nulo");
        }
        if(!pila.isEmpty()&&pila.peek().getClass()!=elemento.getClass()){
            System.out.println("Rechazado: "+elemento + "es"+ elemento.getClass().getSimpleName()+ "pero la cima es" + pila.peek().getClass().getSimpleName());
            return false;
        }
        pila.push(elemento);
        return true;
    }

    public Object pop(){
        return pila.pop();
    }
    public Object peek(){
        return pila.peek();
    }
    public boolean isEmpty(){
        return pila.isEmpty();
    }
    public int size(){
        return pila.size();
    }
    @Override
    public String toString(){
        return pila.toString();
    }
}
