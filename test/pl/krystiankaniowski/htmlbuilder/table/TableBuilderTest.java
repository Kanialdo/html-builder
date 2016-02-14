package pl.krystiankaniowski.htmlbuilder.table;

import org.junit.Assert;
import org.junit.Test;
import pl.krystiankaniowski.htmlbuilder.html.HtmlPacker;

import java.util.LinkedList;
import java.util.List;

public class TableBuilderTest {

    @Test
    public void testSingleRow() throws Exception {

        TableBuilder builder = new TableBuilder();

        Assert.assertEquals("<tr><td>a</td><td>b</td><td>c</td></tr>", builder.addRow("a", "b", "c"));
        Assert.assertEquals("<tr><td>1</td><td>2</td><td>3</td></tr>", builder.addRow(1, 2, 3));

    }

    @Test
    public void testEmpty() throws Exception {
        Assert.assertEquals("<table></table>", new TableBuilder().build().getTable());
    }


    @Test
    public void testSmallTable() throws Exception {

        TableBuilder tableBuilder = new TableBuilder();
        tableBuilder.addRow("a", "b", "c");

        Assert.assertEquals("<table><tr><td>a</td><td>b</td><td>c</td></tr></table>", tableBuilder.build().getTable());

    }

}