package com.explorestack.protobuf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: DescriptorMessageInfoFactory.java */
/* JADX INFO: loaded from: classes.dex */
final class q implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final q f10755a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<String> f10756b = new HashSet(Arrays.asList("cached_size", "serialized_size", "class"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static d f10757c = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f10758d = 0;

    /* JADX INFO: compiled from: DescriptorMessageInfoFactory.java */
    static class a implements l0.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Descriptors.FieldDescriptor f10759a;

        a(Descriptors.FieldDescriptor fieldDescriptor) {
            this.f10759a = fieldDescriptor;
        }

        @Override // com.explorestack.protobuf.l0.e
        public boolean isInRange(int i10) {
            return this.f10759a.m163getEnumType().findValueByNumber(i10) != null;
        }
    }

    /* JADX INFO: compiled from: DescriptorMessageInfoFactory.java */
    static class b implements l0.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Descriptors.FieldDescriptor f10760a;

        b(Descriptors.FieldDescriptor fieldDescriptor) {
            this.f10760a = fieldDescriptor;
        }

        @Override // com.explorestack.protobuf.l0.e
        public boolean isInRange(int i10) {
            return this.f10760a.m163getEnumType().findValueByNumber(i10) != null;
        }
    }

    /* JADX INFO: compiled from: DescriptorMessageInfoFactory.java */
    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f10762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f10763c;

        static {
            int[] iArr = new int[Descriptors.FieldDescriptor.Type.values().length];
            f10763c = iArr;
            try {
                iArr[Descriptors.FieldDescriptor.Type.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10763c[Descriptors.FieldDescriptor.Type.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10763c[Descriptors.FieldDescriptor.Type.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10763c[Descriptors.FieldDescriptor.Type.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10763c[Descriptors.FieldDescriptor.Type.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10763c[Descriptors.FieldDescriptor.Type.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10763c[Descriptors.FieldDescriptor.Type.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10763c[Descriptors.FieldDescriptor.Type.GROUP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10763c[Descriptors.FieldDescriptor.Type.INT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10763c[Descriptors.FieldDescriptor.Type.INT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10763c[Descriptors.FieldDescriptor.Type.MESSAGE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10763c[Descriptors.FieldDescriptor.Type.SFIXED32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f10763c[Descriptors.FieldDescriptor.Type.SFIXED64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f10763c[Descriptors.FieldDescriptor.Type.SINT32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f10763c[Descriptors.FieldDescriptor.Type.SINT64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f10763c[Descriptors.FieldDescriptor.Type.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f10763c[Descriptors.FieldDescriptor.Type.UINT32.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f10763c[Descriptors.FieldDescriptor.Type.UINT64.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[n0.values().length];
            f10762b = iArr2;
            try {
                iArr2[n0.f10691i.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f10762b[n0.f10693k.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f10762b[n0.f10690h.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f10762b[n0.f10689g.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f10762b[n0.f10694l.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f10762b[n0.f10687e.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f10762b[n0.f10688f.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f10762b[n0.f10692j.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f10762b[n0.f10695m.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
            int[] iArr3 = new int[Descriptors.FileDescriptor.Syntax.values().length];
            f10761a = iArr3;
            try {
                iArr3[Descriptors.FileDescriptor.Syntax.PROTO2.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f10761a[Descriptors.FileDescriptor.Syntax.PROTO3.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
        }
    }

    private q() {
    }

    private static java.lang.reflect.Field c(Class<?> cls, int i10) {
        return k(cls, "bitField" + i10 + "_");
    }

    private static d0 d(Class<?> cls, Descriptors.FieldDescriptor fieldDescriptor, e eVar, boolean z10, l0.e eVar2) {
        q1 q1VarA = eVar.a(cls, fieldDescriptor.getContainingOneof());
        f0 f0VarO = o(fieldDescriptor);
        return d0.g(fieldDescriptor.getNumber(), f0VarO, q1VarA, p(cls, fieldDescriptor, f0VarO), z10, eVar2);
    }

    private static java.lang.reflect.Field e(Class<?> cls, Descriptors.FieldDescriptor fieldDescriptor) {
        return k(cls, l(fieldDescriptor));
    }

    private static e1 f(Class<?> cls, Descriptors.Descriptor descriptor) {
        int i10 = c.f10761a[descriptor.getFile().getSyntax().ordinal()];
        if (i10 == 1) {
            return g(cls, descriptor);
        }
        if (i10 == 2) {
            return h(cls, descriptor);
        }
        throw new IllegalArgumentException("Unsupported syntax: " + descriptor.getFile().getSyntax());
    }

    private static k2 g(Class<?> cls, Descriptors.Descriptor descriptor) {
        List<Descriptors.FieldDescriptor> fields = descriptor.getFields();
        k2.a aVarC = k2.c(fields.size());
        aVarC.c(m(cls));
        aVarC.f(u1.PROTO2);
        aVarC.e(descriptor.getOptions().C());
        a aVar = null;
        e eVar = new e(aVar);
        java.lang.reflect.Field fieldC = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1;
        while (i10 < fields.size()) {
            Descriptors.FieldDescriptor fieldDescriptor = fields.get(i10);
            boolean zC0 = fieldDescriptor.getFile().getOptions().C0();
            Descriptors.FieldDescriptor.JavaType javaType = fieldDescriptor.getJavaType();
            Descriptors.FieldDescriptor.JavaType javaType2 = Descriptors.FieldDescriptor.JavaType.ENUM;
            l0.e aVar2 = javaType == javaType2 ? new a(fieldDescriptor) : aVar;
            if (fieldDescriptor.getContainingOneof() != null) {
                aVarC.d(d(cls, fieldDescriptor, eVar, zC0, aVar2));
            } else {
                java.lang.reflect.Field fieldJ = j(cls, fieldDescriptor);
                int number = fieldDescriptor.getNumber();
                f0 f0VarO = o(fieldDescriptor);
                if (fieldDescriptor.isMapField()) {
                    Descriptors.FieldDescriptor fieldDescriptorFindFieldByNumber = fieldDescriptor.getMessageType().findFieldByNumber(2);
                    if (fieldDescriptorFindFieldByNumber.getJavaType() == javaType2) {
                        aVar2 = new b(fieldDescriptorFindFieldByNumber);
                    }
                    aVarC.d(d0.e(fieldJ, number, d2.C(cls, fieldDescriptor.getName()), aVar2));
                } else if (!fieldDescriptor.isRepeated()) {
                    if (fieldC == null) {
                        fieldC = c(cls, i11);
                    }
                    if (fieldDescriptor.isRequired()) {
                        aVarC.d(d0.k(fieldJ, number, f0VarO, fieldC, i12, zC0, aVar2));
                    } else {
                        aVarC.d(d0.j(fieldJ, number, f0VarO, fieldC, i12, zC0, aVar2));
                    }
                } else if (aVar2 != null) {
                    if (fieldDescriptor.isPacked()) {
                        aVarC.d(d0.i(fieldJ, number, f0VarO, aVar2, e(cls, fieldDescriptor)));
                    } else {
                        aVarC.d(d0.d(fieldJ, number, f0VarO, aVar2));
                    }
                } else if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                    aVarC.d(d0.l(fieldJ, number, f0VarO, r(cls, fieldDescriptor)));
                } else if (fieldDescriptor.isPacked()) {
                    aVarC.d(d0.h(fieldJ, number, f0VarO, e(cls, fieldDescriptor)));
                } else {
                    aVarC.d(d0.c(fieldJ, number, f0VarO, zC0));
                }
                i10++;
                aVar = null;
            }
            i12 <<= 1;
            if (i12 == 0) {
                i11++;
                i12 = 1;
                fieldC = null;
            }
            i10++;
            aVar = null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < fields.size(); i13++) {
            Descriptors.FieldDescriptor fieldDescriptor2 = fields.get(i13);
            if (fieldDescriptor2.isRequired() || (fieldDescriptor2.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE && t(fieldDescriptor2.getMessageType()))) {
                arrayList.add(Integer.valueOf(fieldDescriptor2.getNumber()));
            }
        }
        int[] iArr = new int[arrayList.size()];
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            iArr[i14] = ((Integer) arrayList.get(i14)).intValue();
        }
        aVarC.b(iArr);
        return aVarC.a();
    }

    private static k2 h(Class<?> cls, Descriptors.Descriptor descriptor) {
        List<Descriptors.FieldDescriptor> fields = descriptor.getFields();
        k2.a aVarC = k2.c(fields.size());
        aVarC.c(m(cls));
        aVarC.f(u1.PROTO3);
        e eVar = new e(null);
        for (int i10 = 0; i10 < fields.size(); i10++) {
            Descriptors.FieldDescriptor fieldDescriptor = fields.get(i10);
            if (fieldDescriptor.getContainingOneof() != null) {
                aVarC.d(d(cls, fieldDescriptor, eVar, true, null));
            } else if (fieldDescriptor.isMapField()) {
                aVarC.d(d0.e(j(cls, fieldDescriptor), fieldDescriptor.getNumber(), d2.C(cls, fieldDescriptor.getName()), null));
            } else if (fieldDescriptor.isRepeated() && fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                aVarC.d(d0.l(j(cls, fieldDescriptor), fieldDescriptor.getNumber(), o(fieldDescriptor), r(cls, fieldDescriptor)));
            } else if (fieldDescriptor.isPacked()) {
                aVarC.d(d0.h(j(cls, fieldDescriptor), fieldDescriptor.getNumber(), o(fieldDescriptor), e(cls, fieldDescriptor)));
            } else {
                aVarC.d(d0.c(j(cls, fieldDescriptor), fieldDescriptor.getNumber(), o(fieldDescriptor), true));
            }
        }
        return aVarC.a();
    }

    private static Descriptors.Descriptor i(Class<?> cls) {
        return m(cls).getDescriptorForType();
    }

    private static java.lang.reflect.Field j(Class<?> cls, Descriptors.FieldDescriptor fieldDescriptor) {
        return k(cls, n(fieldDescriptor));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.reflect.Field k(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Unable to find field " + str + " in message class " + cls.getName());
        }
    }

    private static String l(Descriptors.FieldDescriptor fieldDescriptor) {
        return u(fieldDescriptor.getName()) + "MemoizedSerializedSize";
    }

    private static Message m(Class<?> cls) {
        try {
            return (Message) cls.getDeclaredMethod("getDefaultInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e10) {
            throw new IllegalArgumentException("Unable to get default instance for message class " + cls.getName(), e10);
        }
    }

    static String n(Descriptors.FieldDescriptor fieldDescriptor) {
        String name = fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.GROUP ? fieldDescriptor.getMessageType().getName() : fieldDescriptor.getName();
        return u(name) + (f10756b.contains(name) ? "__" : "_");
    }

    private static f0 o(Descriptors.FieldDescriptor fieldDescriptor) {
        switch (c.f10763c[fieldDescriptor.getType().ordinal()]) {
            case 1:
                if (fieldDescriptor.isRepeated()) {
                    return fieldDescriptor.isPacked() ? f0.V : f0.E;
                }
                return f0.f10401m;
            case 2:
                return fieldDescriptor.isRepeated() ? f0.H : f0.f10404p;
            case 3:
                if (fieldDescriptor.isRepeated()) {
                    return fieldDescriptor.isPacked() ? f0.O : f0.f10412x;
                }
                return f0.f10392f;
            case 4:
                if (fieldDescriptor.isRepeated()) {
                    return fieldDescriptor.isPacked() ? f0.X : f0.J;
                }
                return f0.f10406r;
            case 5:
                if (fieldDescriptor.isRepeated()) {
                    return fieldDescriptor.isPacked() ? f0.U : f0.D;
                }
                return f0.f10400l;
            case 6:
                if (fieldDescriptor.isRepeated()) {
                    return fieldDescriptor.isPacked() ? f0.T : f0.C;
                }
                return f0.f10399k;
            case 7:
                if (fieldDescriptor.isRepeated()) {
                    return fieldDescriptor.isPacked() ? f0.P : f0.f10413y;
                }
                return f0.f10394g;
            case 8:
                return fieldDescriptor.isRepeated() ? f0.f10389c0 : f0.f10411w;
            case 9:
                if (fieldDescriptor.isRepeated()) {
                    return fieldDescriptor.isPacked() ? f0.S : f0.B;
                }
                return f0.f10398j;
            case 10:
                if (fieldDescriptor.isRepeated()) {
                    return fieldDescriptor.isPacked() ? f0.Q : f0.f10414z;
                }
                return f0.f10396h;
            case 11:
                if (fieldDescriptor.isMapField()) {
                    return f0.f10390d0;
                }
                return fieldDescriptor.isRepeated() ? f0.G : f0.f10403o;
            case 12:
                if (fieldDescriptor.isRepeated()) {
                    return fieldDescriptor.isPacked() ? f0.Y : f0.K;
                }
                return f0.f10407s;
            case 13:
                if (fieldDescriptor.isRepeated()) {
                    return fieldDescriptor.isPacked() ? f0.Z : f0.L;
                }
                return f0.f10408t;
            case 14:
                if (fieldDescriptor.isRepeated()) {
                    return fieldDescriptor.isPacked() ? f0.f10387a0 : f0.M;
                }
                return f0.f10409u;
            case 15:
                if (fieldDescriptor.isRepeated()) {
                    return fieldDescriptor.isPacked() ? f0.f10388b0 : f0.N;
                }
                return f0.f10410v;
            case 16:
                return fieldDescriptor.isRepeated() ? f0.F : f0.f10402n;
            case 17:
                if (fieldDescriptor.isRepeated()) {
                    return fieldDescriptor.isPacked() ? f0.W : f0.I;
                }
                return f0.f10405q;
            case 18:
                if (fieldDescriptor.isRepeated()) {
                    return fieldDescriptor.isPacked() ? f0.R : f0.A;
                }
                return f0.f10397i;
            default:
                throw new IllegalArgumentException("Unsupported field type: " + fieldDescriptor.getType());
        }
    }

    private static Class<?> p(Class<?> cls, Descriptors.FieldDescriptor fieldDescriptor, f0 f0Var) {
        switch (c.f10762b[f0Var.b().ordinal()]) {
            case 1:
                return Boolean.class;
            case 2:
                return ByteString.class;
            case 3:
                return Double.class;
            case 4:
                return Float.class;
            case 5:
            case 6:
                return Integer.class;
            case 7:
                return Long.class;
            case 8:
                return String.class;
            case 9:
                return q(cls, fieldDescriptor);
            default:
                throw new IllegalArgumentException("Invalid type for oneof: " + f0Var);
        }
    }

    private static Class<?> q(Class<?> cls, Descriptors.FieldDescriptor fieldDescriptor) {
        try {
            return cls.getDeclaredMethod(s(fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.GROUP ? fieldDescriptor.getMessageType().getName() : fieldDescriptor.getName()), new Class[0]).getReturnType();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    private static Class<?> r(Class<?> cls, Descriptors.FieldDescriptor fieldDescriptor) {
        try {
            return cls.getDeclaredMethod(s(fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.GROUP ? fieldDescriptor.getMessageType().getName() : fieldDescriptor.getName()), Integer.TYPE).getReturnType();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    private static String s(String str) {
        String strU = u(str);
        return "get" + Character.toUpperCase(strU.charAt(0)) + strU.substring(1, strU.length());
    }

    private static boolean t(Descriptors.Descriptor descriptor) {
        return f10757c.c(descriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String u(String str) {
        StringBuilder sb2 = new StringBuilder(str.length() + 1);
        boolean z10 = false;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '_') {
                z10 = true;
            } else if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
                z10 = true;
            } else if (z10) {
                sb2.append(Character.toUpperCase(cCharAt));
                z10 = false;
            } else if (i10 == 0) {
                sb2.append(Character.toLowerCase(cCharAt));
            } else {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }

    @Override // com.explorestack.protobuf.f1
    public boolean isSupported(Class<?> cls) {
        return j0.class.isAssignableFrom(cls);
    }

    @Override // com.explorestack.protobuf.f1
    public e1 messageInfoFor(Class<?> cls) {
        if (j0.class.isAssignableFrom(cls)) {
            return f(cls, i(cls));
        }
        throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
    }

    /* JADX INFO: compiled from: DescriptorMessageInfoFactory.java */
    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<Descriptors.Descriptor, Boolean> f10764a = new ConcurrentHashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f10765b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Stack<a> f10766c = new Stack<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map<Descriptors.Descriptor, a> f10767d = new HashMap();

        /* JADX INFO: compiled from: DescriptorMessageInfoFactory.java */
        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final Descriptors.Descriptor f10768a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final int f10769b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f10770c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            b f10771d = null;

            a(Descriptors.Descriptor descriptor, int i10) {
                this.f10768a = descriptor;
                this.f10769b = i10;
                this.f10770c = i10;
            }
        }

        d() {
        }

        private void a(b bVar) {
            boolean z10;
            b bVar2;
            Iterator<Descriptors.Descriptor> it = bVar.f10772a.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                Descriptors.Descriptor next = it.next();
                z10 = true;
                if (next.isExtendable()) {
                    break;
                }
                for (Descriptors.FieldDescriptor fieldDescriptor : next.getFields()) {
                    if (fieldDescriptor.isRequired() || (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE && (bVar2 = this.f10767d.get(fieldDescriptor.getMessageType()).f10771d) != bVar && bVar2.f10773b)) {
                        break loop0;
                    }
                }
            }
            bVar.f10773b = z10;
            Iterator<Descriptors.Descriptor> it2 = bVar.f10772a.iterator();
            while (it2.hasNext()) {
                this.f10764a.put(it2.next(), Boolean.valueOf(bVar.f10773b));
            }
        }

        private a b(Descriptors.Descriptor descriptor) {
            a aVarPop;
            int i10 = this.f10765b;
            this.f10765b = i10 + 1;
            a aVar = new a(descriptor, i10);
            this.f10766c.push(aVar);
            this.f10767d.put(descriptor, aVar);
            for (Descriptors.FieldDescriptor fieldDescriptor : descriptor.getFields()) {
                if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                    a aVar2 = this.f10767d.get(fieldDescriptor.getMessageType());
                    if (aVar2 == null) {
                        aVar.f10770c = Math.min(aVar.f10770c, b(fieldDescriptor.getMessageType()).f10770c);
                    } else if (aVar2.f10771d == null) {
                        aVar.f10770c = Math.min(aVar.f10770c, aVar2.f10770c);
                    }
                }
            }
            if (aVar.f10769b == aVar.f10770c) {
                b bVar = new b(null);
                do {
                    aVarPop = this.f10766c.pop();
                    aVarPop.f10771d = bVar;
                    bVar.f10772a.add(aVarPop.f10768a);
                } while (aVarPop != aVar);
                a(bVar);
            }
            return aVar;
        }

        public boolean c(Descriptors.Descriptor descriptor) {
            Boolean bool = this.f10764a.get(descriptor);
            if (bool != null) {
                return bool.booleanValue();
            }
            synchronized (this) {
                Boolean bool2 = this.f10764a.get(descriptor);
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
                return b(descriptor).f10771d.f10773b;
            }
        }

        /* JADX INFO: compiled from: DescriptorMessageInfoFactory.java */
        private static class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final List<Descriptors.Descriptor> f10772a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            boolean f10773b;

            private b() {
                this.f10772a = new ArrayList();
                this.f10773b = false;
            }

            /* synthetic */ b(a aVar) {
                this();
            }
        }
    }

    /* JADX INFO: compiled from: DescriptorMessageInfoFactory.java */
    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private q1[] f10774a;

        private e() {
            this.f10774a = new q1[2];
        }

        private static q1 b(Class<?> cls, Descriptors.OneofDescriptor oneofDescriptor) {
            String strU = q.u(oneofDescriptor.getName());
            return new q1(oneofDescriptor.getIndex(), q.k(cls, strU + "Case_"), q.k(cls, strU + "_"));
        }

        q1 a(Class<?> cls, Descriptors.OneofDescriptor oneofDescriptor) {
            int index = oneofDescriptor.getIndex();
            q1[] q1VarArr = this.f10774a;
            if (index >= q1VarArr.length) {
                this.f10774a = (q1[]) Arrays.copyOf(q1VarArr, index * 2);
            }
            q1 q1Var = this.f10774a[index];
            if (q1Var != null) {
                return q1Var;
            }
            q1 q1VarB = b(cls, oneofDescriptor);
            this.f10774a[index] = q1VarB;
            return q1VarB;
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }
}
