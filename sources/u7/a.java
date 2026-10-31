package u7;

import android.view.View;

/* JADX INFO: compiled from: AdOverlayInfo.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f25938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25940c;

    /* JADX INFO: renamed from: u7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AdOverlayInfo.java */
    public static final class C0439a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f25941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f25942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f25943c;

        public C0439a(View view, int i10) {
            this.f25941a = view;
            this.f25942b = i10;
        }

        public a a() {
            return new a(this.f25941a, this.f25942b, this.f25943c);
        }

        public C0439a b(String str) {
            this.f25943c = str;
            return this;
        }
    }

    @Deprecated
    public a(View view, int i10, String str) {
        this.f25938a = view;
        this.f25939b = i10;
        this.f25940c = str;
    }
}
