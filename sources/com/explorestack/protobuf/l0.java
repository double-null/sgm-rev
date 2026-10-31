package com.explorestack.protobuf;

import com.adjust.sdk.Constants;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: Internal.java */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f10621a = Charset.forName(Constants.ENCODING);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Charset f10622b = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f10623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ByteBuffer f10624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f10625e;

    /* JADX INFO: compiled from: Internal.java */
    public interface a extends j<Boolean> {
        @Override // com.explorestack.protobuf.l0.j, com.explorestack.protobuf.l0.f
        j<Boolean> mutableCopyWithCapacity(int i10);
    }

    /* JADX INFO: compiled from: Internal.java */
    public interface b extends j<Double> {
        @Override // com.explorestack.protobuf.l0.j, com.explorestack.protobuf.l0.f
        j<Double> mutableCopyWithCapacity(int i10);
    }

    /* JADX INFO: compiled from: Internal.java */
    public interface c {
        int getNumber();
    }

    /* JADX INFO: compiled from: Internal.java */
    public interface d<T extends c> {
        T findValueByNumber(int i10);
    }

    /* JADX INFO: compiled from: Internal.java */
    public interface e {
        boolean isInRange(int i10);
    }

    /* JADX INFO: compiled from: Internal.java */
    public interface f extends j<Float> {
        @Override // 
        j<Float> mutableCopyWithCapacity(int i10);
    }

    /* JADX INFO: compiled from: Internal.java */
    public interface g extends j<Integer> {
        void addInt(int i10);

        int getInt(int i10);

        @Override // com.explorestack.protobuf.l0.j, com.explorestack.protobuf.l0.f
        j<Integer> mutableCopyWithCapacity(int i10);

        int setInt(int i10, int i11);
    }

    /* JADX INFO: compiled from: Internal.java */
    public static class h<F, T> extends AbstractList<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<F> f10626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a<F, T> f10627b;

        /* JADX INFO: compiled from: Internal.java */
        public interface a<F, T> {
            T convert(F f10);
        }

        public h(List<F> list, a<F, T> aVar) {
            this.f10626a = list;
            this.f10627b = aVar;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i10) {
            return (T) this.f10627b.convert(this.f10626a.get(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f10626a.size();
        }
    }

    /* JADX INFO: compiled from: Internal.java */
    public interface i extends j<Long> {
        @Override // com.explorestack.protobuf.l0.j, com.explorestack.protobuf.l0.f
        j<Long> mutableCopyWithCapacity(int i10);
    }

    /* JADX INFO: compiled from: Internal.java */
    public interface j<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        j<E> mutableCopyWithCapacity(int i10);
    }

    static {
        byte[] bArr = new byte[0];
        f10623c = bArr;
        f10624d = ByteBuffer.wrap(bArr);
        f10625e = n.l(bArr);
    }

    static <T> T a(T t10) {
        t10.getClass();
        return t10;
    }

    static <T> T b(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static <T extends MessageLite> T c(Class<T> cls) {
        try {
            Method method = cls.getMethod("getDefaultInstance", new Class[0]);
            return (T) method.invoke(method, new Object[0]);
        } catch (Exception e10) {
            throw new RuntimeException("Failed to get default instance for " + cls, e10);
        }
    }

    public static int d(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int e(byte[] bArr) {
        return f(bArr, 0, bArr.length);
    }

    static int f(byte[] bArr, int i10, int i11) {
        int iL = l(i11, bArr, i10, i11);
        if (iL == 0) {
            return 1;
        }
        return iL;
    }

    public static int g(c cVar) {
        return cVar.getNumber();
    }

    public static int h(List<? extends c> list) {
        Iterator<? extends c> it = list.iterator();
        int iG = 1;
        while (it.hasNext()) {
            iG = (iG * 31) + g(it.next());
        }
        return iG;
    }

    public static int i(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static boolean j(byte[] bArr) {
        return a3.s(bArr);
    }

    static Object k(Object obj, Object obj2) {
        return ((MessageLite) obj).toBuilder().mergeFrom((MessageLite) obj2).buildPartial();
    }

    static int l(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static String m(byte[] bArr) {
        return new String(bArr, f10621a);
    }
}
