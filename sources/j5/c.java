package j5;

import java.util.HashSet;
import k5.e;
import k5.f;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class c implements k5.b.InterfaceC0344b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f20638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k5.c f20639b;

    public c(k5.c cVar) {
        this.f20639b = cVar;
    }

    @Override // k5.b.InterfaceC0344b
    public JSONObject a() {
        return this.f20638a;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f20639b.c(new e(this, hashSet, jSONObject, j10));
    }

    public void c() {
        this.f20639b.c(new k5.d(this));
    }

    public void d(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f20639b.c(new f(this, hashSet, jSONObject, j10));
    }

    @Override // k5.b.InterfaceC0344b
    public void a(JSONObject jSONObject) {
        this.f20638a = jSONObject;
    }
}
