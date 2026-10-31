package h0;

import android.content.Context;
import com.vungle.ads.internal.network.converters.vY.vgmm;
import id.p;
import id.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.u;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.t;
import wc.g0;
import wc.s;

/* JADX INFO: compiled from: SharedPreferencesMigration.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<String> f15579a = new LinkedHashSet();

    /* JADX INFO: compiled from: SharedPreferencesMigration.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements p<i0.f, zc.f<? super Boolean>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f15583h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f15584i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Set<String> f15585j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Set<String> set, zc.f<? super b> fVar) {
            super(2, fVar);
            this.f15585j = set;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            b bVar = new b(this.f15585j, fVar);
            bVar.f15584i = obj;
            return bVar;
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i0.f fVar, zc.f<? super Boolean> fVar2) {
            return ((b) create(fVar, fVar2)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ad.d.f();
            if (this.f15583h != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            Set<i0.f.a<?>> setKeySet = ((i0.f) this.f15584i).a().keySet();
            ArrayList arrayList = new ArrayList(u.u(setKeySet, 10));
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((i0.f.a) it.next()).a());
            }
            boolean z10 = true;
            if (this.f15585j != i.c()) {
                Set<String> set = this.f15585j;
                if ((set instanceof Collection) && set.isEmpty()) {
                    z10 = false;
                } else {
                    Iterator<T> it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (!arrayList.contains((String) it2.next())) {
                        }
                    }
                    z10 = false;
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(z10);
        }
    }

    public static final g0.a<i0.f> a(Context context, String sharedPreferencesName, Set<String> keysToMigrate) {
        t.f(context, "context");
        t.f(sharedPreferencesName, "sharedPreferencesName");
        t.f(keysToMigrate, "keysToMigrate");
        return keysToMigrate == f15579a ? new g0.a<>(context, sharedPreferencesName, null, e(keysToMigrate), d(), 4, null) : new g0.a<>(context, sharedPreferencesName, keysToMigrate, e(keysToMigrate), d());
    }

    public static /* synthetic */ g0.a b(Context context, String str, Set set, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            set = f15579a;
        }
        return a(context, str, set);
    }

    public static final Set<String> c() {
        return f15579a;
    }

    private static final q<g0.c, i0.f, zc.f<? super i0.f>, Object> d() {
        return new a(null);
    }

    private static final p<i0.f, zc.f<? super Boolean>, Object> e(Set<String> set) {
        return new b(set, null);
    }

    /* JADX INFO: compiled from: SharedPreferencesMigration.android.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements q<g0.c, i0.f, zc.f<? super i0.f>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f15580h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f15581i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f15582j;

        a(zc.f<? super a> fVar) {
            super(3, fVar);
        }

        @Override // id.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(g0.c cVar, i0.f fVar, zc.f<? super i0.f> fVar2) {
            a aVar = new a(fVar2);
            aVar.f15581i = cVar;
            aVar.f15582j = fVar;
            return aVar.invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ad.d.f();
            if (this.f15580h == 0) {
                s.b(obj);
                g0.c cVar = (g0.c) this.f15581i;
                i0.f fVar = (i0.f) this.f15582j;
                Set<i0.f.a<?>> setKeySet = fVar.a().keySet();
                ArrayList arrayList = new ArrayList(u.u(setKeySet, 10));
                Iterator<T> it = setKeySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((i0.f.a) it.next()).a());
                }
                Map<String, Object> mapA = cVar.a();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, Object> entry : mapA.entrySet()) {
                    if (!arrayList.contains(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                i0.c cVarC = fVar.c();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    String str = (String) entry2.getKey();
                    Object value = entry2.getValue();
                    if (value instanceof Boolean) {
                        cVarC.i(i0.i.a(str), value);
                    } else if (value instanceof Float) {
                        cVarC.i(i0.i.d(str), value);
                    } else if (value instanceof Integer) {
                        cVarC.i(i0.i.e(str), value);
                    } else if (value instanceof Long) {
                        cVarC.i(i0.i.f(str), value);
                    } else if (value instanceof String) {
                        cVarC.i(i0.i.g(str), value);
                    } else if (value instanceof Set) {
                        i0.f.a<Set<String>> aVarH = i0.i.h(str);
                        t.d(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                        cVarC.i(aVarH, (Set) value);
                    }
                }
                return cVarC.d();
            }
            throw new IllegalStateException(vgmm.SxBBxpfxoRt);
        }
    }
}
