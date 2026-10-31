package io.bidmachine.analytics;

import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: loaded from: classes4.dex */
public final class Filter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Expression f16747a;

    public interface Expression {

        public static final class AllOf implements Expression {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final List f16748a;

            public AllOf(List<? extends Expression> list) {
                this.f16748a = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ AllOf copy$default(AllOf allOf, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    list = allOf.f16748a;
                }
                return allOf.copy(list);
            }

            public final List<Expression> component1() {
                return this.f16748a;
            }

            public final AllOf copy(List<? extends Expression> list) {
                return new AllOf(list);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AllOf) && t.a(this.f16748a, ((AllOf) obj).f16748a);
            }

            public final List<Expression> getExpressions() {
                return this.f16748a;
            }

            public int hashCode() {
                return this.f16748a.hashCode();
            }

            public String toString() {
                return "AllOf(expressions=" + this.f16748a + ')';
            }
        }

        public static final class AnyOf implements Expression {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final List f16749a;

            public AnyOf(List<? extends Expression> list) {
                this.f16749a = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ AnyOf copy$default(AnyOf anyOf, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    list = anyOf.f16749a;
                }
                return anyOf.copy(list);
            }

            public final List<Expression> component1() {
                return this.f16749a;
            }

            public final AnyOf copy(List<? extends Expression> list) {
                return new AnyOf(list);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AnyOf) && t.a(this.f16749a, ((AnyOf) obj).f16749a);
            }

            public final List<Expression> getExpressions() {
                return this.f16749a;
            }

            public int hashCode() {
                return this.f16749a.hashCode();
            }

            public String toString() {
                return "AnyOf(expressions=" + this.f16749a + ')';
            }
        }

        public static final class Rule implements Expression {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final List f16750a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Operator f16751b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final List f16752c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final MissingBehavior f16753d;

            public Rule(List<String> list, Operator operator, List<? extends Value> list2, MissingBehavior missingBehavior) {
                this.f16750a = list;
                this.f16751b = operator;
                this.f16752c = list2;
                this.f16753d = missingBehavior;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Rule copy$default(Rule rule, List list, Operator operator, List list2, MissingBehavior missingBehavior, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    list = rule.f16750a;
                }
                if ((i10 & 2) != 0) {
                    operator = rule.f16751b;
                }
                if ((i10 & 4) != 0) {
                    list2 = rule.f16752c;
                }
                if ((i10 & 8) != 0) {
                    missingBehavior = rule.f16753d;
                }
                return rule.copy(list, operator, list2, missingBehavior);
            }

            public final List<String> component1() {
                return this.f16750a;
            }

            public final Operator component2() {
                return this.f16751b;
            }

            public final List<Value> component3() {
                return this.f16752c;
            }

            public final MissingBehavior component4() {
                return this.f16753d;
            }

            public final Rule copy(List<String> list, Operator operator, List<? extends Value> list2, MissingBehavior missingBehavior) {
                return new Rule(list, operator, list2, missingBehavior);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Rule)) {
                    return false;
                }
                Rule rule = (Rule) obj;
                return t.a(this.f16750a, rule.f16750a) && this.f16751b == rule.f16751b && t.a(this.f16752c, rule.f16752c) && this.f16753d == rule.f16753d;
            }

            public final MissingBehavior getMissingBehavior() {
                return this.f16753d;
            }

            public final Operator getOp() {
                return this.f16751b;
            }

            public final List<String> getPath() {
                return this.f16750a;
            }

            public final List<Value> getValues() {
                return this.f16752c;
            }

            public int hashCode() {
                return (((((this.f16750a.hashCode() * 31) + this.f16751b.hashCode()) * 31) + this.f16752c.hashCode()) * 31) + this.f16753d.hashCode();
            }

            public String toString() {
                return "Rule(path=" + this.f16750a + ", op=" + this.f16751b + ", values=" + this.f16752c + ", missingBehavior=" + this.f16753d + ')';
            }
        }
    }

    public enum MissingBehavior {
        FAIL(false),
        PASS(true);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f16755a;

        MissingBehavior(boolean z10) {
            this.f16755a = z10;
        }

        public final boolean getValue() {
            return this.f16755a;
        }
    }

    public enum Operator {
        IN,
        NOT_IN,
        EQ,
        NEQ,
        GT,
        GTE,
        LT,
        LTE,
        EXISTS,
        NOT_EXISTS
    }

    public Filter(Expression expression) {
        this.f16747a = expression;
    }

    public static /* synthetic */ Filter copy$default(Filter filter, Expression expression, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            expression = filter.f16747a;
        }
        return filter.copy(expression);
    }

    public final Expression component1() {
        return this.f16747a;
    }

    public final Filter copy(Expression expression) {
        return new Filter(expression);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Filter) && t.a(this.f16747a, ((Filter) obj).f16747a);
    }

    public final Expression getExpression() {
        return this.f16747a;
    }

    public int hashCode() {
        return this.f16747a.hashCode();
    }

    public String toString() {
        return "Filter(expression=" + this.f16747a + ')';
    }

    public interface Value {

        public interface NumberValue extends Value, Comparable<NumberValue> {
            double toDouble();

            @Override // java.lang.Comparable
            default int compareTo(NumberValue numberValue) {
                return Double.compare(toDouble(), numberValue.toDouble());
            }
        }

        public static final class BoolValue implements Value {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final boolean f16757a;

            private /* synthetic */ BoolValue(boolean z10) {
                this.f16757a = z10;
            }

            /* JADX INFO: renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ BoolValue m355boximpl(boolean z10) {
                return new BoolValue(z10);
            }

            /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
            public static boolean m357equalsimpl(boolean z10, Object obj) {
                return (obj instanceof BoolValue) && z10 == ((BoolValue) obj).m361unboximpl();
            }

            /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m358equalsimpl0(boolean z10, boolean z11) {
                return z10 == z11;
            }

            /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
            public static int m359hashCodeimpl(boolean z10) {
                if (z10) {
                    return 1;
                }
                return z10 ? 1 : 0;
            }

            /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
            public static String m360toStringimpl(boolean z10) {
                return "BoolValue(value=" + z10 + ')';
            }

            public boolean equals(Object obj) {
                return m357equalsimpl(this.f16757a, obj);
            }

            public final boolean getValue() {
                return this.f16757a;
            }

            public int hashCode() {
                return m359hashCodeimpl(this.f16757a);
            }

            public String toString() {
                return m360toStringimpl(this.f16757a);
            }

            /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ boolean m361unboximpl() {
                return this.f16757a;
            }

            /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
            public static boolean m356constructorimpl(boolean z10) {
                return z10;
            }
        }

        public static final class DoubleValue implements NumberValue {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final double f16758a;

            private /* synthetic */ DoubleValue(double d10) {
                this.f16758a = d10;
            }

            /* JADX INFO: renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ DoubleValue m362boximpl(double d10) {
                return new DoubleValue(d10);
            }

            /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
            public static boolean m364equalsimpl(double d10, Object obj) {
                return (obj instanceof DoubleValue) && Double.compare(d10, ((DoubleValue) obj).m369unboximpl()) == 0;
            }

            /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m365equalsimpl0(double d10, double d11) {
                return Double.compare(d10, d11) == 0;
            }

            /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
            public static int m366hashCodeimpl(double d10) {
                return Double.hashCode(d10);
            }

            /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
            public static String m368toStringimpl(double d10) {
                return "DoubleValue(value=" + d10 + ')';
            }

            public boolean equals(Object obj) {
                return m364equalsimpl(this.f16758a, obj);
            }

            public final double getValue() {
                return this.f16758a;
            }

            public int hashCode() {
                return m366hashCodeimpl(this.f16758a);
            }

            @Override // io.bidmachine.analytics.Filter.Value.NumberValue
            public double toDouble() {
                return m367toDoubleimpl(this.f16758a);
            }

            public String toString() {
                return m368toStringimpl(this.f16758a);
            }

            /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ double m369unboximpl() {
                return this.f16758a;
            }

            /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
            public static double m363constructorimpl(double d10) {
                return d10;
            }

            /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
            public static double m367toDoubleimpl(double d10) {
                return d10;
            }
        }

        public static final class LongValue implements NumberValue {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f16759a;

            private /* synthetic */ LongValue(long j10) {
                this.f16759a = j10;
            }

            /* JADX INFO: renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ LongValue m370boximpl(long j10) {
                return new LongValue(j10);
            }

            /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
            public static boolean m372equalsimpl(long j10, Object obj) {
                return (obj instanceof LongValue) && j10 == ((LongValue) obj).m377unboximpl();
            }

            /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m373equalsimpl0(long j10, long j11) {
                return j10 == j11;
            }

            /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
            public static int m374hashCodeimpl(long j10) {
                return Long.hashCode(j10);
            }

            /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
            public static double m375toDoubleimpl(long j10) {
                return j10;
            }

            /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
            public static String m376toStringimpl(long j10) {
                return "LongValue(value=" + j10 + ')';
            }

            public boolean equals(Object obj) {
                return m372equalsimpl(this.f16759a, obj);
            }

            public final long getValue() {
                return this.f16759a;
            }

            public int hashCode() {
                return m374hashCodeimpl(this.f16759a);
            }

            @Override // io.bidmachine.analytics.Filter.Value.NumberValue
            public double toDouble() {
                return m375toDoubleimpl(this.f16759a);
            }

            public String toString() {
                return m376toStringimpl(this.f16759a);
            }

            /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ long m377unboximpl() {
                return this.f16759a;
            }

            /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
            public static long m371constructorimpl(long j10) {
                return j10;
            }
        }

        public static final class StringValue implements Value {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f16760a;

            private /* synthetic */ StringValue(String str) {
                this.f16760a = str;
            }

            /* JADX INFO: renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ StringValue m378boximpl(String str) {
                return new StringValue(str);
            }

            /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
            public static boolean m380equalsimpl(String str, Object obj) {
                return (obj instanceof StringValue) && t.a(str, ((StringValue) obj).m384unboximpl());
            }

            /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m381equalsimpl0(String str, String str2) {
                return t.a(str, str2);
            }

            /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
            public static int m382hashCodeimpl(String str) {
                return str.hashCode();
            }

            /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
            public static String m383toStringimpl(String str) {
                return "StringValue(value=" + str + ')';
            }

            public boolean equals(Object obj) {
                return m380equalsimpl(this.f16760a, obj);
            }

            public final String getValue() {
                return this.f16760a;
            }

            public int hashCode() {
                return m382hashCodeimpl(this.f16760a);
            }

            public String toString() {
                return m383toStringimpl(this.f16760a);
            }

            /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ String m384unboximpl() {
                return this.f16760a;
            }

            /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
            public static String m379constructorimpl(String str) {
                return str;
            }
        }
    }
}
