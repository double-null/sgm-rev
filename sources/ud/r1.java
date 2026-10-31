package ud;

import java.io.Closeable;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class r1 extends k0 implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f26813c = new a(null);

    /* JADX INFO: compiled from: Executors.kt */
    public static final class a extends zc.b<k0, r1> {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r1 d(zc.j.b bVar) {
            if (bVar instanceof r1) {
                return (r1) bVar;
            }
            return null;
        }

        private a() {
            super(k0.f26776b, new id.l() { // from class: ud.q1
                @Override // id.l
                public final Object invoke(Object obj) {
                    return r1.a.d((zc.j.b) obj);
                }
            });
        }
    }
}
