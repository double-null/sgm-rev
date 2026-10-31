package r3;

import com.adjust.sdk.Constants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: ProtobufDataEncoderContext.java */
/* JADX INFO: loaded from: classes4.dex */
final class f implements o3.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Charset f24876f = Charset.forName(Constants.ENCODING);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final o3.b f24877g = o3.b.a(SDKConstants.PARAM_KEY).b(r3.a.b().c(1).a()).a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final o3.b f24878h = o3.b.a("value").b(r3.a.b().c(2).a()).a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final o3.c<Map.Entry<Object, Object>> f24879i = new o3.c() { // from class: r3.e
        @Override // o3.c
        public final void a(Object obj, Object obj2) throws IOException {
            f.w((Map.Entry) obj, (o3.d) obj2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OutputStream f24880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, o3.c<?>> f24881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, o3.e<?>> f24882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o3.c<Object> f24883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f24884e = new i(this);

    /* JADX INFO: compiled from: ProtobufDataEncoderContext.java */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f24885a;

        static {
            int[] iArr = new int[d.a.values().length];
            f24885a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24885a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24885a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    f(OutputStream outputStream, Map<Class<?>, o3.c<?>> map, Map<Class<?>, o3.e<?>> map2, o3.c<Object> cVar) {
        this.f24880a = outputStream;
        this.f24881b = map;
        this.f24882c = map2;
        this.f24883d = cVar;
    }

    private static ByteBuffer p(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private <T> long q(o3.c<T> cVar, T t10) throws IOException {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f24880a;
            this.f24880a = bVar;
            try {
                cVar.a(t10, this);
                this.f24880a = outputStream;
                long jB = bVar.b();
                bVar.close();
                return jB;
            } catch (Throwable th) {
                this.f24880a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private <T> f r(o3.c<T> cVar, o3.b bVar, T t10, boolean z10) throws IOException {
        long jQ = q(cVar, t10);
        if (z10 && jQ == 0) {
            return this;
        }
        x((v(bVar) << 3) | 2);
        y(jQ);
        cVar.a(t10, this);
        return this;
    }

    private <T> f s(o3.e<T> eVar, o3.b bVar, T t10, boolean z10) throws IOException {
        this.f24884e.b(bVar, z10);
        eVar.a(t10, this.f24884e);
        return this;
    }

    private static d u(o3.b bVar) {
        d dVar = (d) bVar.c(d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private static int v(o3.b bVar) {
        d dVar = (d) bVar.c(d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(Map.Entry entry, o3.d dVar) throws IOException {
        dVar.f(f24877g, entry.getKey());
        dVar.f(f24878h, entry.getValue());
    }

    private void x(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f24880a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f24880a.write(i10 & 127);
    }

    private void y(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f24880a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f24880a.write(((int) j10) & 127);
    }

    @Override // o3.d
    public o3.d a(o3.b bVar, double d10) throws IOException {
        return g(bVar, d10, true);
    }

    @Override // o3.d
    public o3.d f(o3.b bVar, Object obj) throws IOException {
        return i(bVar, obj, true);
    }

    o3.d g(o3.b bVar, double d10, boolean z10) throws IOException {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        x((v(bVar) << 3) | 1);
        this.f24880a.write(p(8).putDouble(d10).array());
        return this;
    }

    o3.d h(o3.b bVar, float f10, boolean z10) throws IOException {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        x((v(bVar) << 3) | 5);
        this.f24880a.write(p(4).putFloat(f10).array());
        return this;
    }

    o3.d i(o3.b bVar, Object obj, boolean z10) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            x((v(bVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f24876f);
            x(bytes.length);
            this.f24880a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                i(bVar, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                r(f24879i, bVar, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            return g(bVar, ((Double) obj).doubleValue(), z10);
        }
        if (obj instanceof Float) {
            return h(bVar, ((Float) obj).floatValue(), z10);
        }
        if (obj instanceof Number) {
            return m(bVar, ((Number) obj).longValue(), z10);
        }
        if (obj instanceof Boolean) {
            return o(bVar, ((Boolean) obj).booleanValue(), z10);
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return this;
            }
            x((v(bVar) << 3) | 2);
            x(bArr.length);
            this.f24880a.write(bArr);
            return this;
        }
        o3.c<?> cVar = this.f24881b.get(obj.getClass());
        if (cVar != null) {
            return r(cVar, bVar, obj, z10);
        }
        o3.e<?> eVar = this.f24882c.get(obj.getClass());
        if (eVar != null) {
            return s(eVar, bVar, obj, z10);
        }
        if (obj instanceof c) {
            return c(bVar, ((c) obj).getNumber());
        }
        return obj instanceof Enum ? c(bVar, ((Enum) obj).ordinal()) : r(this.f24883d, bVar, obj, z10);
    }

    @Override // o3.d
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public f c(o3.b bVar, int i10) throws IOException {
        return k(bVar, i10, true);
    }

    f k(o3.b bVar, int i10, boolean z10) throws IOException {
        if (z10 && i10 == 0) {
            return this;
        }
        d dVarU = u(bVar);
        int i11 = a.f24885a[dVarU.intEncoding().ordinal()];
        if (i11 == 1) {
            x(dVarU.tag() << 3);
            x(i10);
        } else if (i11 == 2) {
            x(dVarU.tag() << 3);
            x((i10 << 1) ^ (i10 >> 31));
        } else if (i11 == 3) {
            x((dVarU.tag() << 3) | 5);
            this.f24880a.write(p(4).putInt(i10).array());
        }
        return this;
    }

    @Override // o3.d
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public f b(o3.b bVar, long j10) throws IOException {
        return m(bVar, j10, true);
    }

    f m(o3.b bVar, long j10, boolean z10) throws IOException {
        if (z10 && j10 == 0) {
            return this;
        }
        d dVarU = u(bVar);
        int i10 = a.f24885a[dVarU.intEncoding().ordinal()];
        if (i10 == 1) {
            x(dVarU.tag() << 3);
            y(j10);
        } else if (i10 == 2) {
            x(dVarU.tag() << 3);
            y((j10 >> 63) ^ (j10 << 1));
        } else if (i10 == 3) {
            x((dVarU.tag() << 3) | 1);
            this.f24880a.write(p(8).putLong(j10).array());
        }
        return this;
    }

    @Override // o3.d
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public f d(o3.b bVar, boolean z10) throws IOException {
        return o(bVar, z10, true);
    }

    f o(o3.b bVar, boolean z10, boolean z11) throws IOException {
        return k(bVar, z10 ? 1 : 0, z11);
    }

    f t(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        o3.c<?> cVar = this.f24881b.get(obj.getClass());
        if (cVar != null) {
            cVar.a(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }
}
