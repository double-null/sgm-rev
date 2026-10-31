package x5;

import java.util.HashSet;
import org.json.JSONObject;
import y5.e;
import y5.f;

/* JADX INFO: loaded from: classes4.dex */
public class c implements y5.b.InterfaceC0485b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f28064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y5.c f28065b;

    public c(y5.c cVar) {
        this.f28065b = cVar;
    }

    @Override // y5.b.InterfaceC0485b
    public JSONObject a() {
        return this.f28064a;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f28065b.c(new e(this, hashSet, jSONObject, j10));
    }

    public void c() {
        this.f28065b.c(new y5.d(this));
    }

    public void d(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f28065b.c(new f(this, hashSet, jSONObject, j10));
    }

    @Override // y5.b.InterfaceC0485b
    public void a(JSONObject jSONObject) {
        this.f28064a = jSONObject;
    }
}
