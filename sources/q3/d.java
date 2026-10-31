package q3;

import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: compiled from: JsonDataEncoderBuilder.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements p3.b<d> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final o3.c<Object> f24387e = new o3.c() { // from class: q3.a
        @Override // o3.c
        public final void a(Object obj, Object obj2) throws IOException {
            d.l(obj, (o3.d) obj2);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final o3.e<String> f24388f = new o3.e() { // from class: q3.b
        @Override // o3.e
        public final void a(Object obj, Object obj2) throws IOException {
            ((o3.f) obj2).e((String) obj);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final o3.e<Boolean> f24389g = new o3.e() { // from class: q3.c
        @Override // o3.e
        public final void a(Object obj, Object obj2) throws IOException {
            d.n((Boolean) obj, (o3.f) obj2);
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b f24390h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, o3.c<?>> f24391a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, o3.e<?>> f24392b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private o3.c<Object> f24393c = f24387e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f24394d = false;

    /* JADX INFO: compiled from: JsonDataEncoderBuilder.java */
    class a implements o3.a {
        a() {
        }

        @Override // o3.a
        public void a(Object obj, Writer writer) throws IOException {
            e eVar = new e(writer, d.this.f24391a, d.this.f24392b, d.this.f24393c, d.this.f24394d);
            eVar.k(obj, false);
            eVar.u();
        }

        @Override // o3.a
        public String b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* JADX INFO: compiled from: JsonDataEncoderBuilder.java */
    private static final class b implements o3.e<Date> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final DateFormat f24396a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f24396a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // o3.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, o3.f fVar) throws IOException {
            fVar.e(f24396a.format(date));
        }
    }

    public d() {
        p(String.class, f24388f);
        p(Boolean.class, f24389g);
        p(Date.class, f24390h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(Object obj, o3.d dVar) throws IOException {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(Boolean bool, o3.f fVar) throws IOException {
        fVar.g(bool.booleanValue());
    }

    public o3.a i() {
        return new a();
    }

    public d j(p3.a aVar) {
        aVar.a(this);
        return this;
    }

    public d k(boolean z10) {
        this.f24394d = z10;
        return this;
    }

    @Override // p3.b
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public <T> d a(Class<T> cls, o3.c<? super T> cVar) {
        this.f24391a.put(cls, cVar);
        this.f24392b.remove(cls);
        return this;
    }

    public <T> d p(Class<T> cls, o3.e<? super T> eVar) {
        this.f24392b.put(cls, eVar);
        this.f24391a.remove(cls);
        return this;
    }
}
