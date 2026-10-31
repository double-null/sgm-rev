package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
public final class bp implements com.google.android.play.integrity.internal.ay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bd f11315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bd f11316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bd f11317c;

    public bp(com.google.android.play.integrity.internal.bd bdVar, com.google.android.play.integrity.internal.bd bdVar2, com.google.android.play.integrity.internal.bd bdVar3, com.google.android.play.integrity.internal.bd bdVar4) {
        this.f11315a = bdVar;
        this.f11316b = bdVar2;
        this.f11317c = bdVar3;
    }

    @Override // com.google.android.play.integrity.internal.bd, com.google.android.play.integrity.internal.bc
    public final /* bridge */ /* synthetic */ Object a() {
        return new bn((Context) this.f11315a.a(), (com.google.android.play.integrity.internal.s) this.f11316b.a(), ((au) this.f11317c).a(), new j());
    }
}
