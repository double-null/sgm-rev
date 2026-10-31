package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

/* JADX INFO: compiled from: ListMenuPresenter.java */
/* JADX INFO: loaded from: classes.dex */
public class c implements j, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    LayoutInflater f852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    e f853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ExpandedMenuView f854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private j.a f858h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    a f859i;

    /* JADX INFO: compiled from: ListMenuPresenter.java */
    private class a extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f860a = -1;

        public a() {
            a();
        }

        void a() {
            g gVarV = c.this.f853c.v();
            if (gVarV != null) {
                ArrayList<g> arrayListZ = c.this.f853c.z();
                int size = arrayListZ.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (arrayListZ.get(i10) == gVarV) {
                        this.f860a = i10;
                        return;
                    }
                }
            }
            this.f860a = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g getItem(int i10) {
            ArrayList<g> arrayListZ = c.this.f853c.z();
            int i11 = i10 + c.this.f855e;
            int i12 = this.f860a;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return arrayListZ.get(i11);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.f853c.z().size() - c.this.f855e;
            return this.f860a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f852b.inflate(cVar.f857g, viewGroup, false);
            }
            ((k.a) view).c(getItem(i10), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(Context context, int i10) {
        this(i10, 0);
        this.f851a = context;
        this.f852b = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f859i == null) {
            this.f859i = new a();
        }
        return this.f859i;
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z10) {
        j.a aVar = this.f858h;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean c(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(j.a aVar) {
        this.f858h = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        new f(mVar).d(null);
        j.a aVar = this.f858h;
        if (aVar == null) {
            return true;
        }
        aVar.c(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(boolean z10) {
        a aVar = this.f859i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean h(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(Context context, e eVar) {
        if (this.f856f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f856f);
            this.f851a = contextThemeWrapper;
            this.f852b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f851a != null) {
            this.f851a = context;
            if (this.f852b == null) {
                this.f852b = LayoutInflater.from(context);
            }
        }
        this.f853c = eVar;
        a aVar = this.f859i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public k j(ViewGroup viewGroup) {
        if (this.f854d == null) {
            this.f854d = (ExpandedMenuView) this.f852b.inflate(g.g.f15082g, viewGroup, false);
            if (this.f859i == null) {
                this.f859i = new a();
            }
            this.f854d.setAdapter((ListAdapter) this.f859i);
            this.f854d.setOnItemClickListener(this);
        }
        return this.f854d;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f853c.M(this.f859i.getItem(i10), this, 0);
    }

    public c(int i10, int i11) {
        this.f857g = i10;
        this.f856f = i11;
    }
}
