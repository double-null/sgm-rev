package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zziby implements CharSequence {
    private char[] zza;
    private String zzb;

    private zziby() {
        throw null;
    }

    /* synthetic */ zziby(byte[] bArr) {
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.zza[i10];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.zza.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return new String(this.zza, i10, i11 - i10);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.zzb == null) {
            this.zzb = new String(this.zza);
        }
        return this.zzb;
    }

    final void zza(char[] cArr) {
        this.zza = cArr;
        this.zzb = null;
    }
}
