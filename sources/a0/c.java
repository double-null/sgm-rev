package a0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: ResourceCursorAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f14i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f15j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private LayoutInflater f16k;

    @Deprecated
    public c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f15j = i10;
        this.f14i = i10;
        this.f16k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // a0.a
    public View f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f16k.inflate(this.f15j, viewGroup, false);
    }

    @Override // a0.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f16k.inflate(this.f14i, viewGroup, false);
    }
}
