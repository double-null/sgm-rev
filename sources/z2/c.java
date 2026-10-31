package z2;

import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import e3.h0;
import e3.i0;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: CrashlyticsNativeComponentDeferredProxy.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements CrashlyticsNativeComponent {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final g f28927c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Deferred<CrashlyticsNativeComponent> f28928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<CrashlyticsNativeComponent> f28929b = new AtomicReference<>(null);

    /* JADX INFO: compiled from: CrashlyticsNativeComponentDeferredProxy.java */
    private static final class b implements g {
        private b() {
        }

        @Override // z2.g
        public File getAppFile() {
            return null;
        }

        @Override // z2.g
        public h0.a getApplicationExitInto() {
            return null;
        }

        @Override // z2.g
        public File getDeviceFile() {
            return null;
        }

        @Override // z2.g
        public File getMetadataFile() {
            return null;
        }

        @Override // z2.g
        public File getMinidumpFile() {
            return null;
        }

        @Override // z2.g
        public File getOsFile() {
            return null;
        }

        @Override // z2.g
        public File getSessionFile() {
            return null;
        }
    }

    public c(Deferred<CrashlyticsNativeComponent> deferred) {
        this.f28928a = deferred;
        deferred.a(new Deferred.a() { // from class: z2.a
            @Override // com.google.firebase.inject.Deferred.a
            public final void a(Provider provider) {
                this.f28922a.c(provider);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Provider provider) {
        f.f().b("Crashlytics native component now available.");
        this.f28929b.set((CrashlyticsNativeComponent) provider.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(String str, String str2, long j10, i0 i0Var, Provider provider) {
        ((CrashlyticsNativeComponent) provider.get()).prepareNativeSession(str, str2, j10, i0Var);
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public g getSessionFileProvider(String str) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.f28929b.get();
        return crashlyticsNativeComponent == null ? f28927c : crashlyticsNativeComponent.getSessionFileProvider(str);
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public boolean hasCrashDataForCurrentSession() {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.f28929b.get();
        return crashlyticsNativeComponent != null && crashlyticsNativeComponent.hasCrashDataForCurrentSession();
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public boolean hasCrashDataForSession(String str) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.f28929b.get();
        return crashlyticsNativeComponent != null && crashlyticsNativeComponent.hasCrashDataForSession(str);
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public void prepareNativeSession(final String str, final String str2, final long j10, final i0 i0Var) {
        f.f().i("Deferring native open session: " + str);
        this.f28928a.a(new Deferred.a() { // from class: z2.b
            @Override // com.google.firebase.inject.Deferred.a
            public final void a(Provider provider) {
                c.d(str, str2, j10, i0Var, provider);
            }
        });
    }
}
