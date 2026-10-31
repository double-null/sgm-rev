package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: ViewModelProvider.kt */
/* JADX INFO: loaded from: classes.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f0 f2894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f2895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m0.a f2896c;

    /* JADX INFO: compiled from: ViewModelProvider.kt */
    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f2902a = a.f2903a;

        /* JADX INFO: compiled from: ViewModelProvider.kt */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final /* synthetic */ a f2903a = new a();

            private a() {
            }
        }

        default <T extends c0> T a(Class<T> modelClass, m0.a extras) {
            kotlin.jvm.internal.t.f(modelClass, "modelClass");
            kotlin.jvm.internal.t.f(extras, "extras");
            return (T) b(modelClass);
        }

        default <T extends c0> T b(Class<T> modelClass) {
            kotlin.jvm.internal.t.f(modelClass, "modelClass");
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }
    }

    /* JADX INFO: compiled from: ViewModelProvider.kt */
    public static class c implements b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static c f2905c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f2904b = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final m0.a.b<String> f2906d = a.C0050a.f2907a;

        /* JADX INFO: compiled from: ViewModelProvider.kt */
        public static final class a {

            /* JADX INFO: renamed from: androidx.lifecycle.d0$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: ViewModelProvider.kt */
            private static final class C0050a implements m0.a.b<String> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0050a f2907a = new C0050a();

                private C0050a() {
                }
            }

            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
                this();
            }

            public final c a() {
                if (c.f2905c == null) {
                    c.f2905c = new c();
                }
                c cVar = c.f2905c;
                kotlin.jvm.internal.t.c(cVar);
                return cVar;
            }
        }

        @Override // androidx.lifecycle.d0.b
        public <T extends c0> T b(Class<T> modelClass) throws InvocationTargetException {
            kotlin.jvm.internal.t.f(modelClass, "modelClass");
            try {
                T tNewInstance = modelClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                kotlin.jvm.internal.t.e(tNewInstance, "{\n                modelC…wInstance()\n            }");
                return tNewInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e12);
            }
        }
    }

    /* JADX INFO: compiled from: ViewModelProvider.kt */
    public static class d {
        public void c(c0 viewModel) {
            kotlin.jvm.internal.t.f(viewModel, "viewModel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d0(f0 store, b factory) {
        this(store, factory, null, 4, null);
        kotlin.jvm.internal.t.f(store, "store");
        kotlin.jvm.internal.t.f(factory, "factory");
    }

    public <T extends c0> T a(Class<T> modelClass) {
        kotlin.jvm.internal.t.f(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, modelClass);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public <T extends c0> T b(String key, Class<T> modelClass) {
        T t10;
        kotlin.jvm.internal.t.f(key, "key");
        kotlin.jvm.internal.t.f(modelClass, "modelClass");
        T t11 = (T) this.f2894a.b(key);
        if (!modelClass.isInstance(t11)) {
            m0.d dVar = new m0.d(this.f2896c);
            dVar.c(c.f2906d, key);
            try {
                t10 = (T) this.f2895b.a(modelClass, dVar);
            } catch (AbstractMethodError unused) {
                t10 = (T) this.f2895b.b(modelClass);
            }
            this.f2894a.d(key, t10);
            return t10;
        }
        Object obj = this.f2895b;
        d dVar2 = obj instanceof d ? (d) obj : null;
        if (dVar2 != null) {
            kotlin.jvm.internal.t.c(t11);
            dVar2.c(t11);
        }
        kotlin.jvm.internal.t.d(t11, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return t11;
    }

    /* JADX INFO: compiled from: ViewModelProvider.kt */
    public static class a extends c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static a f2898g;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Application f2900e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final C0048a f2897f = new C0048a(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final m0.a.b<Application> f2899h = C0048a.C0049a.f2901a;

        /* JADX INFO: renamed from: androidx.lifecycle.d0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ViewModelProvider.kt */
        public static final class C0048a {

            /* JADX INFO: renamed from: androidx.lifecycle.d0$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: ViewModelProvider.kt */
            private static final class C0049a implements m0.a.b<Application> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0049a f2901a = new C0049a();

                private C0049a() {
                }
            }

            private C0048a() {
            }

            public /* synthetic */ C0048a(kotlin.jvm.internal.k kVar) {
                this();
            }

            public final a a(Application application) {
                kotlin.jvm.internal.t.f(application, "application");
                if (a.f2898g == null) {
                    a.f2898g = new a(application);
                }
                a aVar = a.f2898g;
                kotlin.jvm.internal.t.c(aVar);
                return aVar;
            }
        }

        private a(Application application, int i10) {
            this.f2900e = application;
        }

        private final <T extends c0> T g(Class<T> cls, Application application) {
            if (!androidx.lifecycle.a.class.isAssignableFrom(cls)) {
                return (T) super.b(cls);
            }
            try {
                T tNewInstance = cls.getConstructor(Application.class).newInstance(application);
                kotlin.jvm.internal.t.e(tNewInstance, "{\n                try {\n…          }\n            }");
                return tNewInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }

        @Override // androidx.lifecycle.d0.b
        public <T extends c0> T a(Class<T> modelClass, m0.a extras) {
            kotlin.jvm.internal.t.f(modelClass, "modelClass");
            kotlin.jvm.internal.t.f(extras, "extras");
            if (this.f2900e != null) {
                return (T) b(modelClass);
            }
            Application application = (Application) extras.a(f2899h);
            if (application != null) {
                return (T) g(modelClass, application);
            }
            if (androidx.lifecycle.a.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.b(modelClass);
        }

        @Override // androidx.lifecycle.d0.c, androidx.lifecycle.d0.b
        public <T extends c0> T b(Class<T> modelClass) {
            kotlin.jvm.internal.t.f(modelClass, "modelClass");
            Application application = this.f2900e;
            if (application != null) {
                return (T) g(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            kotlin.jvm.internal.t.f(application, "application");
        }
    }

    public d0(f0 store, b factory, m0.a defaultCreationExtras) {
        kotlin.jvm.internal.t.f(store, "store");
        kotlin.jvm.internal.t.f(factory, "factory");
        kotlin.jvm.internal.t.f(defaultCreationExtras, "defaultCreationExtras");
        this.f2894a = store;
        this.f2895b = factory;
        this.f2896c = defaultCreationExtras;
    }

    public /* synthetic */ d0(f0 f0Var, b bVar, m0.a aVar, int i10, kotlin.jvm.internal.k kVar) {
        this(f0Var, bVar, (i10 & 4) != 0 ? m0.a.C0361a.f22039b : aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d0(g0 owner, b factory) {
        this(owner.getViewModelStore(), factory, e0.a(owner));
        kotlin.jvm.internal.t.f(owner, "owner");
        kotlin.jvm.internal.t.f(factory, "factory");
    }
}
