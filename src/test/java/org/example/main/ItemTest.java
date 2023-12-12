package org.example.main;

import org.example.main.mockHelperClass.MockHelperItem;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {
    @Test
    @DisplayName("validates empty constructor value")
    public void emptyConstructorValue() {
        MockHelperItem mockHelperItem = new MockHelperItem("");
        assertEquals("",mockHelperItem.getId());
    }
    @Test
    @DisplayName("validates null constructor value")
    public void nullConstructorValue() {
       assertThrows(NullPointerException.class, () -> new MockHelperItem(null));
    }

    @Test
    @DisplayName("validates number constructor value")
    public void numberConstructorValue() {
        MockHelperItem mockHelperItem = new MockHelperItem("123");
        assertEquals("123",mockHelperItem.getId());
    }

    @Test
    @DisplayName("validates uppercase constructor value")
    public void upperCaseConstructorValue() {
        MockHelperItem mockHelperItem = new MockHelperItem("ABCD");
        assertEquals("abcd",mockHelperItem.getId());
    }

    @Test
    @DisplayName("validates long constructor value")
    public void caseConstructorLongValue() {
        MockHelperItem mockHelperItem = new MockHelperItem("ABCDabasdasdasdadasdasd");
        assertEquals("abcdabasdasdasdadasdasd",mockHelperItem.getId());
    }
    @Test
    @DisplayName("Tests setValue String type")
    public void setIdValue() {
        MockHelperItem mockHelperItem = new MockHelperItem("");
        mockHelperItem.setId("abc");
        assertEquals("abc", mockHelperItem.getId());
    }
    @Test
    @DisplayName("Tests setValue to null")
    public void setIdNullValue() {
        MockHelperItem mockHelperItem = new MockHelperItem("");
        assertThrows(NullPointerException.class, () -> {
            mockHelperItem.setId(null);
        });
    }

    @Test
    @DisplayName("Tests setValue of string integer value")
    public void setNumberValue() {
        MockHelperItem mockHelperItem = new MockHelperItem("");
        mockHelperItem.setId("1234");
        assertEquals("1234",mockHelperItem.getId());
    }

    @Test
    @DisplayName("Tests setValue and getValue of uppercase string type")
    public void setUpperCaseValue() {
        MockHelperItem mockHelperItem = new MockHelperItem("");
        mockHelperItem.setId("ABCDEFGH");
        assertEquals("abcdefgh",mockHelperItem.getId());
    }
       // ----
    @Test
    @DisplayName("validates empty toString value")
    public void toStringEmptyValue() {
        MockHelperItem mockHelperItem = new MockHelperItem("");
        assertEquals("",mockHelperItem.toString());
    }
    @Test
    @DisplayName("validates null value toString")
    public void toStringNullValue() {
        assertThrows(NullPointerException.class, () -> {
            MockHelperItem mockHelperItem = new MockHelperItem(null);
            mockHelperItem.toString();
        });
    }
    @Test
    @DisplayName("validates number toString value")
    public void toStringNumber() {
        MockHelperItem mockHelperItem = new MockHelperItem("1234");
        assertEquals("1234",mockHelperItem.toString());
    }

    @Test
    @DisplayName("validates uppercase toString value")
    public void toStringLowerCase() {
        MockHelperItem mockHelperItem = new MockHelperItem("ABCD");
        assertEquals("abcd",mockHelperItem.toString());
    }

    @Test
    @DisplayName("validates long toString value")
    public void toStringLongValue() {
        MockHelperItem mockHelperItem = new MockHelperItem("ABCDabasdasdasdadasdasd");
        assertEquals("abcdabasdasdasdadasdasd", mockHelperItem.toString());
    }
}