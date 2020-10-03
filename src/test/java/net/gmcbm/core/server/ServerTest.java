/*
 * MIT License
 *
 * Copyright (c) 2020 Global Minecraft Ban Manager
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

package net.gmcbm.core.server;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * @author Ursin Filli
 * @version 1.0
 * @since 1.0
 */
class ServerTest {

    private Server server;

    @BeforeEach
    void setUp() {
        server = new Server(UUID.fromString("3eee5cea-0555-40d1-b753-8518ec6ee3f8"), null, null);
    }

    @Test
    void testGetServerId() {
        assertEquals("3eee5cea-0555-40d1-b753-8518ec6ee3f8", server.getServerId().toString(), "Coverage Test");
    }

    @Test
    void testGetServerName() {
        assertEquals(Optional.empty(), server.getServerName(), "Coverage Test");
    }

    @Test
    void testGetOwner() {
        assertEquals(Optional.empty(), server.getOwner(), "Coverage Test");
    }
}