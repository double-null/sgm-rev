package me;

import java.util.List;

/* JADX INFO: compiled from: CookieJar.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f22511a = a.f22513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f22512b = new a.C0370a();

    /* JADX INFO: compiled from: CookieJar.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f22513a = new a();

        /* JADX INFO: renamed from: me.n$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CookieJar.kt */
        private static final class C0370a implements n {
            @Override // me.n
            public void a(u url, List<m> cookies) {
                kotlin.jvm.internal.t.f(url, "url");
                kotlin.jvm.internal.t.f(cookies, "cookies");
            }

            @Override // me.n
            public List<m> b(u url) {
                kotlin.jvm.internal.t.f(url, "url");
                return kotlin.collections.t.k();
            }
        }

        private a() {
        }
    }

    void a(u uVar, List<m> list);

    List<m> b(u uVar);
}
