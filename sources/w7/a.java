package w7;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import x7.l0;

/* JADX INFO: compiled from: Cue.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f27543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f27544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f27545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bitmap f27546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f27547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f27548f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f27549g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f27550h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f27551i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f27552j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f27553k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f27554l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f27555m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f27556n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f27557o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f27558p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f27559q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    public static final a f27534r = new b().o("").a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f27535s = l0.C0(0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f27536t = l0.C0(17);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f27537u = l0.C0(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f27538v = l0.C0(2);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f27539w = l0.C0(3);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f27540x = l0.C0(18);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f27541y = l0.C0(4);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f27542z = l0.C0(5);
    private static final String A = l0.C0(6);
    private static final String B = l0.C0(7);
    private static final String C = l0.C0(8);
    private static final String D = l0.C0(9);
    private static final String E = l0.C0(10);
    private static final String F = l0.C0(11);
    private static final String G = l0.C0(12);
    private static final String H = l0.C0(13);
    private static final String I = l0.C0(14);
    private static final String J = l0.C0(15);
    private static final String K = l0.C0(16);

    /* JADX INFO: compiled from: Cue.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CharSequence f27560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Bitmap f27561b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Layout.Alignment f27562c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Layout.Alignment f27563d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f27564e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f27565f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f27566g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f27567h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f27568i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f27569j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private float f27570k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private float f27571l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private float f27572m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f27573n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f27574o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f27575p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private float f27576q;

        public a a() {
            return new a(this.f27560a, this.f27562c, this.f27563d, this.f27561b, this.f27564e, this.f27565f, this.f27566g, this.f27567h, this.f27568i, this.f27569j, this.f27570k, this.f27571l, this.f27572m, this.f27573n, this.f27574o, this.f27575p, this.f27576q);
        }

        public b b() {
            this.f27573n = false;
            return this;
        }

        public int c() {
            return this.f27566g;
        }

        public int d() {
            return this.f27568i;
        }

        public CharSequence e() {
            return this.f27560a;
        }

        public b f(Bitmap bitmap) {
            this.f27561b = bitmap;
            return this;
        }

        public b g(float f10) {
            this.f27572m = f10;
            return this;
        }

        public b h(float f10, int i10) {
            this.f27564e = f10;
            this.f27565f = i10;
            return this;
        }

        public b i(int i10) {
            this.f27566g = i10;
            return this;
        }

        public b j(Layout.Alignment alignment) {
            this.f27563d = alignment;
            return this;
        }

        public b k(float f10) {
            this.f27567h = f10;
            return this;
        }

        public b l(int i10) {
            this.f27568i = i10;
            return this;
        }

        public b m(float f10) {
            this.f27576q = f10;
            return this;
        }

        public b n(float f10) {
            this.f27571l = f10;
            return this;
        }

        public b o(CharSequence charSequence) {
            this.f27560a = charSequence;
            return this;
        }

        public b p(Layout.Alignment alignment) {
            this.f27562c = alignment;
            return this;
        }

        public b q(float f10, int i10) {
            this.f27570k = f10;
            this.f27569j = i10;
            return this;
        }

        public b r(int i10) {
            this.f27575p = i10;
            return this;
        }

        public b s(int i10) {
            this.f27574o = i10;
            this.f27573n = true;
            return this;
        }

        public b() {
            this.f27560a = null;
            this.f27561b = null;
            this.f27562c = null;
            this.f27563d = null;
            this.f27564e = -3.4028235E38f;
            this.f27565f = Integer.MIN_VALUE;
            this.f27566g = Integer.MIN_VALUE;
            this.f27567h = -3.4028235E38f;
            this.f27568i = Integer.MIN_VALUE;
            this.f27569j = Integer.MIN_VALUE;
            this.f27570k = -3.4028235E38f;
            this.f27571l = -3.4028235E38f;
            this.f27572m = -3.4028235E38f;
            this.f27573n = false;
            this.f27574o = -16777216;
            this.f27575p = Integer.MIN_VALUE;
        }

        private b(a aVar) {
            this.f27560a = aVar.f27543a;
            this.f27561b = aVar.f27546d;
            this.f27562c = aVar.f27544b;
            this.f27563d = aVar.f27545c;
            this.f27564e = aVar.f27547e;
            this.f27565f = aVar.f27548f;
            this.f27566g = aVar.f27549g;
            this.f27567h = aVar.f27550h;
            this.f27568i = aVar.f27551i;
            this.f27569j = aVar.f27556n;
            this.f27570k = aVar.f27557o;
            this.f27571l = aVar.f27552j;
            this.f27572m = aVar.f27553k;
            this.f27573n = aVar.f27554l;
            this.f27574o = aVar.f27555m;
            this.f27575p = aVar.f27558p;
            this.f27576q = aVar.f27559q;
        }
    }

    public static a b(Bundle bundle) {
        b bVar = new b();
        CharSequence charSequence = bundle.getCharSequence(f27535s);
        if (charSequence != null) {
            bVar.o(charSequence);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f27536t);
            if (parcelableArrayList != null) {
                SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    c.c((Bundle) it.next(), spannableStringValueOf);
                }
                bVar.o(spannableStringValueOf);
            }
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(f27537u);
        if (alignment != null) {
            bVar.p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(f27538v);
        if (alignment2 != null) {
            bVar.j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f27539w);
        if (bitmap != null) {
            bVar.f(bitmap);
        } else {
            byte[] byteArray = bundle.getByteArray(f27540x);
            if (byteArray != null) {
                bVar.f(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
            }
        }
        String str = f27541y;
        if (bundle.containsKey(str)) {
            String str2 = f27542z;
            if (bundle.containsKey(str2)) {
                bVar.h(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = A;
        if (bundle.containsKey(str3)) {
            bVar.i(bundle.getInt(str3));
        }
        String str4 = B;
        if (bundle.containsKey(str4)) {
            bVar.k(bundle.getFloat(str4));
        }
        String str5 = C;
        if (bundle.containsKey(str5)) {
            bVar.l(bundle.getInt(str5));
        }
        String str6 = E;
        if (bundle.containsKey(str6)) {
            String str7 = D;
            if (bundle.containsKey(str7)) {
                bVar.q(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = F;
        if (bundle.containsKey(str8)) {
            bVar.n(bundle.getFloat(str8));
        }
        String str9 = G;
        if (bundle.containsKey(str9)) {
            bVar.g(bundle.getFloat(str9));
        }
        String str10 = H;
        if (bundle.containsKey(str10)) {
            bVar.s(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(I, false)) {
            bVar.b();
        }
        String str11 = J;
        if (bundle.containsKey(str11)) {
            bVar.r(bundle.getInt(str11));
        }
        String str12 = K;
        if (bundle.containsKey(str12)) {
            bVar.m(bundle.getFloat(str12));
        }
        return bVar.a();
    }

    private Bundle c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f27543a;
        if (charSequence != null) {
            bundle.putCharSequence(f27535s, charSequence);
            CharSequence charSequence2 = this.f27543a;
            if (charSequence2 instanceof Spanned) {
                ArrayList<Bundle> arrayListA = c.a((Spanned) charSequence2);
                if (!arrayListA.isEmpty()) {
                    bundle.putParcelableArrayList(f27536t, arrayListA);
                }
            }
        }
        bundle.putSerializable(f27537u, this.f27544b);
        bundle.putSerializable(f27538v, this.f27545c);
        bundle.putFloat(f27541y, this.f27547e);
        bundle.putInt(f27542z, this.f27548f);
        bundle.putInt(A, this.f27549g);
        bundle.putFloat(B, this.f27550h);
        bundle.putInt(C, this.f27551i);
        bundle.putInt(D, this.f27556n);
        bundle.putFloat(E, this.f27557o);
        bundle.putFloat(F, this.f27552j);
        bundle.putFloat(G, this.f27553k);
        bundle.putBoolean(I, this.f27554l);
        bundle.putInt(H, this.f27555m);
        bundle.putInt(J, this.f27558p);
        bundle.putFloat(K, this.f27559q);
        return bundle;
    }

    public b a() {
        return new b();
    }

    public Bundle d() {
        Bundle bundleC = c();
        if (this.f27546d != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            x7.a.g(this.f27546d.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundleC.putByteArray(f27540x, byteArrayOutputStream.toByteArray());
        }
        return bundleC;
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return TextUtils.equals(this.f27543a, aVar.f27543a) && this.f27544b == aVar.f27544b && this.f27545c == aVar.f27545c && ((bitmap = this.f27546d) != null ? !((bitmap2 = aVar.f27546d) == null || !bitmap.sameAs(bitmap2)) : aVar.f27546d == null) && this.f27547e == aVar.f27547e && this.f27548f == aVar.f27548f && this.f27549g == aVar.f27549g && this.f27550h == aVar.f27550h && this.f27551i == aVar.f27551i && this.f27552j == aVar.f27552j && this.f27553k == aVar.f27553k && this.f27554l == aVar.f27554l && this.f27555m == aVar.f27555m && this.f27556n == aVar.f27556n && this.f27557o == aVar.f27557o && this.f27558p == aVar.f27558p && this.f27559q == aVar.f27559q;
    }

    public int hashCode() {
        return Objects.hash(this.f27543a, this.f27544b, this.f27545c, this.f27546d, Float.valueOf(this.f27547e), Integer.valueOf(this.f27548f), Integer.valueOf(this.f27549g), Float.valueOf(this.f27550h), Integer.valueOf(this.f27551i), Float.valueOf(this.f27552j), Float.valueOf(this.f27553k), Boolean.valueOf(this.f27554l), Integer.valueOf(this.f27555m), Integer.valueOf(this.f27556n), Float.valueOf(this.f27557o), Integer.valueOf(this.f27558p), Float.valueOf(this.f27559q));
    }

    private a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        if (charSequence == null) {
            x7.a.e(bitmap);
        } else {
            x7.a.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f27543a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f27543a = charSequence.toString();
        } else {
            this.f27543a = null;
        }
        this.f27544b = alignment;
        this.f27545c = alignment2;
        this.f27546d = bitmap;
        this.f27547e = f10;
        this.f27548f = i10;
        this.f27549g = i11;
        this.f27550h = f11;
        this.f27551i = i12;
        this.f27552j = f13;
        this.f27553k = f14;
        this.f27554l = z10;
        this.f27555m = i14;
        this.f27556n = i13;
        this.f27557o = f12;
        this.f27558p = i15;
        this.f27559q = f15;
    }
}
