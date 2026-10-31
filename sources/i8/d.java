package i8;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: HlsPlaylist.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d implements m8.a<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f16103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16104c;

    protected d(String str, List<String> list, boolean z10) {
        this.f16102a = str;
        this.f16103b = Collections.unmodifiableList(list);
        this.f16104c = z10;
    }
}
