package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
public final class az implements ay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f11398a;

    private az(Object obj) {
        this.f11398a = obj;
    }

    public static ay b(Object obj) {
        if (obj != null) {
            return new az(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // com.google.android.play.integrity.internal.bd, com.google.android.play.integrity.internal.bc
    public final Object a() {
        return this.f11398a;
    }
}
