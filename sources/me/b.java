package me;

import java.io.IOException;

/* JADX INFO: compiled from: Authenticator.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f22291a = a.f22294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f22292b = new a.C0367a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f22293c = new oe.a(null, 1, null);

    /* JADX INFO: compiled from: Authenticator.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f22294a = new a();

        /* JADX INFO: renamed from: me.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Authenticator.kt */
        private static final class C0367a implements b {
            @Override // me.b
            public z a(d0 d0Var, b0 response) {
                kotlin.jvm.internal.t.f(response, "response");
                return null;
            }
        }

        private a() {
        }
    }

    z a(d0 d0Var, b0 b0Var) throws IOException;
}
