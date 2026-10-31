package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.e2;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.l0;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.n2;
import com.explorestack.protobuf.q0;
import com.explorestack.protobuf.r0;
import com.explorestack.protobuf.s1;
import com.explorestack.protobuf.u2;
import com.explorestack.protobuf.w1;
import com.explorestack.protobuf.y;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class App extends j0 implements AppOrBuilder {
    public static final int APP_NAME_FIELD_NUMBER = 1;
    public static final int APP_VER_FIELD_NUMBER = 2;
    public static final int FIRST_LAUNCH_TIME_FIELD_NUMBER = 5;
    public static final int FMWNAME_FIELD_NUMBER = 8;
    public static final int INSTALL_BEGIN_SERVER_TIMESTAMP_FIELD_NUMBER = 13;
    public static final int INSTALL_REFERRER_CLICK_SERVER_TIMESTAMP_FIELD_NUMBER = 12;
    public static final int INSTALL_REFERRER_CLICK_TIMESTAMP_FIELD_NUMBER = 10;
    public static final int INSTALL_REFERRER_URL_FIELD_NUMBER = 9;
    public static final int INSTALL_TIME_FIELD_NUMBER = 4;
    public static final int INSTALL_VERSION_FIELD_NUMBER = 14;
    public static final int IS_GOOGLE_PLAY_INSTANT_FIELD_NUMBER = 15;
    public static final int RELEASE_FIELD_NUMBER = 3;
    public static final int SDK_INSTALL_TIME_FIELD_NUMBER = 16;
    public static final int STORECAT_FIELD_NUMBER = 6;
    public static final int STORESUBCAT_FIELD_NUMBER = 7;
    private static final long serialVersionUID = 0;
    private volatile Object appName_;
    private volatile Object appVer_;
    private Timestamp firstLaunchTime_;
    private volatile Object fmwname_;
    private Timestamp installBeginServerTimestamp_;
    private Timestamp installReferrerClickServerTimestamp_;
    private Timestamp installReferrerClickTimestamp_;
    private volatile Object installReferrerUrl_;
    private Timestamp installTime_;
    private volatile Object installVersion_;
    private boolean isGooglePlayInstant_;
    private byte memoizedIsInitialized;
    private com.explorestack.protobuf.adcom.Context.App.Release release_;
    private Timestamp sdkInstallTime_;
    private volatile Object storecat_;
    private r0 storesubcat_;
    private static final App DEFAULT_INSTANCE = new App();
    private static final s1<App> PARSER = new b<App>() { // from class: io.bidmachine.protobuf.sdk.App.1
        @Override // com.explorestack.protobuf.s1
        public App parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new App(nVar, yVar);
        }
    };

    public static final class Builder extends j0.b<Builder> implements AppOrBuilder {
        private Object appName_;
        private Object appVer_;
        private int bitField0_;
        private e2<Timestamp, Timestamp.Builder, n2> firstLaunchTimeBuilder_;
        private Timestamp firstLaunchTime_;
        private Object fmwname_;
        private e2<Timestamp, Timestamp.Builder, n2> installBeginServerTimestampBuilder_;
        private Timestamp installBeginServerTimestamp_;
        private e2<Timestamp, Timestamp.Builder, n2> installReferrerClickServerTimestampBuilder_;
        private Timestamp installReferrerClickServerTimestamp_;
        private e2<Timestamp, Timestamp.Builder, n2> installReferrerClickTimestampBuilder_;
        private Timestamp installReferrerClickTimestamp_;
        private Object installReferrerUrl_;
        private e2<Timestamp, Timestamp.Builder, n2> installTimeBuilder_;
        private Timestamp installTime_;
        private Object installVersion_;
        private boolean isGooglePlayInstant_;
        private e2<com.explorestack.protobuf.adcom.Context.App.Release, com.explorestack.protobuf.adcom.Context.App.Release.Builder, com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder> releaseBuilder_;
        private com.explorestack.protobuf.adcom.Context.App.Release release_;
        private e2<Timestamp, Timestamp.Builder, n2> sdkInstallTimeBuilder_;
        private Timestamp sdkInstallTime_;
        private Object storecat_;
        private r0 storesubcat_;

        private void ensureStoresubcatIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.storesubcat_ = new q0(this.storesubcat_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_App_descriptor;
        }

        private e2<Timestamp, Timestamp.Builder, n2> getFirstLaunchTimeFieldBuilder() {
            if (this.firstLaunchTimeBuilder_ == null) {
                this.firstLaunchTimeBuilder_ = new e2<>(getFirstLaunchTime(), getParentForChildren(), isClean());
                this.firstLaunchTime_ = null;
            }
            return this.firstLaunchTimeBuilder_;
        }

        private e2<Timestamp, Timestamp.Builder, n2> getInstallBeginServerTimestampFieldBuilder() {
            if (this.installBeginServerTimestampBuilder_ == null) {
                this.installBeginServerTimestampBuilder_ = new e2<>(getInstallBeginServerTimestamp(), getParentForChildren(), isClean());
                this.installBeginServerTimestamp_ = null;
            }
            return this.installBeginServerTimestampBuilder_;
        }

        private e2<Timestamp, Timestamp.Builder, n2> getInstallReferrerClickServerTimestampFieldBuilder() {
            if (this.installReferrerClickServerTimestampBuilder_ == null) {
                this.installReferrerClickServerTimestampBuilder_ = new e2<>(getInstallReferrerClickServerTimestamp(), getParentForChildren(), isClean());
                this.installReferrerClickServerTimestamp_ = null;
            }
            return this.installReferrerClickServerTimestampBuilder_;
        }

        private e2<Timestamp, Timestamp.Builder, n2> getInstallReferrerClickTimestampFieldBuilder() {
            if (this.installReferrerClickTimestampBuilder_ == null) {
                this.installReferrerClickTimestampBuilder_ = new e2<>(getInstallReferrerClickTimestamp(), getParentForChildren(), isClean());
                this.installReferrerClickTimestamp_ = null;
            }
            return this.installReferrerClickTimestampBuilder_;
        }

        private e2<Timestamp, Timestamp.Builder, n2> getInstallTimeFieldBuilder() {
            if (this.installTimeBuilder_ == null) {
                this.installTimeBuilder_ = new e2<>(getInstallTime(), getParentForChildren(), isClean());
                this.installTime_ = null;
            }
            return this.installTimeBuilder_;
        }

        private e2<com.explorestack.protobuf.adcom.Context.App.Release, com.explorestack.protobuf.adcom.Context.App.Release.Builder, com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder> getReleaseFieldBuilder() {
            if (this.releaseBuilder_ == null) {
                this.releaseBuilder_ = new e2<>(getRelease(), getParentForChildren(), isClean());
                this.release_ = null;
            }
            return this.releaseBuilder_;
        }

        private e2<Timestamp, Timestamp.Builder, n2> getSdkInstallTimeFieldBuilder() {
            if (this.sdkInstallTimeBuilder_ == null) {
                this.sdkInstallTimeBuilder_ = new e2<>(getSdkInstallTime(), getParentForChildren(), isClean());
                this.sdkInstallTime_ = null;
            }
            return this.sdkInstallTimeBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = j0.alwaysUseFieldBuilders;
        }

        public Builder addAllStoresubcat(Iterable<String> iterable) {
            ensureStoresubcatIsMutable();
            a.AbstractC0128a.addAll((Iterable) iterable, (List) this.storesubcat_);
            onChanged();
            return this;
        }

        public Builder addStoresubcat(String str) {
            str.getClass();
            ensureStoresubcatIsMutable();
            this.storesubcat_.add(str);
            onChanged();
            return this;
        }

        public Builder addStoresubcatBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            ensureStoresubcatIsMutable();
            this.storesubcat_.b(byteString);
            onChanged();
            return this;
        }

        public Builder clearAppName() {
            this.appName_ = App.getDefaultInstance().getAppName();
            onChanged();
            return this;
        }

        public Builder clearAppVer() {
            this.appVer_ = App.getDefaultInstance().getAppVer();
            onChanged();
            return this;
        }

        public Builder clearFirstLaunchTime() {
            if (this.firstLaunchTimeBuilder_ == null) {
                this.firstLaunchTime_ = null;
                onChanged();
            } else {
                this.firstLaunchTime_ = null;
                this.firstLaunchTimeBuilder_ = null;
            }
            return this;
        }

        public Builder clearFmwname() {
            this.fmwname_ = App.getDefaultInstance().getFmwname();
            onChanged();
            return this;
        }

        public Builder clearInstallBeginServerTimestamp() {
            if (this.installBeginServerTimestampBuilder_ == null) {
                this.installBeginServerTimestamp_ = null;
                onChanged();
            } else {
                this.installBeginServerTimestamp_ = null;
                this.installBeginServerTimestampBuilder_ = null;
            }
            return this;
        }

        public Builder clearInstallReferrerClickServerTimestamp() {
            if (this.installReferrerClickServerTimestampBuilder_ == null) {
                this.installReferrerClickServerTimestamp_ = null;
                onChanged();
            } else {
                this.installReferrerClickServerTimestamp_ = null;
                this.installReferrerClickServerTimestampBuilder_ = null;
            }
            return this;
        }

        public Builder clearInstallReferrerClickTimestamp() {
            if (this.installReferrerClickTimestampBuilder_ == null) {
                this.installReferrerClickTimestamp_ = null;
                onChanged();
            } else {
                this.installReferrerClickTimestamp_ = null;
                this.installReferrerClickTimestampBuilder_ = null;
            }
            return this;
        }

        public Builder clearInstallReferrerUrl() {
            this.installReferrerUrl_ = App.getDefaultInstance().getInstallReferrerUrl();
            onChanged();
            return this;
        }

        public Builder clearInstallTime() {
            if (this.installTimeBuilder_ == null) {
                this.installTime_ = null;
                onChanged();
            } else {
                this.installTime_ = null;
                this.installTimeBuilder_ = null;
            }
            return this;
        }

        public Builder clearInstallVersion() {
            this.installVersion_ = App.getDefaultInstance().getInstallVersion();
            onChanged();
            return this;
        }

        public Builder clearIsGooglePlayInstant() {
            this.isGooglePlayInstant_ = false;
            onChanged();
            return this;
        }

        public Builder clearRelease() {
            if (this.releaseBuilder_ == null) {
                this.release_ = null;
                onChanged();
            } else {
                this.release_ = null;
                this.releaseBuilder_ = null;
            }
            return this;
        }

        public Builder clearSdkInstallTime() {
            if (this.sdkInstallTimeBuilder_ == null) {
                this.sdkInstallTime_ = null;
                onChanged();
            } else {
                this.sdkInstallTime_ = null;
                this.sdkInstallTimeBuilder_ = null;
            }
            return this;
        }

        public Builder clearStorecat() {
            this.storecat_ = App.getDefaultInstance().getStorecat();
            onChanged();
            return this;
        }

        public Builder clearStoresubcat() {
            this.storesubcat_ = q0.f10776d;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public String getAppName() {
            Object obj = this.appName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.appName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public ByteString getAppNameBytes() {
            Object obj = this.appName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public String getAppVer() {
            Object obj = this.appVer_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.appVer_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public ByteString getAppVerBytes() {
            Object obj = this.appVer_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appVer_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_App_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public Timestamp getFirstLaunchTime() {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.firstLaunchTimeBuilder_;
            if (e2Var != null) {
                return (Timestamp) e2Var.e();
            }
            Timestamp timestamp = this.firstLaunchTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public Timestamp.Builder getFirstLaunchTimeBuilder() {
            onChanged();
            return (Timestamp.Builder) getFirstLaunchTimeFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public n2 getFirstLaunchTimeOrBuilder() {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.firstLaunchTimeBuilder_;
            if (e2Var != null) {
                return (n2) e2Var.f();
            }
            Timestamp timestamp = this.firstLaunchTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public String getFmwname() {
            Object obj = this.fmwname_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.fmwname_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public ByteString getFmwnameBytes() {
            Object obj = this.fmwname_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.fmwname_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public Timestamp getInstallBeginServerTimestamp() {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.installBeginServerTimestampBuilder_;
            if (e2Var != null) {
                return (Timestamp) e2Var.e();
            }
            Timestamp timestamp = this.installBeginServerTimestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public Timestamp.Builder getInstallBeginServerTimestampBuilder() {
            onChanged();
            return (Timestamp.Builder) getInstallBeginServerTimestampFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public n2 getInstallBeginServerTimestampOrBuilder() {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.installBeginServerTimestampBuilder_;
            if (e2Var != null) {
                return (n2) e2Var.f();
            }
            Timestamp timestamp = this.installBeginServerTimestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public Timestamp getInstallReferrerClickServerTimestamp() {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.installReferrerClickServerTimestampBuilder_;
            if (e2Var != null) {
                return (Timestamp) e2Var.e();
            }
            Timestamp timestamp = this.installReferrerClickServerTimestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public Timestamp.Builder getInstallReferrerClickServerTimestampBuilder() {
            onChanged();
            return (Timestamp.Builder) getInstallReferrerClickServerTimestampFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public n2 getInstallReferrerClickServerTimestampOrBuilder() {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.installReferrerClickServerTimestampBuilder_;
            if (e2Var != null) {
                return (n2) e2Var.f();
            }
            Timestamp timestamp = this.installReferrerClickServerTimestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public Timestamp getInstallReferrerClickTimestamp() {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.installReferrerClickTimestampBuilder_;
            if (e2Var != null) {
                return (Timestamp) e2Var.e();
            }
            Timestamp timestamp = this.installReferrerClickTimestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public Timestamp.Builder getInstallReferrerClickTimestampBuilder() {
            onChanged();
            return (Timestamp.Builder) getInstallReferrerClickTimestampFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public n2 getInstallReferrerClickTimestampOrBuilder() {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.installReferrerClickTimestampBuilder_;
            if (e2Var != null) {
                return (n2) e2Var.f();
            }
            Timestamp timestamp = this.installReferrerClickTimestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public String getInstallReferrerUrl() {
            Object obj = this.installReferrerUrl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.installReferrerUrl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public ByteString getInstallReferrerUrlBytes() {
            Object obj = this.installReferrerUrl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.installReferrerUrl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public Timestamp getInstallTime() {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.installTimeBuilder_;
            if (e2Var != null) {
                return (Timestamp) e2Var.e();
            }
            Timestamp timestamp = this.installTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public Timestamp.Builder getInstallTimeBuilder() {
            onChanged();
            return (Timestamp.Builder) getInstallTimeFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public n2 getInstallTimeOrBuilder() {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.installTimeBuilder_;
            if (e2Var != null) {
                return (n2) e2Var.f();
            }
            Timestamp timestamp = this.installTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public String getInstallVersion() {
            Object obj = this.installVersion_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.installVersion_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public ByteString getInstallVersionBytes() {
            Object obj = this.installVersion_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.installVersion_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public boolean getIsGooglePlayInstant() {
            return this.isGooglePlayInstant_;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public com.explorestack.protobuf.adcom.Context.App.Release getRelease() {
            e2<com.explorestack.protobuf.adcom.Context.App.Release, com.explorestack.protobuf.adcom.Context.App.Release.Builder, com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder> e2Var = this.releaseBuilder_;
            if (e2Var != null) {
                return (com.explorestack.protobuf.adcom.Context.App.Release) e2Var.e();
            }
            com.explorestack.protobuf.adcom.Context.App.Release release = this.release_;
            return release == null ? com.explorestack.protobuf.adcom.Context.App.Release.getDefaultInstance() : release;
        }

        public com.explorestack.protobuf.adcom.Context.App.Release.Builder getReleaseBuilder() {
            onChanged();
            return (com.explorestack.protobuf.adcom.Context.App.Release.Builder) getReleaseFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder getReleaseOrBuilder() {
            e2<com.explorestack.protobuf.adcom.Context.App.Release, com.explorestack.protobuf.adcom.Context.App.Release.Builder, com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder> e2Var = this.releaseBuilder_;
            if (e2Var != null) {
                return (com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder) e2Var.f();
            }
            com.explorestack.protobuf.adcom.Context.App.Release release = this.release_;
            return release == null ? com.explorestack.protobuf.adcom.Context.App.Release.getDefaultInstance() : release;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public Timestamp getSdkInstallTime() {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.sdkInstallTimeBuilder_;
            if (e2Var != null) {
                return (Timestamp) e2Var.e();
            }
            Timestamp timestamp = this.sdkInstallTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public Timestamp.Builder getSdkInstallTimeBuilder() {
            onChanged();
            return (Timestamp.Builder) getSdkInstallTimeFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public n2 getSdkInstallTimeOrBuilder() {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.sdkInstallTimeBuilder_;
            if (e2Var != null) {
                return (n2) e2Var.f();
            }
            Timestamp timestamp = this.sdkInstallTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public String getStorecat() {
            Object obj = this.storecat_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.storecat_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public ByteString getStorecatBytes() {
            Object obj = this.storecat_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.storecat_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public String getStoresubcat(int i10) {
            return this.storesubcat_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public ByteString getStoresubcatBytes(int i10) {
            return this.storesubcat_.getByteString(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public int getStoresubcatCount() {
            return this.storesubcat_.size();
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public boolean hasFirstLaunchTime() {
            return (this.firstLaunchTimeBuilder_ == null && this.firstLaunchTime_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public boolean hasInstallBeginServerTimestamp() {
            return (this.installBeginServerTimestampBuilder_ == null && this.installBeginServerTimestamp_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public boolean hasInstallReferrerClickServerTimestamp() {
            return (this.installReferrerClickServerTimestampBuilder_ == null && this.installReferrerClickServerTimestamp_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public boolean hasInstallReferrerClickTimestamp() {
            return (this.installReferrerClickTimestampBuilder_ == null && this.installReferrerClickTimestamp_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public boolean hasInstallTime() {
            return (this.installTimeBuilder_ == null && this.installTime_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public boolean hasRelease() {
            return (this.releaseBuilder_ == null && this.release_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public boolean hasSdkInstallTime() {
            return (this.sdkInstallTimeBuilder_ == null && this.sdkInstallTime_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_App_fieldAccessorTable.d(App.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeFirstLaunchTime(Timestamp timestamp) {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.firstLaunchTimeBuilder_;
            if (e2Var == null) {
                Timestamp timestamp2 = this.firstLaunchTime_;
                if (timestamp2 != null) {
                    this.firstLaunchTime_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
                } else {
                    this.firstLaunchTime_ = timestamp;
                }
                onChanged();
            } else {
                e2Var.g(timestamp);
            }
            return this;
        }

        public Builder mergeInstallBeginServerTimestamp(Timestamp timestamp) {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.installBeginServerTimestampBuilder_;
            if (e2Var == null) {
                Timestamp timestamp2 = this.installBeginServerTimestamp_;
                if (timestamp2 != null) {
                    this.installBeginServerTimestamp_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
                } else {
                    this.installBeginServerTimestamp_ = timestamp;
                }
                onChanged();
            } else {
                e2Var.g(timestamp);
            }
            return this;
        }

        public Builder mergeInstallReferrerClickServerTimestamp(Timestamp timestamp) {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.installReferrerClickServerTimestampBuilder_;
            if (e2Var == null) {
                Timestamp timestamp2 = this.installReferrerClickServerTimestamp_;
                if (timestamp2 != null) {
                    this.installReferrerClickServerTimestamp_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
                } else {
                    this.installReferrerClickServerTimestamp_ = timestamp;
                }
                onChanged();
            } else {
                e2Var.g(timestamp);
            }
            return this;
        }

        public Builder mergeInstallReferrerClickTimestamp(Timestamp timestamp) {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.installReferrerClickTimestampBuilder_;
            if (e2Var == null) {
                Timestamp timestamp2 = this.installReferrerClickTimestamp_;
                if (timestamp2 != null) {
                    this.installReferrerClickTimestamp_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
                } else {
                    this.installReferrerClickTimestamp_ = timestamp;
                }
                onChanged();
            } else {
                e2Var.g(timestamp);
            }
            return this;
        }

        public Builder mergeInstallTime(Timestamp timestamp) {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.installTimeBuilder_;
            if (e2Var == null) {
                Timestamp timestamp2 = this.installTime_;
                if (timestamp2 != null) {
                    this.installTime_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
                } else {
                    this.installTime_ = timestamp;
                }
                onChanged();
            } else {
                e2Var.g(timestamp);
            }
            return this;
        }

        public Builder mergeRelease(com.explorestack.protobuf.adcom.Context.App.Release release) {
            e2<com.explorestack.protobuf.adcom.Context.App.Release, com.explorestack.protobuf.adcom.Context.App.Release.Builder, com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder> e2Var = this.releaseBuilder_;
            if (e2Var == null) {
                com.explorestack.protobuf.adcom.Context.App.Release release2 = this.release_;
                if (release2 != null) {
                    this.release_ = com.explorestack.protobuf.adcom.Context.App.Release.newBuilder(release2).mergeFrom(release).buildPartial();
                } else {
                    this.release_ = release;
                }
                onChanged();
            } else {
                e2Var.g(release);
            }
            return this;
        }

        public Builder mergeSdkInstallTime(Timestamp timestamp) {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.sdkInstallTimeBuilder_;
            if (e2Var == null) {
                Timestamp timestamp2 = this.sdkInstallTime_;
                if (timestamp2 != null) {
                    this.sdkInstallTime_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
                } else {
                    this.sdkInstallTime_ = timestamp;
                }
                onChanged();
            } else {
                e2Var.g(timestamp);
            }
            return this;
        }

        public Builder setAppName(String str) {
            str.getClass();
            this.appName_ = str;
            onChanged();
            return this;
        }

        public Builder setAppNameBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.appName_ = byteString;
            onChanged();
            return this;
        }

        public Builder setAppVer(String str) {
            str.getClass();
            this.appVer_ = str;
            onChanged();
            return this;
        }

        public Builder setAppVerBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.appVer_ = byteString;
            onChanged();
            return this;
        }

        public Builder setFirstLaunchTime(Timestamp timestamp) {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.firstLaunchTimeBuilder_;
            if (e2Var == null) {
                timestamp.getClass();
                this.firstLaunchTime_ = timestamp;
                onChanged();
            } else {
                e2Var.i(timestamp);
            }
            return this;
        }

        public Builder setFmwname(String str) {
            str.getClass();
            this.fmwname_ = str;
            onChanged();
            return this;
        }

        public Builder setFmwnameBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.fmwname_ = byteString;
            onChanged();
            return this;
        }

        public Builder setInstallBeginServerTimestamp(Timestamp timestamp) {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.installBeginServerTimestampBuilder_;
            if (e2Var == null) {
                timestamp.getClass();
                this.installBeginServerTimestamp_ = timestamp;
                onChanged();
            } else {
                e2Var.i(timestamp);
            }
            return this;
        }

        public Builder setInstallReferrerClickServerTimestamp(Timestamp timestamp) {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.installReferrerClickServerTimestampBuilder_;
            if (e2Var == null) {
                timestamp.getClass();
                this.installReferrerClickServerTimestamp_ = timestamp;
                onChanged();
            } else {
                e2Var.i(timestamp);
            }
            return this;
        }

        public Builder setInstallReferrerClickTimestamp(Timestamp timestamp) {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.installReferrerClickTimestampBuilder_;
            if (e2Var == null) {
                timestamp.getClass();
                this.installReferrerClickTimestamp_ = timestamp;
                onChanged();
            } else {
                e2Var.i(timestamp);
            }
            return this;
        }

        public Builder setInstallReferrerUrl(String str) {
            str.getClass();
            this.installReferrerUrl_ = str;
            onChanged();
            return this;
        }

        public Builder setInstallReferrerUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.installReferrerUrl_ = byteString;
            onChanged();
            return this;
        }

        public Builder setInstallTime(Timestamp timestamp) {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.installTimeBuilder_;
            if (e2Var == null) {
                timestamp.getClass();
                this.installTime_ = timestamp;
                onChanged();
            } else {
                e2Var.i(timestamp);
            }
            return this;
        }

        public Builder setInstallVersion(String str) {
            str.getClass();
            this.installVersion_ = str;
            onChanged();
            return this;
        }

        public Builder setInstallVersionBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.installVersion_ = byteString;
            onChanged();
            return this;
        }

        public Builder setIsGooglePlayInstant(boolean z10) {
            this.isGooglePlayInstant_ = z10;
            onChanged();
            return this;
        }

        public Builder setRelease(com.explorestack.protobuf.adcom.Context.App.Release release) {
            e2<com.explorestack.protobuf.adcom.Context.App.Release, com.explorestack.protobuf.adcom.Context.App.Release.Builder, com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder> e2Var = this.releaseBuilder_;
            if (e2Var == null) {
                release.getClass();
                this.release_ = release;
                onChanged();
            } else {
                e2Var.i(release);
            }
            return this;
        }

        public Builder setSdkInstallTime(Timestamp timestamp) {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.sdkInstallTimeBuilder_;
            if (e2Var == null) {
                timestamp.getClass();
                this.sdkInstallTime_ = timestamp;
                onChanged();
            } else {
                e2Var.i(timestamp);
            }
            return this;
        }

        public Builder setStorecat(String str) {
            str.getClass();
            this.storecat_ = str;
            onChanged();
            return this;
        }

        public Builder setStorecatBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.storecat_ = byteString;
            onChanged();
            return this;
        }

        public Builder setStoresubcat(int i10, String str) {
            str.getClass();
            ensureStoresubcatIsMutable();
            this.storesubcat_.set(i10, str);
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public w1 getStoresubcatList() {
            return this.storesubcat_.getUnmodifiableView();
        }

        private Builder() {
            this.appName_ = "";
            this.appVer_ = "";
            this.storecat_ = "";
            this.storesubcat_ = q0.f10776d;
            this.fmwname_ = "";
            this.installReferrerUrl_ = "";
            this.installVersion_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public App build() {
            App appBuildPartial = buildPartial();
            if (appBuildPartial.isInitialized()) {
                return appBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) appBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public App buildPartial() {
            App app = new App(this);
            app.appName_ = this.appName_;
            app.appVer_ = this.appVer_;
            e2<com.explorestack.protobuf.adcom.Context.App.Release, com.explorestack.protobuf.adcom.Context.App.Release.Builder, com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder> e2Var = this.releaseBuilder_;
            if (e2Var == null) {
                app.release_ = this.release_;
            } else {
                app.release_ = (com.explorestack.protobuf.adcom.Context.App.Release) e2Var.a();
            }
            e2<Timestamp, Timestamp.Builder, n2> e2Var2 = this.installTimeBuilder_;
            if (e2Var2 == null) {
                app.installTime_ = this.installTime_;
            } else {
                app.installTime_ = (Timestamp) e2Var2.a();
            }
            e2<Timestamp, Timestamp.Builder, n2> e2Var3 = this.firstLaunchTimeBuilder_;
            if (e2Var3 == null) {
                app.firstLaunchTime_ = this.firstLaunchTime_;
            } else {
                app.firstLaunchTime_ = (Timestamp) e2Var3.a();
            }
            app.storecat_ = this.storecat_;
            if ((this.bitField0_ & 1) != 0) {
                this.storesubcat_ = this.storesubcat_.getUnmodifiableView();
                this.bitField0_ &= -2;
            }
            app.storesubcat_ = this.storesubcat_;
            app.fmwname_ = this.fmwname_;
            app.installReferrerUrl_ = this.installReferrerUrl_;
            e2<Timestamp, Timestamp.Builder, n2> e2Var4 = this.installReferrerClickTimestampBuilder_;
            if (e2Var4 == null) {
                app.installReferrerClickTimestamp_ = this.installReferrerClickTimestamp_;
            } else {
                app.installReferrerClickTimestamp_ = (Timestamp) e2Var4.a();
            }
            e2<Timestamp, Timestamp.Builder, n2> e2Var5 = this.installReferrerClickServerTimestampBuilder_;
            if (e2Var5 == null) {
                app.installReferrerClickServerTimestamp_ = this.installReferrerClickServerTimestamp_;
            } else {
                app.installReferrerClickServerTimestamp_ = (Timestamp) e2Var5.a();
            }
            e2<Timestamp, Timestamp.Builder, n2> e2Var6 = this.installBeginServerTimestampBuilder_;
            if (e2Var6 == null) {
                app.installBeginServerTimestamp_ = this.installBeginServerTimestamp_;
            } else {
                app.installBeginServerTimestamp_ = (Timestamp) e2Var6.a();
            }
            app.installVersion_ = this.installVersion_;
            app.isGooglePlayInstant_ = this.isGooglePlayInstant_;
            e2<Timestamp, Timestamp.Builder, n2> e2Var7 = this.sdkInstallTimeBuilder_;
            if (e2Var7 == null) {
                app.sdkInstallTime_ = this.sdkInstallTime_;
            } else {
                app.sdkInstallTime_ = (Timestamp) e2Var7.a();
            }
            onBuilt();
            return app;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public App mo164getDefaultInstanceForType() {
            return App.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public final Builder setUnknownFields(u2 u2Var) {
            return (Builder) super.setUnknownFields(u2Var);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public final Builder mergeUnknownFields(u2 u2Var) {
            return (Builder) super.mergeUnknownFields(u2Var);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.appName_ = "";
            this.appVer_ = "";
            if (this.releaseBuilder_ == null) {
                this.release_ = null;
            } else {
                this.release_ = null;
                this.releaseBuilder_ = null;
            }
            if (this.installTimeBuilder_ == null) {
                this.installTime_ = null;
            } else {
                this.installTime_ = null;
                this.installTimeBuilder_ = null;
            }
            if (this.firstLaunchTimeBuilder_ == null) {
                this.firstLaunchTime_ = null;
            } else {
                this.firstLaunchTime_ = null;
                this.firstLaunchTimeBuilder_ = null;
            }
            this.storecat_ = "";
            this.storesubcat_ = q0.f10776d;
            this.bitField0_ &= -2;
            this.fmwname_ = "";
            this.installReferrerUrl_ = "";
            if (this.installReferrerClickTimestampBuilder_ == null) {
                this.installReferrerClickTimestamp_ = null;
            } else {
                this.installReferrerClickTimestamp_ = null;
                this.installReferrerClickTimestampBuilder_ = null;
            }
            if (this.installReferrerClickServerTimestampBuilder_ == null) {
                this.installReferrerClickServerTimestamp_ = null;
            } else {
                this.installReferrerClickServerTimestamp_ = null;
                this.installReferrerClickServerTimestampBuilder_ = null;
            }
            if (this.installBeginServerTimestampBuilder_ == null) {
                this.installBeginServerTimestamp_ = null;
            } else {
                this.installBeginServerTimestamp_ = null;
                this.installBeginServerTimestampBuilder_ = null;
            }
            this.installVersion_ = "";
            this.isGooglePlayInstant_ = false;
            if (this.sdkInstallTimeBuilder_ == null) {
                this.sdkInstallTime_ = null;
            } else {
                this.sdkInstallTime_ = null;
                this.sdkInstallTimeBuilder_ = null;
            }
            return this;
        }

        public Builder setFirstLaunchTime(Timestamp.Builder builder) {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.firstLaunchTimeBuilder_;
            if (e2Var == null) {
                this.firstLaunchTime_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setInstallBeginServerTimestamp(Timestamp.Builder builder) {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.installBeginServerTimestampBuilder_;
            if (e2Var == null) {
                this.installBeginServerTimestamp_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setInstallReferrerClickServerTimestamp(Timestamp.Builder builder) {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.installReferrerClickServerTimestampBuilder_;
            if (e2Var == null) {
                this.installReferrerClickServerTimestamp_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setInstallReferrerClickTimestamp(Timestamp.Builder builder) {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.installReferrerClickTimestampBuilder_;
            if (e2Var == null) {
                this.installReferrerClickTimestamp_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setInstallTime(Timestamp.Builder builder) {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.installTimeBuilder_;
            if (e2Var == null) {
                this.installTime_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setRelease(com.explorestack.protobuf.adcom.Context.App.Release.Builder builder) {
            e2<com.explorestack.protobuf.adcom.Context.App.Release, com.explorestack.protobuf.adcom.Context.App.Release.Builder, com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder> e2Var = this.releaseBuilder_;
            if (e2Var == null) {
                this.release_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setSdkInstallTime(Timestamp.Builder builder) {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.sdkInstallTimeBuilder_;
            if (e2Var == null) {
                this.sdkInstallTime_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
        /* JADX INFO: renamed from: clone */
        public Builder mo162clone() {
            return (Builder) super.mo162clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof App) {
                return mergeFrom((App) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(App app) {
            if (app == App.getDefaultInstance()) {
                return this;
            }
            if (!app.getAppName().isEmpty()) {
                this.appName_ = app.appName_;
                onChanged();
            }
            if (!app.getAppVer().isEmpty()) {
                this.appVer_ = app.appVer_;
                onChanged();
            }
            if (app.hasRelease()) {
                mergeRelease(app.getRelease());
            }
            if (app.hasInstallTime()) {
                mergeInstallTime(app.getInstallTime());
            }
            if (app.hasFirstLaunchTime()) {
                mergeFirstLaunchTime(app.getFirstLaunchTime());
            }
            if (!app.getStorecat().isEmpty()) {
                this.storecat_ = app.storecat_;
                onChanged();
            }
            if (!app.storesubcat_.isEmpty()) {
                if (this.storesubcat_.isEmpty()) {
                    this.storesubcat_ = app.storesubcat_;
                    this.bitField0_ &= -2;
                } else {
                    ensureStoresubcatIsMutable();
                    this.storesubcat_.addAll(app.storesubcat_);
                }
                onChanged();
            }
            if (!app.getFmwname().isEmpty()) {
                this.fmwname_ = app.fmwname_;
                onChanged();
            }
            if (!app.getInstallReferrerUrl().isEmpty()) {
                this.installReferrerUrl_ = app.installReferrerUrl_;
                onChanged();
            }
            if (app.hasInstallReferrerClickTimestamp()) {
                mergeInstallReferrerClickTimestamp(app.getInstallReferrerClickTimestamp());
            }
            if (app.hasInstallReferrerClickServerTimestamp()) {
                mergeInstallReferrerClickServerTimestamp(app.getInstallReferrerClickServerTimestamp());
            }
            if (app.hasInstallBeginServerTimestamp()) {
                mergeInstallBeginServerTimestamp(app.getInstallBeginServerTimestamp());
            }
            if (!app.getInstallVersion().isEmpty()) {
                this.installVersion_ = app.installVersion_;
                onChanged();
            }
            if (app.getIsGooglePlayInstant()) {
                setIsGooglePlayInstant(app.getIsGooglePlayInstant());
            }
            if (app.hasSdkInstallTime()) {
                mergeSdkInstallTime(app.getSdkInstallTime());
            }
            mergeUnknownFields(((j0) app).unknownFields);
            onChanged();
            return this;
        }

        private Builder(j0.c cVar) {
            super(cVar);
            this.appName_ = "";
            this.appVer_ = "";
            this.storecat_ = "";
            this.storesubcat_ = q0.f10776d;
            this.fmwname_ = "";
            this.installReferrerUrl_ = "";
            this.installVersion_ = "";
            maybeForceBuilderInitialization();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
            App app = null;
            try {
                try {
                    App app2 = (App) App.PARSER.parsePartialFrom(nVar, yVar);
                    if (app2 != null) {
                        mergeFrom(app2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    App app3 = (App) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        app = app3;
                        if (app != null) {
                            mergeFrom(app);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (app != null) {
                    mergeFrom(app);
                }
                throw th;
            }
        }
    }

    public static App getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_App_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static App parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (App) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static App parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<App> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof App)) {
            return super.equals(obj);
        }
        App app = (App) obj;
        if (!getAppName().equals(app.getAppName()) || !getAppVer().equals(app.getAppVer()) || hasRelease() != app.hasRelease()) {
            return false;
        }
        if ((hasRelease() && !getRelease().equals(app.getRelease())) || hasInstallTime() != app.hasInstallTime()) {
            return false;
        }
        if ((hasInstallTime() && !getInstallTime().equals(app.getInstallTime())) || hasFirstLaunchTime() != app.hasFirstLaunchTime()) {
            return false;
        }
        if ((hasFirstLaunchTime() && !getFirstLaunchTime().equals(app.getFirstLaunchTime())) || !getStorecat().equals(app.getStorecat()) || !getStoresubcatList().equals(app.getStoresubcatList()) || !getFmwname().equals(app.getFmwname()) || !getInstallReferrerUrl().equals(app.getInstallReferrerUrl()) || hasInstallReferrerClickTimestamp() != app.hasInstallReferrerClickTimestamp()) {
            return false;
        }
        if ((hasInstallReferrerClickTimestamp() && !getInstallReferrerClickTimestamp().equals(app.getInstallReferrerClickTimestamp())) || hasInstallReferrerClickServerTimestamp() != app.hasInstallReferrerClickServerTimestamp()) {
            return false;
        }
        if ((hasInstallReferrerClickServerTimestamp() && !getInstallReferrerClickServerTimestamp().equals(app.getInstallReferrerClickServerTimestamp())) || hasInstallBeginServerTimestamp() != app.hasInstallBeginServerTimestamp()) {
            return false;
        }
        if ((!hasInstallBeginServerTimestamp() || getInstallBeginServerTimestamp().equals(app.getInstallBeginServerTimestamp())) && getInstallVersion().equals(app.getInstallVersion()) && getIsGooglePlayInstant() == app.getIsGooglePlayInstant() && hasSdkInstallTime() == app.hasSdkInstallTime()) {
            return (!hasSdkInstallTime() || getSdkInstallTime().equals(app.getSdkInstallTime())) && this.unknownFields.equals(app.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public String getAppName() {
        Object obj = this.appName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.appName_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public ByteString getAppNameBytes() {
        Object obj = this.appName_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.appName_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public String getAppVer() {
        Object obj = this.appVer_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.appVer_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public ByteString getAppVerBytes() {
        Object obj = this.appVer_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.appVer_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public Timestamp getFirstLaunchTime() {
        Timestamp timestamp = this.firstLaunchTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public n2 getFirstLaunchTimeOrBuilder() {
        return getFirstLaunchTime();
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public String getFmwname() {
        Object obj = this.fmwname_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.fmwname_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public ByteString getFmwnameBytes() {
        Object obj = this.fmwname_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.fmwname_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public Timestamp getInstallBeginServerTimestamp() {
        Timestamp timestamp = this.installBeginServerTimestamp_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public n2 getInstallBeginServerTimestampOrBuilder() {
        return getInstallBeginServerTimestamp();
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public Timestamp getInstallReferrerClickServerTimestamp() {
        Timestamp timestamp = this.installReferrerClickServerTimestamp_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public n2 getInstallReferrerClickServerTimestampOrBuilder() {
        return getInstallReferrerClickServerTimestamp();
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public Timestamp getInstallReferrerClickTimestamp() {
        Timestamp timestamp = this.installReferrerClickTimestamp_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public n2 getInstallReferrerClickTimestampOrBuilder() {
        return getInstallReferrerClickTimestamp();
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public String getInstallReferrerUrl() {
        Object obj = this.installReferrerUrl_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.installReferrerUrl_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public ByteString getInstallReferrerUrlBytes() {
        Object obj = this.installReferrerUrl_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.installReferrerUrl_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public Timestamp getInstallTime() {
        Timestamp timestamp = this.installTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public n2 getInstallTimeOrBuilder() {
        return getInstallTime();
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public String getInstallVersion() {
        Object obj = this.installVersion_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.installVersion_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public ByteString getInstallVersionBytes() {
        Object obj = this.installVersion_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.installVersion_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public boolean getIsGooglePlayInstant() {
        return this.isGooglePlayInstant_;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<App> getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public com.explorestack.protobuf.adcom.Context.App.Release getRelease() {
        com.explorestack.protobuf.adcom.Context.App.Release release = this.release_;
        return release == null ? com.explorestack.protobuf.adcom.Context.App.Release.getDefaultInstance() : release;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder getReleaseOrBuilder() {
        return getRelease();
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public Timestamp getSdkInstallTime() {
        Timestamp timestamp = this.sdkInstallTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public n2 getSdkInstallTimeOrBuilder() {
        return getSdkInstallTime();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getAppNameBytes().isEmpty() ? j0.computeStringSize(1, this.appName_) + 0 : 0;
        if (!getAppVerBytes().isEmpty()) {
            iComputeStringSize += j0.computeStringSize(2, this.appVer_);
        }
        if (this.release_ != null) {
            iComputeStringSize += CodedOutputStream.G(3, getRelease());
        }
        if (this.installTime_ != null) {
            iComputeStringSize += CodedOutputStream.G(4, getInstallTime());
        }
        if (this.firstLaunchTime_ != null) {
            iComputeStringSize += CodedOutputStream.G(5, getFirstLaunchTime());
        }
        if (!getStorecatBytes().isEmpty()) {
            iComputeStringSize += j0.computeStringSize(6, this.storecat_);
        }
        int iComputeStringSizeNoTag = 0;
        for (int i11 = 0; i11 < this.storesubcat_.size(); i11++) {
            iComputeStringSizeNoTag += j0.computeStringSizeNoTag(this.storesubcat_.getRaw(i11));
        }
        int size = iComputeStringSize + iComputeStringSizeNoTag + (getStoresubcatList().size() * 1);
        if (!getFmwnameBytes().isEmpty()) {
            size += j0.computeStringSize(8, this.fmwname_);
        }
        if (!getInstallReferrerUrlBytes().isEmpty()) {
            size += j0.computeStringSize(9, this.installReferrerUrl_);
        }
        if (this.installReferrerClickTimestamp_ != null) {
            size += CodedOutputStream.G(10, getInstallReferrerClickTimestamp());
        }
        if (this.installReferrerClickServerTimestamp_ != null) {
            size += CodedOutputStream.G(12, getInstallReferrerClickServerTimestamp());
        }
        if (this.installBeginServerTimestamp_ != null) {
            size += CodedOutputStream.G(13, getInstallBeginServerTimestamp());
        }
        if (!getInstallVersionBytes().isEmpty()) {
            size += j0.computeStringSize(14, this.installVersion_);
        }
        boolean z10 = this.isGooglePlayInstant_;
        if (z10) {
            size += CodedOutputStream.e(15, z10);
        }
        if (this.sdkInstallTime_ != null) {
            size += CodedOutputStream.G(16, getSdkInstallTime());
        }
        int serializedSize = size + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public String getStorecat() {
        Object obj = this.storecat_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.storecat_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public ByteString getStorecatBytes() {
        Object obj = this.storecat_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.storecat_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public String getStoresubcat(int i10) {
        return this.storesubcat_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public ByteString getStoresubcatBytes(int i10) {
        return this.storesubcat_.getByteString(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public int getStoresubcatCount() {
        return this.storesubcat_.size();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
    public final u2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public boolean hasFirstLaunchTime() {
        return this.firstLaunchTime_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public boolean hasInstallBeginServerTimestamp() {
        return this.installBeginServerTimestamp_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public boolean hasInstallReferrerClickServerTimestamp() {
        return this.installReferrerClickServerTimestamp_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public boolean hasInstallReferrerClickTimestamp() {
        return this.installReferrerClickTimestamp_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public boolean hasInstallTime() {
        return this.installTime_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public boolean hasRelease() {
        return this.release_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public boolean hasSdkInstallTime() {
        return this.sdkInstallTime_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAppName().hashCode()) * 37) + 2) * 53) + getAppVer().hashCode();
        if (hasRelease()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getRelease().hashCode();
        }
        if (hasInstallTime()) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + getInstallTime().hashCode();
        }
        if (hasFirstLaunchTime()) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + getFirstLaunchTime().hashCode();
        }
        int iHashCode2 = (((iHashCode * 37) + 6) * 53) + getStorecat().hashCode();
        if (getStoresubcatCount() > 0) {
            iHashCode2 = (((iHashCode2 * 37) + 7) * 53) + getStoresubcatList().hashCode();
        }
        int iHashCode3 = (((((((iHashCode2 * 37) + 8) * 53) + getFmwname().hashCode()) * 37) + 9) * 53) + getInstallReferrerUrl().hashCode();
        if (hasInstallReferrerClickTimestamp()) {
            iHashCode3 = (((iHashCode3 * 37) + 10) * 53) + getInstallReferrerClickTimestamp().hashCode();
        }
        if (hasInstallReferrerClickServerTimestamp()) {
            iHashCode3 = (((iHashCode3 * 37) + 12) * 53) + getInstallReferrerClickServerTimestamp().hashCode();
        }
        if (hasInstallBeginServerTimestamp()) {
            iHashCode3 = (((iHashCode3 * 37) + 13) * 53) + getInstallBeginServerTimestamp().hashCode();
        }
        int iHashCode4 = (((((((iHashCode3 * 37) + 14) * 53) + getInstallVersion().hashCode()) * 37) + 15) * 53) + l0.d(getIsGooglePlayInstant());
        if (hasSdkInstallTime()) {
            iHashCode4 = (((iHashCode4 * 37) + 16) * 53) + getSdkInstallTime().hashCode();
        }
        int iHashCode5 = (iHashCode4 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_App_fieldAccessorTable.d(App.class, Builder.class);
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.memoizedIsInitialized;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.j0
    protected Object newInstance(j0.g gVar) {
        return new App();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getAppNameBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 1, this.appName_);
        }
        if (!getAppVerBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 2, this.appVer_);
        }
        if (this.release_ != null) {
            codedOutputStream.L0(3, getRelease());
        }
        if (this.installTime_ != null) {
            codedOutputStream.L0(4, getInstallTime());
        }
        if (this.firstLaunchTime_ != null) {
            codedOutputStream.L0(5, getFirstLaunchTime());
        }
        if (!getStorecatBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 6, this.storecat_);
        }
        for (int i10 = 0; i10 < this.storesubcat_.size(); i10++) {
            j0.writeString(codedOutputStream, 7, this.storesubcat_.getRaw(i10));
        }
        if (!getFmwnameBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 8, this.fmwname_);
        }
        if (!getInstallReferrerUrlBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 9, this.installReferrerUrl_);
        }
        if (this.installReferrerClickTimestamp_ != null) {
            codedOutputStream.L0(10, getInstallReferrerClickTimestamp());
        }
        if (this.installReferrerClickServerTimestamp_ != null) {
            codedOutputStream.L0(12, getInstallReferrerClickServerTimestamp());
        }
        if (this.installBeginServerTimestamp_ != null) {
            codedOutputStream.L0(13, getInstallBeginServerTimestamp());
        }
        if (!getInstallVersionBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 14, this.installVersion_);
        }
        boolean z10 = this.isGooglePlayInstant_;
        if (z10) {
            codedOutputStream.n0(15, z10);
        }
        if (this.sdkInstallTime_ != null) {
            codedOutputStream.L0(16, getSdkInstallTime());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static Builder newBuilder(App app) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(app);
    }

    public static App parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public w1 getStoresubcatList() {
        return this.storesubcat_;
    }

    private App(j0.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static App parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (App) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static App parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public App mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static App parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private App() {
        this.memoizedIsInitialized = (byte) -1;
        this.appName_ = "";
        this.appVer_ = "";
        this.storecat_ = "";
        this.storesubcat_ = q0.f10776d;
        this.fmwname_ = "";
        this.installReferrerUrl_ = "";
        this.installVersion_ = "";
    }

    public static App parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    public static App parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    public static App parseFrom(InputStream inputStream) throws IOException {
        return (App) j0.parseWithIOException(PARSER, inputStream);
    }

    public static App parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (App) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    public static App parseFrom(n nVar) throws IOException {
        return (App) j0.parseWithIOException(PARSER, nVar);
    }

    public static App parseFrom(n nVar, y yVar) throws IOException {
        return (App) j0.parseWithIOException(PARSER, nVar, yVar);
    }

    private App(n nVar, y yVar) throws InvalidProtocolBufferException {
        this();
        yVar.getClass();
        u2.b bVarG = u2.g();
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iK = nVar.K();
                    switch (iK) {
                        case 0:
                            break;
                        case 10:
                            this.appName_ = nVar.J();
                            continue;
                        case 18:
                            this.appVer_ = nVar.J();
                            continue;
                        case 26:
                            com.explorestack.protobuf.adcom.Context.App.Release release = this.release_;
                            com.explorestack.protobuf.adcom.Context.App.Release.Builder builder = release != null ? release.toBuilder() : null;
                            com.explorestack.protobuf.adcom.Context.App.Release release2 = (com.explorestack.protobuf.adcom.Context.App.Release) nVar.A(com.explorestack.protobuf.adcom.Context.App.Release.parser(), yVar);
                            this.release_ = release2;
                            if (builder != null) {
                                builder.mergeFrom(release2);
                                this.release_ = builder.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 34:
                            Timestamp timestamp = this.installTime_;
                            Timestamp.Builder builder2 = timestamp != null ? timestamp.toBuilder() : null;
                            Timestamp timestamp2 = (Timestamp) nVar.A(Timestamp.parser(), yVar);
                            this.installTime_ = timestamp2;
                            if (builder2 != null) {
                                builder2.mergeFrom(timestamp2);
                                this.installTime_ = builder2.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 42:
                            Timestamp timestamp3 = this.firstLaunchTime_;
                            Timestamp.Builder builder3 = timestamp3 != null ? timestamp3.toBuilder() : null;
                            Timestamp timestamp4 = (Timestamp) nVar.A(Timestamp.parser(), yVar);
                            this.firstLaunchTime_ = timestamp4;
                            if (builder3 != null) {
                                builder3.mergeFrom(timestamp4);
                                this.firstLaunchTime_ = builder3.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 50:
                            this.storecat_ = nVar.J();
                            continue;
                        case 58:
                            String strJ = nVar.J();
                            boolean z12 = (z11 ? 1 : 0) & true;
                            z11 = z11;
                            if (!z12) {
                                this.storesubcat_ = new q0();
                                z11 = (z11 ? 1 : 0) | true;
                            }
                            this.storesubcat_.add(strJ);
                            continue;
                        case 66:
                            this.fmwname_ = nVar.J();
                            continue;
                        case 74:
                            this.installReferrerUrl_ = nVar.J();
                            continue;
                        case 82:
                            Timestamp timestamp5 = this.installReferrerClickTimestamp_;
                            Timestamp.Builder builder4 = timestamp5 != null ? timestamp5.toBuilder() : null;
                            Timestamp timestamp6 = (Timestamp) nVar.A(Timestamp.parser(), yVar);
                            this.installReferrerClickTimestamp_ = timestamp6;
                            if (builder4 != null) {
                                builder4.mergeFrom(timestamp6);
                                this.installReferrerClickTimestamp_ = builder4.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 98:
                            Timestamp timestamp7 = this.installReferrerClickServerTimestamp_;
                            Timestamp.Builder builder5 = timestamp7 != null ? timestamp7.toBuilder() : null;
                            Timestamp timestamp8 = (Timestamp) nVar.A(Timestamp.parser(), yVar);
                            this.installReferrerClickServerTimestamp_ = timestamp8;
                            if (builder5 != null) {
                                builder5.mergeFrom(timestamp8);
                                this.installReferrerClickServerTimestamp_ = builder5.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 106:
                            Timestamp timestamp9 = this.installBeginServerTimestamp_;
                            Timestamp.Builder builder6 = timestamp9 != null ? timestamp9.toBuilder() : null;
                            Timestamp timestamp10 = (Timestamp) nVar.A(Timestamp.parser(), yVar);
                            this.installBeginServerTimestamp_ = timestamp10;
                            if (builder6 != null) {
                                builder6.mergeFrom(timestamp10);
                                this.installBeginServerTimestamp_ = builder6.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 114:
                            this.installVersion_ = nVar.J();
                            continue;
                        case 120:
                            this.isGooglePlayInstant_ = nVar.q();
                            continue;
                        case MRAID_DOWNLOAD_JS_ERROR_VALUE:
                            Timestamp timestamp11 = this.sdkInstallTime_;
                            Timestamp.Builder builder7 = timestamp11 != null ? timestamp11.toBuilder() : null;
                            Timestamp timestamp12 = (Timestamp) nVar.A(Timestamp.parser(), yVar);
                            this.sdkInstallTime_ = timestamp12;
                            if (builder7 != null) {
                                builder7.mergeFrom(timestamp12);
                                this.sdkInstallTime_ = builder7.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        default:
                            if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                break;
                            }
                            break;
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                if ((z11 ? 1 : 0) & true) {
                    this.storesubcat_ = this.storesubcat_.getUnmodifiableView();
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if ((z11 ? 1 : 0) & true) {
            this.storesubcat_ = this.storesubcat_.getUnmodifiableView();
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }
}
