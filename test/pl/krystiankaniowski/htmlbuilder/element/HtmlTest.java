package pl.krystiankaniowski.htmlbuilder.element;

import org.junit.Assert;
import org.junit.Test;

public class HtmlTest {

    @Test
    public void testBasic() throws Exception {

        Assert.assertEquals("<p>abc</p>", new Html.Paragraph("abc").toString());
        Assert.assertEquals("<h1>abc</h1>", new Html.Header1("abc").toString());
        Assert.assertEquals("<h2>abc</h2>", new Html.Header2("abc").toString());
        Assert.assertEquals("<h3>abc</h3>", new Html.Header3("abc").toString());
        Assert.assertEquals("<a href='link'>abc</a>", new Html.Link("link", "abc").toString());
        Assert.assertEquals("<div>abc</div>", new Html.Div("abc").toString());

    }

    @Test
    public void testId() throws Exception {

        Assert.assertEquals("<p id='i'>abc</p>", new Html.Paragraph("abc").setId("i").toString());

    }

    @Test
    public void testClasses() throws Exception {

        Assert.assertEquals("<p class='c'>abc</p>", new Html.Paragraph("abc").setClass("c").toString());
        Assert.assertEquals("<p class='c1 c2'>abc</p>", new Html.Paragraph("abc").setClass("c1", "c2").toString());
        Assert.assertEquals("<p class='c3 c2 c1'>abc</p>", new Html.Paragraph("abc").setClass("c3", "c2", "c1").toString());

    }

    @Test
    public void testComplex() throws Exception {

        Assert.assertEquals("<div><p>abc</p></div>", new Html.Div(new Html.Paragraph("abc")).toString());
        Assert.assertEquals("<div><p id='i' class='c1 c2'>abc</p></div>", new Html.Div(new Html.Paragraph("abc").setId("i").setClass("c1", "c2")).toString());
        Assert.assertEquals("<div><p id='i' class='c1 c2'>abc</p></div>", new Html.Div(new Html.Paragraph("abc").setClass("c1", "c2").setId("i")).toString());
        Assert.assertEquals("<div><p>a</p><p>b</p><p>c</p></div>", new Html.Div(new Html.Paragraph("a"), new Html.Paragraph("b"), new Html.Paragraph("c")).toString());

    }

}