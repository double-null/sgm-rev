package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: compiled from: AppCompatSpinner.java */
/* JADX INFO: loaded from: classes.dex */
public class v extends Spinner {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f1459i = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.appcompat.widget.e f1460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f1461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p0 f1462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SpinnerAdapter f1463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f1464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private g f1465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f1466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Rect f1467h;

    /* JADX INFO: compiled from: AppCompatSpinner.java */
    class a extends p0 {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ e f1468j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, e eVar) {
            super(view);
            this.f1468j = eVar;
        }

        @Override // androidx.appcompat.widget.p0
        public l.e b() {
            return this.f1468j;
        }

        @Override // androidx.appcompat.widget.p0
        public boolean c() {
            if (v.this.getInternalPopup().a()) {
                return true;
            }
            v.this.b();
            return true;
        }
    }

    /* JADX INFO: compiled from: AppCompatSpinner.java */
    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!v.this.getInternalPopup().a()) {
                v.this.b();
            }
            ViewTreeObserver viewTreeObserver = v.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* JADX INFO: compiled from: AppCompatSpinner.java */
    class c implements g, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        androidx.appcompat.app.c f1471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ListAdapter f1472b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CharSequence f1473c;

        c() {
        }

        @Override // androidx.appcompat.widget.v.g
        public boolean a() {
            androidx.appcompat.app.c cVar = this.f1471a;
            if (cVar != null) {
                return cVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.v.g
        public int b() {
            return 0;
        }

        @Override // androidx.appcompat.widget.v.g
        public void d(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.v.g
        public void dismiss() {
            androidx.appcompat.app.c cVar = this.f1471a;
            if (cVar != null) {
                cVar.dismiss();
                this.f1471a = null;
            }
        }

        @Override // androidx.appcompat.widget.v.g
        public CharSequence e() {
            return this.f1473c;
        }

        @Override // androidx.appcompat.widget.v.g
        public void f(CharSequence charSequence) {
            this.f1473c = charSequence;
        }

        @Override // androidx.appcompat.widget.v.g
        public void g(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.v.g
        public Drawable getBackground() {
            return null;
        }

        @Override // androidx.appcompat.widget.v.g
        public void h(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.v.g
        public void i(int i10, int i11) {
            if (this.f1472b == null) {
                return;
            }
            androidx.appcompat.app.c.a aVar = new androidx.appcompat.app.c.a(v.this.getPopupContext());
            CharSequence charSequence = this.f1473c;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            androidx.appcompat.app.c cVarCreate = aVar.e(this.f1472b, v.this.getSelectedItemPosition(), this).create();
            this.f1471a = cVarCreate;
            ListView listViewE = cVarCreate.e();
            listViewE.setTextDirection(i10);
            listViewE.setTextAlignment(i11);
            this.f1471a.show();
        }

        @Override // androidx.appcompat.widget.v.g
        public int j() {
            return 0;
        }

        @Override // androidx.appcompat.widget.v.g
        public void k(ListAdapter listAdapter) {
            this.f1472b = listAdapter;
        }

        @Override // androidx.appcompat.widget.v.g
        public void n(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            v.this.setSelection(i10);
            if (v.this.getOnItemClickListener() != null) {
                v.this.performItemClick(null, i10, this.f1472b.getItemId(i10));
            }
            dismiss();
        }
    }

    /* JADX INFO: compiled from: AppCompatSpinner.java */
    private static class d implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private SpinnerAdapter f1475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ListAdapter f1476b;

        public d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1475a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1476b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                        return;
                    }
                    return;
                }
                if (spinnerAdapter instanceof d1) {
                    d1 d1Var = (d1) spinnerAdapter;
                    if (d1Var.getDropDownViewTheme() == null) {
                        d1Var.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1476b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1475a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1475a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1475a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1475a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i10);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1475a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f1476b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1475a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1475a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* JADX INFO: compiled from: AppCompatSpinner.java */
    class e extends t0 implements g {
        private CharSequence J;
        ListAdapter K;
        private final Rect L;
        private int M;

        /* JADX INFO: compiled from: AppCompatSpinner.java */
        class a implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ v f1477a;

            a(v vVar) {
                this.f1477a = vVar;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                v.this.setSelection(i10);
                if (v.this.getOnItemClickListener() != null) {
                    e eVar = e.this;
                    v.this.performItemClick(view, i10, eVar.K.getItemId(i10));
                }
                e.this.dismiss();
            }
        }

        /* JADX INFO: compiled from: AppCompatSpinner.java */
        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                e eVar = e.this;
                if (!eVar.O(v.this)) {
                    e.this.dismiss();
                } else {
                    e.this.M();
                    e.super.show();
                }
            }
        }

        /* JADX INFO: compiled from: AppCompatSpinner.java */
        class c implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1480a;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1480a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = v.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1480a);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.L = new Rect();
            x(v.this);
            D(true);
            I(0);
            F(new a(v.this));
        }

        void M() {
            int i10;
            Drawable background = getBackground();
            if (background != null) {
                background.getPadding(v.this.f1467h);
                i10 = o1.b(v.this) ? v.this.f1467h.right : -v.this.f1467h.left;
            } else {
                Rect rect = v.this.f1467h;
                rect.right = 0;
                rect.left = 0;
                i10 = 0;
            }
            int paddingLeft = v.this.getPaddingLeft();
            int paddingRight = v.this.getPaddingRight();
            int width = v.this.getWidth();
            v vVar = v.this;
            int i11 = vVar.f1466g;
            if (i11 == -2) {
                int iA = vVar.a((SpinnerAdapter) this.K, getBackground());
                int i12 = v.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = v.this.f1467h;
                int i13 = (i12 - rect2.left) - rect2.right;
                if (iA > i13) {
                    iA = i13;
                }
                z(Math.max(iA, (width - paddingLeft) - paddingRight));
            } else if (i11 == -1) {
                z((width - paddingLeft) - paddingRight);
            } else {
                z(i11);
            }
            d(o1.b(v.this) ? i10 + (((width - paddingRight) - t()) - N()) : i10 + paddingLeft + N());
        }

        public int N() {
            return this.M;
        }

        boolean O(View view) {
            return androidx.core.view.z0.x(view) && view.getGlobalVisibleRect(this.L);
        }

        @Override // androidx.appcompat.widget.v.g
        public CharSequence e() {
            return this.J;
        }

        @Override // androidx.appcompat.widget.v.g
        public void f(CharSequence charSequence) {
            this.J = charSequence;
        }

        @Override // androidx.appcompat.widget.v.g
        public void h(int i10) {
            this.M = i10;
        }

        @Override // androidx.appcompat.widget.v.g
        public void i(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean zA = a();
            M();
            C(2);
            super.show();
            ListView listViewM = m();
            listViewM.setChoiceMode(1);
            listViewM.setTextDirection(i10);
            listViewM.setTextAlignment(i11);
            J(v.this.getSelectedItemPosition());
            if (zA || (viewTreeObserver = v.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            E(new c(bVar));
        }

        @Override // androidx.appcompat.widget.t0, androidx.appcompat.widget.v.g
        public void k(ListAdapter listAdapter) {
            super.k(listAdapter);
            this.K = listAdapter;
        }
    }

    /* JADX INFO: compiled from: AppCompatSpinner.java */
    static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f1482a;

        /* JADX INFO: compiled from: AppCompatSpinner.java */
        static class a implements Parcelable.Creator<f> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i10) {
                return new f[i10];
            }
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f1482a ? (byte) 1 : (byte) 0);
        }

        f(Parcel parcel) {
            super(parcel);
            this.f1482a = parcel.readByte() != 0;
        }
    }

    /* JADX INFO: compiled from: AppCompatSpinner.java */
    interface g {
        boolean a();

        int b();

        void d(int i10);

        void dismiss();

        CharSequence e();

        void f(CharSequence charSequence);

        void g(int i10);

        Drawable getBackground();

        void h(int i10);

        void i(int i10, int i11);

        int j();

        void k(ListAdapter listAdapter);

        void n(Drawable drawable);
    }

    public v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.I);
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.f1467h);
        Rect rect = this.f1467h;
        return iMax2 + rect.left + rect.right;
    }

    void b() {
        this.f1465f.i(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.e eVar = this.f1460a;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        g gVar = this.f1465f;
        return gVar != null ? gVar.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        g gVar = this.f1465f;
        return gVar != null ? gVar.j() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f1465f != null ? this.f1466g : super.getDropDownWidth();
    }

    final g getInternalPopup() {
        return this.f1465f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        g gVar = this.f1465f;
        return gVar != null ? gVar.getBackground() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1461b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        g gVar = this.f1465f;
        return gVar != null ? gVar.e() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.e eVar = this.f1460a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.e eVar = this.f1460a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.f1465f;
        if (gVar == null || !gVar.a()) {
            return;
        }
        this.f1465f.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f1465f == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (!fVar.f1482a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        g gVar = this.f1465f;
        fVar.f1482a = gVar != null && gVar.a();
        return fVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        p0 p0Var = this.f1462c;
        if (p0Var == null || !p0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        g gVar = this.f1465f;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.a()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.e eVar = this.f1460a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        androidx.appcompat.widget.e eVar = this.f1460a;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        g gVar = this.f1465f;
        if (gVar == null) {
            super.setDropDownHorizontalOffset(i10);
        } else {
            gVar.h(i10);
            this.f1465f.d(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        g gVar = this.f1465f;
        if (gVar != null) {
            gVar.g(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f1465f != null) {
            this.f1466g = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.f1465f;
        if (gVar != null) {
            gVar.n(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(h.a.b(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        g gVar = this.f1465f;
        if (gVar != null) {
            gVar.f(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        androidx.appcompat.widget.e eVar = this.f1460a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        androidx.appcompat.widget.e eVar = this.f1460a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public v(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1464e) {
            this.f1463d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1465f != null) {
            Context context = this.f1461b;
            if (context == null) {
                context = getContext();
            }
            this.f1465f.k(new d(spinnerAdapter, context.getTheme()));
        }
    }

    public v(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10, i11, null);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x006a  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d2  */
    public v(Context context, AttributeSet attributeSet, int i10, int i11, Resources.Theme theme) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] charSequenceArrP;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i10);
        this.f1467h = new Rect();
        h1 h1VarT = h1.t(context, attributeSet, g.j.A2, i10, 0);
        this.f1460a = new androidx.appcompat.widget.e(this);
        if (theme != null) {
            this.f1461b = new k.d(context, theme);
        } else {
            int iM = h1VarT.m(g.j.F2, 0);
            if (iM != 0) {
                this.f1461b = new k.d(context, iM);
            } else {
                this.f1461b = context;
            }
        }
        TypedArray typedArray = null;
        if (i11 == -1) {
            try {
                typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1459i, i10, 0);
                try {
                    try {
                        if (typedArrayObtainStyledAttributes.hasValue(0)) {
                            i11 = typedArrayObtainStyledAttributes.getInt(0, 0);
                        }
                    } catch (Exception e10) {
                        e = e10;
                        Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                        if (typedArrayObtainStyledAttributes != null) {
                        }
                        if (i11 != 0) {
                            c cVar = new c();
                            this.f1465f = cVar;
                            cVar.f(h1VarT.n(g.j.D2));
                        } else if (i11 == 1) {
                            e eVar = new e(this.f1461b, attributeSet, i10);
                            h1 h1VarT2 = h1.t(this.f1461b, attributeSet, g.j.A2, i10, 0);
                            this.f1466g = h1VarT2.l(g.j.E2, -2);
                            eVar.n(h1VarT2.f(g.j.C2));
                            eVar.f(h1VarT.n(g.j.D2));
                            h1VarT2.u();
                            this.f1465f = eVar;
                            this.f1462c = new a(this, eVar);
                        }
                        charSequenceArrP = h1VarT.p(g.j.B2);
                        if (charSequenceArrP != null) {
                            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrP);
                            arrayAdapter.setDropDownViewResource(g.g.f15095t);
                            setAdapter((SpinnerAdapter) arrayAdapter);
                        }
                        h1VarT.u();
                        this.f1464e = true;
                        spinnerAdapter = this.f1463d;
                        if (spinnerAdapter != null) {
                            setAdapter(spinnerAdapter);
                            this.f1463d = null;
                        }
                        this.f1460a.e(attributeSet, i10);
                    }
                } catch (Throwable th) {
                    th = th;
                    typedArray = typedArrayObtainStyledAttributes;
                    if (typedArray != null) {
                        typedArray.recycle();
                    }
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                typedArrayObtainStyledAttributes = null;
            } catch (Throwable th2) {
                th = th2;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (i11 != 0) {
            c cVar2 = new c();
            this.f1465f = cVar2;
            cVar2.f(h1VarT.n(g.j.D2));
        } else if (i11 == 1) {
            e eVar2 = new e(this.f1461b, attributeSet, i10);
            h1 h1VarT3 = h1.t(this.f1461b, attributeSet, g.j.A2, i10, 0);
            this.f1466g = h1VarT3.l(g.j.E2, -2);
            eVar2.n(h1VarT3.f(g.j.C2));
            eVar2.f(h1VarT.n(g.j.D2));
            h1VarT3.u();
            this.f1465f = eVar2;
            this.f1462c = new a(this, eVar2);
        }
        charSequenceArrP = h1VarT.p(g.j.B2);
        if (charSequenceArrP != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrP);
            arrayAdapter2.setDropDownViewResource(g.g.f15095t);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        h1VarT.u();
        this.f1464e = true;
        spinnerAdapter = this.f1463d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f1463d = null;
        }
        this.f1460a.e(attributeSet, i10);
    }
}
