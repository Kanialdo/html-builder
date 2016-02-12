package pl.krystiankaniowski.htmlbuilder.html;

import java.util.List;

public class HtmlPacker {

    public String div(String content) {
        return pack("div", content);
    }

    public String ul(List<?> list) {

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

    public String h1(String content) {
        return pack("h1", content);
    }

    public String h2(String content) {
        return pack("h2", content);
    }

    public String h3(String content) {
        return pack("h3", content);
    }

    public String pack(String tag, String content) {
        return "<" + tag + ">" + content + "</" + tag + ">";
    }

}
