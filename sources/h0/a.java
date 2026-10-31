package h0;

import android.content.Context;
import e0.k;
import id.l;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import ud.e1;
import ud.o0;
import ud.p0;
import ud.t2;

/* JADX INFO: compiled from: PreferenceDataStoreDelegate.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: h0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PreferenceDataStoreDelegate.android.kt */
    public static final class C0236a extends u implements l<Context, List<? extends e0.i<i0.f>>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0236a f15556d = new C0236a();

        C0236a() {
            super(1);
        }

        @Override // id.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List<e0.i<i0.f>> invoke(Context it) {
            t.f(it, "it");
            return kotlin.collections.t.k();
        }
    }

    public static final ld.a<Context, k<i0.f>> a(String name, f0.b<i0.f> bVar, l<? super Context, ? extends List<? extends e0.i<i0.f>>> produceMigrations, o0 scope) {
        t.f(name, "name");
        t.f(produceMigrations, "produceMigrations");
        t.f(scope, "scope");
        return new c(name, bVar, produceMigrations, scope);
    }

    public static /* synthetic */ ld.a b(String str, f0.b bVar, l lVar, o0 o0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        if ((i10 & 4) != 0) {
            lVar = C0236a.f15556d;
        }
        if ((i10 & 8) != 0) {
            o0Var = p0.a(e1.b().z(t2.b(null, 1, null)));
        }
        return a(str, bVar, lVar, o0Var);
    }
}
