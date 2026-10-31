package a0;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* JADX INFO: compiled from: CursorAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, a0.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f3a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f4b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Cursor f5c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Context f6d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f7e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected C0000a f8f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected DataSetObserver f9g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected a0.b f10h;

    /* JADX INFO: renamed from: a0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CursorAdapter.java */
    private class C0000a extends ContentObserver {
        C0000a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            a.this.h();
        }
    }

    /* JADX INFO: compiled from: CursorAdapter.java */
    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f3a = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f3a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z10) {
        e(context, cursor, z10 ? 1 : 2);
    }

    @Override // a0.b.a
    public void a(Cursor cursor) {
        Cursor cursorI = i(cursor);
        if (cursorI != null) {
            cursorI.close();
        }
    }

    @Override // a0.b.a
    public Cursor c() {
        return this.f5c;
    }

    @Override // a0.b.a
    public abstract CharSequence convertToString(Cursor cursor);

    public abstract void d(View view, Context context, Cursor cursor);

    void e(Context context, Cursor cursor, int i10) {
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f4b = true;
        } else {
            this.f4b = false;
        }
        boolean z10 = cursor != null;
        this.f5c = cursor;
        this.f3a = z10;
        this.f6d = context;
        this.f7e = z10 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.f8f = new C0000a();
            this.f9g = new b();
        } else {
            this.f8f = null;
            this.f9g = null;
        }
        if (z10) {
            C0000a c0000a = this.f8f;
            if (c0000a != null) {
                cursor.registerContentObserver(c0000a);
            }
            DataSetObserver dataSetObserver = this.f9g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View f(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f3a || (cursor = this.f5c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f3a) {
            return null;
        }
        this.f5c.moveToPosition(i10);
        if (view == null) {
            view = f(this.f6d, this.f5c, viewGroup);
        }
        d(view, this.f6d, this.f5c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f10h == null) {
            this.f10h = new a0.b(this);
        }
        return this.f10h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f3a || (cursor = this.f5c) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f5c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (this.f3a && (cursor = this.f5c) != null && cursor.moveToPosition(i10)) {
            return this.f5c.getLong(this.f7e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f3a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f5c.moveToPosition(i10)) {
            if (view == null) {
                view = g(this.f6d, this.f5c, viewGroup);
            }
            d(view, this.f6d, this.f5c);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i10);
    }

    protected void h() {
        Cursor cursor;
        if (!this.f4b || (cursor = this.f5c) == null || cursor.isClosed()) {
            return;
        }
        this.f3a = this.f5c.requery();
    }

    public Cursor i(Cursor cursor) {
        Cursor cursor2 = this.f5c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0000a c0000a = this.f8f;
            if (c0000a != null) {
                cursor2.unregisterContentObserver(c0000a);
            }
            DataSetObserver dataSetObserver = this.f9g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f5c = cursor;
        if (cursor != null) {
            C0000a c0000a2 = this.f8f;
            if (c0000a2 != null) {
                cursor.registerContentObserver(c0000a2);
            }
            DataSetObserver dataSetObserver2 = this.f9g;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f7e = cursor.getColumnIndexOrThrow("_id");
            this.f3a = true;
            notifyDataSetChanged();
        } else {
            this.f7e = -1;
            this.f3a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
