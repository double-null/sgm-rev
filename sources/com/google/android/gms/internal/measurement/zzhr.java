package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhr extends zzadp implements zzafd {
    private zzhr() {
        throw null;
    }

    public final List zza() {
        return Collections.unmodifiableList(((zzhs) this.zza).zza());
    }

    public final int zzb() {
        return ((zzhs) this.zza).zzb();
    }

    public final zzhw zzc(int i10) {
        return ((zzhs) this.zza).zzc(i10);
    }

    public final zzhr zzd(int i10, zzhw zzhwVar) {
        zzaY();
        ((zzhs) this.zza).zzq(i10, zzhwVar);
        return this;
    }

    public final zzhr zze(int i10, zzhv zzhvVar) {
        zzaY();
        ((zzhs) this.zza).zzq(i10, (zzhw) zzhvVar.zzbd());
        return this;
    }

    public final zzhr zzf(zzhw zzhwVar) {
        zzaY();
        ((zzhs) this.zza).zzr(zzhwVar);
        return this;
    }

    public final zzhr zzg(zzhv zzhvVar) {
        zzaY();
        ((zzhs) this.zza).zzr((zzhw) zzhvVar.zzbd());
        return this;
    }

    public final zzhr zzh(Iterable iterable) {
        zzaY();
        ((zzhs) this.zza).zzs(iterable);
        return this;
    }

    public final zzhr zzi() {
        zzaY();
        ((zzhs) this.zza).zzt();
        return this;
    }

    public final zzhr zzj(int i10) {
        zzaY();
        ((zzhs) this.zza).zzu(i10);
        return this;
    }

    public final String zzk() {
        return ((zzhs) this.zza).zzd();
    }

    public final zzhr zzl(String str) {
        zzaY();
        ((zzhs) this.zza).zzv(str);
        return this;
    }

    public final boolean zzm() {
        return ((zzhs) this.zza).zze();
    }

    public final long zzn() {
        return ((zzhs) this.zza).zzf();
    }

    public final zzhr zzo(long j10) {
        zzaY();
        ((zzhs) this.zza).zzw(j10);
        return this;
    }

    public final long zzp() {
        return ((zzhs) this.zza).zzi();
    }

    public final zzhr zzq(long j10) {
        zzaY();
        ((zzhs) this.zza).zzx(j10);
        return this;
    }

    public final zzhr zzr(long j10) {
        zzaY();
        ((zzhs) this.zza).zzy(j10);
        return this;
    }

    public final boolean zzs() {
        return ((zzhs) this.zza).zzl();
    }

    public final zzhr zzt(long j10) {
        zzaY();
        ((zzhs) this.zza).zzz(j10);
        return this;
    }

    public final boolean zzu() {
        return ((zzhs) this.zza).zzn();
    }

    public final long zzv() {
        return ((zzhs) this.zza).zzo();
    }

    public final zzhr zzw(long j10) {
        zzaY();
        ((zzhs) this.zza).zzA(j10);
        return this;
    }

    /* synthetic */ zzhr(byte[] bArr) {
        super(zzhs.zzm);
    }
}
