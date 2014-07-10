package com.epam.bp.webparser.entity;

import com.epam.bp.webparser.entity.interfaces.TextPart;

public class Text extends AbstractCompoundTextPart<Paragraph> implements TextPart {
    String sourceText;
}
