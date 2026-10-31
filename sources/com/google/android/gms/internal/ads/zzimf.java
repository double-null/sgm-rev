package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public class zzimf implements Iterator, Closeable, zzauq {
    private static final zzaup zza = new zzime("eof ");
    protected zzaum zzb;
    protected zzimg zzc;
    zzaup zzd = null;
    long zze = 0;
    long zzf = 0;
    private final List zzg = new ArrayList();

    static {
        zzimm.zzb(zzimf.class);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzaup zzaupVar = this.zzd;
        if (zzaupVar == zza) {
            return false;
        }
        if (zzaupVar != null) {
            return true;
        }
        try {
            this.zzd = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zzd = zza;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("[");
        int i10 = 0;
        while (true) {
            List list = this.zzg;
            if (i10 >= list.size()) {
                sb2.append("]");
                return sb2.toString();
            }
            if (i10 > 0) {
                sb2.append(";");
            }
            sb2.append(((zzaup) list.get(i10)).toString());
            i10++;
        }
    }

    public final List zzc() {
        return (this.zzc == null || this.zzd == zza) ? this.zzg : new zziml(this.zzg, this);
    }

    public final void zzd(zzimg zzimgVar, long j10, zzaum zzaumVar) throws IOException {
        this.zzc = zzimgVar;
        this.zze = zzimgVar.zzc();
        zzimgVar.zzd(zzimgVar.zzc() + j10);
        this.zzf = zzimgVar.zzc();
        this.zzb = zzaumVar;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzaup next() {
        zzaup zzaupVarZzb;
        zzaup zzaupVar = this.zzd;
        if (zzaupVar != null && zzaupVar != zza) {
            this.zzd = null;
            return zzaupVar;
        }
        zzimg zzimgVar = this.zzc;
        if (zzimgVar == null || this.zze >= this.zzf) {
            this.zzd = zza;
            throw new NoSuchElementException();
        }
        try {
            synchronized (zzimgVar) {
                this.zzc.zzd(this.zze);
                zzaupVarZzb = this.zzb.zzb(this.zzc, this);
                this.zze = this.zzc.zzc();
            }
            return zzaupVarZzb;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    public void close() throws IOException {
    }
}
