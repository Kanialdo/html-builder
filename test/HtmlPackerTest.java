import pl.krystiankaniowski.htmlbuilder.html.HtmlPacker;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class HtmlPackerTest {

    @Test
    public void testDiv() throws Exception {
        Assert.assertEquals("<div>abc</div>", HtmlPacker.div("abc"));
    }

    @Test
    public void testUl() throws Exception {

        List<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        Assert.assertEquals("<ul><li>a</li><li>b</li><li>c</li></ul>", HtmlPacker.ul(list));

    }

    @Test
    public void testHeaders() throws Exception {
        Assert.assertEquals("<h1>abc</h1>", HtmlPacker.h1("abc"));
        Assert.assertEquals("<h2>abc</h2>", HtmlPacker.h2("abc"));
        Assert.assertEquals("<h3>abc</h3>", HtmlPacker.h3("abc"));
    }

    @Test
    public void testPack() throws Exception {
        Assert.assertEquals("<p>abc</p>", HtmlPacker.p("abc"));
        Assert.assertEquals("<a href='http://google.com'>Google</a>", HtmlPacker.a("http://google.com", "Google"));
    }

}