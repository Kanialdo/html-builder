package pl.krystiankaniowski.htmlbuilder.element;

import pl.krystiankaniowski.htmlbuilder.html.HtmlPacker;

import java.util.List;

public class NumberList extends HtmlElement {

    public NumberList(List<?> rows) {
        super("ol", buildList(rows));
    }

    public static String buildList(List<?> elements) {

        StringBuilder builder = new StringBuilder();

        for (Object element : elements) {
            if (element != null) {
                builder.append(HtmlPacker.pack("li", element.toString()));
            } else {
                builder.append(HtmlPacker.pack("li", "null"));
            }
        }

        return builder.toString();

    }


}
