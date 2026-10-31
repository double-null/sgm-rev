package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzgc;
import com.google.android.gms.internal.play_billing.zzgg;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public class zzgc<MessageType extends zzgg<MessageType, BuilderType>, BuilderType extends zzgc<MessageType, BuilderType>> extends zzeq<MessageType, BuilderType> {
    protected zzgg zza;
    private final zzgg zzb;

    protected zzgc(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzF()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = messagetype.zzs();
    }

    private static void zza(Object obj, Object obj2) {
        zzht.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzeq
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzgc clone() {
        zzgc zzgcVar = (zzgc) this.zzb.zzd(5, null, null);
        zzgcVar.zza = zzk();
        return zzgcVar;
    }

    public final zzgc zzh(zzgg zzggVar) {
        if (!this.zzb.equals(zzggVar)) {
            if (!this.zza.zzF()) {
                zzn();
            }
            zza(this.zza, zzggVar);
        }
        return this;
    }

    public final MessageType zzi() {
        MessageType messagetype = (MessageType) zzk();
        if (messagetype.zzo()) {
            return messagetype;
        }
        throw new zzik(messagetype);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhl
    /* JADX INFO: renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public MessageType zzk() {
        if (!this.zza.zzF()) {
            return (MessageType) this.zza;
        }
        this.zza.zzz();
        return (MessageType) this.zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhn
    public final /* synthetic */ zzhm zzl() {
        throw null;
    }

    protected final void zzm() {
        if (this.zza.zzF()) {
            return;
        }
        zzn();
    }

    protected void zzn() {
        zzgg zzggVarZzs = this.zzb.zzs();
        zza(zzggVarZzs, this.zza);
        this.zza = zzggVarZzs;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhn
    public final boolean zzo() {
        return zzgg.zzc(this.zza, false);
    }
}
