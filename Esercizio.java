
import java.util.Scanner;

public boolean isEmpty() {
    return head==null;
 
}

public void enqueue(T dato) {
    Nodo<T> nuovoNodo=new Nodo<>(dato);
    if (isEmpty()){
        head=nuovoNodo;
        tail=nuovoNodo;
    }else{
        tail=nuovoNodo;
        tail.next=nuovoNodo;
    }
} 

public void dequeue (){
    if (isEmpty){
        ThrowNewException("La coda è vuola");
    }
    T dato=head.dato;
    head=head.next;
    if (head==null){
        tail=null;
    }
}

public T peak(){
    if (isEmpty()){
       ThrowNowException("La coda è vuota");
    }
    return head.dato;
}

public int size(){
    Nodo <T> corrente=head;
    int contatore=0;
    while(!corrente==null){
        corrente=corrente.next;
        ++contatore;
    }
    return contatore;
}

public toString(){
    StringBuilder 
    Nodo <T> corrente=head;
}

class Esercizio {

    public static void main(String args[])
    {

    }
}