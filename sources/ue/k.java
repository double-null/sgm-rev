package ue;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: PushObserver.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f27055a = a.f27057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f27056b = new a.C0446a();

    /* JADX INFO: compiled from: PushObserver.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f27057a = new a();

        /* JADX INFO: renamed from: ue.k$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PushObserver.kt */
        private static final class C0446a implements k {
            @Override // ue.k
            public boolean a(int i10, af.g source, int i11, boolean z10) throws IOException {
                t.f(source, "source");
                source.skip(i11);
                return true;
            }

            @Override // ue.k
            public void b(int i10, ue.a errorCode) {
                t.f(errorCode, "errorCode");
            }

            @Override // ue.k
            public boolean onHeaders(int i10, List<b> responseHeaders, boolean z10) {
                t.f(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // ue.k
            public boolean onRequest(int i10, List<b> requestHeaders) {
                t.f(requestHeaders, "requestHeaders");
                return true;
            }
        }

        private a() {
        }
    }

    boolean a(int i10, af.g gVar, int i11, boolean z10) throws IOException;

    void b(int i10, ue.a aVar);

    boolean onHeaders(int i10, List<b> list, boolean z10);

    boolean onRequest(int i10, List<b> list);
}
