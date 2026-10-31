package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;

/* JADX INFO: loaded from: classes.dex */
public class t4 extends t2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final q0.a f8822n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Context f8823o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f8824p;

    public t4(q0.a aVar, boolean z10, Context context) {
        super(t2.c.RIGHT_DETAIL);
        this.f8822n = aVar;
        this.f8823o = context;
        this.f8761c = new SpannedString(aVar.a());
        this.f8824p = z10;
    }

    @Override // com.applovin.impl.t2
    public SpannedString f() {
        return new SpannedString(this.f8822n.a(this.f8823o));
    }

    @Override // com.applovin.impl.t2
    public boolean o() {
        return false;
    }

    @Override // com.applovin.impl.t2
    public boolean p() {
        Boolean boolB = this.f8822n.b(this.f8823o);
        if (boolB != null) {
            return boolB.equals(Boolean.valueOf(this.f8824p));
        }
        return false;
    }
}
