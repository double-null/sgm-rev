package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.n2;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface AppOrBuilder extends MessageOrBuilder {
    String getAppName();

    ByteString getAppNameBytes();

    String getAppVer();

    ByteString getAppVerBytes();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo164getDefaultInstanceForType();

    Timestamp getFirstLaunchTime();

    n2 getFirstLaunchTimeOrBuilder();

    String getFmwname();

    ByteString getFmwnameBytes();

    Timestamp getInstallBeginServerTimestamp();

    n2 getInstallBeginServerTimestampOrBuilder();

    Timestamp getInstallReferrerClickServerTimestamp();

    n2 getInstallReferrerClickServerTimestampOrBuilder();

    Timestamp getInstallReferrerClickTimestamp();

    n2 getInstallReferrerClickTimestampOrBuilder();

    String getInstallReferrerUrl();

    ByteString getInstallReferrerUrlBytes();

    Timestamp getInstallTime();

    n2 getInstallTimeOrBuilder();

    String getInstallVersion();

    ByteString getInstallVersionBytes();

    boolean getIsGooglePlayInstant();

    com.explorestack.protobuf.adcom.Context.App.Release getRelease();

    com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder getReleaseOrBuilder();

    Timestamp getSdkInstallTime();

    n2 getSdkInstallTimeOrBuilder();

    String getStorecat();

    ByteString getStorecatBytes();

    String getStoresubcat(int i10);

    ByteString getStoresubcatBytes(int i10);

    int getStoresubcatCount();

    List<String> getStoresubcatList();

    boolean hasFirstLaunchTime();

    boolean hasInstallBeginServerTimestamp();

    boolean hasInstallReferrerClickServerTimestamp();

    boolean hasInstallReferrerClickTimestamp();

    boolean hasInstallTime();

    boolean hasRelease();

    boolean hasSdkInstallTime();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
