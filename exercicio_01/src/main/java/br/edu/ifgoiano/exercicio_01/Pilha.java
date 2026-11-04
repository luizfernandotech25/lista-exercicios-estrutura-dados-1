
package br.edu.ifgoiano.exercicio_01;

import java.util.ArrayList;
import java.util.List;

public class Pilha<T> {

    private final List<T> elementos;

    public Pilha() {
        elementos = new ArrayList<>();
    }

    public void push(T elemento) {
        elementos.add(elemento);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia.");
        }

        return elementos.remove(elementos.size() - 1);
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }
}
