package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzgc;
import com.google.android.gms.internal.play_billing.zzgg;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzgg<MessageType extends zzgg<MessageType, BuilderType>, BuilderType extends zzgc<MessageType, BuilderType>> extends zzer<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzim zzc = zzim.zzc();

    protected static void zzB(Class cls, zzgg zzggVar) {
        zzggVar.zzA();
        zzb.put(cls, zzggVar);
    }

    private final int zza(zzhw zzhwVar) {
        return zzht.zza().zzb(getClass()).zza(this);
    }

    private static zzgg zzb(zzgg zzggVar, byte[] bArr, int i10, int i11, zzft zzftVar) throws zzgs {
        if (i11 == 0) {
            return zzggVar;
        }
        zzgg zzggVarZzs = zzggVar.zzs();
        try {
            zzhw zzhwVarZzb = zzht.zza().zzb(zzggVarZzs.getClass());
            zzhwVarZzb.zzh(zzggVarZzs, bArr, 0, i11, new zzeu(zzftVar));
            zzhwVarZzb.zzf(zzggVarZzs);
            return zzggVarZzs;
        } catch (zzgs e10) {
            throw e10;
        } catch (zzik e11) {
            throw e11.zza();
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzgs) {
                throw ((zzgs) e12.getCause());
            }
            throw new zzgs(e12);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzgs("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzc(zzgg zzggVar, boolean z10) {
        byte bByteValue = ((Byte) zzggVar.zzd(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzk = zzht.zza().zzb(zzggVar.getClass()).zzk(zzggVar);
        if (z10) {
            zzggVar.zzd(2, true != zZzk ? null : zzggVar, null);
        }
        return zZzk;
    }

    static zzgg zzr(Class cls) {
        Map map = zzb;
        zzgg zzggVar = (zzgg) map.get(cls);
        if (zzggVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzggVar = (zzgg) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzggVar == null) {
            zzggVar = (zzgg) ((zzgg) zzis.zze(cls)).zzd(6, null, null);
            if (zzggVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzggVar);
        }
        return zzggVar;
    }

    protected static zzgg zzt(zzgg zzggVar, byte[] bArr) throws zzgs {
        int length = bArr.length;
        int i10 = zzft.zzb;
        int i11 = zzet.zza;
        zzgg zzggVarZzb = zzb(zzggVar, bArr, 0, length, zzft.zza);
        if (zzggVarZzb == null || zzc(zzggVarZzb, true)) {
            return zzggVarZzb;
        }
        throw new zzik(zzggVarZzb).zza();
    }

    protected static zzgk zzu() {
        return zzgh.zzf();
    }

    protected static zzgl zzv() {
        return zzhu.zze();
    }

    static Object zzx(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static Object zzy(zzhm zzhmVar, String str, Object[] objArr) {
        return new zzhv(zzhmVar, str, objArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzht.zza().zzb(getClass()).zzj(this, (zzgg) obj);
    }

    public final int hashCode() {
        if (zzF()) {
            return zzm();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iZzm = zzm();
        this.zza = iZzm;
        return iZzm;
    }

    public final String toString() {
        return zzho.zza(this, super.toString());
    }

    final void zzA() {
        this.zzd &= Integer.MAX_VALUE;
    }

    final void zzC(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhm
    public final void zzD(zzfo zzfoVar) throws IOException {
        zzht.zza().zzb(getClass()).zzi(this, zzfp.zza(zzfoVar));
    }

    final boolean zzF() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    protected abstract Object zzd(int i10, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.play_billing.zzer
    final int zzi(zzhw zzhwVar) {
        if (zzF()) {
            int iZza = zzhwVar.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iZza);
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iZza2 = zzhwVar.zza(this);
        if (iZza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
            return iZza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iZza2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhn
    public final /* synthetic */ zzhm zzl() {
        return (zzgg) zzd(6, null, null);
    }

    final int zzm() {
        return zzht.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhm
    public final int zzn() {
        int iZza;
        if (zzF()) {
            iZza = zza(null);
            if (iZza < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + iZza);
            }
        } else {
            iZza = this.zzd & Integer.MAX_VALUE;
            if (iZza == Integer.MAX_VALUE) {
                iZza = zza(null);
                if (iZza < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + iZza);
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza;
            }
        }
        return iZza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhn
    public final boolean zzo() {
        return zzc(this, true);
    }

    protected final zzgc zzp() {
        return (zzgc) zzd(5, null, null);
    }

    public final zzgc zzq() {
        zzgc zzgcVar = (zzgc) zzd(5, null, null);
        zzgcVar.zzh(this);
        return zzgcVar;
    }

    final zzgg zzs() {
        return (zzgg) zzd(4, null, null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhm
    public final /* synthetic */ zzhl zzw() {
        return (zzgc) zzd(5, null, null);
    }

    protected final void zzz() {
        zzht.zza().zzb(getClass()).zzf(this);
        zzA();
    }
}
