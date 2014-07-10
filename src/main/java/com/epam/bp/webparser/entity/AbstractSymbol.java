package com.epam.bp.webparser.entity;

import com.epam.bp.webparser.entity.interfaces.SentencePart;
import com.epam.bp.webparser.entity.interfaces.TextPart;

public abstract class AbstractSymbol<Char> implements TextPart,SentencePart {
    private char symbol;

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
}
