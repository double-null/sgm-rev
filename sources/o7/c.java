package o7;

import android.content.Context;
import c2.YDwL.tFQWuE;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.w1;
import io.bidmachine.analytics.AnalyticsConfig;
import io.bidmachine.analytics.BidMachineAnalytics;
import io.bidmachine.analytics.Filter;
import io.bidmachine.analytics.MonitorConfig;
import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.protobuf.InitResponse;
import io.bidmachine.protobuf.sdk.Configuration;
import io.bidmachine.protobuf.sdk.Monitor;
import io.bidmachine.protobuf.sdk.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b0;
import kotlin.collections.u;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: BidMachineAnalyticsInitializer.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f23119a = new c();

    /* JADX INFO: compiled from: BidMachineAnalyticsInitializer.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[Monitor.FilterExpression.NodeCase.values().length];
            try {
                iArr[Monitor.FilterExpression.NodeCase.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Monitor.FilterExpression.NodeCase.ANY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Monitor.FilterExpression.NodeCase.RULE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Monitor.Operator.values().length];
            try {
                iArr2[Monitor.Operator.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Monitor.Operator.NOT_IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Monitor.Operator.EQ.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Monitor.Operator.NEQ.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Monitor.Operator.EXISTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[Monitor.Operator.NOT_EXISTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[Monitor.Operator.GREATER_THAN.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[Monitor.Operator.GREATER_THAN_OR_EQUAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[Monitor.Operator.LESS_THAN.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[Monitor.Operator.LESS_THAN_OR_EQUAL.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Monitor.MissingBehavior.values().length];
            try {
                iArr3[Monitor.MissingBehavior.PASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[Monitor.MissingBehavior.FAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[Monitor.Value.KindCase.values().length];
            try {
                iArr4[Monitor.Value.KindCase.STRING_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[Monitor.Value.KindCase.BOOL_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[Monitor.Value.KindCase.INT_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[Monitor.Value.KindCase.DOUBLE_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    private c() {
    }

    public final Filter.MissingBehavior b(Monitor.MissingBehavior missingBehavior) {
        t.f(missingBehavior, "<this>");
        int i10 = a.$EnumSwitchMapping$2[missingBehavior.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? Filter.MissingBehavior.FAIL : Filter.MissingBehavior.FAIL;
        }
        return Filter.MissingBehavior.PASS;
    }

    public final MonitorConfig c(Monitor.Configuration configuration) {
        Filter filterK;
        MonitorConfig.ConfigExtension configExtensionL;
        t.f(configuration, "<this>");
        boolean value = configuration.hasShouldReport() ? configuration.getShouldReport().getValue() : false;
        if (configuration.hasFilter()) {
            Monitor.EventFilter filter = configuration.getFilter();
            t.e(filter, "filter");
            filterK = k(filter);
        } else {
            filterK = null;
        }
        if (configuration.hasImpExtension()) {
            Monitor.Configuration.ImpExtension impExtension = configuration.getImpExtension();
            t.e(impExtension, "impExtension");
            configExtensionL = l(impExtension);
        } else {
            configExtensionL = null;
        }
        String value2 = configuration.getName().getValue();
        t.e(value2, "name.value");
        String value3 = configuration.getUrl().getValue();
        t.e(value3, "url.value");
        return new MonitorConfig(value2, value3, configuration.getBatchSize().getValue(), configuration.getInterval().getValue(), value, filterK, configExtensionL);
    }

    public final ReaderConfig d(Reader.Configuration configuration) {
        t.f(configuration, "<this>");
        boolean value = configuration.hasUniqueOnly() ? configuration.getUniqueOnly().getValue() : true;
        String value2 = configuration.getName().getValue();
        t.e(value2, "name.value");
        String value3 = configuration.getUrl().getValue();
        t.e(value3, "url.value");
        long value4 = configuration.getUpdateInterval().getValue();
        List<Reader.Rule> rulesList = configuration.getRulesList();
        t.e(rulesList, "rulesList");
        ArrayList arrayList = new ArrayList();
        for (Reader.Rule it : rulesList) {
            c cVar = f23119a;
            t.e(it, "it");
            ReaderConfig.Rule ruleM = cVar.m(it);
            if (ruleM != null) {
                arrayList.add(ruleM);
            }
        }
        return new ReaderConfig(value2, value3, value4, value, arrayList);
    }

    public final Filter.Expression e(Monitor.All all) {
        t.f(all, "<this>");
        ArrayList arrayList = new ArrayList();
        int itemsCount = all.getItemsCount();
        for (int i10 = 0; i10 < itemsCount; i10++) {
            Monitor.FilterExpression items = all.getItems(i10);
            t.e(items, "getItems(i)");
            Filter.Expression expressionG = g(items);
            if (expressionG == null) {
                return null;
            }
            arrayList.add(expressionG);
        }
        return new Filter.Expression.AllOf(arrayList);
    }

    public final Filter.Expression f(Monitor.Any any) {
        t.f(any, "<this>");
        ArrayList arrayList = new ArrayList();
        int itemsCount = any.getItemsCount();
        for (int i10 = 0; i10 < itemsCount; i10++) {
            Monitor.FilterExpression items = any.getItems(i10);
            t.e(items, "getItems(i)");
            Filter.Expression expressionG = g(items);
            if (expressionG == null) {
                return null;
            }
            arrayList.add(expressionG);
        }
        return new Filter.Expression.AnyOf(arrayList);
    }

    public final Filter.Expression g(Monitor.FilterExpression filterExpression) {
        t.f(filterExpression, "<this>");
        Monitor.FilterExpression.NodeCase nodeCase = filterExpression.getNodeCase();
        int i10 = nodeCase == null ? -1 : a.$EnumSwitchMapping$0[nodeCase.ordinal()];
        if (i10 == 1) {
            if (!filterExpression.hasAll()) {
                return null;
            }
            Monitor.All all = filterExpression.getAll();
            t.e(all, "all");
            return e(all);
        }
        if (i10 == 2) {
            if (!filterExpression.hasAny()) {
                return null;
            }
            Monitor.Any any = filterExpression.getAny();
            t.e(any, "any");
            return f(any);
        }
        if (i10 != 3 || !filterExpression.hasRule()) {
            return null;
        }
        Monitor.Rule rule = filterExpression.getRule();
        t.e(rule, "rule");
        return h(rule);
    }

    public final Filter.Expression h(Monitor.Rule rule) {
        t.f(rule, "<this>");
        if (rule.getPathCount() == 0) {
            return null;
        }
        w1 pathList = rule.getPathList();
        t.e(pathList, "pathList");
        List listP0 = b0.p0(pathList);
        if (listP0.isEmpty()) {
            return null;
        }
        Monitor.Operator op = rule.getOp();
        t.e(op, "op");
        Filter.Operator operatorI = i(op);
        if (operatorI == null) {
            return null;
        }
        Monitor.MissingBehavior missing = rule.getMissing();
        t.e(missing, "missing");
        Filter.MissingBehavior missingBehaviorB = b(missing);
        List<Monitor.Value> protoValues = rule.getValuesList();
        if (operatorI == Filter.Operator.EXISTS || operatorI == Filter.Operator.NOT_EXISTS) {
            t.e(protoValues, "protoValues");
            if (!protoValues.isEmpty()) {
                return null;
            }
            return new Filter.Expression.Rule(listP0, operatorI, kotlin.collections.t.k(), missingBehaviorB);
        }
        if (protoValues.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Monitor.Value value : protoValues) {
            t.e(value, "value");
            Filter.Value valueJ = j(value);
            if (valueJ == null) {
                return null;
            }
            arrayList.add(valueJ);
        }
        return new Filter.Expression.Rule(listP0, operatorI, arrayList, missingBehaviorB);
    }

    public final Filter.Operator i(Monitor.Operator operator) {
        t.f(operator, "<this>");
        switch (a.$EnumSwitchMapping$1[operator.ordinal()]) {
            case 1:
                return Filter.Operator.IN;
            case 2:
                return Filter.Operator.NOT_IN;
            case 3:
                return Filter.Operator.EQ;
            case 4:
                return Filter.Operator.NEQ;
            case 5:
                return Filter.Operator.EXISTS;
            case 6:
                return Filter.Operator.NOT_EXISTS;
            case 7:
                return Filter.Operator.GT;
            case 8:
                return Filter.Operator.GTE;
            case 9:
                return Filter.Operator.LT;
            case 10:
                return Filter.Operator.LTE;
            default:
                return null;
        }
    }

    public final Filter.Value j(Monitor.Value value) {
        t.f(value, "<this>");
        Monitor.Value.KindCase kindCase = value.getKindCase();
        int i10 = kindCase == null ? -1 : a.$EnumSwitchMapping$3[kindCase.ordinal()];
        if (i10 == 1) {
            String stringValue = value.getStringValue();
            t.e(stringValue, "stringValue");
            return Filter.Value.StringValue.m378boximpl(Filter.Value.StringValue.m379constructorimpl(stringValue));
        }
        if (i10 == 2) {
            return Filter.Value.BoolValue.m355boximpl(Filter.Value.BoolValue.m356constructorimpl(value.getBoolValue()));
        }
        if (i10 == 3) {
            return Filter.Value.LongValue.m370boximpl(Filter.Value.LongValue.m371constructorimpl(value.getIntValue()));
        }
        if (i10 != 4) {
            return null;
        }
        return Filter.Value.DoubleValue.m362boximpl(Filter.Value.DoubleValue.m363constructorimpl(value.getDoubleValue()));
    }

    public final Filter k(Monitor.EventFilter eventFilter) {
        t.f(eventFilter, "<this>");
        if (!eventFilter.hasExpr()) {
            return null;
        }
        Monitor.FilterExpression expr = eventFilter.getExpr();
        t.e(expr, "expr");
        Filter.Expression expressionG = g(expr);
        if (expressionG == null) {
            return null;
        }
        return new Filter(expressionG);
    }

    public final MonitorConfig.ConfigExtension l(Monitor.Configuration.ImpExtension impExtension) {
        long jT;
        t.f(impExtension, "<this>");
        String value = impExtension.hasIaaQuery() ? impExtension.getIaaQuery().getValue() : null;
        if (impExtension.hasTtlSeconds()) {
            sd.a.C0418a c0418a = sd.a.f25407b;
            jT = sd.c.t(impExtension.getTtlSeconds().getValue(), sd.d.SECONDS);
        } else {
            sd.a.C0418a c0418a2 = sd.a.f25407b;
            jT = sd.c.t(sd.a.r(sd.c.s(90, sd.d.DAYS)), sd.d.SECONDS);
        }
        return new MonitorConfig.ImpConfigExtension(value, jT, null);
    }

    public final ReaderConfig.Rule m(Reader.Rule rule) {
        t.f(rule, "<this>");
        if (rule.hasGeneralRule()) {
            Reader.Rule.GeneralRule generalRule = rule.getGeneralRule();
            String value = generalRule.getTag().getValue();
            t.e(value, "generalRule.tag.value");
            String value2 = generalRule.getPath().getValue();
            t.e(value2, "generalRule.path.value");
            return new ReaderConfig.Rule.GeneralRule(value, value2);
        }
        if (!rule.hasPurRule()) {
            return null;
        }
        Reader.Rule.PurRule purRule = rule.getPurRule();
        String value3 = purRule.hasQuery() ? purRule.getQuery().getValue() : null;
        boolean value4 = purRule.hasShouldReport() ? purRule.getShouldReport().getValue() : true;
        String value5 = purRule.getTag().getValue();
        t.e(value5, "purRule.tag.value");
        String value6 = purRule.getPath().getValue();
        t.e(value6, "purRule.path.value");
        return new ReaderConfig.Rule.PurRule(value5, value6, value3, value4);
    }

    public static final void a(Context context, String currentSessionId, InitResponse initResponse, String initResponseSessionId) {
        String str;
        t.f(context, "context");
        t.f(currentSessionId, "currentSessionId");
        t.f(initResponse, "initResponse");
        t.f(initResponseSessionId, "initResponseSessionId");
        try {
            if (initResponse.hasSdkAnalyticConfigV2()) {
                Configuration sdkAnalyticConfigV2 = initResponse.getSdkAnalyticConfigV2();
                List<Monitor.Configuration> monitorsList = sdkAnalyticConfigV2.getMonitorsList();
                t.e(monitorsList, "sdkAnalyticConfig.monitorsList");
                ArrayList arrayList = new ArrayList(u.u(monitorsList, 10));
                Iterator<T> it = monitorsList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    str = tFQWuE.AlzyzUQAGciOnrE;
                    if (!zHasNext) {
                        break;
                    }
                    Monitor.Configuration configuration = (Monitor.Configuration) it.next();
                    c cVar = f23119a;
                    t.e(configuration, str);
                    arrayList.add(cVar.c(configuration));
                }
                List<Reader.Configuration> readersList = sdkAnalyticConfigV2.getReadersList();
                t.e(readersList, "sdkAnalyticConfig.readersList");
                ArrayList arrayList2 = new ArrayList(u.u(readersList, 10));
                for (Reader.Configuration configuration2 : readersList) {
                    c cVar2 = f23119a;
                    t.e(configuration2, str);
                    arrayList2.add(cVar2.d(configuration2));
                }
                Struct privateExtras = initResponse.getExtras().getPrivate();
                String bpk = sdkAnalyticConfigV2.getBpk().getValue();
                t.e(bpk, "bpk");
                t.e(privateExtras, "privateExtras");
                BidMachineAnalytics.configure(context, new AnalyticsConfig(initResponseSessionId, arrayList, arrayList2, bpk, privateExtras));
                if (t.a(currentSessionId, initResponseSessionId)) {
                    return;
                }
                BidMachineAnalytics.configure(context, new AnalyticsConfig(currentSessionId, arrayList, arrayList2, bpk, privateExtras));
            }
        } catch (Throwable unused) {
        }
    }
}
