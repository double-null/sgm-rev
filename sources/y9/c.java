package y9;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: compiled from: TtmlNode.java */
/* JADX INFO: loaded from: classes4.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f28807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f28808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f28809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f28810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String[] f28811g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f28812h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f28813i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f28814j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final HashMap<String, Integer> f28815k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final HashMap<String, Integer> f28816l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<c> f28817m;

    private c(String str, String str2, long j10, long j11, g gVar, String[] strArr, String str3, String str4, c cVar) {
        this.f28805a = str;
        this.f28806b = str2;
        this.f28813i = str4;
        this.f28810f = gVar;
        this.f28811g = strArr;
        this.f28807c = str2 != null;
        this.f28808d = j10;
        this.f28809e = j11;
        this.f28812h = (String) x7.a.e(str3);
        this.f28814j = cVar;
        this.f28815k = new HashMap<>();
        this.f28816l = new HashMap<>();
    }

    private void b(Map<String, g> map, w7.a.b bVar, int i10, int i11, int i12) {
        g gVarF = f.f(this.f28810f, this.f28811g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (gVarF != null) {
            f.a(spannableStringBuilder2, i10, i11, gVarF, this.f28814j, map, i12);
            if ("p".equals(this.f28805a)) {
                if (gVarF.m() != Float.MAX_VALUE) {
                    bVar.m((gVarF.m() * (-90.0f)) / 100.0f);
                }
                if (gVarF.o() != null) {
                    bVar.p(gVarF.o());
                }
                if (gVarF.i() != null) {
                    bVar.j(gVarF.i());
                }
            }
        }
    }

    public static c c(String str, long j10, long j11, g gVar, String[] strArr, String str2, String str3, c cVar) {
        return new c(str, null, j10, j11, gVar, strArr, str2, str3, cVar);
    }

    public static c d(String str) {
        return new c(null, f.b(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private static void e(SpannableStringBuilder spannableStringBuilder) {
        for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), "");
        }
        for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
            if (spannableStringBuilder.charAt(i10) == ' ') {
                int i11 = i10 + 1;
                int i12 = i11;
                while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                    i12++;
                }
                int i13 = i12 - i11;
                if (i13 > 0) {
                    spannableStringBuilder.delete(i10, i13 + i10);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
            if (spannableStringBuilder.charAt(i14) == '\n') {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i15) == ' ') {
                    spannableStringBuilder.delete(i15, i14 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
            if (spannableStringBuilder.charAt(i16) == ' ') {
                int i17 = i16 + 1;
                if (spannableStringBuilder.charAt(i17) == '\n') {
                    spannableStringBuilder.delete(i16, i17);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    private void i(TreeSet<Long> treeSet, boolean z10) {
        boolean zEquals = "p".equals(this.f28805a);
        boolean zEquals2 = "div".equals(this.f28805a);
        if (z10 || zEquals || (zEquals2 && this.f28813i != null)) {
            long j10 = this.f28808d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f28809e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f28817m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f28817m.size(); i10++) {
            this.f28817m.get(i10).i(treeSet, z10 || zEquals);
        }
    }

    private static SpannableStringBuilder k(String str, Map<String, w7.a.b> map) {
        if (!map.containsKey(str)) {
            w7.a.b bVar = new w7.a.b();
            bVar.o(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) x7.a.e(map.get(str).e());
    }

    private void n(long j10, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f28812h)) {
            str = this.f28812h;
        }
        if (m(j10) && "div".equals(this.f28805a) && this.f28813i != null) {
            list.add(new Pair<>(str, this.f28813i));
            return;
        }
        for (int i10 = 0; i10 < g(); i10++) {
            f(i10).n(j10, str, list);
        }
    }

    private void o(long j10, Map<String, g> map, Map<String, e> map2, String str, Map<String, w7.a.b> map3) {
        int i10;
        if (m(j10)) {
            String str2 = "".equals(this.f28812h) ? str : this.f28812h;
            Iterator<Map.Entry<String, Integer>> it = this.f28816l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int iIntValue = this.f28815k.containsKey(key) ? this.f28815k.get(key).intValue() : 0;
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    b(map, (w7.a.b) x7.a.e(map3.get(key)), iIntValue, iIntValue2, ((e) x7.a.e(map2.get(str2))).f28841j);
                }
            }
            for (i10 = 0; i10 < g(); i10++) {
                f(i10).o(j10, map, map2, str2, map3);
            }
        }
    }

    private void p(long j10, boolean z10, String str, Map<String, w7.a.b> map) {
        this.f28815k.clear();
        this.f28816l.clear();
        if ("metadata".equals(this.f28805a)) {
            return;
        }
        if (!"".equals(this.f28812h)) {
            str = this.f28812h;
        }
        if (this.f28807c && z10) {
            k(str, map).append((CharSequence) x7.a.e(this.f28806b));
            return;
        }
        if ("br".equals(this.f28805a) && z10) {
            k(str, map).append('\n');
            return;
        }
        if (m(j10)) {
            for (Map.Entry<String, w7.a.b> entry : map.entrySet()) {
                this.f28815k.put(entry.getKey(), Integer.valueOf(((CharSequence) x7.a.e(entry.getValue().e())).length()));
            }
            boolean zEquals = "p".equals(this.f28805a);
            for (int i10 = 0; i10 < g(); i10++) {
                f(i10).p(j10, z10 || zEquals, str, map);
            }
            if (zEquals) {
                f.c(k(str, map));
            }
            for (Map.Entry<String, w7.a.b> entry2 : map.entrySet()) {
                this.f28816l.put(entry2.getKey(), Integer.valueOf(((CharSequence) x7.a.e(entry2.getValue().e())).length()));
            }
        }
    }

    public void a(c cVar) {
        if (this.f28817m == null) {
            this.f28817m = new ArrayList();
        }
        this.f28817m.add(cVar);
    }

    public c f(int i10) {
        List<c> list = this.f28817m;
        if (list != null) {
            return list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List<c> list = this.f28817m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<w7.a> h(long j10, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        n(j10, this.f28812h, arrayList);
        TreeMap treeMap = new TreeMap();
        p(j10, false, this.f28812h, treeMap);
        o(j10, map, map2, this.f28812h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                e eVar = (e) x7.a.e(map2.get(pair.first));
                arrayList2.add(new w7.a.b().f(bitmapDecodeByteArray).k(eVar.f28833b).l(0).h(eVar.f28834c, 0).i(eVar.f28836e).n(eVar.f28837f).g(eVar.f28838g).r(eVar.f28841j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) x7.a.e(map2.get(entry.getKey()));
            w7.a.b bVar = (w7.a.b) entry.getValue();
            e((SpannableStringBuilder) x7.a.e(bVar.e()));
            bVar.h(eVar2.f28834c, eVar2.f28835d);
            bVar.i(eVar2.f28836e);
            bVar.k(eVar2.f28833b);
            bVar.n(eVar2.f28837f);
            bVar.q(eVar2.f28840i, eVar2.f28839h);
            bVar.r(eVar2.f28841j);
            arrayList2.add(bVar.a());
        }
        return arrayList2;
    }

    public long[] j() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i10 = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        return jArr;
    }

    public String[] l() {
        return this.f28811g;
    }

    public boolean m(long j10) {
        long j11 = this.f28808d;
        return (j11 == -9223372036854775807L && this.f28809e == -9223372036854775807L) || (j11 <= j10 && this.f28809e == -9223372036854775807L) || ((j11 == -9223372036854775807L && j10 < this.f28809e) || (j11 <= j10 && j10 < this.f28809e));
    }
}
