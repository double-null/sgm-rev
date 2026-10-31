package androidx.work;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: compiled from: WorkRequest.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private UUID f3844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m1.p f3845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<String> f3846c;

    /* JADX INFO: compiled from: WorkRequest.java */
    public static abstract class a<B extends a<?, ?>, W extends w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        m1.p f3849c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Class<? extends ListenableWorker> f3851e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f3847a = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Set<String> f3850d = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        UUID f3848b = UUID.randomUUID();

        a(Class<? extends ListenableWorker> cls) {
            this.f3851e = cls;
            this.f3849c = new m1.p(this.f3848b.toString(), cls.getName());
            a(cls.getName());
        }

        public final B a(String str) {
            this.f3850d.add(str);
            return (B) d();
        }

        public final W b() {
            W w10 = (W) c();
            c cVar = this.f3849c.f22087j;
            boolean z10 = cVar.e() || cVar.f() || cVar.g() || cVar.h();
            if (this.f3849c.f22094q && z10) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            this.f3848b = UUID.randomUUID();
            m1.p pVar = new m1.p(this.f3849c);
            this.f3849c = pVar;
            pVar.f22078a = this.f3848b.toString();
            return w10;
        }

        abstract W c();

        abstract B d();

        public final B e(c cVar) {
            this.f3849c.f22087j = cVar;
            return (B) d();
        }

        public final B f(e eVar) {
            this.f3849c.f22082e = eVar;
            return (B) d();
        }
    }

    protected w(UUID uuid, m1.p pVar, Set<String> set) {
        this.f3844a = uuid;
        this.f3845b = pVar;
        this.f3846c = set;
    }

    public String a() {
        return this.f3844a.toString();
    }

    public Set<String> b() {
        return this.f3846c;
    }

    public m1.p c() {
        return this.f3845b;
    }
}
