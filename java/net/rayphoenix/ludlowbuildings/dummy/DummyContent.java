package net.rayphoenix.ludlowbuildings.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {
        addItem(new DummyItem("1", "Town Hall"));
        addItem(new DummyItem("2", "Public Works"));
        addItem(new DummyItem("3", "Hubbard Memorial Library"));
        addItem(new DummyItem("4", "Senior Center"));
        addItem(new DummyItem("5", "School Department"));
        addItem(new DummyItem("6", "East Street School"));
        addItem(new DummyItem("7", "Chapin Street School"));
        addItem(new DummyItem("8", "Veterans Park School"));
        addItem(new DummyItem("9", "Baird Middle School"));
        addItem(new DummyItem("10", "Ludlow High School"));
        addItem(new DummyItem("11", "Town Website", "http://www.ludlow.ma.us"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        String itemName;
        public String itemURL;

        DummyItem(String id, String content) {
            this.id = id;
            this.content = content;
        }

        DummyItem(String id, String item_content, String item_url) {
            this.id = id;
            this.content = item_content;
            this.itemName = item_content;
            this.itemURL = item_url;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
