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

package net.gmcbm.core.ban;

import net.gmcbm.core.storage.*;
import net.gmcbm.core.time.TimeManager;

import java.util.Optional;
import java.util.UUID;

public class LocalBan implements IBanManager {

    private final LocalStorageMethod localStorageMethod;
    private final IFileStorage fileStorage;
    private final IDatabaseStorage databaseStorage;

    public LocalBan(LocalStorageMethod localStorageMethod) {
        this.localStorageMethod = localStorageMethod;
        this.fileStorage = new FileStorage();
        this.databaseStorage = new DatabaseStorage();
    }

    @Override
    public Optional<String> addBan(UUID uuid, String reason, TimeManager time, BanType type,
                                   BanStorageLevel storageLevel) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean updateBan(String banId, String reason, TimeManager time, BanType type,
                             BanStorageLevel storageLevel) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean deleteBan(String banId) {
        throw new UnsupportedOperationException();
    }
}