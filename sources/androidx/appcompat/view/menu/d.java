package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: compiled from: MenuAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class d extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    e f862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f863b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LayoutInflater f866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f867f;

    public d(e eVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f865d = z10;
        this.f866e = layoutInflater;
        this.f862a = eVar;
        this.f867f = i10;
        a();
    }

    void a() {
        g gVarV = this.f862a.v();
        if (gVarV != null) {
            ArrayList<g> arrayListZ = this.f862a.z();
            int size = arrayListZ.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (arrayListZ.get(i10) == gVarV) {
                    this.f863b = i10;
                    return;
                }
            }
        }
        this.f863b = -1;
    }

    public e b() {
        return this.f862a;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g getItem(int i10) {
        ArrayList<g> arrayListZ = this.f865d ? this.f862a.z() : this.f862a.E();
        int i11 = this.f863b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return arrayListZ.get(i10);
    }

    public void d(boolean z10) {
        this.f864c = z10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<g> arrayListZ = this.f865d ? this.f862a.z() : this.f862a.E();
        return this.f863b < 0 ? arrayListZ.size() : arrayListZ.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f866e.inflate(this.f867f, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f862a.F() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        k.a aVar = (k.a) view;
        if (this.f864c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.c(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
