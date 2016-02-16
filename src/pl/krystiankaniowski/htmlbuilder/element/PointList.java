package pl.krystiankaniowski.htmlbuilder.element;

import pl.krystiankaniowski.htmlbuilder.html.HtmlPacker;

import java.util.List;

public class PointList extends HtmlElement {

    public PointList(List<?> rows) {
        super("ul", buildList(rows));
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
