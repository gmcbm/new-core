/*
 * MIT License
 *
 * Copyright (c) 2020 Global Minecraft Ban Manager
 * Copyright (c) 2020 Ursin Filli
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package net.gmcbm.core.ban;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Ursin Filli
 * @version 1.0
 * @since 1.0
 */
class BanTest {

    private Ban ban;

    @BeforeEach
    void setUp() {
        ban = new Ban(UUID.fromString("6802f0b5-521c-43f7-aa86-556f8dd939d7"), "ABC123", "Test", Instant.parse("2020-10-03T19:30:18.198Z"), BanType.SECURITY, BanStorageLevel.USER_LEVEL);
    }

    @Test
    void testGetUuid() {
        assertEquals("6802f0b5-521c-43f7-aa86-556f8dd939d7", ban.getUuid().toString(), "Coverage Test");
    }

    @Test
    void testGetBanId() {
        assertEquals("ABC123", ban.getBanId(), "Coverage Test");
    }

    @Test
    void testGetReason() {
        assertEquals("Test", ban.getReason(), "Coverage Test");
    }

    @Test
    void testGetTimestamp() {
        assertEquals("2020-10-03T19:30:18.198Z", ban.getTimestamp().toString(), "Coverage Test");
    }

    @Test
    void testGetType() {
        assertEquals(BanType.SECURITY, ban.getType(), "Coverage Test");
    }

    @Test
    void testGetStorageLevel() {
        assertEquals(BanStorageLevel.USER_LEVEL, ban.getStorageLevel(), "Coverage Test");
    }
}