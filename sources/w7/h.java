package w7;

import android.os.Bundle;
import x7.l0;

/* JADX INFO: compiled from: TextEmphasisSpan.java */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f27591d = l0.C0(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f27592e = l0.C0(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f27593f = l0.C0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27596c;

    public h(int i10, int i11, int i12) {
        this.f27594a = i10;
        this.f27595b = i11;
        this.f27596c = i12;
    }

    public static h a(Bundle bundle) {
        return new h(bundle.getInt(f27591d), bundle.getInt(f27592e), bundle.getInt(f27593f));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f27591d, this.f27594a);
        bundle.putInt(f27592e, this.f27595b);
        bundle.putInt(f27593f, this.f27596c);
        return bundle;
    }
}
