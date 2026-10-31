package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzidy;
import com.google.android.gms.internal.ads.zziee;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zziee<MessageType extends zziee<MessageType, BuilderType>, BuilderType extends zzidy<MessageType, BuilderType>> extends zzicj<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static final Map<Class<?>, zziee<?, ?>> zzd = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzc = -1;
    protected zzigu zzt = zzigu.zza();

    static Method zzbA(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            String name = cls.getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 43 + String.valueOf(str).length() + 2);
            sb2.append("Generated message class \"");
            sb2.append(name);
            sb2.append("\" missing method \"");
            sb2.append(str);
            sb2.append("\".");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    static Object zzbB(Method method, Object obj, Object... objArr) {
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

    protected static zziem zzbC() {
        return zzief.zzd();
    }

    protected static zziem zzbD(zziem zziemVar) {
        int size = zziemVar.size();
        return zziemVar.zzh(size + size);
    }

    protected static zziep zzbE() {
        return zzifd.zzg();
    }

    protected static zziep zzbF(zziep zziepVar) {
        int size = zziepVar.size();
        return zziepVar.zzh(size + size);
    }

    protected static zziel zzbG() {
        return zzidv.zzd();
    }

    protected static zziel zzbH(zziel zzielVar) {
        int size = zzielVar.size();
        return zzielVar.zzh(size + size);
    }

    protected static zzieh zzbI() {
        return zzidl.zzd();
    }

    protected static zzieh zzbJ(zzieh zziehVar) {
        int size = zziehVar.size();
        return zziehVar.zzh(size + size);
    }

    protected static zzieg zzbK() {
        return zzicq.zzd();
    }

    protected static zzieg zzbL(zzieg zziegVar) {
        int size = zziegVar.size();
        return zziegVar.zzh(size + size);
    }

    protected static <E> zzieq<E> zzbM() {
        return zziga.zzd();
    }

    protected static <E> zzieq<E> zzbN(zzieq<E> zzieqVar) {
        int size = zzieqVar.size();
        return zzieqVar.zzh(size + size);
    }

    static <T extends zziee<T, ?>> T zzbO(T t10, zzide zzideVar, zzido zzidoVar) throws zziet {
        T t11 = (T) t10.zzbg();
        try {
            zzigh zzighVarZzb = zzifz.zza().zzb(t11.getClass());
            zzighVarZzb.zzg(t11, zzidf.zza(zzideVar), zzidoVar);
            zzighVarZzb.zzk(t11);
            return t11;
        } catch (zziet e10) {
            if (e10.zzb()) {
                throw new zziet(e10);
            }
            throw e10;
        } catch (zzigs e11) {
            throw e11.zza();
        } catch (IOException e12) {
            if (e12.getCause() instanceof zziet) {
                throw ((zziet) e12.getCause());
            }
            throw new zziet(e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zziet) {
                throw ((zziet) e13.getCause());
            }
            throw e13;
        }
    }

    protected static <T extends zziee<T, ?>> T zzbP(T t10, zzide zzideVar) throws zziet {
        int i10 = zzido.zzb;
        int i11 = zzicn.zza;
        return (T) zzbO(t10, zzideVar, zzido.zza);
    }

    protected static <T extends zziee<T, ?>> T zzbQ(T t10, ByteBuffer byteBuffer, zzido zzidoVar) throws zziet {
        zzide zzideVarZzI;
        int i10 = zzide.zze;
        if (byteBuffer.hasArray()) {
            zzideVarZzI = zzide.zzI(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), false);
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            zzideVarZzI = zzide.zzI(bArr, 0, iRemaining, true);
        }
        T t11 = (T) zzbZ(t10, zzideVarZzI, zzidoVar);
        zzi(t11);
        return t11;
    }

    protected static <T extends zziee<T, ?>> T zzbR(T t10, ByteBuffer byteBuffer) throws zziet {
        int i10 = zzido.zzb;
        int i11 = zzicn.zza;
        return (T) zzbQ(t10, byteBuffer, zzido.zza);
    }

    protected static <T extends zziee<T, ?>> T zzbS(T t10, zzida zzidaVar) throws zziet {
        int i10 = zzido.zzb;
        int i11 = zzicn.zza;
        T t11 = (T) zzbT(t10, zzidaVar, zzido.zza);
        zzi(t11);
        return t11;
    }

    protected static <T extends zziee<T, ?>> T zzbT(T t10, zzida zzidaVar, zzido zzidoVar) throws zziet {
        T t11 = (T) zzj(t10, zzidaVar, zzidoVar);
        zzi(t11);
        return t11;
    }

    protected static <T extends zziee<T, ?>> T zzbU(T t10, byte[] bArr) throws zziet {
        int length = bArr.length;
        int i10 = zzido.zzb;
        int i11 = zzicn.zza;
        T t11 = (T) zzh(t10, bArr, 0, length, zzido.zza);
        zzi(t11);
        return t11;
    }

    protected static <T extends zziee<T, ?>> T zzbV(T t10, byte[] bArr, zzido zzidoVar) throws zziet {
        T t11 = (T) zzh(t10, bArr, 0, bArr.length, zzidoVar);
        zzi(t11);
        return t11;
    }

    protected static <T extends zziee<T, ?>> T zzbW(T t10, InputStream inputStream) throws zziet {
        zzide zzideVarZzH = zzide.zzH(inputStream, 4096);
        int i10 = zzido.zzb;
        int i11 = zzicn.zza;
        T t11 = (T) zzbO(t10, zzideVarZzH, zzido.zza);
        zzi(t11);
        return t11;
    }

    protected static <T extends zziee<T, ?>> T zzbX(T t10, InputStream inputStream, zzido zzidoVar) throws zziet {
        T t11 = (T) zzbO(t10, zzide.zzH(inputStream, 4096), zzidoVar);
        zzi(t11);
        return t11;
    }

    protected static <T extends zziee<T, ?>> T zzbY(T t10, zzide zzideVar) throws zziet {
        int i10 = zzido.zzb;
        int i11 = zzicn.zza;
        return (T) zzbZ(t10, zzideVar, zzido.zza);
    }

    protected static <T extends zziee<T, ?>> T zzbZ(T t10, zzide zzideVar, zzido zzidoVar) throws zziet {
        T t11 = (T) zzbO(t10, zzideVar, zzidoVar);
        zzi(t11);
        return t11;
    }

    static <T extends zziee> T zzbt(Class<T> cls) {
        Map<Class<?>, zziee<?, ?>> map = zzd;
        zziee<?, ?> zzieeVarZzbw = map.get(cls);
        if (zzieeVarZzbw == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzieeVarZzbw = map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzieeVarZzbw == null) {
            zzieeVarZzbw = ((zziee) zziha.zzb(cls)).zzbw();
            if (zzieeVarZzbw == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzieeVarZzbw);
        }
        return zzieeVarZzbw;
    }

    protected static <T extends zziee> void zzbu(Class<T> cls, T t10) {
        t10.zzaY();
        zzd.put(cls, t10);
    }

    protected static Object zzbv(zzifp zzifpVar, String str, Object[] objArr) {
        return new zzigb(zzifpVar, str, objArr);
    }

    public static <ContainingType extends zzifp, Type> zziec<ContainingType, Type> zzby(ContainingType containingtype, Type type, zzifp zzifpVar, zziej zziejVar, int i10, zzihg zzihgVar, Class cls) {
        return new zziec<>(containingtype, type, zzifpVar, new zzieb(zziejVar, i10, zzihgVar, false, false), cls);
    }

    public static <ContainingType extends zzifp, Type> zziec<ContainingType, Type> zzbz(ContainingType containingtype, zzifp zzifpVar, zziej zziejVar, int i10, zzihg zzihgVar, boolean z10, Class cls) {
        return new zziec<>(containingtype, zziga.zzd(), zzifpVar, new zzieb(zziejVar, i10, zzihgVar, true, z10), cls);
    }

    private void zzc() {
        if (this.zzt == zzigu.zza()) {
            this.zzt = zzigu.zzb();
        }
    }

    protected static <T extends zziee<T, ?>> T zzca(T t10, InputStream inputStream) throws zziet {
        int i10 = zzido.zzb;
        int i11 = zzicn.zza;
        T t11 = (T) zzk(t10, inputStream, zzido.zza);
        zzi(t11);
        return t11;
    }

    protected static <T extends zziee<T, ?>> T zzcb(T t10, InputStream inputStream, zzido zzidoVar) throws zziet {
        T t11 = (T) zzk(t10, inputStream, zzidoVar);
        zzi(t11);
        return t11;
    }

    private int zzd(zzigh<?> zzighVar) {
        if (zzighVar != null) {
            return zzighVar.zze(this);
        }
        return zzifz.zza().zzb(getClass()).zze(this);
    }

    private static <MessageType extends zziea<MessageType, BuilderType>, BuilderType, T> zziec<MessageType, T> zze(zzidm<MessageType, T> zzidmVar) {
        return (zziec) zzidmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends zziee<T, ?>> boolean zzg(T t10, boolean z10) {
        byte bByteValue = ((Byte) t10.zzdc(zzied.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = zzifz.zza().zzb(t10.getClass()).zzl(t10);
        if (z10) {
            t10.zzdc(zzied.SET_MEMOIZED_IS_INITIALIZED, true != zZzl ? null : t10, null);
        }
        return zZzl;
    }

    private static <T extends zziee<T, ?>> T zzh(T t10, byte[] bArr, int i10, int i11, zzido zzidoVar) throws zziet {
        if (i11 == 0) {
            return t10;
        }
        T t11 = (T) t10.zzbg();
        try {
            zzigh zzighVarZzb = zzifz.zza().zzb(t11.getClass());
            zzighVarZzb.zzj(t11, bArr, i10, i10 + i11, new zzico(zzidoVar));
            zzighVarZzb.zzk(t11);
            return t11;
        } catch (zziet e10) {
            if (e10.zzb()) {
                throw new zziet(e10);
            }
            throw e10;
        } catch (zzigs e11) {
            throw e11.zza();
        } catch (IOException e12) {
            if (e12.getCause() instanceof zziet) {
                throw ((zziet) e12.getCause());
            }
            throw new zziet(e12);
        } catch (IndexOutOfBoundsException unused) {
            throw new zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static <T extends zziee<T, ?>> T zzi(T t10) throws zziet {
        if (t10 == null || t10.zzbi()) {
            return t10;
        }
        throw t10.zzaU().zza();
    }

    private static <T extends zziee<T, ?>> T zzj(T t10, zzida zzidaVar, zzido zzidoVar) throws zziet {
        zzide zzideVarZzm = zzidaVar.zzm();
        T t11 = (T) zzbO(t10, zzideVarZzm, zzidoVar);
        try {
            zzideVarZzm.zzb(0);
            return t11;
        } catch (zziet e10) {
            throw e10;
        }
    }

    private static <T extends zziee<T, ?>> T zzk(T t10, InputStream inputStream, zzido zzidoVar) throws zziet {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            zzide zzideVarZzH = zzide.zzH(new zzich(inputStream, zzide.zzO(i10, inputStream)), 4096);
            T t11 = (T) zzbO(t10, zzideVarZzH, zzidoVar);
            try {
                zzideVarZzH.zzb(0);
                return t11;
            } catch (zziet e10) {
                throw e10;
            }
        } catch (zziet e11) {
            if (e11.zzb()) {
                throw new zziet(e11);
            }
            throw e11;
        } catch (IOException e12) {
            throw new zziet(e12);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzifz.zza().zzb(getClass()).zzb(this, (zziee) obj);
    }

    public int hashCode() {
        if (zzaX()) {
            return zzbh();
        }
        if (zzbc()) {
            zzba(zzbh());
        }
        return zzaZ();
    }

    public String toString() {
        return zzifr.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzicj
    final int zzaQ() {
        return this.zzc & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzicj
    void zzaR(int i10) {
        if (i10 >= 0) {
            this.zzc = i10 | (this.zzc & Integer.MIN_VALUE);
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 42);
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(i10);
        throw new IllegalStateException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzicj
    int zzaT(zzigh zzighVar) {
        if (!zzaX()) {
            if (zzaQ() != Integer.MAX_VALUE) {
                return zzaQ();
            }
            int iZzd = zzd(zzighVar);
            zzaR(iZzd);
            return iZzd;
        }
        int iZzd2 = zzd(zzighVar);
        if (iZzd2 >= 0) {
            return iZzd2;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzd2).length() + 42);
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(iZzd2);
        throw new IllegalStateException(sb2.toString());
    }

    final boolean zzaX() {
        return (this.zzc & Integer.MIN_VALUE) != 0;
    }

    final void zzaY() {
        this.zzc &= Integer.MAX_VALUE;
    }

    final int zzaZ() {
        return this.zzq;
    }

    final void zzba(int i10) {
        this.zzq = i10;
    }

    final void zzbb() {
        this.zzq = 0;
    }

    final boolean zzbc() {
        return zzaZ() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public final zzifx<MessageType> zzbd() {
        return (zzifx) zzdc(zzied.GET_PARSER, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzifq
    /* JADX INFO: renamed from: zzbe, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbw() {
        return (MessageType) zzdc(zzied.GET_DEFAULT_INSTANCE, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    /* JADX INFO: renamed from: zzbf, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcY() {
        return (BuilderType) zzdc(zzied.zze, null, null);
    }

    final MessageType zzbg() {
        return (MessageType) zzdc(zzied.NEW_MUTABLE_INSTANCE, null, null);
    }

    final int zzbh() {
        return zzifz.zza().zzb(getClass()).zzc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzifq
    public final boolean zzbi() {
        return zzg(this, true);
    }

    protected final boolean zzbj(int i10, zzide zzideVar) throws IOException {
        if ((i10 & 7) == 4) {
            return false;
        }
        zzc();
        return this.zzt.zzl(i10, zzideVar);
    }

    protected final void zzbk(int i10, int i11) {
        zzc();
        zzigu zziguVar = this.zzt;
        zziguVar.zze();
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zziguVar.zzk(i10 << 3, Long.valueOf(i11));
    }

    protected final void zzbl(int i10, zzida zzidaVar) {
        zzc();
        zzigu zziguVar = this.zzt;
        zziguVar.zze();
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zziguVar.zzk((i10 << 3) | 2, zzidaVar);
    }

    protected final void zzbm() {
        zzifz.zza().zzb(getClass()).zzk(this);
        zzaY();
    }

    protected final <MessageType2 extends zziee<MessageType2, BuilderType2>, BuilderType2 extends zzidy<MessageType2, BuilderType2>> BuilderType2 zzbn() {
        return (BuilderType2) zzdc(zzied.zze, null, null);
    }

    protected final <MessageType2 extends zziee<MessageType2, BuilderType2>, BuilderType2 extends zzidy<MessageType2, BuilderType2>> BuilderType2 zzbo(MessageType2 messagetype2) {
        BuilderType2 buildertype2 = (BuilderType2) zzbn();
        buildertype2.zzbo(messagetype2);
        return buildertype2;
    }

    /* JADX INFO: renamed from: zzbp, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcc() {
        BuilderType buildertype = (BuilderType) zzdc(zzied.zze, null, null);
        buildertype.zzbo(this);
        return buildertype;
    }

    final void zzbq() {
        zzaR(Integer.MAX_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public int zzbr() {
        return zzaT(null);
    }

    final Object zzbs() throws Exception {
        return zzdc(zzied.BUILD_MESSAGE_INFO, null, null);
    }

    protected final void zzbx(zzigu zziguVar) {
        this.zzt = zzigu.zzc(this.zzt, zziguVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public void zzcX(zzidj zzidjVar) throws IOException {
        zzifz.zza().zzb(getClass()).zzf(this, zzidk.zza(zzidjVar));
    }

    protected abstract Object zzdc(zzied zziedVar, Object obj, Object obj2);
}
