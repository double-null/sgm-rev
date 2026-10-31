package k5;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f21223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f21224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f21225e;

    public a(b.InterfaceC0344b interfaceC0344b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0344b);
        this.f21223c = new HashSet<>(hashSet);
        this.f21224d = jSONObject;
        this.f21225e = j10;
    }
}
