package com.vungle.ads.internal.model;

import fe.d;
import fe.l;
import he.f;
import je.b2;
import je.q2;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: UnclosedAd.kt */
/* JADX INFO: loaded from: classes4.dex */
@l
public final class UnclosedAd {
    public static final Companion Companion = new Companion(null);
    private final String eventId;
    private String sessionId;

    /* JADX INFO: compiled from: UnclosedAd.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final d<UnclosedAd> serializer() {
            return UnclosedAd$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UnclosedAd(int i10, String str, String str2, q2 q2Var) {
        if (1 != (i10 & 1)) {
            b2.a(i10, 1, UnclosedAd$$serializer.INSTANCE.getDescriptor());
        }
        this.eventId = str;
        if ((i10 & 2) == 0) {
            this.sessionId = "";
        } else {
            this.sessionId = str2;
        }
    }

    public static /* synthetic */ UnclosedAd copy$default(UnclosedAd unclosedAd, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = unclosedAd.eventId;
        }
        if ((i10 & 2) != 0) {
            str2 = unclosedAd.sessionId;
        }
        return unclosedAd.copy(str, str2);
    }

    public static final void write$Self(UnclosedAd self, ie.d output, f serialDesc) {
        t.f(self, "self");
        t.f(output, "output");
        t.f(serialDesc, "serialDesc");
        output.A(serialDesc, 0, self.eventId);
        if (output.w(serialDesc, 1) || !t.a(self.sessionId, "")) {
            output.A(serialDesc, 1, self.sessionId);
        }
    }

    public final String component1() {
        return this.eventId;
    }

    public final String component2() {
        return this.sessionId;
    }

    public final UnclosedAd copy(String eventId, String sessionId) {
        t.f(eventId, "eventId");
        t.f(sessionId, "sessionId");
        return new UnclosedAd(eventId, sessionId);
    }

    public boolean equals(Object obj) {
        if (obj == null || !t.a(UnclosedAd.class, obj.getClass())) {
            return false;
        }
        UnclosedAd unclosedAd = (UnclosedAd) obj;
        return t.a(this.eventId, unclosedAd.eventId) && t.a(this.sessionId, unclosedAd.sessionId);
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return (this.eventId.hashCode() * 31) + this.sessionId.hashCode();
    }

    public final void setSessionId(String str) {
        t.f(str, "<set-?>");
        this.sessionId = str;
    }

    public String toString() {
        return "UnclosedAd(eventId=" + this.eventId + ", sessionId=" + this.sessionId + ')';
    }

    public UnclosedAd(String eventId, String sessionId) {
        t.f(eventId, "eventId");
        t.f(sessionId, "sessionId");
        this.eventId = eventId;
        this.sessionId = sessionId;
    }

    public /* synthetic */ UnclosedAd(String str, String str2, int i10, k kVar) {
        this(str, (i10 & 2) != 0 ? "" : str2);
    }

    public static /* synthetic */ void getEventId$annotations() {
    }

    public static /* synthetic */ void getSessionId$annotations() {
    }
}
