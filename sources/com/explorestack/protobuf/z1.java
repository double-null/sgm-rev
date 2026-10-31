package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.AbstractMessage.Builder;
import com.explorestack.protobuf.MessageOrBuilder;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: RepeatedFieldBuilderV3.java */
/* JADX INFO: loaded from: classes.dex */
public class z1<MType extends AbstractMessage, BType extends AbstractMessage.Builder, IType extends MessageOrBuilder> implements AbstractMessage.BuilderParent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AbstractMessage.BuilderParent f10905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<MType> f10906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<e2<MType, BType, IType>> f10908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f10909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b<MType, BType, IType> f10910f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a<MType, BType, IType> f10911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c<MType, BType, IType> f10912h;

    /* JADX INFO: compiled from: RepeatedFieldBuilderV3.java */
    private static class a<MType extends AbstractMessage, BType extends AbstractMessage.Builder, IType extends MessageOrBuilder> extends AbstractList<BType> implements List<BType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        z1<MType, BType, IType> f10913a;

        a(z1<MType, BType, IType> z1Var) {
            this.f10913a = z1Var;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BType get(int i10) {
            return (BType) this.f10913a.k(i10);
        }

        void c() {
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f10913a.m();
        }
    }

    /* JADX INFO: compiled from: RepeatedFieldBuilderV3.java */
    private static class b<MType extends AbstractMessage, BType extends AbstractMessage.Builder, IType extends MessageOrBuilder> extends AbstractList<MType> implements List<MType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        z1<MType, BType, IType> f10914a;

        b(z1<MType, BType, IType> z1Var) {
            this.f10914a = z1Var;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MType get(int i10) {
            return (MType) this.f10914a.n(i10);
        }

        void c() {
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f10914a.m();
        }
    }

    /* JADX INFO: compiled from: RepeatedFieldBuilderV3.java */
    private static class c<MType extends AbstractMessage, BType extends AbstractMessage.Builder, IType extends MessageOrBuilder> extends AbstractList<IType> implements List<IType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        z1<MType, BType, IType> f10915a;

        c(z1<MType, BType, IType> z1Var) {
            this.f10915a = z1Var;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IType get(int i10) {
            return (IType) this.f10915a.q(i10);
        }

        void c() {
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f10915a.m();
        }
    }

    public z1(List<MType> list, boolean z10, AbstractMessage.BuilderParent builderParent, boolean z11) {
        this.f10906b = list;
        this.f10907c = z10;
        this.f10905a = builderParent;
        this.f10909e = z11;
    }

    private void i() {
        if (this.f10908d == null) {
            this.f10908d = new ArrayList(this.f10906b.size());
            for (int i10 = 0; i10 < this.f10906b.size(); i10++) {
                this.f10908d.add(null);
            }
        }
    }

    private void j() {
        if (this.f10907c) {
            return;
        }
        this.f10906b = new ArrayList(this.f10906b);
        this.f10907c = true;
    }

    private MType o(int i10, boolean z10) {
        List<e2<MType, BType, IType>> list = this.f10908d;
        if (list == null) {
            return this.f10906b.get(i10);
        }
        e2<MType, BType, IType> e2Var = list.get(i10);
        if (e2Var == null) {
            return this.f10906b.get(i10);
        }
        return z10 ? (MType) e2Var.a() : (MType) e2Var.e();
    }

    private void s() {
        b<MType, BType, IType> bVar = this.f10910f;
        if (bVar != null) {
            bVar.c();
        }
        a<MType, BType, IType> aVar = this.f10911g;
        if (aVar != null) {
            aVar.c();
        }
        c<MType, BType, IType> cVar = this.f10912h;
        if (cVar != null) {
            cVar.c();
        }
    }

    private void u() {
        AbstractMessage.BuilderParent builderParent;
        if (!this.f10909e || (builderParent = this.f10905a) == null) {
            return;
        }
        builderParent.markDirty();
        this.f10909e = false;
    }

    public z1<MType, BType, IType> a(Iterable<? extends MType> iterable) {
        int size;
        Iterator<? extends MType> it = iterable.iterator();
        while (it.hasNext()) {
            l0.a(it.next());
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.isEmpty()) {
                return this;
            }
            size = collection.size();
        } else {
            size = -1;
        }
        j();
        if (size >= 0) {
            List<MType> list = this.f10906b;
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            }
        }
        Iterator<? extends MType> it2 = iterable.iterator();
        while (it2.hasNext()) {
            e(it2.next());
        }
        u();
        s();
        return this;
    }

    public BType b(int i10, MType mtype) {
        j();
        i();
        e2<MType, BType, IType> e2Var = new e2<>(mtype, this, this.f10909e);
        this.f10906b.add(i10, null);
        this.f10908d.add(i10, e2Var);
        u();
        s();
        return (BType) e2Var.d();
    }

    public BType c(MType mtype) {
        j();
        i();
        e2<MType, BType, IType> e2Var = new e2<>(mtype, this, this.f10909e);
        this.f10906b.add(null);
        this.f10908d.add(e2Var);
        u();
        s();
        return (BType) e2Var.d();
    }

    public z1<MType, BType, IType> d(int i10, MType mtype) {
        l0.a(mtype);
        j();
        this.f10906b.add(i10, mtype);
        List<e2<MType, BType, IType>> list = this.f10908d;
        if (list != null) {
            list.add(i10, null);
        }
        u();
        s();
        return this;
    }

    public z1<MType, BType, IType> e(MType mtype) {
        l0.a(mtype);
        j();
        this.f10906b.add(mtype);
        List<e2<MType, BType, IType>> list = this.f10908d;
        if (list != null) {
            list.add(null);
        }
        u();
        s();
        return this;
    }

    public List<MType> f() {
        boolean z10;
        this.f10909e = true;
        boolean z11 = this.f10907c;
        if (!z11 && this.f10908d == null) {
            return this.f10906b;
        }
        if (!z11) {
            int i10 = 0;
            while (true) {
                if (i10 >= this.f10906b.size()) {
                    z10 = true;
                    break;
                }
                MType mtype = this.f10906b.get(i10);
                e2<MType, BType, IType> e2Var = this.f10908d.get(i10);
                if (e2Var != null && e2Var.a() != mtype) {
                    z10 = false;
                    break;
                }
                i10++;
            }
            if (z10) {
                return this.f10906b;
            }
        }
        j();
        for (int i11 = 0; i11 < this.f10906b.size(); i11++) {
            this.f10906b.set(i11, (MType) o(i11, true));
        }
        List<MType> listUnmodifiableList = Collections.unmodifiableList(this.f10906b);
        this.f10906b = listUnmodifiableList;
        this.f10907c = false;
        return listUnmodifiableList;
    }

    public void g() {
        this.f10906b = Collections.emptyList();
        this.f10907c = false;
        List<e2<MType, BType, IType>> list = this.f10908d;
        if (list != null) {
            for (e2<MType, BType, IType> e2Var : list) {
                if (e2Var != null) {
                    e2Var.c();
                }
            }
            this.f10908d = null;
        }
        u();
        s();
    }

    public void h() {
        this.f10905a = null;
    }

    public BType k(int i10) {
        i();
        e2<MType, BType, IType> e2Var = this.f10908d.get(i10);
        if (e2Var == null) {
            e2<MType, BType, IType> e2Var2 = new e2<>(this.f10906b.get(i10), this, this.f10909e);
            this.f10908d.set(i10, e2Var2);
            e2Var = e2Var2;
        }
        return (BType) e2Var.d();
    }

    public List<BType> l() {
        if (this.f10911g == null) {
            this.f10911g = new a<>(this);
        }
        return this.f10911g;
    }

    public int m() {
        return this.f10906b.size();
    }

    @Override // com.explorestack.protobuf.AbstractMessage.BuilderParent
    public void markDirty() {
        u();
    }

    public MType n(int i10) {
        return (MType) o(i10, false);
    }

    public List<MType> p() {
        if (this.f10910f == null) {
            this.f10910f = new b<>(this);
        }
        return this.f10910f;
    }

    public IType q(int i10) {
        List<e2<MType, BType, IType>> list = this.f10908d;
        if (list == null) {
            return this.f10906b.get(i10);
        }
        e2<MType, BType, IType> e2Var = list.get(i10);
        return e2Var == null ? this.f10906b.get(i10) : (IType) e2Var.f();
    }

    public List<IType> r() {
        if (this.f10912h == null) {
            this.f10912h = new c<>(this);
        }
        return this.f10912h;
    }

    public boolean t() {
        return this.f10906b.isEmpty();
    }

    public void v(int i10) {
        e2<MType, BType, IType> e2VarRemove;
        j();
        this.f10906b.remove(i10);
        List<e2<MType, BType, IType>> list = this.f10908d;
        if (list != null && (e2VarRemove = list.remove(i10)) != null) {
            e2VarRemove.c();
        }
        u();
        s();
    }

    public z1<MType, BType, IType> w(int i10, MType mtype) {
        e2<MType, BType, IType> e2Var;
        l0.a(mtype);
        j();
        this.f10906b.set(i10, mtype);
        List<e2<MType, BType, IType>> list = this.f10908d;
        if (list != null && (e2Var = list.set(i10, null)) != null) {
            e2Var.c();
        }
        u();
        s();
        return this;
    }
}
