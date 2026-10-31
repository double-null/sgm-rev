package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: classes.dex */
public class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected c f8759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f8760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected SpannedString f8761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected SpannedString f8762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected String f8763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f8764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f8765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f8766h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f8767i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f8768j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected int f8769k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected int f8770l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected boolean f8771m;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final c f8772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f8773b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        SpannedString f8774c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        SpannedString f8775d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f8776e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        String f8777f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f8778g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f8779h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f8780i = -16777216;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f8781j = -16777216;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f8782k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f8783l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f8784m;

        public b(c cVar) {
            this.f8772a = cVar;
        }

        public b a(boolean z10) {
            this.f8773b = z10;
            return this;
        }

        public b b(SpannedString spannedString) {
            this.f8774c = spannedString;
            return this;
        }

        public b c(String str) {
            return a(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public b d(String str) {
            return b(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public b a(SpannedString spannedString) {
            this.f8775d = spannedString;
            return this;
        }

        public b b(String str) {
            this.f8776e = str;
            return this;
        }

        public b a(String str) {
            this.f8777f = str;
            return this;
        }

        public b b(int i10) {
            this.f8783l = i10;
            return this;
        }

        public b c(int i10) {
            this.f8781j = i10;
            return this;
        }

        public b d(int i10) {
            this.f8780i = i10;
            return this;
        }

        public b a(int i10) {
            this.f8779h = i10;
            return this;
        }

        public b b(boolean z10) {
            this.f8784m = z10;
            return this;
        }

        public b a(Context context) {
            this.f8779h = R.drawable.applovin_ic_disclosure_arrow;
            this.f8783l = context.getColor(R.color.applovin_sdk_disclosureButtonColor);
            return this;
        }

        public t2 a() {
            int i10;
            if (this.f8773b && (i10 = this.f8779h) != 0 && i10 != R.drawable.applovin_ic_disclosure_arrow) {
                this.f8780i = -16776961;
            }
            return new t2(this);
        }
    }

    public enum c {
        SECTION(0),
        SECTION_CENTERED(1),
        SIMPLE(2),
        DETAIL(3),
        RIGHT_DETAIL(4),
        COUNT(5);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f8792a;

        c(int i10) {
            this.f8792a = i10;
        }

        public int b() {
            if (this == SECTION) {
                return R.layout.mediation_debugger_list_section;
            }
            if (this == SECTION_CENTERED) {
                return R.layout.mediation_debugger_list_section_centered;
            }
            if (this == SIMPLE) {
                return android.R.layout.simple_list_item_1;
            }
            return this == DETAIL ? R.layout.applovin_debugger_list_item_detail : R.layout.mediation_debugger_list_item_right_detail;
        }

        public int c() {
            return this.f8792a;
        }
    }

    public static b a() {
        return a(c.RIGHT_DETAIL);
    }

    public static int n() {
        return c.COUNT.c();
    }

    public String b() {
        return this.f8764f;
    }

    public String c() {
        return this.f8763e;
    }

    public int d() {
        return this.f8766h;
    }

    public int e() {
        return this.f8770l;
    }

    public SpannedString f() {
        return this.f8762d;
    }

    public int g() {
        return this.f8768j;
    }

    public int h() {
        return this.f8765g;
    }

    public int i() {
        return this.f8769k;
    }

    public int j() {
        return this.f8759a.b();
    }

    public SpannedString k() {
        return this.f8761c;
    }

    public int l() {
        return this.f8767i;
    }

    public int m() {
        return this.f8759a.c();
    }

    public boolean o() {
        return this.f8760b;
    }

    public boolean p() {
        return this.f8771m;
    }

    protected t2(c cVar) {
        this.f8765g = 0;
        this.f8766h = 0;
        this.f8767i = -16777216;
        this.f8768j = -16777216;
        this.f8769k = 0;
        this.f8770l = 0;
        this.f8759a = cVar;
    }

    public static b a(c cVar) {
        return new b(cVar);
    }

    private t2(b bVar) {
        this.f8765g = 0;
        this.f8766h = 0;
        this.f8767i = -16777216;
        this.f8768j = -16777216;
        this.f8769k = 0;
        this.f8770l = 0;
        this.f8759a = bVar.f8772a;
        this.f8760b = bVar.f8773b;
        this.f8761c = bVar.f8774c;
        this.f8762d = bVar.f8775d;
        this.f8763e = bVar.f8776e;
        this.f8764f = bVar.f8777f;
        this.f8765g = bVar.f8778g;
        this.f8766h = bVar.f8779h;
        this.f8767i = bVar.f8780i;
        this.f8768j = bVar.f8781j;
        this.f8769k = bVar.f8782k;
        this.f8770l = bVar.f8783l;
        this.f8771m = bVar.f8784m;
    }
}
