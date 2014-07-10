package com.epam.bp.webparser.action;

import com.epam.bp.webparser.entity.Paragraph;
import com.epam.bp.webparser.entity.Text;

import java.util.ArrayList;
import java.util.List;

public class ParseAction {

    public Text parsedToParagraphs(String sourceText) {
        String[] arrParagraphs = sourceText.split("\n");
        Text parsedText = new Text();
        List<Paragraph> paragraphs = new ArrayList<Paragraph>();

        for (Paragraph arrParagraph: arrParagraphs) {
            paragraphs.add(arrParagraph);
        }
        parsedText.setElements(paragraphs);
    }
}
