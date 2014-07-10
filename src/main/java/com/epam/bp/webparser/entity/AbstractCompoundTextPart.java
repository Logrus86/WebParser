package com.epam.bp.webparser.entity;

import com.epam.bp.webparser.entity.interfaces.CompoundTextPart;
import com.epam.bp.webparser.entity.interfaces.TextPart;

import java.util.List;

public class AbstractCompoundTextPart<E extends TextPart> implements CompoundTextPart {
    private List<E> elements;

    public List<E> getElements() {
        return elements;
    }

    public void setElements(List<E> elements) {
        this.elements = elements;
    }

    public E getElementByNumber(int number) {
        return elements.get(number);
    }

    public void addElement(E element) {
        this.elements.add(element);
    }
}
