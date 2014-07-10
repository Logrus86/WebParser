package com.epam.bp.webparser.entity;

import com.epam.bp.webparser.entity.interfaces.CompoundTextPart;
import com.epam.bp.webparser.entity.interfaces.TextPart;

import java.util.ArrayList;
import java.util.List;

public class Paragraph<E extends CompoundTextPart> extends AbstractCompoundTextPart<Sentence> implements CompoundTextPart, TextPart {
    List<E> paragraphsPartList;
    List<Paragraph> paragraphs = new ArrayList<Paragraph>();
    public Paragraph() {

    }

}
