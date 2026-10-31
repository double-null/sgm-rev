package pb;

import android.graphics.Bitmap;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f23925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f23926c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f23927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f23928b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f23929c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Bitmap f23930d;

        public a(b type, String title, String data) {
            kotlin.jvm.internal.t.f(type, "type");
            kotlin.jvm.internal.t.f(title, "title");
            kotlin.jvm.internal.t.f(data, "data");
            this.f23927a = type;
            this.f23928b = title;
            this.f23929c = data;
        }

        public final String a() {
            return this.f23929c;
        }

        public final Bitmap b() {
            return this.f23930d;
        }

        public final String c() {
            return this.f23928b;
        }

        public final b d() {
            return this.f23927a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f23927a == aVar.f23927a && kotlin.jvm.internal.t.a(this.f23928b, aVar.f23928b) && kotlin.jvm.internal.t.a(this.f23929c, aVar.f23929c);
        }

        public int hashCode() {
            return (((this.f23927a.hashCode() * 31) + this.f23928b.hashCode()) * 31) + this.f23929c.hashCode();
        }

        public String toString() {
            return "Action(type=" + this.f23927a + ", title=" + this.f23928b + ", data=" + this.f23929c + ')';
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(b type, String title, String data, Bitmap bitmap) {
            this(type, title, data);
            kotlin.jvm.internal.t.f(type, "type");
            kotlin.jvm.internal.t.f(title, "title");
            kotlin.jvm.internal.t.f(data, "data");
            this.f23930d = bitmap;
        }
    }

    public enum b {
        REDIRECT,
        COPY_TO_CLIPBOARD
    }

    public a1(String title, String subtitle, List<a> actions) {
        kotlin.jvm.internal.t.f(title, "title");
        kotlin.jvm.internal.t.f(subtitle, "subtitle");
        kotlin.jvm.internal.t.f(actions, "actions");
        this.f23924a = title;
        this.f23925b = subtitle;
        this.f23926c = actions;
    }

    public final List<a> a() {
        return this.f23926c;
    }

    public final String b() {
        return this.f23925b;
    }

    public final String c() {
        return this.f23924a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return kotlin.jvm.internal.t.a(this.f23924a, a1Var.f23924a) && kotlin.jvm.internal.t.a(this.f23925b, a1Var.f23925b) && kotlin.jvm.internal.t.a(this.f23926c, a1Var.f23926c);
    }

    public int hashCode() {
        return (((this.f23924a.hashCode() * 31) + this.f23925b.hashCode()) * 31) + this.f23926c.hashCode();
    }

    public String toString() {
        return "PrivacySheetParams(title=" + this.f23924a + ", subtitle=" + this.f23925b + ", actions=" + this.f23926c + ')';
    }
}
