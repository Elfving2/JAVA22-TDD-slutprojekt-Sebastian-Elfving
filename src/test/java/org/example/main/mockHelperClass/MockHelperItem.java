package org.example.main.mockHelperClass;

import org.example.main.Item;

public class MockHelperItem extends Item {
    public MockHelperItem(String id) {
        super(id);
    }
    public String getId() {
        return super.id;
    }
}
