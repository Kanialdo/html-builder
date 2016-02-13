package pl.krystiankaniowski.htmlbuilder.html;

import java.util.List;

public class HtmlPacker {

    public static String div(String content) {
        return pack("div", content);
    }

    public static String ul(List<?> list) {

        StringBuilder builder = new StringBuilder();

        for (Object element : list) {
            if (element != null) {
                builder.append(pack("li", element.toString()));
            } else {
                builder.append(pack("li", "null"));
            }
        }

        return pack("ul", builder.toString());

    }

    public static String h1(String content) {
        return pack("h1", content);
    }

    public static String h2(String content) {
        return pack("h2", content);
    }

    public static String h3(String content) {
        return pack("h3", content);
    }

    public static String p(String content) {
        return pack("p", content);
    }

    public static String a(String url, String label) { return "<a href='" + url + "'>" + label + "</a>"; }

    public static String pack(String tag, String content) {
        return "<" + tag + ">" + content + "</" + tag + ">";
    }

}
