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

package net.gmcbm.core.time;

import java.time.Instant;

/**
 * @author Ursin Filli
 * @version 1.0
 * @since 1.0
 */
public class TimeManager {

    private final TimeUnit unit;
    private final int amount;
    private Instant instant;

    public TimeManager(TimeUnit unit, int amount) {
        this.unit = unit;
        this.amount = amount;
        setInstant(Instant.now());
    }

    public long getSeconds() {
        return unit.getSeconds() * amount;
    }

    public Instant getTimestamp() {
        return instant.plusSeconds(getSeconds());
    }

    public Instant getInstant() {
        return instant;
    }

    protected final void setInstant(Instant instant) {
        this.instant = instant;
    }
}
