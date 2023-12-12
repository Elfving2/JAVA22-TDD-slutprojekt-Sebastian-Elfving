package org.example.main.mockModules;

import org.example.main.Item;
import org.example.main.mockHelperClass.MockHelperBuffer;

public class MockConsumer {
    MockHelperBuffer mockHelperBuffer;
    public MockConsumer (MockHelperBuffer mockHelperBuffer) {
        this.mockHelperBuffer = mockHelperBuffer;
    }

    public Item removeItem() {
        return mockHelperBuffer.remove();
    }
}
