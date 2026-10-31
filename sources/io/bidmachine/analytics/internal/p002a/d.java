package io.bidmachine.analytics.internal.p002a;

import io.bidmachine.analytics.Filter;
import io.bidmachine.analytics.internal.E.e;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.b0;
import kotlin.collections.t;
import kotlin.jvm.internal.i0;
import pd.c;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Filter.Operator.values().length];
            try {
                iArr[Filter.Operator.EQ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Filter.Operator.NEQ.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Filter.Operator.GT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Filter.Operator.GTE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Filter.Operator.LT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Filter.Operator.LTE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Filter.Operator.IN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Filter.Operator.NOT_IN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final boolean a(Filter filter, Map map) {
        return a(filter.getExpression(), map);
    }

    private final boolean a(Filter.Expression expression, Map map) {
        if (expression instanceof Filter.Expression.AllOf) {
            List<Filter.Expression> expressions = ((Filter.Expression.AllOf) expression).getExpressions();
            if (!(expressions instanceof Collection) || !expressions.isEmpty()) {
                Iterator<T> it = expressions.iterator();
                while (it.hasNext()) {
                    if (!a((Filter.Expression) it.next(), map)) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (!(expression instanceof Filter.Expression.AnyOf)) {
            if (expression instanceof Filter.Expression.Rule) {
                return a((Filter.Expression.Rule) expression, map);
            }
            throw new NoWhenBranchMatchedException();
        }
        List<Filter.Expression> expressions2 = ((Filter.Expression.AnyOf) expression).getExpressions();
        if (!(expressions2 instanceof Collection) || !expressions2.isEmpty()) {
            Iterator<T> it2 = expressions2.iterator();
            while (it2.hasNext()) {
                if (a((Filter.Expression) it2.next(), map)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean a(Filter filter) {
        return a(filter.getExpression());
    }

    private final boolean a(Filter.Expression expression) {
        if (expression instanceof Filter.Expression.AllOf) {
            List<Filter.Expression> expressions = ((Filter.Expression.AllOf) expression).getExpressions();
            if (!(expressions instanceof Collection) || !expressions.isEmpty()) {
                Iterator<T> it = expressions.iterator();
                while (it.hasNext()) {
                    if (!a((Filter.Expression) it.next())) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (expression instanceof Filter.Expression.AnyOf) {
            List<Filter.Expression> expressions2 = ((Filter.Expression.AnyOf) expression).getExpressions();
            if (!(expressions2 instanceof Collection) || !expressions2.isEmpty()) {
                Iterator<T> it2 = expressions2.iterator();
                while (it2.hasNext()) {
                    if (!a((Filter.Expression) it2.next())) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (expression instanceof Filter.Expression.Rule) {
            return a((Filter.Expression.Rule) expression);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final boolean a(Filter.Expression.Rule rule, Map map) {
        String strB;
        Map mapA = a(rule.getPath(), map);
        String str = (String) b0.Y(rule.getPath());
        boolean z10 = false;
        if (str == null || (strB = e.b(str)) == null) {
            return false;
        }
        if (rule.getOp() == Filter.Operator.EXISTS) {
            return mapA != null && mapA.containsKey(strB);
        }
        if (rule.getOp() == Filter.Operator.NOT_EXISTS) {
            if (mapA != null && mapA.containsKey(strB)) {
                z10 = true;
            }
            return !z10;
        }
        Filter.Value valueA = a(mapA != null ? mapA.get(strB) : null);
        if (valueA == null) {
            return rule.getMissingBehavior().getValue();
        }
        if (a(valueA, rule.getValues())) {
            switch (a.$EnumSwitchMapping$0[rule.getOp().ordinal()]) {
                case 1:
                    return a(valueA, (Filter.Value) b0.O(rule.getValues()));
                case 2:
                    if (a(valueA, (Filter.Value) b0.O(rule.getValues()))) {
                        return false;
                    }
                    break;
                case 3:
                    Filter.Value value = (Filter.Value) b0.O(rule.getValues());
                    if (!(valueA instanceof Filter.Value.NumberValue) || !(value instanceof Filter.Value.NumberValue)) {
                        return false;
                    }
                    if (((Filter.Value.NumberValue) valueA).compareTo((Filter.Value.NumberValue) value) <= 0) {
                        return false;
                    }
                    break;
                case 4:
                    Filter.Value value2 = (Filter.Value) b0.O(rule.getValues());
                    if (!(valueA instanceof Filter.Value.NumberValue) || !(value2 instanceof Filter.Value.NumberValue)) {
                        return false;
                    }
                    if (((Filter.Value.NumberValue) valueA).compareTo((Filter.Value.NumberValue) value2) < 0) {
                        return false;
                    }
                    break;
                case 5:
                    Filter.Value value3 = (Filter.Value) b0.O(rule.getValues());
                    if (!(valueA instanceof Filter.Value.NumberValue) || !(value3 instanceof Filter.Value.NumberValue)) {
                        return false;
                    }
                    if (((Filter.Value.NumberValue) valueA).compareTo((Filter.Value.NumberValue) value3) >= 0) {
                        return false;
                    }
                    break;
                case 6:
                    Filter.Value value4 = (Filter.Value) b0.O(rule.getValues());
                    if (!(valueA instanceof Filter.Value.NumberValue) || !(value4 instanceof Filter.Value.NumberValue)) {
                        return false;
                    }
                    if (((Filter.Value.NumberValue) valueA).compareTo((Filter.Value.NumberValue) value4) > 0) {
                        return false;
                    }
                    break;
                case 7:
                    List<Filter.Value> values = rule.getValues();
                    if ((values instanceof Collection) && values.isEmpty()) {
                        return false;
                    }
                    Iterator<T> it = values.iterator();
                    while (it.hasNext()) {
                        if (a((Filter.Value) it.next(), valueA)) {
                            break;
                        }
                    }
                    return false;
                case 8:
                    List<Filter.Value> values2 = rule.getValues();
                    if (!(values2 instanceof Collection) || !values2.isEmpty()) {
                        Iterator<T> it2 = values2.iterator();
                        while (it2.hasNext()) {
                            if (a((Filter.Value) it2.next(), valueA)) {
                                return false;
                            }
                        }
                    }
                    break;
                default:
                    return rule.getMissingBehavior().getValue();
            }
            return true;
        }
        return rule.getMissingBehavior().getValue();
    }

    private final Map a(List list, Map map) {
        Object obj;
        if (list.isEmpty()) {
            return null;
        }
        int iM = t.m(list);
        int i10 = 0;
        while (i10 < iM) {
            Map map2 = obj instanceof Map ? (Map) obj : null;
            if (map2 == null) {
                obj = map;
                obj = map;
                return null;
            }
            obj = map;
            obj = map;
            Object obj2 = map2.get(e.b((String) list.get(i10)));
            i10++;
            obj = obj2;
        }
        obj = map;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    private final Filter.Value a(Object obj) {
        if (obj instanceof String) {
            return Filter.Value.StringValue.m378boximpl(Filter.Value.StringValue.m379constructorimpl(e.d((String) obj)));
        }
        if (obj instanceof Boolean) {
            return Filter.Value.BoolValue.m355boximpl(Filter.Value.BoolValue.m356constructorimpl(((Boolean) obj).booleanValue()));
        }
        if (obj instanceof Integer) {
            return Filter.Value.LongValue.m370boximpl(Filter.Value.LongValue.m371constructorimpl(((Number) obj).intValue()));
        }
        if (obj instanceof Long) {
            return Filter.Value.LongValue.m370boximpl(Filter.Value.LongValue.m371constructorimpl(((Number) obj).longValue()));
        }
        if (obj instanceof Float) {
            return Filter.Value.DoubleValue.m362boximpl(Filter.Value.DoubleValue.m363constructorimpl(((Number) obj).floatValue()));
        }
        if (obj instanceof Double) {
            return Filter.Value.DoubleValue.m362boximpl(Filter.Value.DoubleValue.m363constructorimpl(((Number) obj).doubleValue()));
        }
        return null;
    }

    private final boolean a(Filter.Value value, List list) {
        if (list.isEmpty()) {
            return true;
        }
        c cVarB = i0.b(value.getClass());
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!kotlin.jvm.internal.t.a(i0.b(((Filter.Value) it.next()).getClass()), cVarB)) {
                if (value instanceof Filter.Value.NumberValue) {
                    if (list.isEmpty()) {
                        return true;
                    }
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (!(((Filter.Value) it2.next()) instanceof Filter.Value.NumberValue)) {
                        }
                    }
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    private final boolean a(Filter.Expression.Rule rule) {
        if (rule.getPath().isEmpty()) {
            return false;
        }
        if (rule.getOp() != Filter.Operator.EXISTS && rule.getOp() != Filter.Operator.NOT_EXISTS) {
            if (rule.getValues().isEmpty()) {
                return false;
            }
            c cVarB = i0.b(b0.O(rule.getValues()).getClass());
            List<Filter.Value> values = rule.getValues();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                Iterator<T> it = values.iterator();
                while (it.hasNext()) {
                    if (!kotlin.jvm.internal.t.a(i0.b(((Filter.Value) it.next()).getClass()), cVarB)) {
                        return false;
                    }
                }
            }
            switch (a.$EnumSwitchMapping$0[rule.getOp().ordinal()]) {
                case 1:
                case 2:
                    if (rule.getValues().size() != 1) {
                        return false;
                    }
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    if (rule.getValues().size() != 1 || !(b0.O(rule.getValues()) instanceof Filter.Value.NumberValue)) {
                        return false;
                    }
                    break;
                case 7:
                case 8:
                    if (rule.getValues().isEmpty()) {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
            return true;
        }
        return rule.getValues().isEmpty();
    }

    private final boolean a(Filter.Value value, Filter.Value value2) {
        if ((value instanceof Filter.Value.NumberValue) && (value2 instanceof Filter.Value.NumberValue)) {
            return ((Filter.Value.NumberValue) value).compareTo((Filter.Value.NumberValue) value2) == 0;
        }
        return kotlin.jvm.internal.t.a(value, value2);
    }
}
