package com.facebook.appevents;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import s.sBoZ.TwDPD;

/* JADX INFO: compiled from: PersistedEvents.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PersistedEvents implements Serializable {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 20160629001L;
    private final HashMap<AccessTokenAppIdPair, List<AppEvent>> events;

    /* JADX INFO: compiled from: PersistedEvents.kt */
    /* JADX INFO: loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: PersistedEvents.kt */
    /* JADX INFO: loaded from: classes.dex */
    public static final class SerializationProxyV1 implements Serializable {
        public static final Companion Companion = new Companion(null);
        private static final long serialVersionUID = 20160629001L;
        private final HashMap<AccessTokenAppIdPair, List<AppEvent>> proxyEvents;

        /* JADX INFO: compiled from: PersistedEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }
        }

        public SerializationProxyV1(HashMap<AccessTokenAppIdPair, List<AppEvent>> proxyEvents) {
            kotlin.jvm.internal.t.f(proxyEvents, "proxyEvents");
            this.proxyEvents = proxyEvents;
        }

        private final Object readResolve() throws ObjectStreamException {
            return new PersistedEvents(this.proxyEvents);
        }
    }

    public PersistedEvents() {
        this.events = new HashMap<>();
    }

    private final Object writeReplace() throws ObjectStreamException {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return new SerializationProxyV1(this.events);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final void addEvents(AccessTokenAppIdPair accessTokenAppIdPair, List<AppEvent> appEvents) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.t.f(accessTokenAppIdPair, "accessTokenAppIdPair");
            kotlin.jvm.internal.t.f(appEvents, "appEvents");
            if (!this.events.containsKey(accessTokenAppIdPair)) {
                this.events.put(accessTokenAppIdPair, kotlin.collections.b0.r0(appEvents));
                return;
            }
            List<AppEvent> list = this.events.get(accessTokenAppIdPair);
            if (list != null) {
                list.addAll(appEvents);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final boolean containsKey(AccessTokenAppIdPair accessTokenAppIdPair) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            kotlin.jvm.internal.t.f(accessTokenAppIdPair, "accessTokenAppIdPair");
            return this.events.containsKey(accessTokenAppIdPair);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    public final List<AppEvent> get(AccessTokenAppIdPair accessTokenAppIdPair) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            kotlin.jvm.internal.t.f(accessTokenAppIdPair, "accessTokenAppIdPair");
            return this.events.get(accessTokenAppIdPair);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final Set<AccessTokenAppIdPair> keySet() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Set<AccessTokenAppIdPair> setKeySet = this.events.keySet();
            kotlin.jvm.internal.t.e(setKeySet, "events.keys");
            return setKeySet;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public PersistedEvents(HashMap<AccessTokenAppIdPair, List<AppEvent>> appEventMap) {
        kotlin.jvm.internal.t.f(appEventMap, "appEventMap");
        HashMap<AccessTokenAppIdPair, List<AppEvent>> map = new HashMap<>();
        this.events = map;
        map.putAll(appEventMap);
    }

    public final Set<Map.Entry<AccessTokenAppIdPair, List<AppEvent>>> entrySet() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Set<Map.Entry<AccessTokenAppIdPair, List<AppEvent>>> setEntrySet = this.events.entrySet();
            kotlin.jvm.internal.t.e(setEntrySet, TwDPD.zSEoUNwx);
            return setEntrySet;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
