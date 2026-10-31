package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzub {
    private static final zzgwm zza = zzgwm.zzj(12);

    /* JADX WARN: Code duplicated, block: B:113:0x0180  */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0173, code lost:
    
        if (r0.isEmpty() != false) goto L110;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzgwm zza(android.media.AudioDeviceInfo r10) {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzub.zza(android.media.AudioDeviceInfo):com.google.android.gms.internal.ads.zzgwm");
    }

    private static zzgwm zzb(AudioDeviceInfo audioDeviceInfo) {
        List<AudioProfile> audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator.comparing(zzua.zza).reversed());
        for (AudioProfile audioProfile : audioProfiles) {
            if (audioProfile.getEncapsulationType() != 1 && zzfl.zzD(audioProfile.getFormat())) {
                for (int i10 : audioProfile.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i10));
                }
            }
        }
        return zzgwm.zzq(treeSet);
    }
}
