package com.google.common.base;

/* JADX INFO: compiled from: CharMatcher.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class d implements q<Character> {

    /* JADX INFO: compiled from: CharMatcher.java */
    static abstract class a extends d {
        a() {
        }

        @Override // com.google.common.base.q
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.b(ch);
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    private static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char f11442a;

        b(char c10) {
            this.f11442a = c10;
        }

        @Override // com.google.common.base.d
        public boolean e(char c10) {
            return c10 == this.f11442a;
        }

        public String toString() {
            return "CharMatcher.is('" + d.g(this.f11442a) + "')";
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    static abstract class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f11443a;

        c(String str) {
            this.f11443a = (String) p.l(str);
        }

        public final String toString() {
            return this.f11443a;
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CharMatcher.java */
    private static final class C0139d extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f11444b = new C0139d();

        private C0139d() {
            super("CharMatcher.none()");
        }

        @Override // com.google.common.base.d
        public int c(CharSequence charSequence, int i10) {
            p.o(i10, charSequence.length());
            return -1;
        }

        @Override // com.google.common.base.d
        public boolean e(char c10) {
            return false;
        }
    }

    protected d() {
    }

    public static d d(char c10) {
        return new b(c10);
    }

    public static d f() {
        return C0139d.f11444b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String g(char c10) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    public boolean b(Character ch) {
        return e(ch.charValue());
    }

    public int c(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        p.o(i10, length);
        while (i10 < length) {
            if (e(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public abstract boolean e(char c10);
}
