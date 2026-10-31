package androidx.room;

import android.content.Context;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: DatabaseConfiguration.java */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0.c.InterfaceC0464c f3448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f3449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h.d f3451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<h.b> f3452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f3453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h.c f3454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f3455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f3456i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f3457j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f3458k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f3459l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Set<Integer> f3460m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f3461n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final File f3462o;

    public a(Context context, String str, x0.c.InterfaceC0464c interfaceC0464c, h.d dVar, List<h.b> list, boolean z10, h.c cVar, Executor executor, Executor executor2, boolean z11, boolean z12, boolean z13, Set<Integer> set, String str2, File file) {
        this.f3448a = interfaceC0464c;
        this.f3449b = context;
        this.f3450c = str;
        this.f3451d = dVar;
        this.f3452e = list;
        this.f3453f = z10;
        this.f3454g = cVar;
        this.f3455h = executor;
        this.f3456i = executor2;
        this.f3457j = z11;
        this.f3458k = z12;
        this.f3459l = z13;
        this.f3460m = set;
        this.f3461n = str2;
        this.f3462o = file;
    }

    public boolean a(int i10, int i11) {
        Set<Integer> set;
        if ((i10 > i11) && this.f3459l) {
            return false;
        }
        return this.f3458k && ((set = this.f3460m) == null || !set.contains(Integer.valueOf(i10)));
    }
}
