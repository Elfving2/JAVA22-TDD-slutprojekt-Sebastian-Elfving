package org.example.main.mockModules;

import org.example.main.Item;
import org.example.main.mockHelperClass.MockHelperBuffer;

public class MockProducer {
    MockHelperBuffer bh;

    public MockProducer(MockHelperBuffer bh) {
        this.bh = bh;
    }

    public boolean addItem(Item item) {
        return bh.add(item);
    }
}
