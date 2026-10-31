package i4;

import com.google.gson.JsonIOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: compiled from: ConstructorConstructor.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Type, g4.h<?>> f15927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k4.b f15928b = k4.b.a();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    class a<T> implements i4.h<T> {
        a() {
        }

        @Override // i4.h
        public T a() {
            return (T) new ConcurrentHashMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    class b<T> implements i4.h<T> {
        b() {
        }

        @Override // i4.h
        public T a() {
            return (T) new TreeMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: i4.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    class C0244c<T> implements i4.h<T> {
        C0244c() {
        }

        @Override // i4.h
        public T a() {
            return (T) new LinkedHashMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    class d<T> implements i4.h<T> {
        d() {
        }

        @Override // i4.h
        public T a() {
            return (T) new i4.g();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    class e<T> implements i4.h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i4.l f15933a = i4.l.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f15934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Type f15935c;

        e(Class cls, Type type) {
            this.f15934b = cls;
            this.f15935c = type;
        }

        @Override // i4.h
        public T a() {
            try {
                return (T) this.f15933a.c(this.f15934b);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f15935c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e10);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    class f<T> implements i4.h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g4.h f15937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Type f15938b;

        f(g4.h hVar, Type type) {
            this.f15937a = hVar;
            this.f15938b = type;
        }

        @Override // i4.h
        public T a() {
            return (T) this.f15937a.a(this.f15938b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    class g<T> implements i4.h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g4.h f15940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Type f15941b;

        g(g4.h hVar, Type type) {
            this.f15940a = hVar;
            this.f15941b = type;
        }

        @Override // i4.h
        public T a() {
            return (T) this.f15940a.a(this.f15941b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    class h<T> implements i4.h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Constructor f15943a;

        h(Constructor constructor) {
            this.f15943a = constructor;
        }

        @Override // i4.h
        public T a() {
            try {
                return (T) this.f15943a.newInstance(null);
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Failed to invoke " + this.f15943a + " with no args", e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException("Failed to invoke " + this.f15943a + " with no args", e12.getTargetException());
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    class i<T> implements i4.h<T> {
        i() {
        }

        @Override // i4.h
        public T a() {
            return (T) new TreeSet();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    class j<T> implements i4.h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Type f15946a;

        j(Type type) {
            this.f15946a = type;
        }

        @Override // i4.h
        public T a() {
            Type type = this.f15946a;
            if (!(type instanceof ParameterizedType)) {
                throw new JsonIOException("Invalid EnumSet type: " + this.f15946a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return (T) EnumSet.noneOf((Class) type2);
            }
            throw new JsonIOException("Invalid EnumSet type: " + this.f15946a.toString());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    class k<T> implements i4.h<T> {
        k() {
        }

        @Override // i4.h
        public T a() {
            return (T) new LinkedHashSet();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    class l<T> implements i4.h<T> {
        l() {
        }

        @Override // i4.h
        public T a() {
            return (T) new ArrayDeque();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    class m<T> implements i4.h<T> {
        m() {
        }

        @Override // i4.h
        public T a() {
            return (T) new ArrayList();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    class n<T> implements i4.h<T> {
        n() {
        }

        @Override // i4.h
        public T a() {
            return (T) new ConcurrentSkipListMap();
        }
    }

    public c(Map<Type, g4.h<?>> map) {
        this.f15927a = map;
    }

    private <T> i4.h<T> b(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f15928b.b(declaredConstructor);
            }
            return new h(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private <T> i4.h<T> c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new i();
            }
            if (EnumSet.class.isAssignableFrom(cls)) {
                return new j(type);
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new k();
            }
            return Queue.class.isAssignableFrom(cls) ? new l() : new m();
        }
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
            return new n();
        }
        if (ConcurrentMap.class.isAssignableFrom(cls)) {
            return new a();
        }
        if (SortedMap.class.isAssignableFrom(cls)) {
            return new b();
        }
        return (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(l4.a.b(((ParameterizedType) type).getActualTypeArguments()[0]).c())) ? new d() : new C0244c();
    }

    private <T> i4.h<T> d(Type type, Class<? super T> cls) {
        return new e(cls, type);
    }

    public <T> i4.h<T> a(l4.a<T> aVar) {
        Type typeE = aVar.e();
        Class<? super T> clsC = aVar.c();
        g4.h<?> hVar = this.f15927a.get(typeE);
        if (hVar != null) {
            return new f(hVar, typeE);
        }
        g4.h<?> hVar2 = this.f15927a.get(clsC);
        if (hVar2 != null) {
            return new g(hVar2, typeE);
        }
        i4.h<T> hVarB = b(clsC);
        if (hVarB != null) {
            return hVarB;
        }
        i4.h<T> hVarC = c(typeE, clsC);
        return hVarC != null ? hVarC : d(typeE, clsC);
    }

    public String toString() {
        return this.f15927a.toString();
    }
}
