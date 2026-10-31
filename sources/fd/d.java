package fd;

import id.p;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.io.AccessDeniedException;
import kotlin.jvm.internal.t;
import wc.g0;

/* JADX INFO: compiled from: FileTreeWalk.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d implements qd.g<File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f14929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f14930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final id.l<File, Boolean> f14931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final id.l<File, g0> f14932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p<File, IOException, g0> f14933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f14934f;

    /* JADX INFO: compiled from: FileTreeWalk.kt */
    private static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File rootDir) {
            super(rootDir);
            t.f(rootDir, "rootDir");
        }
    }

    /* JADX INFO: compiled from: FileTreeWalk.kt */
    private final class b extends kotlin.collections.c<File> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayDeque<c> f14935c;

        /* JADX INFO: compiled from: FileTreeWalk.kt */
        private final class a extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f14937b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private File[] f14938c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f14939d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f14940e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f14941f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, File rootDir) {
                super(rootDir);
                t.f(rootDir, "rootDir");
                this.f14941f = bVar;
            }

            @Override // fd.d.c
            public File b() {
                if (!this.f14940e && this.f14938c == null) {
                    id.l lVar = d.this.f14931c;
                    boolean z10 = false;
                    if (lVar != null && !((Boolean) lVar.invoke(a())).booleanValue()) {
                        z10 = true;
                    }
                    if (z10) {
                        return null;
                    }
                    File[] fileArrListFiles = a().listFiles();
                    this.f14938c = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        p pVar = d.this.f14933e;
                        if (pVar != null) {
                            pVar.invoke(a(), new AccessDeniedException(a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f14940e = true;
                    }
                }
                File[] fileArr = this.f14938c;
                if (fileArr != null) {
                    int i10 = this.f14939d;
                    t.c(fileArr);
                    if (i10 < fileArr.length) {
                        File[] fileArr2 = this.f14938c;
                        t.c(fileArr2);
                        int i11 = this.f14939d;
                        this.f14939d = i11 + 1;
                        return fileArr2[i11];
                    }
                }
                if (!this.f14937b) {
                    this.f14937b = true;
                    return a();
                }
                id.l lVar2 = d.this.f14932d;
                if (lVar2 != null) {
                    lVar2.invoke(a());
                }
                return null;
            }
        }

        /* JADX INFO: renamed from: fd.d$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FileTreeWalk.kt */
        private final class C0224b extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f14942b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f14943c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0224b(b bVar, File rootFile) {
                super(rootFile);
                t.f(rootFile, "rootFile");
                this.f14943c = bVar;
            }

            @Override // fd.d.c
            public File b() {
                if (this.f14942b) {
                    return null;
                }
                this.f14942b = true;
                return a();
            }
        }

        /* JADX INFO: compiled from: FileTreeWalk.kt */
        private final class c extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f14944b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private File[] f14945c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f14946d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ b f14947e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, File rootDir) {
                super(rootDir);
                t.f(rootDir, "rootDir");
                this.f14947e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
            
                if (r0.length == 0) goto L33;
             */
            @Override // fd.d.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.io.File b() {
                /*
                    r10 = this;
                    boolean r0 = r10.f14944b
                    r1 = 0
                    if (r0 != 0) goto L2c
                    fd.d$b r0 = r10.f14947e
                    fd.d r0 = fd.d.this
                    id.l r0 = fd.d.d(r0)
                    r2 = 0
                    r3 = 1
                    if (r0 == 0) goto L22
                    java.io.File r4 = r10.a()
                    java.lang.Object r0 = r0.invoke(r4)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L22
                    r2 = r3
                L22:
                    if (r2 == 0) goto L25
                    return r1
                L25:
                    r10.f14944b = r3
                    java.io.File r0 = r10.a()
                    return r0
                L2c:
                    java.io.File[] r0 = r10.f14945c
                    if (r0 == 0) goto L4b
                    int r2 = r10.f14946d
                    kotlin.jvm.internal.t.c(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L39
                    goto L4b
                L39:
                    fd.d$b r0 = r10.f14947e
                    fd.d r0 = fd.d.this
                    id.l r0 = fd.d.f(r0)
                    if (r0 == 0) goto L4a
                    java.io.File r2 = r10.a()
                    r0.invoke(r2)
                L4a:
                    return r1
                L4b:
                    java.io.File[] r0 = r10.f14945c
                    if (r0 != 0) goto L97
                    java.io.File r0 = r10.a()
                    java.io.File[] r0 = r0.listFiles()
                    r10.f14945c = r0
                    if (r0 != 0) goto L7b
                    fd.d$b r0 = r10.f14947e
                    fd.d r0 = fd.d.this
                    id.p r0 = fd.d.e(r0)
                    if (r0 == 0) goto L7b
                    java.io.File r2 = r10.a()
                    kotlin.io.AccessDeniedException r9 = new kotlin.io.AccessDeniedException
                    java.io.File r4 = r10.a()
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r7 = 2
                    r8 = 0
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r9)
                L7b:
                    java.io.File[] r0 = r10.f14945c
                    if (r0 == 0) goto L85
                    kotlin.jvm.internal.t.c(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L97
                L85:
                    fd.d$b r0 = r10.f14947e
                    fd.d r0 = fd.d.this
                    id.l r0 = fd.d.f(r0)
                    if (r0 == 0) goto L96
                    java.io.File r2 = r10.a()
                    r0.invoke(r2)
                L96:
                    return r1
                L97:
                    java.io.File[] r0 = r10.f14945c
                    kotlin.jvm.internal.t.c(r0)
                    int r1 = r10.f14946d
                    int r2 = r1 + 1
                    r10.f14946d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: fd.d.b.c.b():java.io.File");
            }
        }

        /* JADX INFO: renamed from: fd.d$b$d, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FileTreeWalk.kt */
        public /* synthetic */ class C0225d {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[e.values().length];
                try {
                    iArr[e.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[e.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.f14935c = arrayDeque;
            if (d.this.f14929a.isDirectory()) {
                arrayDeque.push(e(d.this.f14929a));
            } else if (d.this.f14929a.isFile()) {
                arrayDeque.push(new C0224b(this, d.this.f14929a));
            } else {
                b();
            }
        }

        private final a e(File file) {
            int i10 = C0225d.$EnumSwitchMapping$0[d.this.f14930b.ordinal()];
            if (i10 == 1) {
                return new c(this, file);
            }
            if (i10 == 2) {
                return new a(this, file);
            }
            throw new NoWhenBranchMatchedException();
        }

        private final File f() {
            while (true) {
                c cVarPeek = this.f14935c.peek();
                if (cVarPeek == null) {
                    return null;
                }
                File fileB = cVarPeek.b();
                if (fileB == null) {
                    this.f14935c.pop();
                } else {
                    if (t.a(fileB, cVarPeek.a()) || !fileB.isDirectory() || this.f14935c.size() >= d.this.f14934f) {
                        return fileB;
                    }
                    this.f14935c.push(e(fileB));
                }
            }
        }

        @Override // kotlin.collections.c
        protected void a() {
            File fileF = f();
            if (fileF != null) {
                c(fileF);
            } else {
                b();
            }
        }
    }

    /* JADX INFO: compiled from: FileTreeWalk.kt */
    private static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f14948a;

        public c(File root) {
            t.f(root, "root");
            this.f14948a = root;
        }

        public final File a() {
            return this.f14948a;
        }

        public abstract File b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private d(File file, e eVar, id.l<? super File, Boolean> lVar, id.l<? super File, g0> lVar2, p<? super File, ? super IOException, g0> pVar, int i10) {
        this.f14929a = file;
        this.f14930b = eVar;
        this.f14931c = lVar;
        this.f14932d = lVar2;
        this.f14933e = pVar;
        this.f14934f = i10;
    }

    @Override // qd.g
    public Iterator<File> iterator() {
        return new b();
    }

    /* synthetic */ d(File file, e eVar, id.l lVar, id.l lVar2, p pVar, int i10, int i11, kotlin.jvm.internal.k kVar) {
        this(file, (i11 & 2) != 0 ? e.TOP_DOWN : eVar, lVar, lVar2, pVar, (i11 & 32) != 0 ? Integer.MAX_VALUE : i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(File start, e direction) {
        this(start, direction, null, null, null, 0, 32, null);
        t.f(start, "start");
        t.f(direction, "direction");
    }
}
