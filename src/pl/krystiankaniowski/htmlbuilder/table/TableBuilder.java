package pl.krystiankaniowski.htmlbuilder.table;

import pl.krystiankaniowski.htmlbuilder.html.HtmlPacker;

public class TableBuilder {

    private String table;

    public TableBuilder() {

        table = new String();

    }

    public String addRow(Object... objs) {

        String row = new String();

        for (Object o : objs) {
            row += HtmlPacker.pack("td", (o != null) ? o.toString() : null);
        }

        row = HtmlPacker.pack("tr", row);

        table += row;

        return row;

    }

    public TableBuilder build() {
        table = HtmlPacker.pack("table", table);
        return this;
    }

    public String getTable() {
        return table;
    }

}
