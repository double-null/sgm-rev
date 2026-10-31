package com.vungle.ads.internal.signals;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.vungle.ads.internal.model.UnclosedAd;
import com.vungle.ads.internal.model.UnclosedAd$$serializer;
import fe.d;
import fe.l;
import he.f;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import je.b2;
import je.q2;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: SessionData.kt */
/* JADX INFO: loaded from: classes4.dex */
@l
public final class SessionData {
    public static final Companion Companion = new Companion(null);
    private int httpProxyEnabled;
    private int isDevice;
    private int isVPNConnected;
    private int overlayGranted;
    private int sensorCount;
    private final int sessionCount;
    private long sessionCreationTime;
    private int sessionDepthCounter;
    private long sessionDuration;
    private final String sessionId;
    private List<SignaledAd> signaledAd;
    private List<UnclosedAd> unclosedAd;

    /* JADX INFO: compiled from: SessionData.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final d<SessionData> serializer() {
            return SessionData$$serializer.INSTANCE;
        }
    }

    public SessionData(int i10) {
        this.sessionCount = i10;
        String string = UUID.randomUUID().toString();
        t.e(string, "randomUUID().toString()");
        this.sessionId = string;
        this.sessionCreationTime = System.currentTimeMillis() / 1000;
        this.signaledAd = new ArrayList();
        this.unclosedAd = new ArrayList();
    }

    public static /* synthetic */ SessionData copy$default(SessionData sessionData, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = sessionData.sessionCount;
        }
        return sessionData.copy(i10);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x001c  */
    public static final void write$Self(SessionData self, ie.d output, f serialDesc) {
        boolean z10;
        t.f(self, "self");
        t.f(output, "output");
        t.f(serialDesc, "serialDesc");
        output.h(serialDesc, 0, self.sessionCount);
        if (output.w(serialDesc, 1)) {
            z10 = true;
        } else {
            String str = self.sessionId;
            String string = UUID.randomUUID().toString();
            t.e(string, "randomUUID().toString()");
            if (t.a(str, string)) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        if (z10) {
            output.A(serialDesc, 1, self.sessionId);
        }
        if (output.w(serialDesc, 2) || self.sessionCreationTime != System.currentTimeMillis() / 1000) {
            output.p(serialDesc, 2, self.sessionCreationTime);
        }
        if (output.w(serialDesc, 3) || !t.a(self.signaledAd, new ArrayList())) {
            output.E(serialDesc, 3, new je.f(SignaledAd$$serializer.INSTANCE), self.signaledAd);
        }
        if (output.w(serialDesc, 4) || self.sessionDuration != 0) {
            output.p(serialDesc, 4, self.sessionDuration);
        }
        if (output.w(serialDesc, 5) || self.sessionDepthCounter != 0) {
            output.h(serialDesc, 5, self.sessionDepthCounter);
        }
        if (output.w(serialDesc, 6) || !t.a(self.unclosedAd, new ArrayList())) {
            output.E(serialDesc, 6, new je.f(UnclosedAd$$serializer.INSTANCE), self.unclosedAd);
        }
        if (output.w(serialDesc, 7) || self.isDevice != 0) {
            output.h(serialDesc, 7, self.isDevice);
        }
        if (output.w(serialDesc, 8) || self.isVPNConnected != 0) {
            output.h(serialDesc, 8, self.isVPNConnected);
        }
        if (output.w(serialDesc, 9) || self.overlayGranted != 0) {
            output.h(serialDesc, 9, self.overlayGranted);
        }
        if (output.w(serialDesc, 10) || self.sensorCount != 0) {
            output.h(serialDesc, 10, self.sensorCount);
        }
        if (output.w(serialDesc, 11) || self.httpProxyEnabled != 0) {
            output.h(serialDesc, 11, self.httpProxyEnabled);
        }
    }

    public final int component1() {
        return this.sessionCount;
    }

    public final SessionData copy(int i10) {
        return new SessionData(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SessionData) && this.sessionCount == ((SessionData) obj).sessionCount;
    }

    public final int getHttpProxyEnabled() {
        return this.httpProxyEnabled;
    }

    public final int getOverlayGranted() {
        return this.overlayGranted;
    }

    public final int getSensorCount() {
        return this.sensorCount;
    }

    public final int getSessionCount() {
        return this.sessionCount;
    }

    public final long getSessionCreationTime() {
        return this.sessionCreationTime;
    }

    public final int getSessionDepthCounter() {
        return this.sessionDepthCounter;
    }

    public final long getSessionDuration() {
        return this.sessionDuration;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final List<SignaledAd> getSignaledAd() {
        return this.signaledAd;
    }

    public final List<UnclosedAd> getUnclosedAd() {
        return this.unclosedAd;
    }

    public int hashCode() {
        return Integer.hashCode(this.sessionCount);
    }

    public final int isDevice() {
        return this.isDevice;
    }

    public final int isVPNConnected() {
        return this.isVPNConnected;
    }

    public final void setDevice(int i10) {
        this.isDevice = i10;
    }

    public final void setHttpProxyEnabled(int i10) {
        this.httpProxyEnabled = i10;
    }

    public final void setOverlayGranted(int i10) {
        this.overlayGranted = i10;
    }

    public final void setSensorCount(int i10) {
        this.sensorCount = i10;
    }

    public final void setSessionCreationTime(long j10) {
        this.sessionCreationTime = j10;
    }

    public final void setSessionDepthCounter(int i10) {
        this.sessionDepthCounter = i10;
    }

    public final void setSessionDuration(long j10) {
        this.sessionDuration = j10;
    }

    public final void setSignaledAd(List<SignaledAd> list) {
        t.f(list, "<set-?>");
        this.signaledAd = list;
    }

    public final void setUnclosedAd(List<UnclosedAd> list) {
        t.f(list, "<set-?>");
        this.unclosedAd = list;
    }

    public final void setVPNConnected(int i10) {
        this.isVPNConnected = i10;
    }

    public String toString() {
        return "SessionData(sessionCount=" + this.sessionCount + ')';
    }

    public /* synthetic */ SessionData(int i10, int i11, String str, long j10, List list, long j11, int i12, List list2, int i13, int i14, int i15, int i16, int i17, q2 q2Var) {
        String string;
        if (1 != (i10 & 1)) {
            b2.a(i10, 1, SessionData$$serializer.INSTANCE.getDescriptor());
        }
        this.sessionCount = i11;
        if ((i10 & 2) == 0) {
            string = UUID.randomUUID().toString();
            t.e(string, "randomUUID().toString()");
        } else {
            string = str;
        }
        this.sessionId = string;
        this.sessionCreationTime = (i10 & 4) == 0 ? System.currentTimeMillis() / 1000 : j10;
        this.signaledAd = (i10 & 8) == 0 ? new ArrayList() : list;
        this.sessionDuration = (i10 & 16) == 0 ? 0L : j11;
        if ((i10 & 32) == 0) {
            this.sessionDepthCounter = 0;
        } else {
            this.sessionDepthCounter = i12;
        }
        this.unclosedAd = (i10 & 64) == 0 ? new ArrayList() : list2;
        if ((i10 & 128) == 0) {
            this.isDevice = 0;
        } else {
            this.isDevice = i13;
        }
        if ((i10 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0) {
            this.isVPNConnected = 0;
        } else {
            this.isVPNConnected = i14;
        }
        if ((i10 & 512) == 0) {
            this.overlayGranted = 0;
        } else {
            this.overlayGranted = i15;
        }
        if ((i10 & 1024) == 0) {
            this.sensorCount = 0;
        } else {
            this.sensorCount = i16;
        }
        if ((i10 & 2048) == 0) {
            this.httpProxyEnabled = 0;
        } else {
            this.httpProxyEnabled = i17;
        }
    }

    public static /* synthetic */ void getHttpProxyEnabled$annotations() {
    }

    public static /* synthetic */ void getOverlayGranted$annotations() {
    }

    public static /* synthetic */ void getSensorCount$annotations() {
    }

    public static /* synthetic */ void getSessionCount$annotations() {
    }

    public static /* synthetic */ void getSessionCreationTime$annotations() {
    }

    public static /* synthetic */ void getSessionDepthCounter$annotations() {
    }

    public static /* synthetic */ void getSessionDuration$annotations() {
    }

    public static /* synthetic */ void getSessionId$annotations() {
    }

    public static /* synthetic */ void getSignaledAd$annotations() {
    }

    public static /* synthetic */ void getUnclosedAd$annotations() {
    }

    public static /* synthetic */ void isDevice$annotations() {
    }

    public static /* synthetic */ void isVPNConnected$annotations() {
    }
}
