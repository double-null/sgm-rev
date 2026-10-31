package io.bidmachine.iab.mraid;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f17610a = new b0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final bc.a f17611b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f17612c = 6;

    static final class a extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f17613d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object[] f17614e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Object[] objArr) {
            super(0);
            this.f17613d = str;
            this.f17614e = objArr;
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.l0.f21527a;
            String str = this.f17613d;
            if (str == null) {
                str = "";
            }
            Object[] objArr = this.f17614e;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            String str2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            kotlin.jvm.internal.t.e(str2, "format(format, *args)");
            return str2;
        }
    }

    static final class b extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f17615d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object[] f17616e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Object[] objArr) {
            super(0);
            this.f17615d = str;
            this.f17616e = objArr;
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.l0.f21527a;
            String str = this.f17615d;
            if (str == null) {
                str = "";
            }
            Object[] objArr = this.f17616e;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            String str2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            kotlin.jvm.internal.t.e(str2, "format(format, *args)");
            return str2;
        }
    }

    static final class c extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f17617d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object[] f17618e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, Object[] objArr) {
            super(0);
            this.f17617d = str;
            this.f17618e = objArr;
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.l0.f21527a;
            String str = this.f17617d;
            if (str == null) {
                str = "";
            }
            Object[] objArr = this.f17618e;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            String str2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            kotlin.jvm.internal.t.e(str2, "format(format, *args)");
            return str2;
        }
    }

    public static final class d extends bc.a {
        d() {
            super("MraidLog");
        }

        @Override // bc.a
        public boolean k(int i10) {
            return b0.f17612c <= i10;
        }
    }

    private b0() {
    }

    public static final void c(Object obj, id.a<String> messageBuilder) {
        kotlin.jvm.internal.t.f(messageBuilder, "messageBuilder");
        f17611b.b(obj, messageBuilder);
    }

    public static final void d(String subTag, String str, Object... args) {
        kotlin.jvm.internal.t.f(subTag, "subTag");
        kotlin.jvm.internal.t.f(args, "args");
        c(subTag, new a(str, args));
    }

    public static final void e(Object obj, id.a<String> messageBuilder) {
        kotlin.jvm.internal.t.f(messageBuilder, "messageBuilder");
        f17611b.d(obj, messageBuilder);
    }

    public static final void f(Object obj, Throwable throwable) {
        kotlin.jvm.internal.t.f(throwable, "throwable");
        f17611b.j(obj, throwable);
    }

    public static final void g(String subTag, String str, Object... args) {
        kotlin.jvm.internal.t.f(subTag, "subTag");
        kotlin.jvm.internal.t.f(args, "args");
        e(subTag, new b(str, args));
    }

    public static final void h(boolean z10) {
        f17612c = z10 ? 3 : Integer.MAX_VALUE;
    }

    public static final void i(Object obj, id.a<String> messageBuilder) {
        kotlin.jvm.internal.t.f(messageBuilder, "messageBuilder");
        f17611b.g(obj, messageBuilder);
    }

    public static final void j(String subTag, String str, Object... args) {
        kotlin.jvm.internal.t.f(subTag, "subTag");
        kotlin.jvm.internal.t.f(args, "args");
        i(subTag, new c(str, args));
    }

    public final boolean a() {
        return f17611b.k(3);
    }

    public final boolean b() {
        return f17611b.k(6);
    }
}
