package pl.krystiankaniowski.htmlbuilder;

import pl.krystiankaniowski.htmlbuilder.html.HtmlPacker;

public class HtmlBuilder {

    private String html;
    private StringBuilder head;
    private StringBuilder body;

    public HtmlBuilder() {

        head = new StringBuilder();
        body = new StringBuilder();

    }

    public void addSection(String header, String content) {
        body.append(HtmlPacker.div(HtmlPacker.h1(header) + content));
    }

    public void addCustom(String content) {
        body.append(content);
    }

    public HtmlBuilder build() {
        html = "<!DOCTYPE html>" + HtmlPacker.pack("html", HtmlPacker.pack("head", head.toString()) + HtmlPacker.pack("body", body.toString()));
        return this;
    }

    public String getHtml() {
        return html;
    }

}
