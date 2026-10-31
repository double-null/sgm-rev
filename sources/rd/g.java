package rd;

/* JADX INFO: compiled from: HexFormat.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f25026d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final g f25027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final g f25028f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f25029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f25030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f25031c;

    /* JADX INFO: compiled from: HexFormat.kt */
    public static final class a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final C0409a f25032j = new C0409a(null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final a f25033k = new a(Integer.MAX_VALUE, Integer.MAX_VALUE, "  ", "", "", "");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f25034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f25035b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f25036c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f25037d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f25038e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f25039f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f25040g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f25041h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f25042i;

        /* JADX INFO: renamed from: rd.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: HexFormat.kt */
        public static final class C0409a {
            private C0409a() {
            }

            public /* synthetic */ C0409a(kotlin.jvm.internal.k kVar) {
                this();
            }

            public final a a() {
                return a.f25033k;
            }
        }

        /* JADX WARN: Code duplicated, block: B:20:0x004f  */
        public a(int i10, int i11, String groupSeparator, String byteSeparator, String bytePrefix, String byteSuffix) {
            boolean z10;
            kotlin.jvm.internal.t.f(groupSeparator, "groupSeparator");
            kotlin.jvm.internal.t.f(byteSeparator, "byteSeparator");
            kotlin.jvm.internal.t.f(bytePrefix, "bytePrefix");
            kotlin.jvm.internal.t.f(byteSuffix, "byteSuffix");
            this.f25034a = i10;
            this.f25035b = i11;
            this.f25036c = groupSeparator;
            this.f25037d = byteSeparator;
            this.f25038e = bytePrefix;
            this.f25039f = byteSuffix;
            this.f25040g = i10 == Integer.MAX_VALUE && i11 == Integer.MAX_VALUE;
            if (bytePrefix.length() == 0) {
                if (!(byteSuffix.length() == 0) || byteSeparator.length() > 1) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } else {
                z10 = false;
            }
            this.f25041h = z10;
            this.f25042i = h.b(groupSeparator) || h.b(byteSeparator) || h.b(bytePrefix) || h.b(byteSuffix);
        }

        public final StringBuilder b(StringBuilder sb2, String indent) {
            kotlin.jvm.internal.t.f(sb2, "sb");
            kotlin.jvm.internal.t.f(indent, "indent");
            sb2.append(indent);
            sb2.append("bytesPerLine = ");
            sb2.append(this.f25034a);
            sb2.append(",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("bytesPerGroup = ");
            sb2.append(this.f25035b);
            sb2.append(",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("groupSeparator = \"");
            sb2.append(this.f25036c);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("byteSeparator = \"");
            sb2.append(this.f25037d);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("bytePrefix = \"");
            sb2.append(this.f25038e);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("byteSuffix = \"");
            sb2.append(this.f25039f);
            sb2.append("\"");
            return sb2;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("BytesHexFormat(");
            sb2.append('\n');
            b(sb2, "    ").append('\n');
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: HexFormat.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final g a() {
            return g.f25027e;
        }
    }

    /* JADX INFO: compiled from: HexFormat.kt */
    public static final class c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f25043h = new a(null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final c f25044i = new c("", "", false, 1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f25045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f25046b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f25047c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f25048d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f25049e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f25050f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f25051g;

        /* JADX INFO: compiled from: HexFormat.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
                this();
            }

            public final c a() {
                return c.f25044i;
            }
        }

        /* JADX WARN: Code duplicated, block: B:13:0x002f  */
        public c(String prefix, String suffix, boolean z10, int i10) {
            boolean z11;
            kotlin.jvm.internal.t.f(prefix, "prefix");
            kotlin.jvm.internal.t.f(suffix, "suffix");
            this.f25045a = prefix;
            this.f25046b = suffix;
            this.f25047c = z10;
            this.f25048d = i10;
            if (prefix.length() == 0) {
                if (suffix.length() == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            this.f25049e = z11;
            this.f25050f = z11 && i10 == 1;
            this.f25051g = h.b(prefix) || h.b(suffix);
        }

        public final StringBuilder b(StringBuilder sb2, String indent) {
            kotlin.jvm.internal.t.f(sb2, "sb");
            kotlin.jvm.internal.t.f(indent, "indent");
            sb2.append(indent);
            sb2.append("prefix = \"");
            sb2.append(this.f25045a);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("suffix = \"");
            sb2.append(this.f25046b);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("removeLeadingZeros = ");
            sb2.append(this.f25047c);
            sb2.append(',');
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("minLength = ");
            sb2.append(this.f25048d);
            return sb2;
        }

        public final boolean c() {
            return this.f25051g;
        }

        public final String d() {
            return this.f25045a;
        }

        public final String e() {
            return this.f25046b;
        }

        public final boolean f() {
            return this.f25049e;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NumberHexFormat(");
            sb2.append('\n');
            b(sb2, "    ").append('\n');
            sb2.append(")");
            return sb2.toString();
        }
    }

    static {
        a.C0409a c0409a = a.f25032j;
        a aVarA = c0409a.a();
        c.a aVar = c.f25043h;
        f25027e = new g(false, aVarA, aVar.a());
        f25028f = new g(true, c0409a.a(), aVar.a());
    }

    public g(boolean z10, a bytes, c number) {
        kotlin.jvm.internal.t.f(bytes, "bytes");
        kotlin.jvm.internal.t.f(number, "number");
        this.f25029a = z10;
        this.f25030b = bytes;
        this.f25031c = number;
    }

    public final c b() {
        return this.f25031c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HexFormat(");
        sb2.append('\n');
        sb2.append("    upperCase = ");
        sb2.append(this.f25029a);
        sb2.append(",");
        sb2.append('\n');
        sb2.append("    bytes = BytesHexFormat(");
        sb2.append('\n');
        this.f25030b.b(sb2, "        ").append('\n');
        sb2.append("    ),");
        sb2.append('\n');
        sb2.append("    number = NumberHexFormat(");
        sb2.append('\n');
        this.f25031c.b(sb2, "        ").append('\n');
        sb2.append("    )");
        sb2.append('\n');
        sb2.append(")");
        return sb2.toString();
    }
}
