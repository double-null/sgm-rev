package r3;

import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: ProtobufEncoder.java */
/* JADX INFO: loaded from: classes4.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, o3.c<?>> f24886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, o3.e<?>> f24887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o3.c<Object> f24888c;

    /* JADX INFO: compiled from: ProtobufEncoder.java */
    public static final class a implements p3.b<a> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final o3.c<Object> f24889d = new o3.c() { // from class: r3.g
            @Override // o3.c
            public final void a(Object obj, Object obj2) throws IOException {
                h.a.e(obj, (o3.d) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<Class<?>, o3.c<?>> f24890a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<Class<?>, o3.e<?>> f24891b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private o3.c<Object> f24892c = f24889d;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void e(Object obj, o3.d dVar) throws IOException {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h c() {
            return new h(new HashMap(this.f24890a), new HashMap(this.f24891b), this.f24892c);
        }

        public a d(p3.a aVar) {
            aVar.a(this);
            return this;
        }

        @Override // p3.b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public <U> a a(Class<U> cls, o3.c<? super U> cVar) {
            this.f24890a.put(cls, cVar);
            this.f24891b.remove(cls);
            return this;
        }
    }

    h(Map<Class<?>, o3.c<?>> map, Map<Class<?>, o3.e<?>> map2, o3.c<Object> cVar) {
        this.f24886a = map;
        this.f24887b = map2;
        this.f24888c = cVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) throws IOException {
        new f(outputStream, this.f24886a, this.f24887b, this.f24888c).t(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
