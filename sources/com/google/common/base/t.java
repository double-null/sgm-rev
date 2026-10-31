package com.google.common.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: Splitter.java */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.common.base.d f11460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f11461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f11462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f11463d;

    /* JADX INFO: compiled from: Splitter.java */
    class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.d f11464a;

        /* JADX INFO: renamed from: com.google.common.base.t$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Splitter.java */
        class C0141a extends d {
            C0141a(t tVar, CharSequence charSequence) {
                super(tVar, charSequence);
            }

            @Override // com.google.common.base.t.d
            int e(int i10) {
                return i10 + 1;
            }

            @Override // com.google.common.base.t.d
            int f(int i10) {
                return a.this.f11464a.c(this.f11470c, i10);
            }
        }

        a(com.google.common.base.d dVar) {
            this.f11464a = dVar;
        }

        @Override // com.google.common.base.t.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(t tVar, CharSequence charSequence) {
            return new C0141a(tVar, charSequence);
        }
    }

    /* JADX INFO: compiled from: Splitter.java */
    class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f11466a;

        /* JADX INFO: compiled from: Splitter.java */
        class a extends d {
            a(t tVar, CharSequence charSequence) {
                super(tVar, charSequence);
            }

            @Override // com.google.common.base.t.d
            public int e(int i10) {
                return i10 + b.this.f11466a.length();
            }

            @Override // com.google.common.base.t.d
            public int f(int i10) {
                int length = b.this.f11466a.length();
                int length2 = this.f11470c.length() - length;
                while (i10 <= length2) {
                    for (int i11 = 0; i11 < length; i11++) {
                        if (this.f11470c.charAt(i11 + i10) != b.this.f11466a.charAt(i11)) {
                            i10++;
                        }
                    }
                    return i10;
                }
                return -1;
            }
        }

        b(String str) {
            this.f11466a = str;
        }

        @Override // com.google.common.base.t.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(t tVar, CharSequence charSequence) {
            return new a(tVar, charSequence);
        }
    }

    /* JADX INFO: compiled from: Splitter.java */
    class c implements Iterable<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f11468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f11469b;

        c(t tVar, CharSequence charSequence) {
            this.f11468a = charSequence;
            this.f11469b = tVar;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return this.f11469b.k(this.f11468a);
        }

        public String toString() {
            i iVarG = i.g(", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            StringBuilder sbB = iVarG.b(sb2, this);
            sbB.append(']');
            return sbB.toString();
        }
    }

    /* JADX INFO: compiled from: Splitter.java */
    private static abstract class d extends com.google.common.base.b<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final CharSequence f11470c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final com.google.common.base.d f11471d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f11472e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f11473f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f11474g;

        protected d(t tVar, CharSequence charSequence) {
            this.f11471d = tVar.f11460a;
            this.f11472e = tVar.f11461b;
            this.f11474g = tVar.f11463d;
            this.f11470c = charSequence;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String a() {
            int i10 = this.f11473f;
            while (true) {
                int i11 = this.f11473f;
                if (i11 == -1) {
                    return b();
                }
                int iF = f(i11);
                if (iF == -1) {
                    iF = this.f11470c.length();
                    this.f11473f = -1;
                } else {
                    this.f11473f = e(iF);
                }
                int i12 = this.f11473f;
                if (i12 == i10) {
                    int i13 = i12 + 1;
                    this.f11473f = i13;
                    if (i13 > this.f11470c.length()) {
                        this.f11473f = -1;
                    }
                } else {
                    while (i10 < iF && this.f11471d.e(this.f11470c.charAt(i10))) {
                        i10++;
                    }
                    while (iF > i10 && this.f11471d.e(this.f11470c.charAt(iF - 1))) {
                        iF--;
                    }
                    if (!this.f11472e || i10 != iF) {
                        int i14 = this.f11474g;
                        if (i14 == 1) {
                            iF = this.f11470c.length();
                            this.f11473f = -1;
                            while (iF > i10 && this.f11471d.e(this.f11470c.charAt(iF - 1))) {
                                iF--;
                            }
                        } else {
                            this.f11474g = i14 - 1;
                        }
                        return this.f11470c.subSequence(i10, iF).toString();
                    }
                    i10 = this.f11473f;
                }
            }
        }

        abstract int e(int i10);

        abstract int f(int i10);
    }

    /* JADX INFO: compiled from: Splitter.java */
    private interface e {
        Iterator<String> a(t tVar, CharSequence charSequence);
    }

    private t(e eVar) {
        this(eVar, false, com.google.common.base.d.f(), Integer.MAX_VALUE);
    }

    public static t f(char c10) {
        return g(com.google.common.base.d.d(c10));
    }

    public static t g(com.google.common.base.d dVar) {
        p.l(dVar);
        return new t(new a(dVar));
    }

    public static t h(String str) {
        p.e(str.length() != 0, "The separator may not be the empty string.");
        return str.length() == 1 ? f(str.charAt(0)) : new t(new b(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Iterator<String> k(CharSequence charSequence) {
        return this.f11462c.a(this, charSequence);
    }

    public t e() {
        return new t(this.f11462c, true, this.f11460a, this.f11463d);
    }

    public Iterable<String> i(CharSequence charSequence) {
        p.l(charSequence);
        return new c(this, charSequence);
    }

    public List<String> j(CharSequence charSequence) {
        p.l(charSequence);
        Iterator<String> itK = k(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itK.hasNext()) {
            arrayList.add(itK.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    private t(e eVar, boolean z10, com.google.common.base.d dVar, int i10) {
        this.f11462c = eVar;
        this.f11461b = z10;
        this.f11460a = dVar;
        this.f11463d = i10;
    }
}
