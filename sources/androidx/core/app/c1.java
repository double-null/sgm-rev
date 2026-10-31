package androidx.core.app;

import android.app.Person;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.share.internal.ShareConstants;
import java.util.Objects;

/* JADX INFO: compiled from: Person.java */
/* JADX INFO: loaded from: classes.dex */
public class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    CharSequence f1693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    IconCompat f1694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f1695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f1696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f1697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f1698f;

    /* JADX INFO: compiled from: Person.java */
    static class a {
        static c1 a(Person person) {
            return new b().f(person.getName()).c(person.getIcon() != null ? IconCompat.a(person.getIcon()) : null).g(person.getUri()).e(person.getKey()).b(person.isBot()).d(person.isImportant()).a();
        }

        static Person b(c1 c1Var) {
            return new Person.Builder().setName(c1Var.c()).setIcon(c1Var.a() != null ? c1Var.a().s() : null).setUri(c1Var.d()).setKey(c1Var.b()).setBot(c1Var.e()).setImportant(c1Var.f()).build();
        }
    }

    /* JADX INFO: compiled from: Person.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        CharSequence f1699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        IconCompat f1700b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f1701c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f1702d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f1703e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f1704f;

        public c1 a() {
            return new c1(this);
        }

        public b b(boolean z10) {
            this.f1703e = z10;
            return this;
        }

        public b c(IconCompat iconCompat) {
            this.f1700b = iconCompat;
            return this;
        }

        public b d(boolean z10) {
            this.f1704f = z10;
            return this;
        }

        public b e(String str) {
            this.f1702d = str;
            return this;
        }

        public b f(CharSequence charSequence) {
            this.f1699a = charSequence;
            return this;
        }

        public b g(String str) {
            this.f1701c = str;
            return this;
        }
    }

    c1(b bVar) {
        this.f1693a = bVar.f1699a;
        this.f1694b = bVar.f1700b;
        this.f1695c = bVar.f1701c;
        this.f1696d = bVar.f1702d;
        this.f1697e = bVar.f1703e;
        this.f1698f = bVar.f1704f;
    }

    public IconCompat a() {
        return this.f1694b;
    }

    public String b() {
        return this.f1696d;
    }

    public CharSequence c() {
        return this.f1693a;
    }

    public String d() {
        return this.f1695c;
    }

    public boolean e() {
        return this.f1697e;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        String strB = b();
        String strB2 = c1Var.b();
        if (strB == null && strB2 == null) {
            return Objects.equals(Objects.toString(c()), Objects.toString(c1Var.c())) && Objects.equals(d(), c1Var.d()) && Objects.equals(Boolean.valueOf(e()), Boolean.valueOf(c1Var.e())) && Objects.equals(Boolean.valueOf(f()), Boolean.valueOf(c1Var.f()));
        }
        return Objects.equals(strB, strB2);
    }

    public boolean f() {
        return this.f1698f;
    }

    public String g() {
        String str = this.f1695c;
        if (str != null) {
            return str;
        }
        if (this.f1693a == null) {
            return "";
        }
        return "name:" + ((Object) this.f1693a);
    }

    public Person h() {
        return a.b(this);
    }

    public int hashCode() {
        String strB = b();
        return strB != null ? strB.hashCode() : Objects.hash(c(), d(), Boolean.valueOf(e()), Boolean.valueOf(f()));
    }

    public Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f1693a);
        IconCompat iconCompat = this.f1694b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.r() : null);
        bundle.putString(ShareConstants.MEDIA_URI, this.f1695c);
        bundle.putString(SDKConstants.PARAM_KEY, this.f1696d);
        bundle.putBoolean("isBot", this.f1697e);
        bundle.putBoolean("isImportant", this.f1698f);
        return bundle;
    }
}
