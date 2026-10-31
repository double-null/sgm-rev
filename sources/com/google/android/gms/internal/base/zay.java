package com.google.android.gms.internal.base;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
final class zay extends zaw {
    private final zaaa zaa;

    zay(zaaa zaaaVar, int i10) {
        super(zaaaVar.size(), i10);
        this.zaa = zaaaVar;
    }

    @Override // com.google.android.gms.internal.base.zaw
    final Object zaa(int i10) {
        return this.zaa.get(i10);
    }
}
