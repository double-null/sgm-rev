package com.vungle.ads.fpd;

import fe.d;
import fe.l;
import fe.u;
import he.f;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import je.b2;
import je.q2;
import je.v2;
import je.z0;
import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.v;

/* JADX INFO: compiled from: FirstPartyData.kt */
/* JADX INFO: loaded from: classes4.dex */
@l
public final class FirstPartyData {
    public static final Companion Companion = new Companion(null);
    private static final b JSON = v.b(null, FirstPartyData$Companion$JSON$1.INSTANCE, 1, null);
    private static final String MODEL_VERSION = "2.0";
    private Map<String, String> _customData;
    private volatile Demographic _demographic;
    private volatile Location _location;
    private volatile Revenue _revenue;
    private volatile SessionContext _sessionContext;
    private final String modelVersion;

    /* JADX INFO: compiled from: FirstPartyData.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final d<FirstPartyData> serializer() {
            return FirstPartyData$$serializer.INSTANCE;
        }
    }

    public FirstPartyData() {
        this.modelVersion = MODEL_VERSION;
    }

    public static final void write$Self(FirstPartyData self, ie.d output, f serialDesc) {
        t.f(self, "self");
        t.f(output, "output");
        t.f(serialDesc, "serialDesc");
        if (output.w(serialDesc, 0) || !t.a(self.modelVersion, MODEL_VERSION)) {
            output.A(serialDesc, 0, self.modelVersion);
        }
        if (output.w(serialDesc, 1) || self._sessionContext != null) {
            output.o(serialDesc, 1, SessionContext$$serializer.INSTANCE, self._sessionContext);
        }
        if (output.w(serialDesc, 2) || self._demographic != null) {
            output.o(serialDesc, 2, Demographic$$serializer.INSTANCE, self._demographic);
        }
        if (output.w(serialDesc, 3) || self._location != null) {
            output.o(serialDesc, 3, Location$$serializer.INSTANCE, self._location);
        }
        if (output.w(serialDesc, 4) || self._revenue != null) {
            output.o(serialDesc, 4, Revenue$$serializer.INSTANCE, self._revenue);
        }
        if (output.w(serialDesc, 5) || self._customData != null) {
            v2 v2Var = v2.f21024a;
            output.o(serialDesc, 5, new z0(v2Var, v2Var), self._customData);
        }
    }

    public final synchronized void clearAll() {
        this._sessionContext = null;
        this._demographic = null;
        this._revenue = null;
        this._location = null;
        Map<String, String> map = this._customData;
        if (map != null) {
            map.clear();
        }
        this._customData = null;
    }

    public final String debug() {
        b bVar = JSON;
        d<Object> dVarB = u.b(bVar.a(), i0.j(FirstPartyData.class));
        t.d(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return bVar.b(dVarB, this);
    }

    public final synchronized Map<String, String> getCustomData() {
        Map<String, String> concurrentHashMap;
        concurrentHashMap = this._customData;
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
            this._customData = concurrentHashMap;
        }
        return concurrentHashMap;
    }

    public final synchronized Demographic getDemographic() {
        Demographic demographic;
        demographic = this._demographic;
        if (demographic == null) {
            demographic = new Demographic();
            this._demographic = demographic;
        }
        return demographic;
    }

    public final synchronized Location getLocation() {
        Location location;
        location = this._location;
        if (location == null) {
            location = new Location();
            this._location = location;
        }
        return location;
    }

    public final synchronized Revenue getRevenue() {
        Revenue revenue;
        revenue = this._revenue;
        if (revenue == null) {
            revenue = new Revenue();
            this._revenue = revenue;
        }
        return revenue;
    }

    public final synchronized SessionContext getSessionContext() {
        SessionContext sessionContext;
        sessionContext = this._sessionContext;
        if (sessionContext == null) {
            sessionContext = new SessionContext();
            this._sessionContext = sessionContext;
        }
        return sessionContext;
    }

    public /* synthetic */ FirstPartyData(int i10, String str, SessionContext sessionContext, Demographic demographic, Location location, Revenue revenue, Map map, q2 q2Var) {
        if ((i10 & 0) != 0) {
            b2.a(i10, 0, FirstPartyData$$serializer.INSTANCE.getDescriptor());
        }
        this.modelVersion = (i10 & 1) == 0 ? MODEL_VERSION : str;
        if ((i10 & 2) == 0) {
            this._sessionContext = null;
        } else {
            this._sessionContext = sessionContext;
        }
        if ((i10 & 4) == 0) {
            this._demographic = null;
        } else {
            this._demographic = demographic;
        }
        if ((i10 & 8) == 0) {
            this._location = null;
        } else {
            this._location = location;
        }
        if ((i10 & 16) == 0) {
            this._revenue = null;
        } else {
            this._revenue = revenue;
        }
        if ((i10 & 32) == 0) {
            this._customData = null;
        } else {
            this._customData = map;
        }
    }

    private static /* synthetic */ void getModelVersion$annotations() {
    }

    private static /* synthetic */ void get_customData$annotations() {
    }

    private static /* synthetic */ void get_demographic$annotations() {
    }

    private static /* synthetic */ void get_location$annotations() {
    }

    private static /* synthetic */ void get_revenue$annotations() {
    }

    private static /* synthetic */ void get_sessionContext$annotations() {
    }
}
