package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

public class NumberProcessorTest {

    private final NumberProcessor processor = new NumberProcessor();

    // ==========================================
    // 1. STATEMENT COVERAGE (Bao phủ tất cả các lệnh)
    // ==========================================
    @Test
    @DisplayName("Statement Coverage: Thuc thi qua tat ca cac dong command")
    public void testStatementCoverage() {
        // Chạy qua dòng check null
        assertEquals(0, processor.processNumbers(null));

        // Chạy qua cả nhánh if (số âm) và else (số dương) trong vòng lặp
        assertEquals(30, processor.processNumbers(Arrays.asList(10, -5, 20)));
    }

    // ==========================================
    // 2. PATH COVERAGE (Bao phủ tất cả các đường đi)
    // ==========================================
    @Test
    @DisplayName("Path 1a: Input null")
    public void testPath_NullList() {
        assertEquals(0, processor.processNumbers(null));
    }

    @Test
    @DisplayName("Path 1b: Input danh sach rong")
    public void testPath_EmptyList() {
        assertEquals(0, processor.processNumbers(Collections.emptyList()));
    }

    @Test
    @DisplayName("Path 2: Chi chua so am (Chi vao nhanh IF trong loop)")
    public void testPath_OnlyNegativeNumbers() {
        assertEquals(0, processor.processNumbers(Arrays.asList(-1, -2, -3)));
    }

    @Test
    @DisplayName("Path 3: Chi chua so duong (Chi vao nhanh ELSE trong loop)")
    public void testPath_OnlyPositiveNumbers() {
        assertEquals(15, processor.processNumbers(Arrays.asList(5, 10)));
    }

    @Test
    @DisplayName("Path 4: Danh sach hon hop (Vao ca IF va ELSE)")
    public void testPath_MixedNumbers() {
        assertEquals(7, processor.processNumbers(Arrays.asList(10, -3, -2, 0)));
    }
}