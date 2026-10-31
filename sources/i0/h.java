package i0;

import androidx.datastore.core.CorruptionException;
import e0.g0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.b0;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: PreferencesFileSerializer.jvmAndroid.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h implements g0<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f15882a = new h();

    /* JADX INFO: compiled from: PreferencesFileSerializer.jvmAndroid.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[h0.h.b.values().length];
            try {
                iArr[h0.h.b.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h0.h.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h0.h.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h0.h.b.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h0.h.b.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[h0.h.b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[h0.h.b.STRING_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[h0.h.b.BYTES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[h0.h.b.VALUE_NOT_SET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private h() {
    }

    private final void a(String str, h0.h hVar, c cVar) throws CorruptionException {
        h0.h.b bVarF0 = hVar.f0();
        switch (bVarF0 == null ? -1 : a.$EnumSwitchMapping$0[bVarF0.ordinal()]) {
            case -1:
                throw new CorruptionException("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                cVar.i(i.a(str), Boolean.valueOf(hVar.W()));
                return;
            case 2:
                cVar.i(i.d(str), Float.valueOf(hVar.a0()));
                return;
            case 3:
                cVar.i(i.c(str), Double.valueOf(hVar.Z()));
                return;
            case 4:
                cVar.i(i.e(str), Integer.valueOf(hVar.b0()));
                return;
            case 5:
                cVar.i(i.f(str), Long.valueOf(hVar.c0()));
                return;
            case 6:
                f.a<String> aVarG = i.g(str);
                String strD0 = hVar.d0();
                t.e(strD0, "value.string");
                cVar.i(aVarG, strD0);
                return;
            case 7:
                f.a<Set<String>> aVarH = i.h(str);
                List<String> listS = hVar.e0().S();
                t.e(listS, "value.stringSet.stringsList");
                cVar.i(aVarH, b0.t0(listS));
                return;
            case 8:
                f.a<byte[]> aVarB = i.b(str);
                byte[] bArrD = hVar.X().D();
                t.e(bArrD, "value.bytes.toByteArray()");
                cVar.i(aVarB, bArrD);
                return;
            case 9:
                throw new CorruptionException("Value not set.", null, 2, null);
        }
    }

    private final h0.h c(Object obj) {
        if (obj instanceof Boolean) {
            h0.h hVarBuild = h0.h.g0().u(((Boolean) obj).booleanValue()).build();
            t.e(hVarBuild, "newBuilder().setBoolean(value).build()");
            return hVarBuild;
        }
        if (obj instanceof Float) {
            h0.h hVarBuild2 = h0.h.g0().x(((Number) obj).floatValue()).build();
            t.e(hVarBuild2, "newBuilder().setFloat(value).build()");
            return hVarBuild2;
        }
        if (obj instanceof Double) {
            h0.h hVarBuild3 = h0.h.g0().w(((Number) obj).doubleValue()).build();
            t.e(hVarBuild3, "newBuilder().setDouble(value).build()");
            return hVarBuild3;
        }
        if (obj instanceof Integer) {
            h0.h hVarBuild4 = h0.h.g0().y(((Number) obj).intValue()).build();
            t.e(hVarBuild4, "newBuilder().setInteger(value).build()");
            return hVarBuild4;
        }
        if (obj instanceof Long) {
            h0.h hVarBuild5 = h0.h.g0().z(((Number) obj).longValue()).build();
            t.e(hVarBuild5, "newBuilder().setLong(value).build()");
            return hVarBuild5;
        }
        if (obj instanceof String) {
            h0.h hVarBuild6 = h0.h.g0().A((String) obj).build();
            t.e(hVarBuild6, "newBuilder().setString(value).build()");
            return hVarBuild6;
        }
        if (obj instanceof Set) {
            h0.h.a aVarG0 = h0.h.g0();
            h0.g.a aVarT = h0.g.T();
            t.d(obj, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            h0.h hVarBuild7 = aVarG0.B(aVarT.u((Set) obj)).build();
            t.e(hVarBuild7, "newBuilder()\n           …                 .build()");
            return hVarBuild7;
        }
        if (obj instanceof byte[]) {
            h0.h hVarBuild8 = h0.h.g0().v(androidx.datastore.preferences.protobuf.g.h((byte[]) obj)).build();
            t.e(hVarBuild8, "newBuilder().setBytes(By….copyFrom(value)).build()");
            return hVarBuild8;
        }
        throw new IllegalStateException("PreferencesSerializer does not support type: " + obj.getClass().getName());
    }

    @Override // e0.g0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f getDefaultValue() {
        return g.a();
    }

    @Override // e0.g0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object writeTo(f fVar, OutputStream outputStream, zc.f<? super wc.g0> fVar2) throws IOException {
        Map<f.a<?>, Object> mapA = fVar.a();
        h0.f.a aVarT = h0.f.T();
        for (Map.Entry<f.a<?>, Object> entry : mapA.entrySet()) {
            aVarT.u(entry.getKey().a(), c(entry.getValue()));
        }
        aVarT.build().j(outputStream);
        return wc.g0.f27756a;
    }

    @Override // e0.g0
    public Object readFrom(InputStream inputStream, zc.f<? super f> fVar) throws IOException {
        h0.f fVarA = h0.d.f15565a.a(inputStream);
        c cVarB = g.b(new f.b[0]);
        Map<String, h0.h> mapQ = fVarA.Q();
        t.e(mapQ, "preferencesProto.preferencesMap");
        for (Map.Entry<String, h0.h> entry : mapQ.entrySet()) {
            String name = entry.getKey();
            h0.h value = entry.getValue();
            h hVar = f15882a;
            t.e(name, "name");
            t.e(value, "value");
            hVar.a(name, value, cVarB);
        }
        return cVarB.d();
    }
}
