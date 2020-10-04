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

package net.gmcbm.core.time;

/**
 * @author Ursin Filli
 * @version 1.0
 * @since 1.0
 */
public enum TimeUnit {

    // 1 Second
    SECOND(1),
    // 60 Seconds
    MINUTE(60),
    // 60 Minutes
    HOUR(3_600),
    // 24 Hours
    DAY(86_400),
    // 7 Days
    WEEK(604_800),
    // 30 Days
    MONTH(2_592_000),
    // 356 Days
    YEAR(30_758_400);

    private final long seconds;

    TimeUnit(long seconds) {
        this.seconds = seconds;
    }

    public long getSeconds() {
        return seconds;
    }
}
