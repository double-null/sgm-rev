package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public interface zzse {
    void zzA();

    void zzB();

    void zzC();

    void zza(zzsb zzsbVar);

    boolean zzd(zzv zzvVar);

    int zze(zzv zzvVar);

    default zzqs zzf(zzv zzvVar) {
        throw null;
    }

    long zzg(boolean z10);

    default void zzh(zzrx zzrxVar) throws zzrz {
        throw null;
    }

    void zzi();

    void zzj();

    boolean zzk(ByteBuffer byteBuffer, long j10, int i10) throws zzsa, zzsd;

    void zzl() throws zzsd;

    boolean zzm();

    boolean zzn();

    void zzo(zzav zzavVar);

    zzav zzp();

    void zzq(boolean z10);

    void zzr(zzd zzdVar);

    default zzqh zzs() {
        throw null;
    }

    void zzt(int i10);

    void zzu(zze zzeVar);

    long zzx();

    void zzz(float f10);

    default void zzD() {
    }

    default void zzb(zzqf zzqfVar) {
    }

    default void zzc(zzdo zzdoVar) {
    }

    default void zzv(AudioDeviceInfo audioDeviceInfo) {
    }

    default void zzw(int i10) {
    }

    default void zzy(int i10, int i11) {
    }
}
