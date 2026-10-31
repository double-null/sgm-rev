package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzici;
import com.google.android.gms.internal.ads.zzicj;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import sc.NfwM.XDucgbzInpQa;
import ze.tmM.zKUlck;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzici<MessageType extends zzicj<MessageType, BuilderType>, BuilderType extends zzici<MessageType, BuilderType>> implements zzifo {
    private String zza(String str) {
        String name = getClass().getName();
        StringBuilder sb2 = new StringBuilder(name.length() + 16 + String.valueOf(str).length() + 44);
        sb2.append("Reading ");
        sb2.append(name);
        sb2.append(" from a ");
        sb2.append(str);
        sb2.append(" threw an IOException (should never happen).");
        return sb2.toString();
    }

    protected static zzigs zzaR(zzifp zzifpVar) {
        return new zzigs(zzifpVar);
    }

    @Deprecated
    protected static <T> void zzaS(Iterable<T> iterable, Collection<? super T> collection) {
        zzaT(iterable, (List) collection);
    }

    protected static <T> void zzaT(Iterable<T> iterable, List<? super T> list) {
        iterable.getClass();
        if (!(iterable instanceof zzifa)) {
            if (iterable instanceof zzify) {
                list.addAll((Collection) iterable);
                return;
            } else {
                zzb(iterable, list);
                return;
            }
        }
        List listZza = ((zzifa) iterable).zza();
        zzifa zzifaVar = (zzifa) list;
        int size = list.size();
        for (Object obj : listZza) {
            if (obj == null) {
                int size2 = zzifaVar.size() - size;
                StringBuilder sb2 = new StringBuilder(String.valueOf(size2).length() + 26);
                sb2.append("Element at index ");
                sb2.append(size2);
                sb2.append(" is null.");
                String string = sb2.toString();
                int size3 = zzifaVar.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(string);
                    }
                    zzifaVar.remove(size3);
                }
            } else if (obj instanceof zzida) {
                zzifaVar.zzb();
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                zzida.zzt(bArr, 0, bArr.length);
                zzifaVar.zzb();
            } else {
                zzifaVar.add((String) obj);
            }
        }
    }

    private static <T> void zzb(Iterable<T> iterable, List<? super T> list) {
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof zziga) {
                ((zziga) list).zze(list.size() + size);
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    zzc(list, size2);
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i10 = 0; i10 < size3; i10++) {
            a0.c cVar = (Object) list2.get(i10);
            if (cVar == null) {
                zzc(list, size2);
            }
            list.add(cVar);
        }
    }

    @Override // 
    public abstract BuilderType zzbf();

    /* JADX INFO: renamed from: zzaD, reason: merged with bridge method [inline-methods] */
    public BuilderType zzbe(zzide zzideVar) throws IOException {
        int i10 = zzido.zzb;
        int i11 = zzicn.zza;
        return (BuilderType) zzbd(zzideVar, zzido.zza);
    }

    @Override // 
    /* JADX INFO: renamed from: zzaE, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType zzbd(zzide zzideVar, zzido zzidoVar) throws IOException;

    public BuilderType zzaG(zzida zzidaVar, zzido zzidoVar) throws zziet {
        try {
            zzide zzideVarZzm = zzidaVar.zzm();
            zzbd(zzideVarZzm, zzidoVar);
            zzideVarZzm.zzb(0);
            return this;
        } catch (zziet e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException(zza("ByteString"), e11);
        }
    }

    /* JADX INFO: renamed from: zzaH, reason: merged with bridge method [inline-methods] */
    public BuilderType zzba(byte[] bArr) throws zziet {
        return (BuilderType) zzaZ(bArr, 0, bArr.length);
    }

    @Override // 
    /* JADX INFO: renamed from: zzaI, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaZ(byte[] bArr, int i10, int i11) throws zziet {
        try {
            zzide zzideVarZzI = zzide.zzI(bArr, i10, i11, false);
            zzbe(zzideVarZzI);
            zzideVarZzI.zzb(0);
            return this;
        } catch (zziet e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException(zza("byte array"), e11);
        }
    }

    /* JADX INFO: renamed from: zzaJ, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaY(byte[] bArr, zzido zzidoVar) throws zziet {
        return (BuilderType) zzaX(bArr, 0, bArr.length, zzidoVar);
    }

    @Override // 
    /* JADX INFO: renamed from: zzaK, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaX(byte[] bArr, int i10, int i11, zzido zzidoVar) throws zziet {
        try {
            zzide zzideVarZzI = zzide.zzI(bArr, i10, i11, false);
            zzbd(zzideVarZzI, zzidoVar);
            zzideVarZzI.zzb(0);
            return this;
        } catch (zziet e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException(zza("byte array"), e11);
        }
    }

    public BuilderType zzaL(InputStream inputStream) throws IOException {
        zzide zzideVarZzH = zzide.zzH(inputStream, 4096);
        zzbe(zzideVarZzH);
        zzideVarZzH.zzb(0);
        return this;
    }

    public BuilderType zzaM(InputStream inputStream, zzido zzidoVar) throws IOException {
        zzide zzideVarZzH = zzide.zzH(inputStream, 4096);
        zzbd(zzideVarZzH, zzidoVar);
        zzideVarZzH.zzb(0);
        return this;
    }

    public boolean zzaN(InputStream inputStream, zzido zzidoVar) throws IOException {
        int i10 = inputStream.read();
        if (i10 == -1) {
            return false;
        }
        zzaM(new zzich(inputStream, zzide.zzO(i10, inputStream)), zzidoVar);
        return true;
    }

    public boolean zzaO(InputStream inputStream) throws IOException {
        int i10 = zzido.zzb;
        int i11 = zzicn.zza;
        return zzaN(inputStream, zzido.zza);
    }

    /* JADX INFO: renamed from: zzaP, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaU(zzifp zzifpVar) {
        if (zzbw().getClass().isInstance(zzifpVar)) {
            return (BuilderType) zzaQ((zzicj) zzifpVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    protected abstract BuilderType zzaQ(MessageType messagetype);

    public /* bridge */ /* synthetic */ zzifo zzaV(InputStream inputStream, zzido zzidoVar) throws IOException {
        zzaM(inputStream, zzidoVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzifo zzaW(InputStream inputStream) throws IOException {
        zzaL(inputStream);
        return this;
    }

    public /* bridge */ /* synthetic */ zzifo zzbb(zzida zzidaVar, zzido zzidoVar) throws zziet {
        zzaG(zzidaVar, zzidoVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzifo zzbc(zzida zzidaVar) throws zziet {
        zzaF(zzidaVar);
        return this;
    }

    private static void zzc(List<?> list, int i10) {
        int size = list.size() - i10;
        StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 26);
        sb2.append(zKUlck.vSdQqkZcG);
        sb2.append(size);
        sb2.append(" is null.");
        String string = sb2.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 >= i10) {
                list.remove(size2);
            } else {
                throw new NullPointerException(string);
            }
        }
    }

    public BuilderType zzaF(zzida zzidaVar) throws zziet {
        try {
            zzide zzideVarZzm = zzidaVar.zzm();
            zzbe(zzideVarZzm);
            zzideVarZzm.zzb(0);
            return this;
        } catch (zziet e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException(zza(XDucgbzInpQa.QSfYsAfYBgXlUi), e11);
        }
    }
}
