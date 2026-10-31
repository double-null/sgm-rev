package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.d3;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.j2;
import com.explorestack.protobuf.o2;
import com.explorestack.protobuf.w;
import com.explorestack.protobuf.y;
import com.google.ads.mediation.ZRT.wHzciBnJlYkdX;
import com.google.firebase.provider.fH.UyXgnuLGEkgnZE;

/* JADX INFO: loaded from: classes5.dex */
public final class SDKAnalyticV2Proto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n*bidmachine/protobuf/sdk/analytics_v2.proto\u0012$bidmachine.protobuf.sdk.analytics_v2\u001a\u001fgoogle/protobuf/timestamp.proto\u001a\u001cgoogle/protobuf/struct.proto\u001a\u001egoogle/protobuf/wrappers.proto\u001a$bidmachine/protobuf/sdk/errors.proto\"ë\u000e\n\u0007Monitor\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012E\n\u0007records\u0018\u0002 \u0003(\u000b24.bidmachine.protobuf.sdk.analytics_v2.Monitor.Record\u001a±\u0004\n\rConfiguration\u0012*\n\u0004name\u0018\u0001 \u0001(\u000b2\u001c.google.protobuf.StringValue\u0012)\n\u0003url\u0018\u0002 \u0001(\u000b2\u001c.google.protobuf.StringValue\u00120\n\nbatch_size\u0018\u0003 \u0001(\u000b2\u001c.google.protobuf.UInt32Value\u0012.\n\binterval\u0018\u0004 \u0001(\u000b2\u001c.google.protobuf.UInt32Value\u00121\n\rshould_report\u0018\u0005 \u0001(\u000b2\u001a.google.protobuf.BoolValue\u0012a\n\rimp_extension\u0018\u0006 \u0001(\u000b2H.bidmachine.protobuf.sdk.analytics_v2.Monitor.Configuration.ImpExtensionH\u0000\u0012I\n\u0006filter\u0018\u0007 \u0001(\u000b29.bidmachine.protobuf.sdk.analytics_v2.Monitor.EventFilter\u001ar\n\fImpExtension\u0012/\n\tiaa_query\u0018\u0001 \u0001(\u000b2\u001c.google.protobuf.StringValue\u00121\n\u000bttl_seconds\u0018\u0002 \u0001(\u000b2\u001c.google.protobuf.UInt32ValueB\u0012\n\u0010config_extension\u001a\u0096\u0001\n\u0006Record\u0012-\n\ttimestamp\u0018\u0001 \u0001(\u000b2\u001a.google.protobuf.Timestamp\u0012'\n\u0006fields\u0018\u0002 \u0001(\u000b2\u0017.google.protobuf.Struct\u00124\n\u0005error\u0018\u0003 \u0001(\u000b2%.bidmachine.protobuf.sdk.errors.Error\u001a[\n\u000bEventFilter\u0012L\n\u0004expr\u0018\u0001 \u0001(\u000b2>.bidmachine.protobuf.sdk.analytics_v2.Monitor.FilterExpression\u001aâ\u0001\n\u0010FilterExpression\u0012@\n\u0003all\u0018\u0001 \u0001(\u000b21.bidmachine.protobuf.sdk.analytics_v2.Monitor.AllH\u0000\u0012@\n\u0003any\u0018\u0002 \u0001(\u000b21.bidmachine.protobuf.sdk.analytics_v2.Monitor.AnyH\u0000\u0012B\n\u0004rule\u0018\u0003 \u0001(\u000b22.bidmachine.protobuf.sdk.analytics_v2.Monitor.RuleH\u0000B\u0006\n\u0004node\u001aT\n\u0003All\u0012M\n\u0005items\u0018\u0001 \u0003(\u000b2>.bidmachine.protobuf.sdk.analytics_v2.Monitor.FilterExpression\u001aT\n\u0003Any\u0012M\n\u0005items\u0018\u0001 \u0003(\u000b2>.bidmachine.protobuf.sdk.analytics_v2.Monitor.FilterExpression\u001aí\u0001\n\u0004Rule\u0012\f\n\u0004path\u0018\u0001 \u0003(\t\u0012B\n\u0002op\u0018\u0002 \u0001(\u000e26.bidmachine.protobuf.sdk.analytics_v2.Monitor.Operator\u0012C\n\u0006values\u0018\u0003 \u0003(\u000b23.bidmachine.protobuf.sdk.analytics_v2.Monitor.Value\u0012N\n\u0007missing\u0018\u0004 \u0001(\u000e2=.bidmachine.protobuf.sdk.analytics_v2.Monitor.MissingBehavior\u001aj\n\u0005Value\u0012\u0016\n\fstring_value\u0018\u0001 \u0001(\tH\u0000\u0012\u0013\n\tint_value\u0018\u0002 \u0001(\u0003H\u0000\u0012\u0014\n\nbool_value\u0018\u0003 \u0001(\bH\u0000\u0012\u0016\n\fdouble_value\u0018\u0004 \u0001(\u0001H\u0000B\u0006\n\u0004kind\"³\u0001\n\bOperator\u0012\u0012\n\u000eOP_UNSPECIFIED\u0010\u0000\u0012\u0006\n\u0002IN\u0010\u0001\u0012\n\n\u0006NOT_IN\u0010\u0002\u0012\u0006\n\u0002EQ\u0010\u0003\u0012\u0007\n\u0003NEQ\u0010\u0004\u0012\n\n\u0006EXISTS\u0010\u0005\u0012\u000e\n\nNOT_EXISTS\u0010\u0006\u0012\u0010\n\fGREATER_THAN\u0010\u0007\u0012\u0019\n\u0015GREATER_THAN_OR_EQUAL\u0010\b\u0012\r\n\tLESS_THAN\u0010\t\u0012\u0016\n\u0012LESS_THAN_OR_EQUAL\u0010\n\">\n\u000fMissingBehavior\u0012\u0017\n\u0013MISSING_UNSPECIFIED\u0010\u0000\u0012\b\n\u0004FAIL\u0010\u0001\u0012\b\n\u0004PASS\u0010\u0002\"¢\n\n\u0006Reader\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012-\n\ttimestamp\u0018\u0002 \u0001(\u000b2\u001a.google.protobuf.Timestamp\u0012D\n\u0007records\u0018\u0003 \u0003(\u000b23.bidmachine.protobuf.sdk.analytics_v2.Reader.Record\u001a\u0090\u0002\n\rConfiguration\u0012*\n\u0004name\u0018\u0001 \u0001(\u000b2\u001c.google.protobuf.StringValue\u0012)\n\u0003url\u0018\u0002 \u0001(\u000b2\u001c.google.protobuf.StringValue\u00125\n\u000fupdate_interval\u0018\u0003 \u0001(\u000b2\u001c.google.protobuf.UInt32Value\u0012/\n\u000bunique_only\u0018\u0004 \u0001(\u000b2\u001a.google.protobuf.BoolValue\u0012@\n\u0005rules\u0018\u0005 \u0003(\u000b21.bidmachine.protobuf.sdk.analytics_v2.Reader.Rule\u001aÐ\u0005\n\u0004Rule\u0012U\n\fgeneral_rule\u0018\u0001 \u0001(\u000b2=.bidmachine.protobuf.sdk.analytics_v2.Reader.Rule.GeneralRuleH\u0000\u0012T\n\fios_log_rule\u0018\u0002 \u0001(\u000b2<.bidmachine.protobuf.sdk.analytics_v2.Reader.Rule.IOSLogRuleH\u0000\u0012M\n\bpur_rule\u0018\u0003 \u0001(\u000b29.bidmachine.protobuf.sdk.analytics_v2.Reader.Rule.PurRuleH\u0000\u001ad\n\u000bGeneralRule\u0012)\n\u0003tag\u0018\u0001 \u0001(\u000b2\u001c.google.protobuf.StringValue\u0012*\n\u0004path\u0018\u0002 \u0001(\u000b2\u001c.google.protobuf.StringValue\u001a\u0094\u0001\n\nIOSLogRule\u0012)\n\u0003tag\u0018\u0001 \u0001(\u000b2\u001c.google.protobuf.StringValue\u0012,\n\u0006levels\u0018\u0002 \u0003(\u000b2\u001c.google.protobuf.StringValue\u0012-\n\u0007sources\u0018\u0003 \u0003(\u000b2\u001c.google.protobuf.StringValue\u001aÀ\u0001\n\u0007PurRule\u0012)\n\u0003tag\u0018\u0001 \u0001(\u000b2\u001c.google.protobuf.StringValue\u0012*\n\u0004path\u0018\u0002 \u0001(\u000b2\u001c.google.protobuf.StringValue\u0012+\n\u0005query\u0018\u0003 \u0001(\u000b2\u001c.google.protobuf.StringValue\u00121\n\rshould_report\u0018\u0004 \u0001(\u000b2\u001a.google.protobuf.BoolValueB\f\n\nrule_oneof\u001a®\u0001\n\u0006Record\u0012?\n\u0004rule\u0018\u0001 \u0001(\u000b21.bidmachine.protobuf.sdk.analytics_v2.Reader.Rule\u0012-\n\braw_data\u0018\u0002 \u0001(\u000b2\u001b.google.protobuf.BytesValue\u00124\n\u0005error\u0018\u0003 \u0001(\u000b2%.bidmachine.protobuf.sdk.errors.Error\"Ö\u0001\n\rConfiguration\u0012M\n\bmonitors\u0018\u0001 \u0003(\u000b2;.bidmachine.protobuf.sdk.analytics_v2.Monitor.Configuration\u0012K\n\u0007readers\u0018\u0002 \u0003(\u000b2:.bidmachine.protobuf.sdk.analytics_v2.Reader.Configuration\u0012)\n\u0003bpk\u0018\u0003 \u0001(\u000b2\u001c.google.protobuf.StringValue\"Å\u0001\n\u0005Event\u0012@\n\u0007monitor\u0018\u0001 \u0001(\u000b2-.bidmachine.protobuf.sdk.analytics_v2.MonitorH\u0000\u0012>\n\u0006reader\u0018\u0002 \u0001(\u000b2,.bidmachine.protobuf.sdk.analytics_v2.ReaderH\u0000\u0012/\n\u000eextras_private\u0018\u0003 \u0001(\u000b2\u0017.google.protobuf.StructB\t\n\u0007payload\"Â\u0001\n\u0005OSLog\u0012C\n\u0007records\u0018\u0001 \u0003(\u000b22.bidmachine.protobuf.sdk.analytics_v2.OSLog.Record\u001at\n\u0006Record\u0012-\n\ttimestamp\u0018\u0001 \u0001(\u000b2\u001a.google.protobuf.Timestamp\u0012\u000b\n\u0003tag\u0018\u0002 \u0001(\t\u0012\r\n\u0005level\u0018\u0003 \u0001(\t\u0012\u000e\n\u0006source\u0018\u0004 \u0001(\t\u0012\u000f\n\u0007message\u0018\u0005 \u0001(\tB8\n\u001aio.bidmachine.protobuf.sdkB\u0012SDKAnalyticV2ProtoP\u0001¢\u0002\u0003BDMb\u0006proto3"}, new Descriptors.FileDescriptor[]{o2.a(), j2.a(), d3.a(), SDKErrorsProto.getDescriptor()});
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Configuration_descriptor;
    static final j0.f internal_static_bidmachine_protobuf_sdk_analytics_v2_Configuration_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Event_descriptor;
    static final j0.f internal_static_bidmachine_protobuf_sdk_analytics_v2_Event_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_All_descriptor;
    static final j0.f internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_All_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Any_descriptor;
    static final j0.f internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Any_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_ImpExtension_descriptor;
    static final j0.f internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_ImpExtension_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_descriptor;
    static final j0.f internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_EventFilter_descriptor;
    static final j0.f internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_EventFilter_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_FilterExpression_descriptor;
    static final j0.f internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_FilterExpression_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Record_descriptor;
    static final j0.f internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Record_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Rule_descriptor;
    static final j0.f internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Rule_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Value_descriptor;
    static final j0.f internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Value_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_descriptor;
    static final j0.f internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_Record_descriptor;
    static final j0.f internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_Record_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_descriptor;
    static final j0.f internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Configuration_descriptor;
    static final j0.f internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Configuration_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Record_descriptor;
    static final j0.f internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Record_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_GeneralRule_descriptor;
    static final j0.f internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_GeneralRule_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_IOSLogRule_descriptor;
    static final j0.f internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_IOSLogRule_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_PurRule_descriptor;
    static final j0.f internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_PurRule_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_descriptor;
    static final j0.f internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_descriptor;
    static final j0.f internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_fieldAccessorTable;

    private SDKAnalyticV2Proto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(y yVar) {
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_descriptor = descriptor2;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_fieldAccessorTable = new j0.f(descriptor2, new String[]{"Name", "Records"});
        Descriptors.Descriptor descriptor3 = descriptor2.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_descriptor = descriptor3;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_fieldAccessorTable = new j0.f(descriptor3, new String[]{"Name", "Url", "BatchSize", "Interval", "ShouldReport", "ImpExtension", "Filter", "ConfigExtension"});
        Descriptors.Descriptor descriptor4 = descriptor3.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_ImpExtension_descriptor = descriptor4;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_ImpExtension_fieldAccessorTable = new j0.f(descriptor4, new String[]{"IaaQuery", "TtlSeconds"});
        Descriptors.Descriptor descriptor5 = descriptor2.getNestedTypes().get(1);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Record_descriptor = descriptor5;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Record_fieldAccessorTable = new j0.f(descriptor5, new String[]{"Timestamp", "Fields", "Error"});
        Descriptors.Descriptor descriptor6 = descriptor2.getNestedTypes().get(2);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_EventFilter_descriptor = descriptor6;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_EventFilter_fieldAccessorTable = new j0.f(descriptor6, new String[]{"Expr"});
        Descriptors.Descriptor descriptor7 = descriptor2.getNestedTypes().get(3);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_FilterExpression_descriptor = descriptor7;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_FilterExpression_fieldAccessorTable = new j0.f(descriptor7, new String[]{"All", "Any", "Rule", "Node"});
        Descriptors.Descriptor descriptor8 = descriptor2.getNestedTypes().get(4);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_All_descriptor = descriptor8;
        String str = UyXgnuLGEkgnZE.MdMsedPIynIc;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_All_fieldAccessorTable = new j0.f(descriptor8, new String[]{str});
        Descriptors.Descriptor descriptor9 = descriptor2.getNestedTypes().get(5);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Any_descriptor = descriptor9;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Any_fieldAccessorTable = new j0.f(descriptor9, new String[]{str});
        Descriptors.Descriptor descriptor10 = descriptor2.getNestedTypes().get(6);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Rule_descriptor = descriptor10;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Rule_fieldAccessorTable = new j0.f(descriptor10, new String[]{"Path", "Op", "Values", "Missing"});
        Descriptors.Descriptor descriptor11 = descriptor2.getNestedTypes().get(7);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Value_descriptor = descriptor11;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Value_fieldAccessorTable = new j0.f(descriptor11, new String[]{"StringValue", "IntValue", "BoolValue", wHzciBnJlYkdX.lTtMfhtDtuDDj, "Kind"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(1);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_descriptor = descriptor12;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_fieldAccessorTable = new j0.f(descriptor12, new String[]{"Name", "Timestamp", "Records"});
        Descriptors.Descriptor descriptor13 = descriptor12.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Configuration_descriptor = descriptor13;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Configuration_fieldAccessorTable = new j0.f(descriptor13, new String[]{"Name", "Url", "UpdateInterval", "UniqueOnly", "Rules"});
        Descriptors.Descriptor descriptor14 = descriptor12.getNestedTypes().get(1);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_descriptor = descriptor14;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_fieldAccessorTable = new j0.f(descriptor14, new String[]{"GeneralRule", "IosLogRule", "PurRule", "RuleOneof"});
        Descriptors.Descriptor descriptor15 = descriptor14.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_GeneralRule_descriptor = descriptor15;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_GeneralRule_fieldAccessorTable = new j0.f(descriptor15, new String[]{"Tag", "Path"});
        Descriptors.Descriptor descriptor16 = descriptor14.getNestedTypes().get(1);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_IOSLogRule_descriptor = descriptor16;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_IOSLogRule_fieldAccessorTable = new j0.f(descriptor16, new String[]{"Tag", "Levels", "Sources"});
        Descriptors.Descriptor descriptor17 = descriptor14.getNestedTypes().get(2);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_PurRule_descriptor = descriptor17;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_PurRule_fieldAccessorTable = new j0.f(descriptor17, new String[]{"Tag", "Path", "Query", "ShouldReport"});
        Descriptors.Descriptor descriptor18 = descriptor12.getNestedTypes().get(2);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Record_descriptor = descriptor18;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Record_fieldAccessorTable = new j0.f(descriptor18, new String[]{"Rule", "RawData", "Error"});
        Descriptors.Descriptor descriptor19 = getDescriptor().getMessageTypes().get(2);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Configuration_descriptor = descriptor19;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Configuration_fieldAccessorTable = new j0.f(descriptor19, new String[]{"Monitors", "Readers", "Bpk"});
        Descriptors.Descriptor descriptor20 = getDescriptor().getMessageTypes().get(3);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Event_descriptor = descriptor20;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Event_fieldAccessorTable = new j0.f(descriptor20, new String[]{"Monitor", "Reader", "ExtrasPrivate", "Payload"});
        Descriptors.Descriptor descriptor21 = getDescriptor().getMessageTypes().get(4);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_descriptor = descriptor21;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_fieldAccessorTable = new j0.f(descriptor21, new String[]{"Records"});
        Descriptors.Descriptor descriptor22 = descriptor21.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_Record_descriptor = descriptor22;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_Record_fieldAccessorTable = new j0.f(descriptor22, new String[]{"Timestamp", "Tag", "Level", "Source", "Message"});
        o2.a();
        j2.a();
        d3.a();
        SDKErrorsProto.getDescriptor();
    }

    public static void registerAllExtensions(w wVar) {
        registerAllExtensions((y) wVar);
    }
}
