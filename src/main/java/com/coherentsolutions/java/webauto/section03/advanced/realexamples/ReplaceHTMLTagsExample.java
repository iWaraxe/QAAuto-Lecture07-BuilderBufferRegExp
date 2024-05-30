package com.coherentsolutions.java.webauto.section03.advanced.realexamples;

public class ReplaceHTMLTagsExample {
    public static void main(String[] args) {
        String html = "<html><body><h1>Title</h1><p>Paragraph.</p></body></html>";
        String replacedHTML = html.replaceAll("<[^>]+>", "");

        System.out.println("Original HTML: " + html);
        System.out.println("Text without HTML tags: " + replacedHTML);
    }
}
