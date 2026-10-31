package io.bidmachine;

import android.content.Context;
import android.text.TextUtils;
import com.explorestack.protobuf.ListValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.adcom.ConnectionType;
import com.explorestack.protobuf.adcom.DeviceType;
import com.explorestack.protobuf.adcom.OS;
import io.bidmachine.protobuf.InitRequest;
import io.bidmachine.protobuf.InitResponse;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: InitialRequest.java */
/* JADX INFO: loaded from: classes4.dex */
class y3 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f20490k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f20491l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f20492m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20494b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Queue<String> f20497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Queue<String> f20498f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f20499g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ApiRequest<InitRequest, InitResponse> f20500h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p7.b f20502j;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f20501i = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ub.k f20495c = new BidMachineTrackingObject();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f20496d = new b(this);

    /* JADX INFO: compiled from: InitialRequest.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: io.bidmachine.y3$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: InitialRequest.java */
        class C0333a implements io.bidmachine.core.b.InterfaceC0315b<InitResponse, oc.a> {
            C0333a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ String c(long j10) {
                return String.format("reschedule init request (%s)", Long.valueOf(j10));
            }

            @Override // io.bidmachine.core.b.InterfaceC0315b
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void a(oc.a aVar) {
                final long jK;
                y3.this.f20500h = null;
                if (y3.this.f20498f.isEmpty()) {
                    jK = y3.this.k();
                    io.bidmachine.core.a.d(new qc.b() { // from class: io.bidmachine.x3
                        @Override // qc.b
                        public final Object get() {
                            return y3.a.C0333a.c(jK);
                        }
                    });
                    if (y3.this.f20499g != null) {
                        y3.this.f20499g.a(aVar);
                    }
                } else {
                    jK = 0;
                }
                io.bidmachine.core.h.R(y3.this.f20496d, jK);
                y3.this.f20495c.eventFinish(TrackEventType.InitLoading, null, null, aVar);
            }

            @Override // io.bidmachine.core.b.InterfaceC0315b
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(InitResponse initResponse) {
                y3.this.f20500h = null;
                y3.this.f20501i = 0L;
                io.bidmachine.core.h.f(y3.this.f20496d);
                if (y3.this.f20499g != null) {
                    y3.this.f20499g.onSuccess(initResponse);
                }
                y3.this.f20495c.eventFinish(TrackEventType.InitLoading, null, null, null);
                y3.this.f20502j.a();
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y3.this.f20500h = new ApiRequest.Builder().url(y3.this.r()).setDataBinder(new ApiRequest.ApiInitDataBinder()).setRequestData(y3.this.m()).setCallback(new C0333a()).request();
        }
    }

    /* JADX INFO: compiled from: InitialRequest.java */
    private static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<y3> f20505a;

        public b(y3 y3Var) {
            this.f20505a = new WeakReference<>(y3Var);
        }

        @Override // java.lang.Runnable
        public void run() {
            y3 y3Var = this.f20505a.get();
            if (y3Var != null) {
                y3Var.s();
            }
        }
    }

    /* JADX INFO: compiled from: InitialRequest.java */
    interface c extends io.bidmachine.core.b.InterfaceC0315b<InitResponse, oc.a> {
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f20490k = timeUnit.toMillis(2L);
        f20491l = timeUnit.toMillis(128L);
        f20492m = TimeUnit.DAYS.toMillis(7L);
    }

    public y3(Context context, String str, Queue<String> queue) {
        this.f20493a = context;
        this.f20494b = str;
        this.f20497e = new LinkedList(queue);
        this.f20498f = new LinkedList(queue);
        this.f20502j = new p7.b(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long k() {
        long j10 = this.f20501i;
        if (j10 <= 0) {
            this.f20501i = f20490k;
        } else {
            long j11 = j10 * 2;
            this.f20501i = j11;
            long j12 = f20491l;
            if (j11 >= j12) {
                this.f20501i = j12;
            }
        }
        return this.f20501i;
    }

    private Struct l(Context context) {
        Struct.Builder builderNewBuilder = Struct.newBuilder();
        builderNewBuilder.putFields("networks_info", Value.newBuilder().setListValue(n(context)).build());
        return builderNewBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InitRequest m() throws Throwable {
        ConnectionType connectionType;
        AdvertisingDataManager.d(this.f20493a);
        b2 b2VarE = b2.e();
        w5 w5VarW = b2VarE.w();
        TargetingParams targetingParamsU = b2VarE.u();
        InitRequest.Builder builderNewBuilder = InitRequest.newBuilder();
        String packageName = this.f20493a.getPackageName();
        if (packageName != null) {
            builderNewBuilder.setBundle(packageName);
        }
        builderNewBuilder.setSellerId(this.f20494b);
        builderNewBuilder.setOs(OS.OS_ANDROID);
        builderNewBuilder.setOsv(oc.d.h());
        String strR = io.bidmachine.core.h.r(this.f20493a);
        if (strR != null) {
            builderNewBuilder.setAppVer(strR);
        }
        builderNewBuilder.setSdk(BidMachine.NAME);
        builderNewBuilder.setSdkver("3.6.1");
        builderNewBuilder.setIfa(AdvertisingDataManager.a(this.f20493a, !w5VarW.a()));
        String strJ = b2VarE.j();
        if (!TextUtils.isEmpty(strJ)) {
            builderNewBuilder.setIfv(strJ);
        }
        builderNewBuilder.setBmIfv(b2VarE.K(this.f20493a));
        builderNewBuilder.setSessionId(SessionManager.get().getSessionId());
        DeviceInfo deviceInfoObtain = DeviceInfo.obtain(this.f20493a);
        String str = deviceInfoObtain.manufacturer;
        if (str != null) {
            builderNewBuilder.setMake(str);
        }
        String str2 = deviceInfoObtain.model;
        if (str2 != null) {
            builderNewBuilder.setModel(str2);
        }
        String hwv = deviceInfoObtain.getHWV();
        if (hwv != null) {
            builderNewBuilder.setHwv(hwv);
        }
        builderNewBuilder.setDeviceType(deviceInfoObtain.isTablet ? DeviceType.DEVICE_TYPE_TABLET : DeviceType.DEVICE_TYPE_PHONE_DEVICE);
        if (w5VarW.c()) {
            ConnectionType connectionTypeB = oc.d.b(this.f20493a);
            builderNewBuilder.setContype(connectionTypeB);
            connectionType = connectionTypeB;
        } else {
            connectionType = null;
        }
        if (w5VarW.b()) {
            com.explorestack.protobuf.adcom.Context.Geo.Builder builderC = oc.h.c(this.f20493a, targetingParamsU.getDeviceLocation(), null, true);
            targetingParamsU.build(builderC);
            builderNewBuilder.setGeo(builderC);
        }
        builderNewBuilder.setContext(RequestDataRetriever.collectContext(this.f20493a, b2VarE, w5VarW, targetingParamsU, connectionType, null));
        builderNewBuilder.setAndroid(p(this.f20493a));
        builderNewBuilder.setExt(l(this.f20493a));
        return builderNewBuilder.build();
    }

    private ListValue.Builder n(Context context) {
        ListValue.Builder builderNewBuilder = ListValue.newBuilder();
        for (h4 h4Var : g4.e(context).values()) {
            builderNewBuilder.addValues(o(h4Var.c(), h4Var.d(), h4Var.a()));
        }
        builderNewBuilder.addValues(o("mraid", "3.6.1", "3.6.1.1"));
        builderNewBuilder.addValues(o("vast", "3.6.1", "3.6.1.1"));
        builderNewBuilder.addValues(o("nast", "1.0", "3.6.1.1"));
        builderNewBuilder.addValues(o("adaptive_rendering", "3.6.1", "3.6.1.1"));
        return builderNewBuilder;
    }

    private Value o(String str, String str2, String str3) {
        Value valueBuild = Value.newBuilder().setStringValue(str).build();
        Value valueBuild2 = Value.newBuilder().setStringValue(str2).build();
        return Value.newBuilder().setStructValue(Struct.newBuilder().putFields("network", valueBuild).putFields("network_version", valueBuild2).putFields("network_adapter_version", Value.newBuilder().setStringValue(str3).build()).build()).build();
    }

    private InitRequest.AndroidPlatformData p(Context context) {
        PlatformData platformData = PlatformData.get(context);
        final InitRequest.AndroidPlatformData.Builder builderNewBuilder = InitRequest.AndroidPlatformData.newBuilder();
        Integer minSdkVersion = platformData.getMinSdkVersion();
        Objects.requireNonNull(builderNewBuilder);
        io.bidmachine.core.h.B(minSdkVersion, new Executable() { // from class: io.bidmachine.v3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builderNewBuilder.setMinApiLevel(((Integer) obj).intValue());
            }
        });
        io.bidmachine.core.h.B(platformData.kotlinVersion, new Executable() { // from class: io.bidmachine.w3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builderNewBuilder.setKotlinVersion((String) obj);
            }
        });
        for (p7.a aVar : this.f20502j.b(io.bidmachine.core.c.a() - f20492m)) {
            builderNewBuilder.addContentProviderStartupMetrics(InitRequest.AndroidPlatformData.ContentProviderStartupMetrics.newBuilder().setStartInitTime(oc.h.p(aVar.b())).setInitDuration(aVar.a()).setInitCompleted(aVar.c()).build());
        }
        return builderNewBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String r() {
        if (this.f20498f.isEmpty()) {
            this.f20498f.addAll(this.f20497e);
        }
        return this.f20498f.poll();
    }

    void q() {
        this.f20499g = null;
        this.f20500h = null;
    }

    void s() {
        this.f20495c.eventStart(TrackEventType.InitLoading, null);
        io.bidmachine.core.h.Q(new a());
    }

    void t(c cVar) {
        this.f20499g = cVar;
    }
}
