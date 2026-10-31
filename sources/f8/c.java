package f8;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import u7.b0;
import x7.l0;

/* JADX INFO: compiled from: DashManifest.java */
/* JADX INFO: loaded from: classes4.dex */
public class c implements m8.a<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f14669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f14670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f14671g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f14672h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o f14673i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f14674j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f14675k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f14676l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List<g> f14677m;

    public c(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, h hVar, o oVar, l lVar, Uri uri, List<g> list) {
        this.f14665a = j10;
        this.f14666b = j11;
        this.f14667c = j12;
        this.f14668d = z10;
        this.f14669e = j13;
        this.f14670f = j14;
        this.f14671g = j15;
        this.f14672h = j16;
        this.f14676l = hVar;
        this.f14673i = oVar;
        this.f14675k = uri;
        this.f14674j = lVar;
        this.f14677m = list == null ? Collections.emptyList() : list;
    }

    private static ArrayList<a> c(List<a> list, LinkedList<b0> linkedList) {
        b0 b0VarPoll = linkedList.poll();
        int i10 = b0VarPoll.f25981a;
        ArrayList<a> arrayList = new ArrayList<>();
        do {
            int i11 = b0VarPoll.f25982b;
            a aVar = list.get(i11);
            List<j> list2 = aVar.f14657c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(b0VarPoll.f25983c));
                b0VarPoll = linkedList.poll();
                if (b0VarPoll.f25981a != i10) {
                    break;
                }
            } while (b0VarPoll.f25982b == i11);
            arrayList.add(new a(aVar.f14655a, aVar.f14656b, arrayList2, aVar.f14658d, aVar.f14659e, aVar.f14660f));
        } while (b0VarPoll.f25981a == i10);
        linkedList.addFirst(b0VarPoll);
        return arrayList;
    }

    @Override // m8.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c a(List<b0> list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new b0(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= e()) {
                break;
            }
            if (((b0) linkedList.peek()).f25981a != i10) {
                long jF = f(i10);
                if (jF != -9223372036854775807L) {
                    j10 += jF;
                }
            } else {
                g gVarD = d(i10);
                arrayList.add(new g(gVarD.f14701a, gVarD.f14702b - j10, c(gVarD.f14703c, linkedList), gVarD.f14704d));
            }
            i10++;
        }
        long j11 = this.f14666b;
        return new c(this.f14665a, j11 != -9223372036854775807L ? j11 - j10 : -9223372036854775807L, this.f14667c, this.f14668d, this.f14669e, this.f14670f, this.f14671g, this.f14672h, this.f14676l, this.f14673i, this.f14674j, this.f14675k, arrayList);
    }

    public final g d(int i10) {
        return this.f14677m.get(i10);
    }

    public final int e() {
        return this.f14677m.size();
    }

    public final long f(int i10) {
        long j10;
        long j11;
        if (i10 == this.f14677m.size() - 1) {
            j10 = this.f14666b;
            if (j10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j11 = this.f14677m.get(i10).f14702b;
        } else {
            j10 = this.f14677m.get(i10 + 1).f14702b;
            j11 = this.f14677m.get(i10).f14702b;
        }
        return j10 - j11;
    }

    public final long g(int i10) {
        return l0.S0(f(i10));
    }
}
