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

import net.gmcbm.core.server.Server;
import net.gmcbm.core.storage.LocalStorageMethod;
import net.gmcbm.core.storage.StorageMethod;
import net.gmcbm.core.time.TimeManager;

import javax.annotation.Nonnull;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

/**
 * @author Ursin Filli
 * @version 1.0
 * @since 1.0
 */
public class BanManager implements IBanManager {

    private final StorageMethod storageMethod;
    private final LocalBan localBan;
    private final WebBan webBan;

    public BanManager(@Nonnull StorageMethod storageMethod, @Nonnull LocalStorageMethod localStorageMethod) {
        this.storageMethod = Objects.requireNonNull(storageMethod);
        this.localBan = new LocalBan(localStorageMethod);
        this.webBan = new WebBan();
    }

    @Override
    public Optional<String> addBan(@Nonnull Server server, @Nonnull UUID uuid, @Nonnull String reason,
                                   @Nonnull TimeManager time, @Nonnull BanType type,
                                   @Nonnull BanStorageLevel storageLevel) {
        if (storageMethod == StorageMethod.LOCAL) {
            return localBan.addBan(server, uuid, reason, time, type, storageLevel);
        }
        if (storageMethod == StorageMethod.WEB) {
            return webBan.addBan(server, uuid, reason, time, type, storageLevel);
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public Optional<Boolean> updateBan(@Nonnull String banId, @Nonnull String reason, @Nonnull TimeManager time,
                                       @Nonnull BanType type, @Nonnull BanStorageLevel storageLevel) {
        if (storageMethod == StorageMethod.LOCAL) {
            return localBan.updateBan(banId, reason, time, type, storageLevel);
        }
        if (storageMethod == StorageMethod.WEB) {
            return webBan.updateBan(banId, reason, time, type, storageLevel);
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public Optional<Boolean> deleteBan(@Nonnull String banId) {
        if (storageMethod == StorageMethod.LOCAL) {
            return localBan.deleteBan(banId);
        }
        if (storageMethod == StorageMethod.WEB) {
            return webBan.deleteBan(banId);
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public Optional<Ban> getBan(@Nonnull String banId) {
        if (storageMethod == StorageMethod.LOCAL) {
            return localBan.getBan(banId);
        }
        if (storageMethod == StorageMethod.WEB) {
            return webBan.getBan(banId);
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public Optional<Boolean> isBanned() {
        if (storageMethod == StorageMethod.LOCAL) {
            return localBan.isBanned();
        }
        if (storageMethod == StorageMethod.WEB) {
            return webBan.isBanned();
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public Optional<Boolean> isBannedOnLevel(@Nonnull BanStorageLevel storageLevel) {
        if (storageMethod == StorageMethod.LOCAL) {
            return localBan.isBannedOnLevel(storageLevel);
        }
        if (storageMethod == StorageMethod.WEB) {
            return webBan.isBannedOnLevel(storageLevel);
        }
        throw new UnsupportedOperationException();
    }
}
