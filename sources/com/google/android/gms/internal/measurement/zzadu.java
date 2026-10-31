package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzadp;
import com.google.android.gms.internal.measurement.zzadu;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzadu<MessageType extends zzadu<MessageType, BuilderType>, BuilderType extends zzadp<MessageType, BuilderType>> extends zzacb<MessageType, BuilderType> {
    public static final /* synthetic */ int zzd = 0;
    private static final Map zze = new ConcurrentHashMap();
    private int zzb = -1;
    protected zzaga zzc = zzaga.zza();

    private final int zzc(zzafp zzafpVar) {
        return zzafl.zza().zzb(getClass()).zze(this);
    }

    protected static zzadu zzcA(zzadu zzaduVar, byte[] bArr, zzadf zzadfVar) throws zzaeh {
        zzadu zzaduVarZze = zze(zzaduVar, bArr, 0, bArr.length, zzadfVar);
        zzf(zzaduVarZze);
        return zzaduVarZze;
    }

    protected static zzadu zzcB(zzadu zzaduVar, InputStream inputStream, zzadf zzadfVar) throws zzaeh {
        zzacv zzacvVarZzM = zzacv.zzM(inputStream, 4096);
        zzadu zzaduVarZzck = zzaduVar.zzck();
        try {
            zzafp zzafpVarZzb = zzafl.zza().zzb(zzaduVarZzck.getClass());
            zzafpVarZzb.zzg(zzaduVarZzck, zzacw.zza(zzacvVarZzM), zzadfVar);
            zzafpVarZzb.zzk(zzaduVarZzck);
            zzf(zzaduVarZzck);
            return zzaduVarZzck;
        } catch (zzaeh e10) {
            if (e10.zzb()) {
                throw new zzaeh(e10);
            }
            throw e10;
        } catch (zzafy e11) {
            throw e11.zza();
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzaeh) {
                throw ((zzaeh) e12.getCause());
            }
            throw new zzaeh(e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzaeh) {
                throw ((zzaeh) e13.getCause());
            }
            throw e13;
        }
    }

    protected static zzadu zzcC(zzadu zzaduVar, zzacv zzacvVar, zzadf zzadfVar) throws zzaeh {
        zzadu zzaduVarZzck = zzaduVar.zzck();
        try {
            zzafp zzafpVarZzb = zzafl.zza().zzb(zzaduVarZzck.getClass());
            zzafpVarZzb.zzg(zzaduVarZzck, zzacw.zza(zzacvVar), zzadfVar);
            zzafpVarZzb.zzk(zzaduVarZzck);
            zzf(zzaduVarZzck);
            return zzaduVarZzck;
        } catch (zzaeh e10) {
            if (e10.zzb()) {
                throw new zzaeh(e10);
            }
            throw e10;
        } catch (zzafy e11) {
            throw e11.zza();
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzaeh) {
                throw ((zzaeh) e12.getCause());
            }
            throw new zzaeh(e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzaeh) {
                throw ((zzaeh) e13.getCause());
            }
            throw e13;
        }
    }

    static zzadu zzcr(Class cls) {
        Map map = zze;
        zzadu zzaduVar = (zzadu) map.get(cls);
        if (zzaduVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzaduVar = (zzadu) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzaduVar == null) {
            zzaduVar = (zzadu) ((zzadu) zzagg.zzb(cls)).zzg(6, null, null);
            if (zzaduVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzaduVar);
        }
        return zzaduVar;
    }

    protected static void zzcs(Class cls, zzadu zzaduVar) {
        zzaduVar.zzci();
        zze.put(cls, zzaduVar);
    }

    protected static Object zzct(zzafc zzafcVar, String str, Object[] objArr) {
        return new zzafn(zzafcVar, str, objArr);
    }

    static Object zzcu(Method method, Object obj, Object... objArr) {
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

    protected static zzaeb zzcv() {
        return zzadv.zzd();
    }

    protected static zzaee zzcw() {
        return zzaeq.zze();
    }

    protected static zzaee zzcx(zzaee zzaeeVar) {
        int size = zzaeeVar.size();
        return zzaeeVar.zzg(size + size);
    }

    protected static zzaef zzcy() {
        return zzafm.zzd();
    }

    protected static zzaef zzcz(zzaef zzaefVar) {
        int size = zzaefVar.size();
        return zzaefVar.zzg(size + size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzd(zzadu zzaduVar, boolean z10) {
        byte bByteValue = ((Byte) zzaduVar.zzg(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = zzafl.zza().zzb(zzaduVar.getClass()).zzl(zzaduVar);
        if (z10) {
            zzaduVar.zzg(2, true != zZzl ? null : zzaduVar, null);
        }
        return zZzl;
    }

    private static zzadu zze(zzadu zzaduVar, byte[] bArr, int i10, int i11, zzadf zzadfVar) throws zzaeh {
        if (i11 == 0) {
            return zzaduVar;
        }
        zzadu zzaduVarZzck = zzaduVar.zzck();
        try {
            zzafp zzafpVarZzb = zzafl.zza().zzb(zzaduVarZzck.getClass());
            zzafpVarZzb.zzj(zzaduVarZzck, bArr, 0, i11, new zzacg(zzadfVar));
            zzafpVarZzb.zzk(zzaduVarZzck);
            return zzaduVarZzck;
        } catch (zzaeh e10) {
            if (e10.zzb()) {
                throw new zzaeh(e10);
            }
            throw e10;
        } catch (zzafy e11) {
            throw e11.zza();
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzaeh) {
                throw ((zzaeh) e12.getCause());
            }
            throw new zzaeh(e12);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static zzadu zzf(zzadu zzaduVar) throws zzaeh {
        if (zzaduVar == null || zzd(zzaduVar, true)) {
            return zzaduVar;
        }
        throw new zzafy(zzaduVar).zza();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzafl.zza().zzb(getClass()).zzb(this, (zzadu) obj);
    }

    public final int hashCode() {
        if (zzch()) {
            return zzcl();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iZzcl = zzcl();
        this.zza = iZzcl;
        return iZzcl;
    }

    public final String toString() {
        return zzafe.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.measurement.zzafc
    public final void zzcH(zzada zzadaVar) throws IOException {
        zzafl.zza().zzb(getClass()).zzf(this, zzadb.zza(zzadaVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzafc
    public final /* synthetic */ zzafb zzcI() {
        return (zzadp) zzg(5, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzafd
    public final boolean zzcJ() {
        return zzd(this, true);
    }

    @Override // com.google.android.gms.internal.measurement.zzafd
    public final /* synthetic */ zzafc zzcK() {
        return (zzadu) zzg(6, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzacb
    final int zzcf(zzafp zzafpVar) {
        if (zzch()) {
            int iZze = zzafpVar.zze(this);
            if (iZze >= 0) {
                return iZze;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZze).length() + 42);
            sb2.append("serialized size must be non-negative, was ");
            sb2.append(iZze);
            throw new IllegalStateException(sb2.toString());
        }
        int i10 = this.zzb & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iZze2 = zzafpVar.zze(this);
        if (iZze2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iZze2;
            return iZze2;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(iZze2).length() + 42);
        sb3.append("serialized size must be non-negative, was ");
        sb3.append(iZze2);
        throw new IllegalStateException(sb3.toString());
    }

    final boolean zzch() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    final void zzci() {
        this.zzb &= Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzafc
    public final zzafj zzcj() {
        return (zzafj) zzg(7, null, null);
    }

    final zzadu zzck() {
        return (zzadu) zzg(4, null, null);
    }

    final int zzcl() {
        return zzafl.zza().zzb(getClass()).zzc(this);
    }

    protected final void zzcm() {
        zzafl.zza().zzb(getClass()).zzk(this);
        zzci();
    }

    protected final zzadp zzcn() {
        return (zzadp) zzg(5, null, null);
    }

    public final zzadp zzco() {
        zzadp zzadpVar = (zzadp) zzg(5, null, null);
        zzadpVar.zzbe(this);
        return zzadpVar;
    }

    final void zzcp(int i10) {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzafc
    public final int zzcq() {
        int iZzc;
        if (zzch()) {
            iZzc = zzc(null);
            if (iZzc < 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(iZzc).length() + 42);
                sb2.append("serialized size must be non-negative, was ");
                sb2.append(iZzc);
                throw new IllegalStateException(sb2.toString());
            }
        } else {
            iZzc = this.zzb & Integer.MAX_VALUE;
            if (iZzc == Integer.MAX_VALUE) {
                iZzc = zzc(null);
                if (iZzc < 0) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(iZzc).length() + 42);
                    sb3.append("serialized size must be non-negative, was ");
                    sb3.append(iZzc);
                    throw new IllegalStateException(sb3.toString());
                }
                this.zzb = (this.zzb & Integer.MIN_VALUE) | iZzc;
            }
        }
        return iZzc;
    }

    protected abstract Object zzg(int i10, Object obj, Object obj2);
}
