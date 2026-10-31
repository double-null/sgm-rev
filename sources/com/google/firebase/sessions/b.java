package com.google.firebase.sessions;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import b2.i;
import b4.a1;
import b4.b1;
import b4.h0;
import b4.l0;
import b4.u0;
import b4.y0;
import b4.z0;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import e0.a0;
import e0.g0;
import e0.k;
import e0.l;
import e4.h;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.util.List;
import kotlin.collections.t;
import ud.o0;
import ud.p0;
import zc.j;

/* JADX INFO: compiled from: FirebaseSessionsComponent.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface b {

    /* JADX INFO: compiled from: FirebaseSessionsComponent.kt */
    public interface a {
        a a(FirebaseInstallationsApi firebaseInstallationsApi);

        a b(Provider<i> provider);

        b build();

        a c(FirebaseApp firebaseApp);

        a d(@w2.a j jVar);

        a e(Context context);

        a f(@w2.b j jVar);
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FirebaseSessionsComponent.kt */
    public interface InterfaceC0154b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f12321a = a.f12322a;

        /* JADX INFO: renamed from: com.google.firebase.sessions.b$b$a */
        /* JADX INFO: compiled from: FirebaseSessionsComponent.kt */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final /* synthetic */ a f12322a = new a();

            private a() {
            }

            private final <T> k<T> f(g0<T> g0Var, f0.b<T> bVar, List<? extends e0.i<T>> list, o0 o0Var, id.a<? extends File> aVar) {
                return h() ? a0.f13550a.a(g0Var, bVar, list, o0Var, aVar) : l.f13625a.a(g0Var, bVar, list, o0Var, aVar);
            }

            static /* synthetic */ k g(a aVar, g0 g0Var, f0.b bVar, List list, o0 o0Var, id.a aVar2, int i10, Object obj) {
                if ((i10 & 4) != 0) {
                    list = t.k();
                }
                return aVar.f(g0Var, bVar, list, o0Var, aVar2);
            }

            private final boolean h() {
                try {
                    System.loadLibrary("datastore_shared_counter");
                    return true;
                } catch (SecurityException | UnsatisfiedLinkError unused) {
                    return false;
                }
            }

            private final void i(File file) throws IOException {
                File parentFile = file.getParentFile();
                if (parentFile == null) {
                    return;
                }
                if (parentFile.exists() && !parentFile.isDirectory() && kotlin.jvm.internal.t.a(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
                    throw new IOException("Failed to delete conflicting file: " + parentFile);
                }
                if (parentFile.isDirectory()) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    try {
                        Files.createDirectories(parentFile.toPath(), new FileAttribute[0]);
                        return;
                    } catch (Exception e10) {
                        throw new IOException("Failed to create directory: " + parentFile, e10);
                    }
                }
                if (parentFile.mkdirs() || parentFile.isDirectory()) {
                    return;
                }
                throw new IOException("Failed to create directory: " + parentFile);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final h k(CorruptionException ex) {
                kotlin.jvm.internal.t.f(ex, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", ex);
                return e4.i.f14430a.getDefaultValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final File l(Context context) throws IOException {
                File fileA = d0.a.a(context, "firebaseSessions/sessionConfigsDataStore.data");
                f12322a.i(fileA);
                return fileA;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final b4.g0 n(h0 h0Var, CorruptionException ex) {
                kotlin.jvm.internal.t.f(ex, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session data DataStore", ex);
                return h0Var.getDefaultValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final File o(Context context) throws IOException {
                File fileA = d0.a.a(context, "firebaseSessions/sessionDataStore.data");
                f12322a.i(fileA);
                return fileA;
            }

            public final b4.b e(FirebaseApp firebaseApp) {
                kotlin.jvm.internal.t.f(firebaseApp, "firebaseApp");
                return l0.f3972a.b(firebaseApp);
            }

            public final k<h> j(final Context appContext, @w2.b j blockingDispatcher) {
                kotlin.jvm.internal.t.f(appContext, "appContext");
                kotlin.jvm.internal.t.f(blockingDispatcher, "blockingDispatcher");
                return g(this, e4.i.f14430a, new f0.b(new id.l() { // from class: b4.p
                    @Override // id.l
                    public final Object invoke(Object obj) {
                        return com.google.firebase.sessions.b.InterfaceC0154b.a.k((CorruptionException) obj);
                    }
                }), null, p0.a(blockingDispatcher), new id.a() { // from class: b4.q
                    @Override // id.a
                    public final Object invoke() {
                        return com.google.firebase.sessions.b.InterfaceC0154b.a.l(appContext);
                    }
                }, 4, null);
            }

            public final k<b4.g0> m(final Context appContext, @w2.b j blockingDispatcher, final h0 sessionDataSerializer) {
                kotlin.jvm.internal.t.f(appContext, "appContext");
                kotlin.jvm.internal.t.f(blockingDispatcher, "blockingDispatcher");
                kotlin.jvm.internal.t.f(sessionDataSerializer, "sessionDataSerializer");
                return g(this, sessionDataSerializer, new f0.b(new id.l() { // from class: b4.n
                    @Override // id.l
                    public final Object invoke(Object obj) {
                        return com.google.firebase.sessions.b.InterfaceC0154b.a.n(sessionDataSerializer, (CorruptionException) obj);
                    }
                }), null, p0.a(blockingDispatcher), new id.a() { // from class: b4.o
                    @Override // id.a
                    public final Object invoke() {
                        return com.google.firebase.sessions.b.InterfaceC0154b.a.o(appContext);
                    }
                }, 4, null);
            }

            public final y0 p() {
                return z0.f4090a;
            }

            public final a1 q() {
                return b1.f3885a;
            }
        }
    }

    u0 a();

    b4.l b();
}
