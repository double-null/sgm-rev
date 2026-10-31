package com.vungle.ads.internal.signals;

import fe.d;
import fe.l;
import he.f;
import je.b2;
import je.q2;
import je.v2;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: SignaledAd.kt */
/* JADX INFO: loaded from: classes4.dex */
@l
public final class SignaledAd {
    public static final Companion Companion = new Companion(null);
    private long adAvailabilityCallbackTime;
    private String eventId;
    private final Long lastAdLoadTime;
    private final long loadAdTime;
    private long playAdTime;
    private int screenOrientation;
    private String templateSignals;
    private long timeBetweenAdAvailabilityAndPlayAd;
    private final long timeSinceLastAdLoad;

    /* JADX INFO: compiled from: SignaledAd.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final d<SignaledAd> serializer() {
            return SignaledAd$$serializer.INSTANCE;
        }
    }

    public SignaledAd() {
        this(null, 0L, 3, null);
    }

    public static /* synthetic */ SignaledAd copy$default(SignaledAd signaledAd, Long l10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = signaledAd.lastAdLoadTime;
        }
        if ((i10 & 2) != 0) {
            j10 = signaledAd.loadAdTime;
        }
        return signaledAd.copy(l10, j10);
    }

    private final long getTimeDifference(Long l10, long j10) {
        if (l10 == null) {
            return -1L;
        }
        long jLongValue = j10 - l10.longValue();
        if (jLongValue < 0) {
            return -1L;
        }
        return jLongValue;
    }

    public static final void write$Self(SignaledAd self, ie.d output, f serialDesc) {
        t.f(self, "self");
        t.f(output, "output");
        t.f(serialDesc, "serialDesc");
        if (output.w(serialDesc, 0) || self.templateSignals != null) {
            output.o(serialDesc, 0, v2.f21024a, self.templateSignals);
        }
        output.p(serialDesc, 1, self.timeSinceLastAdLoad);
        if (output.w(serialDesc, 2) || self.eventId != null) {
            output.o(serialDesc, 2, v2.f21024a, self.eventId);
        }
        if (output.w(serialDesc, 3) || self.timeBetweenAdAvailabilityAndPlayAd != 0) {
            output.p(serialDesc, 3, self.timeBetweenAdAvailabilityAndPlayAd);
        }
        if (output.w(serialDesc, 4) || self.screenOrientation != 0) {
            output.h(serialDesc, 4, self.screenOrientation);
        }
    }

    public final void calculateTimeBetweenAdAvailabilityAndPlayAd() {
        this.timeBetweenAdAvailabilityAndPlayAd = getTimeDifference(Long.valueOf(this.adAvailabilityCallbackTime), this.playAdTime);
    }

    public final Long component1() {
        return this.lastAdLoadTime;
    }

    public final long component2() {
        return this.loadAdTime;
    }

    public final SignaledAd copy(Long l10, long j10) {
        return new SignaledAd(l10, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignaledAd)) {
            return false;
        }
        SignaledAd signaledAd = (SignaledAd) obj;
        return t.a(this.lastAdLoadTime, signaledAd.lastAdLoadTime) && this.loadAdTime == signaledAd.loadAdTime;
    }

    public final long getAdAvailabilityCallbackTime() {
        return this.adAvailabilityCallbackTime;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final Long getLastAdLoadTime() {
        return this.lastAdLoadTime;
    }

    public final long getLoadAdTime() {
        return this.loadAdTime;
    }

    public final long getPlayAdTime() {
        return this.playAdTime;
    }

    public final int getScreenOrientation() {
        return this.screenOrientation;
    }

    public final String getTemplateSignals() {
        return this.templateSignals;
    }

    public final long getTimeBetweenAdAvailabilityAndPlayAd() {
        return this.timeBetweenAdAvailabilityAndPlayAd;
    }

    public final long getTimeSinceLastAdLoad() {
        return this.timeSinceLastAdLoad;
    }

    public int hashCode() {
        Long l10 = this.lastAdLoadTime;
        return ((l10 == null ? 0 : l10.hashCode()) * 31) + Long.hashCode(this.loadAdTime);
    }

    public final void setAdAvailabilityCallbackTime(long j10) {
        this.adAvailabilityCallbackTime = j10;
    }

    public final void setEventId(String str) {
        this.eventId = str;
    }

    public final void setPlayAdTime(long j10) {
        this.playAdTime = j10;
    }

    public final void setScreenOrientation(int i10) {
        this.screenOrientation = i10;
    }

    public final void setTemplateSignals(String str) {
        this.templateSignals = str;
    }

    public final void setTimeBetweenAdAvailabilityAndPlayAd(long j10) {
        this.timeBetweenAdAvailabilityAndPlayAd = j10;
    }

    public String toString() {
        return "SignaledAd(lastAdLoadTime=" + this.lastAdLoadTime + ", loadAdTime=" + this.loadAdTime + ')';
    }

    public /* synthetic */ SignaledAd(int i10, String str, long j10, String str2, long j11, int i11, q2 q2Var) {
        if (2 != (i10 & 2)) {
            b2.a(i10, 2, SignaledAd$$serializer.INSTANCE.getDescriptor());
        }
        this.lastAdLoadTime = 0L;
        this.loadAdTime = 0L;
        if ((i10 & 1) == 0) {
            this.templateSignals = null;
        } else {
            this.templateSignals = str;
        }
        this.timeSinceLastAdLoad = j10;
        if ((i10 & 4) == 0) {
            this.eventId = null;
        } else {
            this.eventId = str2;
        }
        if ((i10 & 8) == 0) {
            this.timeBetweenAdAvailabilityAndPlayAd = 0L;
        } else {
            this.timeBetweenAdAvailabilityAndPlayAd = j11;
        }
        if ((i10 & 16) == 0) {
            this.screenOrientation = 0;
        } else {
            this.screenOrientation = i11;
        }
        this.adAvailabilityCallbackTime = 0L;
        this.playAdTime = 0L;
        this.timeSinceLastAdLoad = getTimeDifference(0L, 0L);
    }

    public SignaledAd(Long l10, long j10) {
        this.lastAdLoadTime = l10;
        this.loadAdTime = j10;
        this.timeSinceLastAdLoad = getTimeDifference(l10, j10);
    }

    public /* synthetic */ SignaledAd(Long l10, long j10, int i10, k kVar) {
        this((i10 & 1) != 0 ? 0L : l10, (i10 & 2) != 0 ? 0L : j10);
    }

    public static /* synthetic */ void getAdAvailabilityCallbackTime$annotations() {
    }

    public static /* synthetic */ void getEventId$annotations() {
    }

    public static /* synthetic */ void getLastAdLoadTime$annotations() {
    }

    public static /* synthetic */ void getLoadAdTime$annotations() {
    }

    public static /* synthetic */ void getPlayAdTime$annotations() {
    }

    public static /* synthetic */ void getScreenOrientation$annotations() {
    }

    public static /* synthetic */ void getTemplateSignals$annotations() {
    }

    public static /* synthetic */ void getTimeBetweenAdAvailabilityAndPlayAd$annotations() {
    }

    public static /* synthetic */ void getTimeSinceLastAdLoad$annotations() {
    }
}
