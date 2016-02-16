package pl.krystiankaniowski.htmlbuilder.element;

public class Html {

    private Html() {
    }

    public static class Header1 extends HtmlElement {
        public Header1(String content) {
            super("h1", content);
        }
    }

    public static class Header2 extends HtmlElement {
        public Header2(String content) {
            super("h2", content);
        }
    }

    public static class Header3 extends HtmlElement {
        public Header3(String content) {
            super("h3", content);
        }
    }

    public static class Paragraph extends HtmlElement {
        public Paragraph(String content) {
            super("p", content);
        }
    }

    public static class Link extends HtmlElement {

        public Link(String url, String label) {
            super("a", label);
            addParam("href", url);
        }

    }

    public static class Div extends HtmlElement {

        public Div(String content) {
            super("div", content);
        }

        public Div(HtmlElement... content) {
            super("div", content);
        }

        public void String(String content) {
            this.content.append(content);
        }

        public void append(HtmlElement content) {
            this.content.append(content);
        }


    }

}
