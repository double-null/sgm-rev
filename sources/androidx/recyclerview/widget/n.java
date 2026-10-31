package androidx.recyclerview.widget;

/* JADX INFO: compiled from: ViewInfoStore.java */
/* JADX INFO: loaded from: classes.dex */
class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final androidx.collection.h<RecyclerView.f0, a> f3436a = new androidx.collection.h<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final androidx.collection.e<RecyclerView.f0> f3437b = new androidx.collection.e<>();

    /* JADX INFO: compiled from: ViewInfoStore.java */
    static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static w.f<a> f3438d = new w.g(20);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f3439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        RecyclerView.m.c f3440b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        RecyclerView.m.c f3441c;

        private a() {
        }

        static void a() {
            while (f3438d.b() != null) {
            }
        }

        static a b() {
            a aVarB = f3438d.b();
            return aVarB == null ? new a() : aVarB;
        }

        static void c(a aVar) {
            aVar.f3439a = 0;
            aVar.f3440b = null;
            aVar.f3441c = null;
            f3438d.a(aVar);
        }
    }

    /* JADX INFO: compiled from: ViewInfoStore.java */
    interface b {
        void a(RecyclerView.f0 f0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void b(RecyclerView.f0 f0Var);

        void c(RecyclerView.f0 f0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void d(RecyclerView.f0 f0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);
    }

    n() {
    }

    private RecyclerView.m.c l(RecyclerView.f0 f0Var, int i10) {
        a aVarN;
        RecyclerView.m.c cVar;
        int iF = this.f3436a.f(f0Var);
        if (iF >= 0 && (aVarN = this.f3436a.n(iF)) != null) {
            int i11 = aVarN.f3439a;
            if ((i11 & i10) != 0) {
                int i12 = (~i10) & i11;
                aVarN.f3439a = i12;
                if (i10 == 4) {
                    cVar = aVarN.f3440b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = aVarN.f3441c;
                }
                if ((i12 & 12) == 0) {
                    this.f3436a.l(iF);
                    a.c(aVarN);
                }
                return cVar;
            }
        }
        return null;
    }

    void a(RecyclerView.f0 f0Var, RecyclerView.m.c cVar) {
        a aVarB = this.f3436a.get(f0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f3436a.put(f0Var, aVarB);
        }
        aVarB.f3439a |= 2;
        aVarB.f3440b = cVar;
    }

    void b(RecyclerView.f0 f0Var) {
        a aVarB = this.f3436a.get(f0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f3436a.put(f0Var, aVarB);
        }
        aVarB.f3439a |= 1;
    }

    void c(long j10, RecyclerView.f0 f0Var) {
        this.f3437b.k(j10, f0Var);
    }

    void d(RecyclerView.f0 f0Var, RecyclerView.m.c cVar) {
        a aVarB = this.f3436a.get(f0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f3436a.put(f0Var, aVarB);
        }
        aVarB.f3441c = cVar;
        aVarB.f3439a |= 8;
    }

    void e(RecyclerView.f0 f0Var, RecyclerView.m.c cVar) {
        a aVarB = this.f3436a.get(f0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f3436a.put(f0Var, aVarB);
        }
        aVarB.f3440b = cVar;
        aVarB.f3439a |= 4;
    }

    void f() {
        this.f3436a.clear();
        this.f3437b.a();
    }

    RecyclerView.f0 g(long j10) {
        return this.f3437b.h(j10);
    }

    boolean h(RecyclerView.f0 f0Var) {
        a aVar = this.f3436a.get(f0Var);
        return (aVar == null || (aVar.f3439a & 1) == 0) ? false : true;
    }

    boolean i(RecyclerView.f0 f0Var) {
        a aVar = this.f3436a.get(f0Var);
        return (aVar == null || (aVar.f3439a & 4) == 0) ? false : true;
    }

    void j() {
        a.a();
    }

    public void k(RecyclerView.f0 f0Var) {
        p(f0Var);
    }

    RecyclerView.m.c m(RecyclerView.f0 f0Var) {
        return l(f0Var, 8);
    }

    RecyclerView.m.c n(RecyclerView.f0 f0Var) {
        return l(f0Var, 4);
    }

    void o(b bVar) {
        for (int size = this.f3436a.size() - 1; size >= 0; size--) {
            RecyclerView.f0 f0VarJ = this.f3436a.j(size);
            a aVarL = this.f3436a.l(size);
            int i10 = aVarL.f3439a;
            if ((i10 & 3) == 3) {
                bVar.b(f0VarJ);
            } else if ((i10 & 1) != 0) {
                RecyclerView.m.c cVar = aVarL.f3440b;
                if (cVar == null) {
                    bVar.b(f0VarJ);
                } else {
                    bVar.c(f0VarJ, cVar, aVarL.f3441c);
                }
            } else if ((i10 & 14) == 14) {
                bVar.a(f0VarJ, aVarL.f3440b, aVarL.f3441c);
            } else if ((i10 & 12) == 12) {
                bVar.d(f0VarJ, aVarL.f3440b, aVarL.f3441c);
            } else if ((i10 & 4) != 0) {
                bVar.c(f0VarJ, aVarL.f3440b, null);
            } else if ((i10 & 8) != 0) {
                bVar.a(f0VarJ, aVarL.f3440b, aVarL.f3441c);
            }
            a.c(aVarL);
        }
    }

    void p(RecyclerView.f0 f0Var) {
        a aVar = this.f3436a.get(f0Var);
        if (aVar == null) {
            return;
        }
        aVar.f3439a &= -2;
    }

    void q(RecyclerView.f0 f0Var) {
        for (int iN = this.f3437b.n() - 1; iN >= 0; iN--) {
            if (f0Var == this.f3437b.o(iN)) {
                this.f3437b.m(iN);
                break;
            }
        }
        a aVarRemove = this.f3436a.remove(f0Var);
        if (aVarRemove != null) {
            a.c(aVarRemove);
        }
    }
}
