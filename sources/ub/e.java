package ub;

import com.explorestack.protobuf.Struct;
import io.bidmachine.AdsType;
import io.bidmachine.ApiRequest;
import io.bidmachine.TrackEventType;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.protobuf.analytics.events.SDKEvent;
import io.bidmachine.protobuf.sdk.Error;
import kotlin.jvm.internal.t;
import oc.m;

/* JADX INFO: compiled from: EventTrackerImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AdExtension.EventConfiguration f26698a;

    public e() {
        this(null);
    }

    private final Error.Data j(oc.a aVar) {
        Error.Data dataBuild = Error.Data.newBuilder().setCode(aVar.e()).setDescription(aVar.g()).build();
        t.e(dataBuild, "newBuilder()\n           …age)\n            .build()");
        return dataBuild;
    }

    private final boolean k(AdExtension.EventConfiguration eventConfiguration, final int i10, boolean z10, long j10, long j11, AdsType adsType, String str, Double d10, Struct struct, final oc.a aVar) {
        if (eventConfiguration != null) {
            try {
                if (eventConfiguration.getActionsList().contains(Integer.valueOf(i10))) {
                    String url = eventConfiguration.getUrl();
                    if (url == null || url.length() == 0) {
                        return false;
                    }
                    if (aVar == null) {
                        io.bidmachine.core.a.d(new qc.b() { // from class: ub.c
                            @Override // qc.b
                            public final Object get() {
                                return e.l(i10);
                            }
                        });
                    } else {
                        io.bidmachine.core.a.d(new qc.b() { // from class: ub.d
                            @Override // qc.b
                            public final Object get() {
                                return e.m(i10, aVar);
                            }
                        });
                    }
                    SDKEvent.Builder finishTime = SDKEvent.newBuilder().setAction(i10).setBillable(z10).setContext(eventConfiguration.getContext()).setStartTime(oc.h.p(j10)).setFinishTime(oc.h.p(j11));
                    if (adsType != null) {
                        finishTime.setAdType(m.r(adsType.name()));
                    }
                    if (!(str == null || str.length() == 0)) {
                        finishTime.setNetwork(m.r(str));
                    }
                    if (d10 != null) {
                        finishTime.setPrice(d10.doubleValue());
                    }
                    if (struct != null) {
                        finishTime.setCustomParams(struct);
                    }
                    if (aVar != null) {
                        Error.Builder error = Error.newBuilder().setError(j(aVar));
                        t.e(error, "newBuilder()\n           …or(bmError.toErrorData())");
                        oc.a aVarF = aVar.f();
                        if (aVarF != null) {
                            error.setReason(j(aVarF));
                        }
                        finishTime.setError(error);
                    }
                    new ApiRequest.Builder().url(url).setMethod(io.bidmachine.core.b.e.Post).setDataBinder(new ApiRequest.ApiEventDataBinder()).setRequestData(finishTime.build()).request();
                    return true;
                }
            } catch (Throwable th) {
                io.bidmachine.core.a.o(th);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String l(int i10) {
        return "Sending event to server - " + i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String m(int i10, oc.a aVar) {
        return "Sending error event to server - " + i10 + ", error - " + aVar;
    }

    @Override // ub.b
    public void d(k trackingObject, TrackEventType trackEventType, j jVar, AdsType adsType, oc.a aVar, a aVar2) {
        long jA;
        long jB;
        String strD;
        Double dE;
        Struct structC;
        boolean zF;
        t.f(trackingObject, "trackingObject");
        t.f(trackEventType, "trackEventType");
        if (aVar == null || aVar.j()) {
            if (jVar != null) {
                jA = jVar.c();
                jB = jVar.b();
            } else {
                jA = io.bidmachine.core.c.a();
                jB = jA;
            }
            if (aVar2 != null) {
                zF = aVar2.f();
                strD = aVar2.d();
                dE = aVar2.e();
                structC = aVar2.c();
            } else {
                strD = null;
                dE = null;
                structC = null;
                zF = false;
            }
            int actionValue = trackEventType.getActionValue();
            if (k(trackingObject.getEventConfiguration(), actionValue, zF, jA, jB, adsType, strD, dE, structC, aVar)) {
                return;
            }
            k(this.f26698a, actionValue, zF, jA, jB, adsType, strD, dE, structC, aVar);
        }
    }

    public final void i(AdExtension.EventConfiguration eventConfiguration) {
        if (eventConfiguration == AdExtension.EventConfiguration.getDefaultInstance()) {
            eventConfiguration = null;
        }
        this.f26698a = eventConfiguration;
    }

    public e(AdExtension.EventConfiguration eventConfiguration) {
        i(eventConfiguration);
    }
}
