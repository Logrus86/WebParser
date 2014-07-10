package com.epam.bp.webparser.entity;

import com.epam.bp.webparser.entity.interfaces.CompoundTextPart;
import com.epam.bp.webparser.entity.interfaces.SentencePart;

public class Word extends AbstractCompoundTextPart<Letter> implements CompoundTextPart, SentencePart {
}
