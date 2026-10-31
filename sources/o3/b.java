package o3;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: FieldDescriptor.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Object> f23011b;

    /* JADX INFO: renamed from: o3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FieldDescriptor.java */
    public static final class C0383b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f23012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<Class<?>, Object> f23013b = null;

        C0383b(String str) {
            this.f23012a = str;
        }

        public b a() {
            return new b(this.f23012a, this.f23013b == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.f23013b)));
        }

        public <T extends Annotation> C0383b b(T t10) {
            if (this.f23013b == null) {
                this.f23013b = new HashMap();
            }
            this.f23013b.put(t10.annotationType(), t10);
            return this;
        }
    }

    public static C0383b a(String str) {
        return new C0383b(str);
    }

    public static b d(String str) {
        return new b(str, Collections.emptyMap());
    }

    public String b() {
        return this.f23010a;
    }

    public <T extends Annotation> T c(Class<T> cls) {
        return (T) this.f23011b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f23010a.equals(bVar.f23010a) && this.f23011b.equals(bVar.f23011b);
    }

    public int hashCode() {
        return (this.f23010a.hashCode() * 31) + this.f23011b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f23010a + ", properties=" + this.f23011b.values() + "}";
    }

    private b(String str, Map<Class<?>, Object> map) {
        this.f23010a = str;
        this.f23011b = map;
    }
}
