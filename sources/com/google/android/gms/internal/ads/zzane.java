package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzane implements zzanj {
    @Override // com.google.android.gms.internal.ads.zzanj
    public final boolean zza(zzv zzvVar) {
        String str = zzvVar.zzp;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    @Override // com.google.android.gms.internal.ads.zzanj
    public final int zzb(zzv zzvVar) {
        String str = zzvVar.zzp;
        if (str != null) {
            switch (str) {
                case "text/x-ssa":
                case "text/vtt":
                    return 1;
                case "application/x-mp4-vtt":
                    return 2;
                case "application/x-subrip":
                    return 1;
                case "application/x-quicktime-tx3g":
                case "application/pgs":
                case "application/vobsub":
                case "application/dvbsubs":
                    return 2;
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    @Override // com.google.android.gms.internal.ads.zzanj
    public final zzanl zzc(zzv zzvVar) {
        String str = zzvVar.zzp;
        if (str != null) {
            switch (str) {
                case "text/x-ssa":
                    return new zzaob(zzvVar.zzs);
                case "text/vtt":
                    return new zzapd();
                case "application/x-mp4-vtt":
                    return new zzaot();
                case "application/x-subrip":
                    return new zzaof();
                case "application/x-quicktime-tx3g":
                    return new zzaoq(zzvVar.zzs);
                case "application/pgs":
                    return new zzanz();
                case "application/vobsub":
                    return new zzaos(zzvVar.zzs);
                case "application/dvbsubs":
                    return new zzanx(zzvVar.zzs);
                case "application/ttml+xml":
                    return new zzaol();
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
    }
}
