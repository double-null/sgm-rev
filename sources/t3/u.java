package t3;

import android.content.Context;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import wc.g0;

/* JADX INFO: compiled from: HeartBeatInfoStorage.java */
/* JADX INFO: loaded from: classes4.dex */
class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final i0.f.a<Long> f25490b = i0.i.f("fire-global");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final i0.f.a<Long> f25491c = i0.i.f("fire-count");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final i0.f.a<String> f25492d = i0.i.g("last-used-date");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l3.c f25493a;

    public u(Context context, String str) {
        this.f25493a = new l3.c(context, "FirebaseHeartBeat" + str);
    }

    private long d(i0.c cVar) {
        long jLongValue = ((Long) l3.d.a(cVar, f25491c, 0L)).longValue();
        Set hashSet = new HashSet();
        String str = null;
        String strA = "";
        for (Map.Entry<i0.f.a<?>, Object> entry : cVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Set<String> set = (Set) entry.getValue();
                for (String str2 : set) {
                    if (str == null || str.compareTo(str2) > 0) {
                        strA = entry.getKey().a();
                        hashSet = set;
                        str = str2;
                    }
                }
            }
        }
        HashSet hashSet2 = new HashSet(hashSet);
        hashSet2.remove(str);
        cVar.i(i0.i.h(strA), hashSet2);
        long j10 = jLongValue - 1;
        cVar.i(f25491c, Long.valueOf(j10));
        return j10;
    }

    private String g(long j10) {
        return Build.VERSION.SDK_INT >= 26 ? new Date(j10).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE) : new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j10));
    }

    private i0.f.a<Set<String>> h(i0.c cVar, String str) {
        for (Map.Entry<i0.f.a<?>, Object> entry : cVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return i0.i.h(entry.getKey().a());
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ g0 i(i0.c cVar) {
        long j10 = 0;
        for (Map.Entry<i0.f.a<?>, Object> entry : cVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                i0.f.a<?> key = entry.getKey();
                Set set = (Set) entry.getValue();
                String strG = g(System.currentTimeMillis());
                if (set.contains(strG)) {
                    cVar.i(key, q.a(new Object[]{strG}));
                    j10++;
                } else {
                    cVar.h(key);
                }
            }
        }
        if (j10 == 0) {
            cVar.h(f25491c);
            return null;
        }
        cVar.i(f25491c, Long.valueOf(j10));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ g0 j(String str, String str2, i0.f.a aVar, i0.c cVar) {
        i0.f.a<String> aVar2 = f25492d;
        if (((String) l3.d.a(cVar, aVar2, "")).equals(str)) {
            i0.f.a<Set<String>> aVarH = h(cVar, str);
            if (aVarH == null || aVarH.a().equals(str2)) {
                return null;
            }
            o(cVar, aVar, str);
            return null;
        }
        i0.f.a<Long> aVar3 = f25491c;
        long jLongValue = ((Long) l3.d.a(cVar, aVar3, 0L)).longValue();
        if (jLongValue + 1 == 30) {
            jLongValue = d(cVar);
        }
        HashSet hashSet = new HashSet((Collection) l3.d.a(cVar, aVar, new HashSet()));
        hashSet.add(str);
        cVar.i(aVar, hashSet);
        cVar.i(aVar3, Long.valueOf(jLongValue + 1));
        cVar.i(aVar2, str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g0 k(long j10, i0.c cVar) {
        cVar.i(f25490b, Long.valueOf(j10));
        return null;
    }

    private void l(i0.c cVar, String str) {
        i0.f.a<Set<String>> aVarH = h(cVar, str);
        if (aVarH == null) {
            return;
        }
        HashSet hashSet = new HashSet((Collection) l3.d.a(cVar, aVarH, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            cVar.h(aVarH);
        } else {
            cVar.i(aVarH, hashSet);
        }
    }

    private void o(i0.c cVar, i0.f.a<Set<String>> aVar, String str) {
        l(cVar, str);
        HashSet hashSet = new HashSet((Collection) l3.d.a(cVar, aVar, new HashSet()));
        hashSet.add(str);
        cVar.i(aVar, hashSet);
    }

    synchronized void e() {
        this.f25493a.g(new id.l() { // from class: t3.s
            @Override // id.l
            public final Object invoke(Object obj) {
                return this.f25488a.i((i0.c) obj);
            }
        });
    }

    synchronized List<v> f() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        String strG = g(System.currentTimeMillis());
        for (Map.Entry<i0.f.a<?>, Object> entry : this.f25493a.h().entrySet()) {
            if (entry.getValue() instanceof Set) {
                HashSet hashSet = new HashSet((Set) entry.getValue());
                hashSet.remove(strG);
                if (!hashSet.isEmpty()) {
                    arrayList.add(v.a(entry.getKey().a(), new ArrayList(hashSet)));
                }
            }
        }
        n(System.currentTimeMillis());
        return arrayList;
    }

    synchronized void m(long j10, final String str) {
        final String strG = g(j10);
        final i0.f.a<Set<String>> aVarH = i0.i.h(str);
        this.f25493a.g(new id.l() { // from class: t3.r
            @Override // id.l
            public final Object invoke(Object obj) {
                return this.f25484a.j(strG, str, aVarH, (i0.c) obj);
            }
        });
    }

    synchronized void n(final long j10) {
        this.f25493a.g(new id.l() { // from class: t3.t
            @Override // id.l
            public final Object invoke(Object obj) {
                return u.k(j10, (i0.c) obj);
            }
        });
    }
}
