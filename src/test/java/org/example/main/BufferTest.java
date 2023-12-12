package org.example.main;
import org.example.main.mockModules.MockConsumer;
import org.example.main.mockModules.MockProducer;
import org.example.main.mockHelperClass.MockHelperBuffer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BufferTest {
    @Test
    @DisplayName("returns the wrong dataType")
    public void addItemToBuffer() {
        MockHelperBuffer mockHelperBuffer = new MockHelperBuffer();
        MockProducer mockProducer = new MockProducer(mockHelperBuffer);

        mockProducer.addItem(new Item("123"));
        assertEquals(1, mockHelperBuffer.buffer.size());
    }

    @Test
    @DisplayName("returns the wrong dataType")
    public void startingSizeOfBuffer() {
        MockHelperBuffer mockHelperBuffer = new MockHelperBuffer();
        assertEquals(mockHelperBuffer.getBuffer().size(), 0);
    }

    @Test
    @DisplayName("returns the wrong dataType")
    public void itemRemoveBuffer() {
        MockHelperBuffer mockHelperBuffer = new MockHelperBuffer();
        MockProducer mockProducer = new MockProducer(mockHelperBuffer);
        MockConsumer mockConsumer = new MockConsumer(mockHelperBuffer);

        Thread thread = new Thread(() -> {
            mockProducer.addItem(new Item("1"));
            mockProducer.addItem(new Item("2"));
            mockProducer.addItem(new Item("3"));
            mockConsumer.removeItem();
            mockConsumer.removeItem();
            assertEquals(1, mockHelperBuffer.getBuffer().size());
        });
        thread.start();
    }

    @Test
    @DisplayName("Test waiting state")
    public void testWaitingFunctionality() throws InterruptedException {
        MockHelperBuffer mockHelperBuffer = new MockHelperBuffer();

        Thread thread = new Thread(() -> {
            synchronized (mockHelperBuffer) {
                mockHelperBuffer.remove();
            }
        });

        thread.start();
        Thread.sleep(1000);

        assertEquals(Thread.State.WAITING, thread.getState());

        thread.interrupt();

        thread.join();
    }
}