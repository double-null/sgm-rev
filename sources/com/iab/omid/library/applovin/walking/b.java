package com.iab.omid.library.applovin.walking;

import com.iab.omid.library.applovin.walking.async.d;
import com.iab.omid.library.applovin.walking.async.e;
import com.iab.omid.library.applovin.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class b implements com.iab.omid.library.applovin.walking.async.b.InterfaceC0165b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f12657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.applovin.walking.async.c f12658b;

    public b(com.iab.omid.library.applovin.walking.async.c cVar) {
        this.f12658b = cVar;
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.InterfaceC0165b
    public JSONObject a() {
        return this.f12657a;
    }

    public void b() {
        this.f12658b.b(new d(this));
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.InterfaceC0165b
    public void a(JSONObject jSONObject) {
        this.f12657a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f12658b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f12658b.b(new e(this, hashSet, jSONObject, j10));
    }
}
