package io.bidmachine.iab.mraid;

import java.util.Date;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f17829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Date f17830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f17831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f17832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Date f17833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f17834f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f17835g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f17836h;

    v(String str, Date date) {
        this.f17829a = str;
        this.f17830b = date;
    }

    void a(String str) {
        this.f17831c = str;
    }

    void b(Date date) {
        this.f17833e = date;
    }

    void c(String str) {
        this.f17836h = str;
    }

    void d(String str) {
        this.f17834f = str;
    }

    void e(String str) {
        this.f17832d = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Objects.equals(this.f17829a, vVar.f17829a) && Objects.equals(this.f17830b, vVar.f17830b) && Objects.equals(this.f17831c, vVar.f17831c) && Objects.equals(this.f17832d, vVar.f17832d) && Objects.equals(this.f17833e, vVar.f17833e) && Objects.equals(this.f17834f, vVar.f17834f) && Objects.equals(this.f17835g, vVar.f17835g) && Objects.equals(this.f17836h, vVar.f17836h);
    }

    void f(String str) {
        this.f17835g = str;
    }

    public String g() {
        return this.f17829a;
    }

    public Date h() {
        return this.f17833e;
    }

    public int hashCode() {
        return Objects.hash(this.f17829a, this.f17830b, this.f17831c, this.f17832d, this.f17833e, this.f17834f, this.f17835g, this.f17836h);
    }

    public String i() {
        return this.f17831c;
    }

    public String j() {
        return this.f17836h;
    }

    public Date k() {
        return this.f17830b;
    }

    public String l() {
        return this.f17834f;
    }

    public String m() {
        return this.f17832d;
    }

    public String n() {
        return this.f17835g;
    }

    public String toString() {
        return "MraidCalendarEvent{description='" + this.f17829a + "', start=" + this.f17830b + ", location='" + this.f17831c + "', summary='" + this.f17832d + "', end=" + this.f17833e + ", status='" + this.f17834f + "', transparency='" + this.f17835g + "', recurrence='" + this.f17836h + "'}";
    }
}
