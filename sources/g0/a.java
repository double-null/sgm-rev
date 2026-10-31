package g0;

import android.content.Context;
import android.content.SharedPreferences;
import e0.i;
import id.p;
import id.q;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import wc.g0;
import wc.k;
import wc.m;
import wc.s;
import zc.f;

/* JADX INFO: compiled from: SharedPreferencesMigration.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a<T> implements i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p<T, f<? super Boolean>, Object> f15241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q<g0.c, T, f<? super T>, Object> f15242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f15243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f15244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f15245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set<String> f15246f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: g0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SharedPreferencesMigration.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.migrations.SharedPreferencesMigration$3", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
    public static final class C0226a extends l implements p<T, f<? super Boolean>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f15247h;

        C0226a(f<? super C0226a> fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final f<g0> create(Object obj, f<?> fVar) {
            return new C0226a(fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T t10, f<? super Boolean> fVar) {
            return ((C0226a) create(t10, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ad.d.f();
            if (this.f15247h != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(true);
        }
    }

    /* JADX INFO: compiled from: SharedPreferencesMigration.android.kt */
    static final class b extends u implements id.a<SharedPreferences> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f15248d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f15249e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, String str) {
            super(0);
            this.f15248d = context;
            this.f15249e = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // id.a
        public final SharedPreferences invoke() {
            SharedPreferences sharedPreferences = this.f15248d.getSharedPreferences(this.f15249e, 0);
            t.e(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
            return sharedPreferences;
        }
    }

    /* JADX INFO: compiled from: SharedPreferencesMigration.android.kt */
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f15250a = new c();

        private c() {
        }

        public static final boolean a(Context context, String name) {
            t.f(context, "context");
            t.f(name, "name");
            return context.deleteSharedPreferences(name);
        }
    }

    /* JADX INFO: compiled from: SharedPreferencesMigration.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.migrations.SharedPreferencesMigration", f = "SharedPreferencesMigration.android.kt", l = {151}, m = "shouldMigrate")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f15251h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f15252i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ a<T> f15253j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f15254k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(a<T> aVar, f<? super d> fVar) {
            super(fVar);
            this.f15253j = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f15252i = obj;
            this.f15254k |= Integer.MIN_VALUE;
            return this.f15253j.b(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private a(id.a<? extends SharedPreferences> aVar, Set<String> set, p<? super T, ? super f<? super Boolean>, ? extends Object> pVar, q<? super g0.c, ? super T, ? super f<? super T>, ? extends Object> qVar, Context context, String str) {
        this.f15241a = pVar;
        this.f15242b = qVar;
        this.f15243c = context;
        this.f15244d = str;
        this.f15245e = m.a(aVar);
        this.f15246f = set == g0.b.a() ? null : b0.s0(set);
    }

    private final void d(Context context, String str) {
        c.a(context, str);
    }

    private final SharedPreferences e() {
        return (SharedPreferences) this.f15245e.getValue();
    }

    @Override // e0.i
    public Object a(f<? super g0> fVar) throws IOException {
        Context context;
        String str;
        SharedPreferences.Editor editorEdit = e().edit();
        Set<String> set = this.f15246f;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (e().getAll().isEmpty() && (context = this.f15243c) != null && (str = this.f15244d) != null) {
            d(context, str);
        }
        Set<String> set2 = this.f15246f;
        if (set2 != null) {
            set2.clear();
        }
        return g0.f27756a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // e0.i
    public Object b(T t10, f<? super Boolean> fVar) throws Throwable {
        d dVar;
        a<T> aVar;
        if (fVar instanceof d) {
            dVar = (d) fVar;
            int i10 = dVar.f15254k;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f15254k = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, fVar);
            }
        } else {
            dVar = new d(this, fVar);
        }
        Object objInvoke = dVar.f15252i;
        Object objF = ad.d.f();
        int i11 = dVar.f15254k;
        boolean z10 = true;
        if (i11 == 0) {
            s.b(objInvoke);
            p<T, f<? super Boolean>, Object> pVar = this.f15241a;
            dVar.f15251h = this;
            dVar.f15254k = 1;
            objInvoke = pVar.invoke(t10, dVar);
            if (objInvoke == objF) {
                return objF;
            }
            aVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (a) dVar.f15251h;
            s.b(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return kotlin.coroutines.jvm.internal.b.a(false);
        }
        Set<String> set = aVar.f15246f;
        if (set == null) {
            Map<String, ?> all = aVar.e().getAll();
            t.e(all, "sharedPrefs.all");
            if (all.isEmpty()) {
                z10 = false;
            }
        } else {
            SharedPreferences sharedPreferencesE = aVar.e();
            if ((set instanceof Collection) && set.isEmpty()) {
                z10 = false;
            } else {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (sharedPreferencesE.contains((String) it.next())) {
                    }
                }
                z10 = false;
            }
        }
        return kotlin.coroutines.jvm.internal.b.a(z10);
    }

    @Override // e0.i
    public Object c(T t10, f<? super T> fVar) {
        return this.f15242b.invoke(new g0.c(e(), this.f15246f), t10, fVar);
    }

    public /* synthetic */ a(Context context, String str, Set set, p pVar, q qVar, int i10, kotlin.jvm.internal.k kVar) {
        this(context, str, (i10 & 4) != 0 ? g0.b.a() : set, (i10 & 8) != 0 ? new C0226a(null) : pVar, qVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, String sharedPreferencesName, Set<String> keysToMigrate, p<? super T, ? super f<? super Boolean>, ? extends Object> shouldRunMigration, q<? super g0.c, ? super T, ? super f<? super T>, ? extends Object> migrate) {
        this(new b(context, sharedPreferencesName), keysToMigrate, shouldRunMigration, migrate, context, sharedPreferencesName);
        t.f(context, "context");
        t.f(sharedPreferencesName, "sharedPreferencesName");
        t.f(keysToMigrate, "keysToMigrate");
        t.f(shouldRunMigration, "shouldRunMigration");
        t.f(migrate, "migrate");
    }
}
