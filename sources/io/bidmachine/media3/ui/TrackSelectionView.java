package io.bidmachine.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class TrackSelectionView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LayoutInflater f20065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CheckedTextView f20066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CheckedTextView f20067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f20068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<u7.h0.a> f20069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<u7.e0, u7.f0> f20070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f20071h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f20072i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private fa.y f20073j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CheckedTextView[][] f20074k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f20075l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Comparator<c> f20076m;

    private class b implements View.OnClickListener {
        private b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.c(view);
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u7.h0.a f20078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20079b;

        public c(u7.h0.a aVar, int i10) {
            this.f20078a = aVar;
            this.f20079b = i10;
        }

        public u7.q a() {
            return this.f20078a.b(this.f20079b);
        }
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static Map<u7.e0, u7.f0> b(Map<u7.e0, u7.f0> map, List<u7.h0.a> list, boolean z10) {
        HashMap map2 = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            u7.f0 f0Var = map.get(list.get(i10).a());
            if (f0Var != null && (z10 || map2.isEmpty())) {
                map2.put(f0Var.f26066a, f0Var);
            }
        }
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(View view) {
        if (view == this.f20066c) {
            e();
        } else if (view == this.f20067d) {
            d();
        } else {
            f(view);
        }
        i();
    }

    private void d() {
        this.f20075l = false;
        this.f20070g.clear();
    }

    private void e() {
        this.f20075l = true;
        this.f20070g.clear();
    }

    private void f(View view) {
        this.f20075l = false;
        c cVar = (c) x7.a.e(view.getTag());
        u7.e0 e0VarA = cVar.f20078a.a();
        int i10 = cVar.f20079b;
        u7.f0 f0Var = this.f20070g.get(e0VarA);
        if (f0Var == null) {
            if (!this.f20072i && this.f20070g.size() > 0) {
                this.f20070g.clear();
            }
            this.f20070g.put(e0VarA, new u7.f0(e0VarA, com.google.common.collect.u.I(Integer.valueOf(i10))));
            return;
        }
        ArrayList arrayList = new ArrayList(f0Var.f26067b);
        boolean zIsChecked = ((CheckedTextView) view).isChecked();
        boolean zG = g(cVar.f20078a);
        boolean z10 = zG || h();
        if (zIsChecked && z10) {
            arrayList.remove(Integer.valueOf(i10));
            if (arrayList.isEmpty()) {
                this.f20070g.remove(e0VarA);
                return;
            } else {
                this.f20070g.put(e0VarA, new u7.f0(e0VarA, arrayList));
                return;
            }
        }
        if (zIsChecked) {
            return;
        }
        if (!zG) {
            this.f20070g.put(e0VarA, new u7.f0(e0VarA, com.google.common.collect.u.I(Integer.valueOf(i10))));
        } else {
            arrayList.add(Integer.valueOf(i10));
            this.f20070g.put(e0VarA, new u7.f0(e0VarA, arrayList));
        }
    }

    private boolean g(u7.h0.a aVar) {
        return this.f20071h && aVar.d();
    }

    private boolean h() {
        return this.f20072i && this.f20069f.size() > 1;
    }

    private void i() {
        this.f20066c.setChecked(this.f20075l);
        this.f20067d.setChecked(!this.f20075l && this.f20070g.size() == 0);
        for (int i10 = 0; i10 < this.f20074k.length; i10++) {
            u7.f0 f0Var = this.f20070g.get(this.f20069f.get(i10).a());
            int i11 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f20074k[i10];
                if (i11 < checkedTextViewArr.length) {
                    if (f0Var != null) {
                        this.f20074k[i10][i11].setChecked(f0Var.f26067b.contains(Integer.valueOf(((c) x7.a.e(checkedTextViewArr[i11].getTag())).f20079b)));
                    } else {
                        checkedTextViewArr[i11].setChecked(false);
                    }
                    i11++;
                }
            }
        }
    }

    private void j() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f20069f.isEmpty()) {
            this.f20066c.setEnabled(false);
            this.f20067d.setEnabled(false);
            return;
        }
        this.f20066c.setEnabled(true);
        this.f20067d.setEnabled(true);
        this.f20074k = new CheckedTextView[this.f20069f.size()][];
        boolean zH = h();
        for (int i10 = 0; i10 < this.f20069f.size(); i10++) {
            u7.h0.a aVar = this.f20069f.get(i10);
            boolean zG = g(aVar);
            CheckedTextView[][] checkedTextViewArr = this.f20074k;
            int i11 = aVar.f26173a;
            checkedTextViewArr[i10] = new CheckedTextView[i11];
            c[] cVarArr = new c[i11];
            for (int i12 = 0; i12 < aVar.f26173a; i12++) {
                cVarArr[i12] = new c(aVar, i12);
            }
            Comparator<c> comparator = this.f20076m;
            if (comparator != null) {
                Arrays.sort(cVarArr, comparator);
            }
            for (int i13 = 0; i13 < i11; i13++) {
                if (i13 == 0) {
                    addView(this.f20065b.inflate(fa.t.f14830a, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.f20065b.inflate((zG || zH) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.f20064a);
                checkedTextView.setText(this.f20073j.a(cVarArr[i13].a()));
                checkedTextView.setTag(cVarArr[i13]);
                if (aVar.h(i13)) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setOnClickListener(this.f20068e);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.f20074k[i10][i13] = checkedTextView;
                addView(checkedTextView);
            }
        }
        i();
    }

    public boolean getIsDisabled() {
        return this.f20075l;
    }

    public Map<u7.e0, u7.f0> getOverrides() {
        return this.f20070g;
    }

    public void setAllowAdaptiveSelections(boolean z10) {
        if (this.f20071h != z10) {
            this.f20071h = z10;
            j();
        }
    }

    public void setAllowMultipleOverrides(boolean z10) {
        if (this.f20072i != z10) {
            this.f20072i = z10;
            if (!z10 && this.f20070g.size() > 1) {
                Map<u7.e0, u7.f0> mapB = b(this.f20070g, this.f20069f, false);
                this.f20070g.clear();
                this.f20070g.putAll(mapB);
            }
            j();
        }
    }

    public void setShowDisableOption(boolean z10) {
        this.f20066c.setVisibility(z10 ? 0 : 8);
    }

    public void setTrackNameProvider(fa.y yVar) {
        this.f20073j = (fa.y) x7.a.e(yVar);
        j();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f20064a = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f20065b = layoutInflaterFrom;
        b bVar = new b();
        this.f20068e = bVar;
        this.f20073j = new fa.d(getResources());
        this.f20069f = new ArrayList();
        this.f20070g = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f20066c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(fa.v.f14861x);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(fa.t.f14830a, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f20067d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(fa.v.f14860w);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }
}
