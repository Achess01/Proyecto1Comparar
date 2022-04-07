/*
 * Welcome
 */
package com.achess.client.html;

/**
 *
 * @author achess
 */
public class H2Tag implements HtmlElement{
    private String value;

    @Override
    public String run() {
        return "<h2>" + value + "</h2>";
    }
}
