package io.bidmachine;

import android.content.Context;
import com.applovin.sdk.AppLovinEventTypes;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.BoolValue;
import io.bidmachine.analytics.BidMachineAnalytics;
import io.bidmachine.protobuf.RequestTokenPayload;
import io.bidmachine.protobuf.sdk.ContextualData;
import io.bidmachine.protobuf.sdk.Session;
import java.util.Date;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: SessionParams.java */
/* JADX INFO: loaded from: classes4.dex */
final class q5 {

    /* JADX INFO: compiled from: SessionParams.java */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20396a;

        static {
            int[] iArr = new int[AdsType.values().length];
            f20396a = iArr;
            try {
                iArr[AdsType.Banner.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20396a[AdsType.Interstitial.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20396a[AdsType.Rewarded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20396a[AdsType.Native.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    q5() {
    }

    private ContextualData.Builder j(AdsType adsType, String str, Map<String, Object> map) {
        try {
            final ContextualData.Builder mediatorName = ContextualData.newBuilder().setMediatorName(str);
            io.bidmachine.core.h.B(adsType, new Executable() { // from class: io.bidmachine.k5
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    q5.o(mediatorName, (AdsType) obj);
                }
            });
            ContextualData.ImpressionData.Builder builderK = k(map);
            Objects.requireNonNull(mediatorName);
            io.bidmachine.core.h.B(builderK, new Executable() { // from class: io.bidmachine.l5
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    mediatorName.setData((ContextualData.ImpressionData.Builder) obj);
                }
            });
            return mediatorName;
        } catch (Throwable unused) {
            return null;
        }
    }

    private ContextualData.ImpressionData.Builder k(Map<String, Object> map) {
        try {
            final ContextualData.ImpressionData.Builder builderNewBuilder = ContextualData.ImpressionData.newBuilder();
            Integer numJ = io.bidmachine.core.h.j(map.get("imimd"), null);
            Objects.requireNonNull(builderNewBuilder);
            io.bidmachine.core.h.B(numJ, new Executable() { // from class: io.bidmachine.m5
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builderNewBuilder.setImimd(((Integer) obj).intValue());
                }
            });
            io.bidmachine.core.h.B(io.bidmachine.core.h.j(map.get("imd"), null), new Executable() { // from class: io.bidmachine.n5
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builderNewBuilder.setImd(((Integer) obj).intValue());
                }
            });
            io.bidmachine.core.h.B(io.bidmachine.core.h.i(map.get("imwp"), null), new Executable() { // from class: io.bidmachine.o5
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builderNewBuilder.setImwp(((Float) obj).floatValue());
                }
            });
            io.bidmachine.core.h.B(io.bidmachine.core.h.i(map.get("wp"), null), new Executable() { // from class: io.bidmachine.p5
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builderNewBuilder.setWp(((Float) obj).floatValue());
                }
            });
            io.bidmachine.core.h.B(map.get("imagency"), new Executable() { // from class: io.bidmachine.d5
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    q5.p(builderNewBuilder, obj);
                }
            });
            io.bidmachine.core.h.B(map.get("agency"), new Executable() { // from class: io.bidmachine.e5
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    q5.q(builderNewBuilder, obj);
                }
            });
            io.bidmachine.core.h.B(map.get("imcurl"), new Executable() { // from class: io.bidmachine.f5
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    q5.r(builderNewBuilder, obj);
                }
            });
            io.bidmachine.core.h.B(map.get("clcurl"), new Executable() { // from class: io.bidmachine.g5
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    q5.s(builderNewBuilder, obj);
                }
            });
            return builderNewBuilder;
        } catch (Throwable unused) {
            return null;
        }
    }

    private Session.Builder l(Context context, AdsType adsType) {
        try {
            final Session.Builder sessionId = Session.newBuilder().setSessionId(SessionManager.get().getSessionId());
            Session.Context.Builder builderM = m(context, adsType);
            Objects.requireNonNull(sessionId);
            io.bidmachine.core.h.B(builderM, new Executable() { // from class: io.bidmachine.c5
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    sessionId.setContext((Session.Context.Builder) obj);
                }
            });
            return sessionId;
        } catch (Throwable unused) {
            return null;
        }
    }

    private Session.Context.Builder m(Context context, AdsType adsType) {
        try {
            Date date = new Date(f2.D(context));
            SessionManager sessionManager = SessionManager.get();
            final Session.Context.Builder retention = Session.Context.newBuilder().setSessionduration(sessionManager.getSessionDurationSec()).setLastSessionDuration(sessionManager.getLastSessionDurationSec()).setSc(SessionManager.get().getSessionCount()).setRetention(tc.a.c(date, new Date(io.bidmachine.core.c.a())));
            for (Map.Entry<String, Map<String, Object>> entry : BidMachineAnalytics.getImpData(n(adsType)).entrySet()) {
                Map<String, Object> value = entry.getValue();
                if (!value.isEmpty()) {
                    ContextualData.Builder builderJ = j(adsType, entry.getKey(), value);
                    Objects.requireNonNull(retention);
                    io.bidmachine.core.h.B(builderJ, new Executable() { // from class: io.bidmachine.h5
                        @Override // io.bidmachine.Executable
                        public final void execute(Object obj) {
                            retention.addData((ContextualData.Builder) obj);
                        }
                    });
                }
            }
            io.bidmachine.core.h.B(BidMachineAnalytics.getProperty(AppLovinEventTypes.USER_COMPLETED_IN_APP_PURCHASE), new Executable() { // from class: io.bidmachine.i5
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    q5.t(retention, obj);
                }
            });
            io.bidmachine.core.h.B(BidMachineAnalytics.getProperty("iaa"), new Executable() { // from class: io.bidmachine.j5
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    q5.u(retention, obj);
                }
            });
            return retention;
        } catch (Throwable unused) {
            return null;
        }
    }

    private int n(AdsType adsType) {
        if (adsType == null) {
            return 0;
        }
        int i10 = a.f20396a[adsType.ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                i11 = 3;
                if (i10 != 3) {
                    i11 = 4;
                    if (i10 != 4) {
                        return 0;
                    }
                }
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o(ContextualData.Builder builder, AdsType adsType) {
        builder.setPlacement(adsType.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p(ContextualData.ImpressionData.Builder builder, Object obj) {
        builder.setImagency(obj.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(ContextualData.ImpressionData.Builder builder, Object obj) {
        builder.setAgency(obj.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(ContextualData.ImpressionData.Builder builder, Object obj) {
        builder.setImcurl(obj.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s(ContextualData.ImpressionData.Builder builder, Object obj) {
        builder.setClcurl(obj.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t(Session.Context.Builder builder, Object obj) {
        if (obj instanceof Boolean) {
            builder.setIap(BoolValue.of(((Boolean) obj).booleanValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u(Session.Context.Builder builder, Object obj) {
        if (obj instanceof Boolean) {
            builder.setIaa(BoolValue.of(((Boolean) obj).booleanValue()));
        }
    }

    void h(Context context, com.explorestack.protobuf.adcom.Context.User.Builder builder, AdsType adsType) {
        Session.Builder builderL = l(context, adsType);
        if (builderL != null) {
            builder.addExtProto(Any.pack(builderL.build()));
        }
    }

    void i(Context context, RequestTokenPayload.Builder builder, AdsType adsType) {
        Session.Builder builderL = l(context, adsType);
        if (builderL != null) {
            builder.setSession(builderL);
        }
    }
}
