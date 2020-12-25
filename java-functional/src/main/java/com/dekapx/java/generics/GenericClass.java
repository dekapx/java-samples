package com.dekapx.java.generics;

public class GenericClass<E> {
    private E element;

    public GenericClass(E element) {
        this.element = element;
    }

    public E getElement() {
        return this.element;
    }
}
