package com.applovin.impl;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class u2 extends BaseAdapter implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f8861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f8862b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f8863c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f8864d;

    public interface a {
        void a(l2 l2Var, t2 t2Var);
    }

    protected u2(Context context) {
        this.f8861a = context.getApplicationContext();
    }

    protected t2 a() {
        return null;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    protected abstract int b();

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t2 getItem(int i10) {
        return (t2) this.f8862b.get(i10);
    }

    protected abstract List c(int i10);

    public void c() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.ne
            @Override // java.lang.Runnable
            public final void run() {
                this.f7721a.notifyDataSetChanged();
            }
        });
    }

    protected abstract int d(int i10);

    protected abstract t2 e(int i10);

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f8862b.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i10) {
        return getItem(i10).m();
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        s2 s2Var;
        t2 item = getItem(i10);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(item.j(), viewGroup, false);
            s2Var = new s2();
            s2Var.f8156a = (TextView) view.findViewById(R.id.text1);
            s2Var.f8157b = (TextView) view.findViewById(R.id.text2);
            s2Var.f8158c = (ImageView) view.findViewById(com.applovin.sdk.R.id.imageView);
            s2Var.f8159d = (ImageView) view.findViewById(com.applovin.sdk.R.id.detailImageView);
            view.setTag(s2Var);
            view.setOnClickListener(this);
            view.setBackground(a(view));
        } else {
            s2Var = (s2) view.getTag();
        }
        s2Var.a(i10);
        s2Var.a(item);
        view.setEnabled(item.o());
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return t2.n();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i10) {
        return getItem(i10).o();
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        int i10;
        this.f8862b = new ArrayList();
        int iB = b();
        this.f8863c = new HashMap(iB);
        t2 t2VarA = a();
        if (t2VarA != null) {
            this.f8862b.add(t2VarA);
            i10 = 1;
        } else {
            i10 = 0;
        }
        for (int i11 = 0; i11 < iB; i11++) {
            int iD = d(i11);
            if (iD != 0) {
                this.f8862b.add(e(i11));
                this.f8862b.addAll(c(i11));
                this.f8863c.put(Integer.valueOf(i11), Integer.valueOf(i10));
                i10 += iD + 1;
            }
        }
        this.f8862b.add(new x4(""));
        super.notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        s2 s2Var = (s2) view.getTag();
        t2 t2VarB = s2Var.b();
        l2 l2VarA = a(s2Var.a());
        a aVar = this.f8864d;
        if (aVar == null || l2VarA == null) {
            return;
        }
        aVar.a(l2VarA, t2VarB);
    }

    public void a(a aVar) {
        this.f8864d = aVar;
    }

    private l2 a(int i10) {
        for (int i11 = 0; i11 < b(); i11++) {
            Integer num = (Integer) this.f8863c.get(Integer.valueOf(i11));
            if (num != null) {
                if (i10 <= num.intValue() + d(i11)) {
                    return new l2(i11, i10 - (num.intValue() + 1));
                }
            }
        }
        return null;
    }

    private Drawable a(View view) {
        Drawable background = view.getBackground();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.f8861a.getColor(com.applovin.sdk.R.color.applovin_sdk_highlightListItemColor));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable);
        stateListDrawable.addState(new int[0], background);
        return stateListDrawable;
    }
}
