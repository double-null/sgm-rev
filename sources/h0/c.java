package h0;

import android.content.Context;
import b2.Bo.yeILL;
import e0.k;
import id.l;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import ud.o0;

/* JADX INFO: compiled from: PreferenceDataStoreDelegate.android.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements ld.a<Context, k<i0.f>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f0.b<i0.f> f15558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l<Context, List<e0.i<i0.f>>> f15559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o0 f15560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f15561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile k<i0.f> f15562f;

    /* JADX INFO: compiled from: PreferenceDataStoreDelegate.android.kt */
    /* JADX INFO: loaded from: classes.dex */
    static final class a extends u implements id.a<File> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f15563d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ c f15564e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, c cVar) {
            super(0);
            this.f15563d = context;
            this.f15564e = cVar;
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            Context applicationContext = this.f15563d;
            t.e(applicationContext, "applicationContext");
            return b.a(applicationContext, this.f15564e.f15557a);
        }
    }

    @Override // ld.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public k<i0.f> a(Context thisRef, pd.h<?> property) {
        k<i0.f> kVar;
        t.f(thisRef, "thisRef");
        t.f(property, "property");
        k<i0.f> kVar2 = this.f15562f;
        if (kVar2 != null) {
            return kVar2;
        }
        synchronized (this.f15561e) {
            if (this.f15562f == null) {
                Context applicationContext = thisRef.getApplicationContext();
                i0.e eVar = i0.e.f15877a;
                f0.b<i0.f> bVar = this.f15558b;
                l<Context, List<e0.i<i0.f>>> lVar = this.f15559c;
                t.e(applicationContext, "applicationContext");
                this.f15562f = eVar.b(bVar, lVar.invoke(applicationContext), this.f15560d, new a(applicationContext, this));
            }
            kVar = this.f15562f;
            t.c(kVar);
        }
        return kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(String str, f0.b<i0.f> bVar, l<? super Context, ? extends List<? extends e0.i<i0.f>>> produceMigrations, o0 scope) {
        t.f(str, yeILL.iqRVJCTCxybb);
        t.f(produceMigrations, "produceMigrations");
        t.f(scope, "scope");
        this.f15557a = str;
        this.f15558b = bVar;
        this.f15559c = produceMigrations;
        this.f15560d = scope;
        this.f15561e = new Object();
    }
}
