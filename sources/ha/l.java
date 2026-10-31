package ha;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import io.bidmachine.ImageData;
import io.bidmachine.LabelData;
import io.bidmachine.PrivacySheetData;
import java.util.Set;
import ka.o;

/* JADX INFO: compiled from: NativeNetworkAdapter.java */
/* JADX INFO: loaded from: classes4.dex */
public class l implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f15801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f15802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f15803c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ImageData f15805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ImageData f15806f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f15807g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f15808h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f15809i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f15810j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private LabelData f15812l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private PrivacySheetData f15813m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f15804d = -1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f15811k = true;

    public View a(Context context) {
        return null;
    }

    @Override // ha.h
    public PrivacySheetData b() {
        return this.f15813m;
    }

    public View c(Context context) {
        if (this.f15812l == null && this.f15813m == null) {
            return null;
        }
        ka.n nVar = new ka.n(context);
        nVar.b(this);
        nVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return nVar;
    }

    @Override // ha.h
    public LabelData d() {
        return this.f15812l;
    }

    public String f() {
        return this.f15803c;
    }

    public String g() {
        return this.f15807g;
    }

    @Override // ha.m
    public ImageData getIcon() {
        return this.f15805e;
    }

    @Override // ha.m
    public ImageData getMainImage() {
        return this.f15806f;
    }

    public String h() {
        return this.f15802b;
    }

    @Override // ha.m
    public boolean hasVideo() {
        return this.f15810j;
    }

    public String i() {
        return this.f15801a;
    }

    public boolean j() {
        return this.f15811k;
    }

    @Override // ha.h
    public String k() {
        return this.f15808h;
    }

    public boolean l() {
        return (TextUtils.isEmpty(i()) || TextUtils.isEmpty(h()) || TextUtils.isEmpty(f())) ? false : true;
    }

    @Override // ha.h
    public String m() {
        return this.f15809i;
    }

    public l o(LabelData labelData) {
        this.f15812l = labelData;
        return this;
    }

    public l p(String str) {
        this.f15803c = str;
        return this;
    }

    public l q(String str) {
        this.f15807g = str;
        return this;
    }

    public l r(String str) {
        this.f15802b = str;
        return this;
    }

    public l s(ImageData imageData) {
        this.f15805e = imageData;
        return this;
    }

    public l t(ImageData imageData) {
        this.f15806f = imageData;
        return this;
    }

    public l u(boolean z10) {
        this.f15811k = z10;
        return this;
    }

    public l v(PrivacySheetData privacySheetData) {
        this.f15813m = privacySheetData;
        return this;
    }

    public l w(float f10) {
        this.f15804d = f10;
        return this;
    }

    public l x(String str) {
        this.f15801a = str;
        return this;
    }

    public l y(String str) {
        this.f15809i = str;
        return this;
    }

    public l z(String str) {
        this.f15808h = str;
        return this;
    }

    public void A() {
    }

    public void e() {
    }

    public void n(ViewGroup viewGroup, ImageView imageView, o oVar, Set<View> set) {
    }
}
