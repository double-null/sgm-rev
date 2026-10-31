package com.vungle.ads.internal.model;

import android.util.Base64;
import fe.d;
import fe.l;
import he.f;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.zip.GZIPInputStream;
import je.b2;
import je.q2;
import je.u0;
import je.v2;
import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.e;
import kotlinx.serialization.json.v;
import wc.g0;

/* JADX INFO: compiled from: BidPayload.kt */
/* JADX INFO: loaded from: classes4.dex */
@l
public final class BidPayload {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private final AdPayload f13072ad;
    private final String adunit;
    private final List<String> impression;
    private final b json;
    private final Integer version;

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.BidPayload$1, reason: invalid class name */
    /* JADX INFO: compiled from: BidPayload.kt */
    static final class AnonymousClass1 extends u implements id.l<e, g0> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ g0 invoke(e eVar) {
            invoke2(eVar);
            return g0.f27756a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(e Json) {
            t.f(Json, "$this$Json");
            Json.f(true);
            Json.d(true);
            Json.e(false);
        }
    }

    /* JADX INFO: compiled from: BidPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final d<BidPayload> serializer() {
            return BidPayload$$serializer.INSTANCE;
        }
    }

    public BidPayload() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BidPayload copy$default(BidPayload bidPayload, Integer num, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = bidPayload.version;
        }
        if ((i10 & 2) != 0) {
            str = bidPayload.adunit;
        }
        if ((i10 & 4) != 0) {
            list = bidPayload.impression;
        }
        return bidPayload.copy(num, str, list);
    }

    private final String gzipDecode(byte[] bArr) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream, 1024);
            try {
                byte[] bArr2 = new byte[1024];
                while (true) {
                    int i10 = gZIPInputStream.read(bArr2);
                    if (i10 == -1) {
                        g0 g0Var = g0.f27756a;
                        fd.b.a(gZIPInputStream, null);
                        fd.b.a(byteArrayInputStream, null);
                        String string = byteArrayOutputStream.toString();
                        t.e(string, "result.toString()");
                        return string;
                    }
                    byteArrayOutputStream.write(bArr2, 0, i10);
                    try {
                        throw th;
                    } catch (Throwable th) {
                        fd.b.a(byteArrayInputStream, th);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    fd.b.a(gZIPInputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    public static final void write$Self(BidPayload self, ie.d output, f serialDesc) {
        String decodedAdsResponse;
        boolean z10;
        t.f(self, "self");
        t.f(output, "output");
        t.f(serialDesc, "serialDesc");
        if (output.w(serialDesc, 0) || self.version != null) {
            output.o(serialDesc, 0, u0.f21014a, self.version);
        }
        if (output.w(serialDesc, 1) || self.adunit != null) {
            output.o(serialDesc, 1, v2.f21024a, self.adunit);
        }
        if (output.w(serialDesc, 2) || self.impression != null) {
            output.o(serialDesc, 2, new je.f(v2.f21024a), self.impression);
        }
        if (!output.w(serialDesc, 3)) {
            AdPayload adPayload = self.f13072ad;
            AdPayload adPayload2 = null;
            if (self.adunit != null && (decodedAdsResponse = self.getDecodedAdsResponse()) != null) {
                b bVar = self.json;
                d<Object> dVarB = fe.u.b(bVar.a(), i0.j(AdPayload.class));
                t.d(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                adPayload2 = (AdPayload) bVar.c(dVarB, decodedAdsResponse);
            }
            z10 = t.a(adPayload, adPayload2) ? false : true;
        }
        if (z10) {
            output.o(serialDesc, 3, AdPayload$$serializer.INSTANCE, self.f13072ad);
        }
    }

    public final Integer component1() {
        return this.version;
    }

    public final String component2() {
        return this.adunit;
    }

    public final List<String> component3() {
        return this.impression;
    }

    public final BidPayload copy(Integer num, String str, List<String> list) {
        return new BidPayload(num, str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BidPayload)) {
            return false;
        }
        BidPayload bidPayload = (BidPayload) obj;
        return t.a(this.version, bidPayload.version) && t.a(this.adunit, bidPayload.adunit) && t.a(this.impression, bidPayload.impression);
    }

    public final AdPayload getAdPayload() {
        return this.f13072ad;
    }

    public final String getAdunit() {
        return this.adunit;
    }

    public final String getCreativeId() {
        AdPayload adPayload = this.f13072ad;
        if (adPayload != null) {
            return adPayload.getCreativeId();
        }
        return null;
    }

    public final String getDecodedAdsResponse() throws Throwable {
        byte[] bArrDecode = Base64.decode(this.adunit, 0);
        if (bArrDecode != null) {
            return gzipDecode(bArrDecode);
        }
        return null;
    }

    public final String getEventId() {
        AdPayload adPayload = this.f13072ad;
        if (adPayload != null) {
            return adPayload.eventId();
        }
        return null;
    }

    public final List<String> getImpression() {
        return this.impression;
    }

    public final String getPlacementId() {
        AdPayload adPayload = this.f13072ad;
        if (adPayload != null) {
            return adPayload.placementId();
        }
        return null;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        Integer num = this.version;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.adunit;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.impression;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "BidPayload(version=" + this.version + ", adunit=" + this.adunit + ", impression=" + this.impression + ')';
    }

    public /* synthetic */ BidPayload(int i10, Integer num, String str, List list, AdPayload adPayload, q2 q2Var) {
        String decodedAdsResponse;
        if ((i10 & 0) != 0) {
            b2.a(i10, 0, BidPayload$$serializer.INSTANCE.getDescriptor());
        }
        AdPayload adPayload2 = null;
        if ((i10 & 1) == 0) {
            this.version = null;
        } else {
            this.version = num;
        }
        if ((i10 & 2) == 0) {
            this.adunit = null;
        } else {
            this.adunit = str;
        }
        if ((i10 & 4) == 0) {
            this.impression = null;
        } else {
            this.impression = list;
        }
        b bVarB = v.b(null, AnonymousClass1.INSTANCE, 1, null);
        this.json = bVarB;
        if ((i10 & 8) != 0) {
            this.f13072ad = adPayload;
            return;
        }
        if (this.adunit != null && (decodedAdsResponse = getDecodedAdsResponse()) != null) {
            d<Object> dVarB = fe.u.b(bVarB.a(), i0.j(AdPayload.class));
            t.d(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            adPayload2 = (AdPayload) bVarB.c(dVarB, decodedAdsResponse);
        }
        this.f13072ad = adPayload2;
    }

    public BidPayload(Integer num, String str, List<String> list) {
        String decodedAdsResponse;
        this.version = num;
        this.adunit = str;
        this.impression = list;
        AdPayload adPayload = null;
        b bVarB = v.b(null, BidPayload$json$1.INSTANCE, 1, null);
        this.json = bVarB;
        if (str != null && (decodedAdsResponse = getDecodedAdsResponse()) != null) {
            d<Object> dVarB = fe.u.b(bVarB.a(), i0.j(AdPayload.class));
            t.d(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            adPayload = (AdPayload) bVarB.c(dVarB, decodedAdsResponse);
        }
        this.f13072ad = adPayload;
    }

    private static /* synthetic */ void getJson$annotations() {
    }

    public /* synthetic */ BidPayload(Integer num, String str, List list, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : list);
    }
}
