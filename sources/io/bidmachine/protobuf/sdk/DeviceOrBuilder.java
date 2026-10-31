package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.BoolValue;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.h2;
import com.explorestack.protobuf.i;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface DeviceOrBuilder extends MessageOrBuilder {
    String getAccess();

    ByteString getAccessBytes();

    boolean getAirplane();

    int getApilevel();

    int getAtts();

    com.explorestack.protobuf.adcom.Context.Device.AudioContext getAudioContext();

    com.explorestack.protobuf.adcom.Context.Device.AudioContextOrBuilder getAudioContextOrBuilder();

    float getBatterylevel();

    boolean getBatterysaver();

    String getBmIfv();

    ByteString getBmIfvBytes();

    boolean getCharging();

    com.explorestack.protobuf.adcom.Context.Device.Connection getConnection();

    com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder getConnectionOrBuilder();

    String getCpuname();

    ByteString getCpunameBytes();

    String getCpuvendor();

    ByteString getCpuvendorBytes();

    boolean getDarkmode();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo164getDefaultInstanceForType();

    String getDevicename();

    ByteString getDevicenameBytes();

    long getDiskspace();

    boolean getDnd();

    long getFreemem();

    String getGpuname();

    ByteString getGpunameBytes();

    String getGpuvendor();

    ByteString getGpuvendorBytes();

    boolean getHeadset();

    String getHeadsetname();

    ByteString getHeadsetnameBytes();

    String getIfv();

    ByteString getIfvBytes();

    String getInputlanguage(int i10);

    ByteString getInputlanguageBytes(int i10);

    int getInputlanguageCount();

    List<String> getInputlanguageList();

    boolean getJailbreak();

    long getLastbootup();

    BoolValue getNetworkRoaming();

    i getNetworkRoamingOrBuilder();

    boolean getRingmute();

    float getScreenbright();

    StringValue getSimCarrier();

    h2 getSimCarrierOrBuilder();

    StringValue getSimCountry();

    h2 getSimCountryOrBuilder();

    long getTime();

    String getTimezone();

    ByteString getTimezoneBytes();

    long getTotaldisk();

    long getTotalmem();

    boolean hasAudioContext();

    boolean hasConnection();

    boolean hasNetworkRoaming();

    boolean hasSimCarrier();

    boolean hasSimCountry();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
