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

import com.sun.istack.internal.NotNull;
import net.gmcbm.core.server.Server;
import net.gmcbm.core.time.TimeManager;

import java.util.Optional;
import java.util.UUID;

/**
 * @author Ursin Filli
 * @version 1.0
 * @since 1.0
 */
public interface IBanManager {

    Optional<String> addBan(@NotNull Server server, @NotNull UUID uuid, @NotNull String reason,
                            @NotNull TimeManager time, @NotNull BanType type, @NotNull BanStorageLevel storageLevel);

    Optional<Boolean> updateBan(@NotNull String banId, @NotNull String reason, @NotNull TimeManager time,
                                @NotNull BanType type, @NotNull BanStorageLevel storageLevel);

    Optional<Boolean> deleteBan(@NotNull String banId);

    Optional<Ban> getBan(@NotNull String banId);

    Optional<Boolean> isBanned();

    Optional<Boolean> isBannedOnLevel(@NotNull BanStorageLevel storageLevel);
}
