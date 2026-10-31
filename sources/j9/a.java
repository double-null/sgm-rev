package j9;

import java.util.Arrays;
import java.util.Objects;
import u7.u;

/* JADX INFO: compiled from: ApicFrame.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f20699e;

    public a(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f20696b = str;
        this.f20697c = str2;
        this.f20698d = i10;
        this.f20699e = bArr;
    }

    @Override // u7.v.a
    public void b(u.b bVar) {
        bVar.K(this.f20699e, this.f20698d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f20698d == aVar.f20698d && Objects.equals(this.f20696b, aVar.f20696b) && Objects.equals(this.f20697c, aVar.f20697c) && Arrays.equals(this.f20699e, aVar.f20699e);
    }

    public int hashCode() {
        int i10 = (527 + this.f20698d) * 31;
        String str = this.f20696b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f20697c;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f20699e);
    }

    @Override // j9.i
    public String toString() {
        return this.f20724a + ": mimeType=" + this.f20696b + ", description=" + this.f20697c;
    }
}
