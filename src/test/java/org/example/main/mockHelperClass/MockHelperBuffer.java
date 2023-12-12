package org.example.main.mockHelperClass;

import org.example.main.Buffer;
import org.example.main.Item;

import java.util.Queue;

public class MockHelperBuffer extends Buffer {
    public Queue<Item> getBuffer() {
        return super.buffer;
    }
}
