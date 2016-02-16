package pl.krystiankaniowski.htmlbuilder.element;

import pl.krystiankaniowski.htmlbuilder.utils.TextUtils;

import java.util.HashMap;
import java.util.Map;

public abstract class HtmlElement {

    private final String tag;
    protected StringBuilder content = new StringBuilder();

    private HashMap<String, String> params;

    private String id;
    private String[] classes;

    public HtmlElement(String tag) {
        this.tag = tag;
    }

    public HtmlElement(String tag, String content) {
        this.tag = tag;
        this.content.append(content);
    }

    public HtmlElement(String tag, HtmlElement... elements) {
        this.tag = tag;
        for (HtmlElement element : elements) {
            this.content.append(element);
        }
    }

    public HtmlElement setId(String id) {
        this.id = id;
        return this;
    }

    public HtmlElement setClass(String... classes) {
        this.classes = classes;
        return this;
    }

    public HtmlElement addParam(String param, String value) {
        if (params == null) {
            params = new HashMap<>();
        }
        params.put(param, value);
        return this;
    }

    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append("<").append(tag);

        if (TextUtils.containsData(id)) {
            builder.append(" id='").append(id).append("'");
        }

        if (classes != null && classes.length > 0) {
            builder.append(" class='").append(classes[0]);
            for (int i = 1; i < classes.length; i++) {
                builder.append(" ").append(classes[i]);
            }
            builder.append("'");
        }

        if (params != null) {
            for (Map.Entry<String, String> entry : params.entrySet()) {
                builder.append(" ").append(entry.getKey()).append("='").append(entry.getValue()).append("'");
            }
        }

        if (TextUtils.containsData(content.toString())) {
            builder.append(">").append(content).append("</").append(tag).append(">");
        } else {
            builder.append(" />");
        }

        return builder.toString();

    }

}
