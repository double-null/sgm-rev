package e0;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: FileStorage.kt */
/* JADX INFO: loaded from: classes.dex */
public final class q<T> implements l0<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f13789d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Set<String> f13790e = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f13791f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0<T> f13792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final id.l<File, v> f13793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final id.a<File> f13794c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: compiled from: FileStorage.kt */
    public static final class a extends kotlin.jvm.internal.u implements id.l<File, v> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f13795d = new a();

        a() {
            super(1);
        }

        @Override // id.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v invoke(File it) {
            kotlin.jvm.internal.t.f(it, "it");
            return x.a(it);
        }
    }

    /* JADX INFO: compiled from: FileStorage.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final Set<String> a() {
            return q.f13790e;
        }

        public final Object b() {
            return q.f13791f;
        }
    }

    /* JADX INFO: compiled from: FileStorage.kt */
    static final class c extends kotlin.jvm.internal.u implements id.a<wc.g0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ File f13796d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(File file) {
            super(0);
            this.f13796d = file;
        }

        @Override // id.a
        public /* bridge */ /* synthetic */ wc.g0 invoke() {
            invoke2();
            return wc.g0.f27756a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            b bVar = q.f13789d;
            Object objB = bVar.b();
            File file = this.f13796d;
            synchronized (objB) {
                bVar.a().remove(file.getAbsolutePath());
                wc.g0 g0Var = wc.g0.f27756a;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(g0<T> serializer, id.l<? super File, ? extends v> coordinatorProducer, id.a<? extends File> produceFile) {
        kotlin.jvm.internal.t.f(serializer, "serializer");
        kotlin.jvm.internal.t.f(coordinatorProducer, "coordinatorProducer");
        kotlin.jvm.internal.t.f(produceFile, "produceFile");
        this.f13792a = serializer;
        this.f13793b = coordinatorProducer;
        this.f13794c = produceFile;
    }

    @Override // e0.l0
    public m0<T> a() throws IOException {
        File file = this.f13794c.invoke().getCanonicalFile();
        synchronized (f13791f) {
            String path = file.getAbsolutePath();
            Set<String> set = f13790e;
            if (!(!set.contains(path))) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            kotlin.jvm.internal.t.e(path, "path");
            set.add(path);
        }
        kotlin.jvm.internal.t.e(file, "file");
        return new r(file, this.f13792a, this.f13793b.invoke(file), new c(file));
    }

    public /* synthetic */ q(g0 g0Var, id.l lVar, id.a aVar, int i10, kotlin.jvm.internal.k kVar) {
        this(g0Var, (i10 & 2) != 0 ? a.f13795d : lVar, aVar);
    }
}
