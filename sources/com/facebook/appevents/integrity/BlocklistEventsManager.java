package com.facebook.appevents.integrity;

import com.facebook.FacebookSdk;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: BlocklistEventsManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class BlocklistEventsManager {
    public static final BlocklistEventsManager INSTANCE = new BlocklistEventsManager();
    private static Set<String> blocklist = new HashSet();
    private static boolean enabled;

    private BlocklistEventsManager() {
    }

    public static final void disable() {
        if (CrashShieldHandler.isObjectCrashing(BlocklistEventsManager.class)) {
            return;
        }
        try {
            enabled = false;
            blocklist = new HashSet();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, BlocklistEventsManager.class);
        }
    }

    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(BlocklistEventsManager.class)) {
            return;
        }
        try {
            INSTANCE.loadBlocklistEvents();
            Set<String> set = blocklist;
            if (set == null || set.isEmpty()) {
                return;
            }
            enabled = true;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, BlocklistEventsManager.class);
        }
    }

    public static final boolean isInBlocklist(String eventName) {
        if (CrashShieldHandler.isObjectCrashing(BlocklistEventsManager.class)) {
            return false;
        }
        try {
            t.f(eventName, "eventName");
            if (enabled) {
                return blocklist.contains(eventName);
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, BlocklistEventsManager.class);
            return false;
        }
    }

    private final void loadBlocklistEvents() {
        HashSet<String> hashSetConvertJSONArrayToHashSet;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            FetchedAppSettings fetchedAppSettingsQueryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
            if (fetchedAppSettingsQueryAppSettings == null || (hashSetConvertJSONArrayToHashSet = Utility.convertJSONArrayToHashSet(fetchedAppSettingsQueryAppSettings.getBlocklistEvents())) == null) {
                return;
            }
            blocklist = hashSetConvertJSONArrayToHashSet;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }
}
