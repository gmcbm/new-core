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
import net.gmcbm.core.time.TimeManager;
import net.gmcbm.core.web.IWeb;
import net.gmcbm.core.web.Web;

import javax.annotation.Nonnull;
import java.util.Optional;
import java.util.UUID;

/**
 * @author Ursin Filli
 * @version 1.0
 * @since 1.0
 */
public class WebBan implements IBanManager {

    private final IWeb web;

    public WebBan() {
        this.web = new Web();
    }

    @Override
    public Optional<String> addBan(@Nonnull Server server, @Nonnull UUID uuid, @Nonnull String reason,
                                   @Nonnull TimeManager time, @Nonnull BanType type,
                                   @Nonnull BanStorageLevel storageLevel) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Optional<Boolean> updateBan(@Nonnull String banId, @Nonnull String reason, @Nonnull TimeManager time,
                                       @Nonnull BanType type, @Nonnull BanStorageLevel storageLevel) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Optional<Boolean> deleteBan(@Nonnull String banId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Optional<Ban> getBan(@Nonnull String banId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Optional<Boolean> isBanned() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Optional<Boolean> isBannedOnLevel(@Nonnull BanStorageLevel storageLevel) {
        throw new UnsupportedOperationException();
    }
}
