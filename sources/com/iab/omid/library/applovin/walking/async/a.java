package com.iab.omid.library.applovin.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f12648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f12649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f12650e;

    public a(b.InterfaceC0165b interfaceC0165b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0165b);
        this.f12648c = new HashSet<>(hashSet);
        this.f12649d = jSONObject;
        this.f12650e = j10;
    }
}
