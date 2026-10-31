package g4;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: FieldNamingPolicy.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d implements g4.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f15322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f15323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f15324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f15325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f15326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f15327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ d[] f15328g;

    /* JADX INFO: compiled from: FieldNamingPolicy.java */
    final enum a extends d {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // g4.e
        public String b(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        f15322a = aVar;
        d dVar = new d("UPPER_CAMEL_CASE", 1) { // from class: g4.d.b
            {
                a aVar2 = null;
            }

            @Override // g4.e
            public String b(Field field) {
                return d.e(field.getName());
            }
        };
        f15323b = dVar;
        d dVar2 = new d("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: g4.d.c
            {
                a aVar2 = null;
            }

            @Override // g4.e
            public String b(Field field) {
                return d.e(d.c(field.getName(), " "));
            }
        };
        f15324c = dVar2;
        d dVar3 = new d("LOWER_CASE_WITH_UNDERSCORES", 3) { // from class: g4.d.d
            {
                a aVar2 = null;
            }

            @Override // g4.e
            public String b(Field field) {
                return d.c(field.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        };
        f15325d = dVar3;
        d dVar4 = new d("LOWER_CASE_WITH_DASHES", 4) { // from class: g4.d.e
            {
                a aVar2 = null;
            }

            @Override // g4.e
            public String b(Field field) {
                return d.c(field.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        };
        f15326e = dVar4;
        d dVar5 = new d("LOWER_CASE_WITH_DOTS", 5) { // from class: g4.d.f
            {
                a aVar2 = null;
            }

            @Override // g4.e
            public String b(Field field) {
                return d.c(field.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        };
        f15327f = dVar5;
        f15328g = new d[]{aVar, dVar, dVar2, dVar3, dVar4, dVar5};
    }

    private d(String str, int i10) {
        super(str, i10);
    }

    static String c(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt) && sb2.length() != 0) {
                sb2.append(str2);
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    static String e(String str) {
        int length = str.length() - 1;
        int i10 = 0;
        while (!Character.isLetter(str.charAt(i10)) && i10 < length) {
            i10++;
        }
        char cCharAt = str.charAt(i10);
        if (Character.isUpperCase(cCharAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(cCharAt);
        if (i10 == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i10) + upperCase + str.substring(i10 + 1);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f15328g.clone();
    }

    /* synthetic */ d(String str, int i10, a aVar) {
        this(str, i10);
    }
}
