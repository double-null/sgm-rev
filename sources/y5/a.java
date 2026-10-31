package y5;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f28662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f28663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f28664e;

    public a(b.InterfaceC0485b interfaceC0485b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0485b);
        this.f28662c = new HashSet<>(hashSet);
        this.f28663d = jSONObject;
        this.f28664e = j10;
    }
}
