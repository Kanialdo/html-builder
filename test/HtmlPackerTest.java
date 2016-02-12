import pl.krystiankaniowski.htmlbuilder.html.HtmlPacker;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class HtmlPackerTest {

    HtmlPacker packer = new HtmlPacker();

    @Test
    public void testDiv() throws Exception {
        Assert.assertEquals("<div>abc</div>", packer.div("abc"));
    }

    @Test
    public void testUl() throws Exception {

        List<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        Assert.assertEquals("<ul><li>a</li><li>b</li><li>c</li></ul>", packer.ul(list));

    }

    @Test
    public void testHeaders() throws Exception {
        Assert.assertEquals("<h1>abc</h1>", packer.h1("abc"));
        Assert.assertEquals("<h2>abc</h2>", packer.h2("abc"));
        Assert.assertEquals("<h3>abc</h3>", packer.h3("abc"));
    }

    @Test
    public void testPack() throws Exception {

    }

}