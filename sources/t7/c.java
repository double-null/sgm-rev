package t7;

import a5.m;
import android.content.Context;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import io.bidmachine.BuildConfig;
import io.bidmachine.ExtraParamsManager;
import io.bidmachine.ProtoExtConstants;
import io.bidmachine.core.h;
import io.bidmachine.protobuf.sdk.SDK;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: OMSDKSettings.java */
/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicBoolean f25592a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f25593b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static m f25594c;

    /* JADX INFO: compiled from: OMSDKSettings.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f25595a;

        a(Context context) {
            this.f25595a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (z4.a.b()) {
                    return;
                }
                z4.a.a(this.f25595a);
                z4.a.c();
                m unused = c.f25594c = m.a("Appodeal", BuildConfig.OMSDK_VERSION_NAME);
                c.f25593b.set(true);
            } catch (Throwable th) {
                io.bidmachine.core.a.o(th);
            }
        }
    }

    public static void c(SDK.Builder builder) {
        builder.setOmidpn("Appodeal");
        builder.setOmidpv(BuildConfig.OMSDK_VERSION_NAME);
    }

    public static void d(Struct.Builder builder) {
        builder.putFields(ProtoExtConstants.Source.OMID_PN, Value.newBuilder().setStringValue("Appodeal").build());
        builder.putFields(ProtoExtConstants.Source.OMID_PV, Value.newBuilder().setStringValue(BuildConfig.OMSDK_VERSION_NAME).build());
    }

    public static m e() {
        return f25594c;
    }

    public static void f(Context context) {
        if (f25592a.compareAndSet(false, true)) {
            Context applicationContext = context.getApplicationContext();
            if (ExtraParamsManager.get().getInternalDataRetriever(applicationContext).l("omsdk_disabled", false)) {
                return;
            }
            h.S(new a(applicationContext));
        }
    }

    public static boolean g() {
        return f25593b.get();
    }
}
