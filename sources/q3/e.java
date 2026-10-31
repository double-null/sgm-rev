package q3;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: JsonValueObjectEncoderContext.java */
/* JADX INFO: loaded from: classes4.dex */
final class e implements o3.d, o3.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f24397a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f24398b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JsonWriter f24399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Class<?>, o3.c<?>> f24400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<Class<?>, o3.e<?>> f24401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o3.c<Object> f24402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f24403g;

    e(Writer writer, Map<Class<?>, o3.c<?>> map, Map<Class<?>, o3.e<?>> map2, o3.c<Object> cVar, boolean z10) {
        this.f24399c = new JsonWriter(writer);
        this.f24400d = map;
        this.f24401e = map2;
        this.f24402f = cVar;
        this.f24403g = z10;
    }

    private boolean t(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private e w(String str, Object obj) throws EncodingException, IOException {
        y();
        this.f24399c.name(str);
        if (obj != null) {
            return k(obj, false);
        }
        this.f24399c.nullValue();
        return this;
    }

    private e x(String str, Object obj) throws EncodingException, IOException {
        if (obj == null) {
            return this;
        }
        y();
        this.f24399c.name(str);
        return k(obj, false);
    }

    private void y() throws IOException {
        if (!this.f24398b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        e eVar = this.f24397a;
        if (eVar != null) {
            eVar.y();
            this.f24397a.f24398b = false;
            this.f24397a = null;
            this.f24399c.endObject();
        }
    }

    @Override // o3.d
    public o3.d a(o3.b bVar, double d10) throws IOException {
        return m(bVar.b(), d10);
    }

    @Override // o3.d
    public o3.d b(o3.b bVar, long j10) throws IOException {
        return o(bVar.b(), j10);
    }

    @Override // o3.d
    public o3.d c(o3.b bVar, int i10) throws IOException {
        return n(bVar.b(), i10);
    }

    @Override // o3.d
    public o3.d d(o3.b bVar, boolean z10) throws IOException {
        return q(bVar.b(), z10);
    }

    @Override // o3.d
    public o3.d f(o3.b bVar, Object obj) throws IOException {
        return p(bVar.b(), obj);
    }

    public e h(double d10) throws IOException {
        y();
        this.f24399c.value(d10);
        return this;
    }

    public e i(int i10) throws IOException {
        y();
        this.f24399c.value(i10);
        return this;
    }

    public e j(long j10) throws IOException {
        y();
        this.f24399c.value(j10);
        return this;
    }

    e k(Object obj, boolean z10) throws IOException {
        int i10 = 0;
        if (z10 && t(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new EncodingException(String.format("%s cannot be encoded inline", objArr));
        }
        if (obj == null) {
            this.f24399c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f24399c.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f24399c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    k(it.next(), false);
                }
                this.f24399c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f24399c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        p((String) key, entry.getValue());
                    } catch (ClassCastException e10) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                this.f24399c.endObject();
                return this;
            }
            o3.c<?> cVar = this.f24400d.get(obj.getClass());
            if (cVar != null) {
                return v(cVar, obj, z10);
            }
            o3.e<?> eVar = this.f24401e.get(obj.getClass());
            if (eVar != null) {
                eVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return v(this.f24402f, obj, z10);
            }
            if (obj instanceof f) {
                i(((f) obj).getNumber());
            } else {
                e(((Enum) obj).name());
            }
            return this;
        }
        if (obj instanceof byte[]) {
            return s((byte[]) obj);
        }
        this.f24399c.beginArray();
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i10 < length) {
                this.f24399c.value(iArr[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                j(jArr[i10]);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                this.f24399c.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                this.f24399c.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                k(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                k(obj2, false);
            }
        }
        this.f24399c.endArray();
        return this;
    }

    @Override // o3.f
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public e e(String str) throws IOException {
        y();
        this.f24399c.value(str);
        return this;
    }

    public e m(String str, double d10) throws IOException {
        y();
        this.f24399c.name(str);
        return h(d10);
    }

    public e n(String str, int i10) throws IOException {
        y();
        this.f24399c.name(str);
        return i(i10);
    }

    public e o(String str, long j10) throws IOException {
        y();
        this.f24399c.name(str);
        return j(j10);
    }

    public e p(String str, Object obj) throws IOException {
        return this.f24403g ? x(str, obj) : w(str, obj);
    }

    public e q(String str, boolean z10) throws IOException {
        y();
        this.f24399c.name(str);
        return g(z10);
    }

    @Override // o3.f
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public e g(boolean z10) throws IOException {
        y();
        this.f24399c.value(z10);
        return this;
    }

    public e s(byte[] bArr) throws IOException {
        y();
        if (bArr == null) {
            this.f24399c.nullValue();
        } else {
            this.f24399c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    void u() throws IOException {
        y();
        this.f24399c.flush();
    }

    e v(o3.c<Object> cVar, Object obj, boolean z10) throws IOException {
        if (!z10) {
            this.f24399c.beginObject();
        }
        cVar.a(obj, this);
        if (!z10) {
            this.f24399c.endObject();
        }
        return this;
    }
}
