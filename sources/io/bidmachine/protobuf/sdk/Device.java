package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.BoolValue;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.e2;
import com.explorestack.protobuf.h2;
import com.explorestack.protobuf.i;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.l0;
import com.explorestack.protobuf.n;
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
public final class Device extends j0 implements DeviceOrBuilder {
    public static final int ACCESS_FIELD_NUMBER = 19;
    public static final int AIRPLANE_FIELD_NUMBER = 12;
    public static final int APILEVEL_FIELD_NUMBER = 31;
    public static final int ATTS_FIELD_NUMBER = 22;
    public static final int AUDIOCONTEXT_FIELD_NUMBER = 24;
    public static final int BATTERYLEVEL_FIELD_NUMBER = 9;
    public static final int BATTERYSAVER_FIELD_NUMBER = 10;
    public static final int BM_IFV_FIELD_NUMBER = 2;
    public static final int CHARGING_FIELD_NUMBER = 7;
    public static final int CONNECTION_FIELD_NUMBER = 23;
    public static final int CPUNAME_FIELD_NUMBER = 25;
    public static final int CPUVENDOR_FIELD_NUMBER = 26;
    public static final int DARKMODE_FIELD_NUMBER = 11;
    public static final int DEVICENAME_FIELD_NUMBER = 14;
    public static final int DISKSPACE_FIELD_NUMBER = 4;
    public static final int DND_FIELD_NUMBER = 13;
    public static final int FREEMEM_FIELD_NUMBER = 30;
    public static final int GPUNAME_FIELD_NUMBER = 27;
    public static final int GPUVENDOR_FIELD_NUMBER = 28;
    public static final int HEADSETNAME_FIELD_NUMBER = 20;
    public static final int HEADSET_FIELD_NUMBER = 8;
    public static final int IFV_FIELD_NUMBER = 1;
    public static final int INPUTLANGUAGE_FIELD_NUMBER = 3;
    public static final int JAILBREAK_FIELD_NUMBER = 17;
    public static final int LASTBOOTUP_FIELD_NUMBER = 18;
    public static final int NETWORKROAMING_FIELD_NUMBER = 34;
    public static final int RINGMUTE_FIELD_NUMBER = 6;
    public static final int SCREENBRIGHT_FIELD_NUMBER = 16;
    public static final int SIMCARRIER_FIELD_NUMBER = 32;
    public static final int SIMCOUNTRY_FIELD_NUMBER = 33;
    public static final int TIMEZONE_FIELD_NUMBER = 29;
    public static final int TIME_FIELD_NUMBER = 15;
    public static final int TOTALDISK_FIELD_NUMBER = 5;
    public static final int TOTALMEM_FIELD_NUMBER = 21;
    private static final long serialVersionUID = 0;
    private volatile Object access_;
    private boolean airplane_;
    private int apilevel_;
    private int atts_;
    private com.explorestack.protobuf.adcom.Context.Device.AudioContext audioContext_;
    private float batterylevel_;
    private boolean batterysaver_;
    private volatile Object bmIfv_;
    private boolean charging_;
    private com.explorestack.protobuf.adcom.Context.Device.Connection connection_;
    private volatile Object cpuname_;
    private volatile Object cpuvendor_;
    private boolean darkmode_;
    private volatile Object devicename_;
    private long diskspace_;
    private boolean dnd_;
    private long freemem_;
    private volatile Object gpuname_;
    private volatile Object gpuvendor_;
    private boolean headset_;
    private volatile Object headsetname_;
    private volatile Object ifv_;
    private r0 inputlanguage_;
    private boolean jailbreak_;
    private long lastbootup_;
    private byte memoizedIsInitialized;
    private BoolValue networkRoaming_;
    private boolean ringmute_;
    private float screenbright_;
    private StringValue simCarrier_;
    private StringValue simCountry_;
    private long time_;
    private volatile Object timezone_;
    private long totaldisk_;
    private long totalmem_;
    private static final Device DEFAULT_INSTANCE = new Device();
    private static final s1<Device> PARSER = new b<Device>() { // from class: io.bidmachine.protobuf.sdk.Device.1
        @Override // com.explorestack.protobuf.s1
        public Device parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new Device(nVar, yVar);
        }
    };

    public static final class Builder extends j0.b<Builder> implements DeviceOrBuilder {
        private Object access_;
        private boolean airplane_;
        private int apilevel_;
        private int atts_;
        private e2<com.explorestack.protobuf.adcom.Context.Device.AudioContext, com.explorestack.protobuf.adcom.Context.Device.AudioContext.Builder, com.explorestack.protobuf.adcom.Context.Device.AudioContextOrBuilder> audioContextBuilder_;
        private com.explorestack.protobuf.adcom.Context.Device.AudioContext audioContext_;
        private float batterylevel_;
        private boolean batterysaver_;
        private int bitField0_;
        private Object bmIfv_;
        private boolean charging_;
        private e2<com.explorestack.protobuf.adcom.Context.Device.Connection, com.explorestack.protobuf.adcom.Context.Device.Connection.Builder, com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder> connectionBuilder_;
        private com.explorestack.protobuf.adcom.Context.Device.Connection connection_;
        private Object cpuname_;
        private Object cpuvendor_;
        private boolean darkmode_;
        private Object devicename_;
        private long diskspace_;
        private boolean dnd_;
        private long freemem_;
        private Object gpuname_;
        private Object gpuvendor_;
        private boolean headset_;
        private Object headsetname_;
        private Object ifv_;
        private r0 inputlanguage_;
        private boolean jailbreak_;
        private long lastbootup_;
        private e2<BoolValue, BoolValue.Builder, i> networkRoamingBuilder_;
        private BoolValue networkRoaming_;
        private boolean ringmute_;
        private float screenbright_;
        private e2<StringValue, StringValue.Builder, h2> simCarrierBuilder_;
        private StringValue simCarrier_;
        private e2<StringValue, StringValue.Builder, h2> simCountryBuilder_;
        private StringValue simCountry_;
        private long time_;
        private Object timezone_;
        private long totaldisk_;
        private long totalmem_;

        private void ensureInputlanguageIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.inputlanguage_ = new q0(this.inputlanguage_);
                this.bitField0_ |= 1;
            }
        }

        private e2<com.explorestack.protobuf.adcom.Context.Device.AudioContext, com.explorestack.protobuf.adcom.Context.Device.AudioContext.Builder, com.explorestack.protobuf.adcom.Context.Device.AudioContextOrBuilder> getAudioContextFieldBuilder() {
            if (this.audioContextBuilder_ == null) {
                this.audioContextBuilder_ = new e2<>(getAudioContext(), getParentForChildren(), isClean());
                this.audioContext_ = null;
            }
            return this.audioContextBuilder_;
        }

        private e2<com.explorestack.protobuf.adcom.Context.Device.Connection, com.explorestack.protobuf.adcom.Context.Device.Connection.Builder, com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder> getConnectionFieldBuilder() {
            if (this.connectionBuilder_ == null) {
                this.connectionBuilder_ = new e2<>(getConnection(), getParentForChildren(), isClean());
                this.connection_ = null;
            }
            return this.connectionBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Device_descriptor;
        }

        private e2<BoolValue, BoolValue.Builder, i> getNetworkRoamingFieldBuilder() {
            if (this.networkRoamingBuilder_ == null) {
                this.networkRoamingBuilder_ = new e2<>(getNetworkRoaming(), getParentForChildren(), isClean());
                this.networkRoaming_ = null;
            }
            return this.networkRoamingBuilder_;
        }

        private e2<StringValue, StringValue.Builder, h2> getSimCarrierFieldBuilder() {
            if (this.simCarrierBuilder_ == null) {
                this.simCarrierBuilder_ = new e2<>(getSimCarrier(), getParentForChildren(), isClean());
                this.simCarrier_ = null;
            }
            return this.simCarrierBuilder_;
        }

        private e2<StringValue, StringValue.Builder, h2> getSimCountryFieldBuilder() {
            if (this.simCountryBuilder_ == null) {
                this.simCountryBuilder_ = new e2<>(getSimCountry(), getParentForChildren(), isClean());
                this.simCountry_ = null;
            }
            return this.simCountryBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = j0.alwaysUseFieldBuilders;
        }

        public Builder addAllInputlanguage(Iterable<String> iterable) {
            ensureInputlanguageIsMutable();
            a.AbstractC0128a.addAll((Iterable) iterable, (List) this.inputlanguage_);
            onChanged();
            return this;
        }

        public Builder addInputlanguage(String str) {
            str.getClass();
            ensureInputlanguageIsMutable();
            this.inputlanguage_.add(str);
            onChanged();
            return this;
        }

        public Builder addInputlanguageBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            ensureInputlanguageIsMutable();
            this.inputlanguage_.b(byteString);
            onChanged();
            return this;
        }

        public Builder clearAccess() {
            this.access_ = Device.getDefaultInstance().getAccess();
            onChanged();
            return this;
        }

        public Builder clearAirplane() {
            this.airplane_ = false;
            onChanged();
            return this;
        }

        public Builder clearApilevel() {
            this.apilevel_ = 0;
            onChanged();
            return this;
        }

        public Builder clearAtts() {
            this.atts_ = 0;
            onChanged();
            return this;
        }

        public Builder clearAudioContext() {
            if (this.audioContextBuilder_ == null) {
                this.audioContext_ = null;
                onChanged();
            } else {
                this.audioContext_ = null;
                this.audioContextBuilder_ = null;
            }
            return this;
        }

        public Builder clearBatterylevel() {
            this.batterylevel_ = 0.0f;
            onChanged();
            return this;
        }

        public Builder clearBatterysaver() {
            this.batterysaver_ = false;
            onChanged();
            return this;
        }

        public Builder clearBmIfv() {
            this.bmIfv_ = Device.getDefaultInstance().getBmIfv();
            onChanged();
            return this;
        }

        public Builder clearCharging() {
            this.charging_ = false;
            onChanged();
            return this;
        }

        public Builder clearConnection() {
            if (this.connectionBuilder_ == null) {
                this.connection_ = null;
                onChanged();
            } else {
                this.connection_ = null;
                this.connectionBuilder_ = null;
            }
            return this;
        }

        public Builder clearCpuname() {
            this.cpuname_ = Device.getDefaultInstance().getCpuname();
            onChanged();
            return this;
        }

        public Builder clearCpuvendor() {
            this.cpuvendor_ = Device.getDefaultInstance().getCpuvendor();
            onChanged();
            return this;
        }

        public Builder clearDarkmode() {
            this.darkmode_ = false;
            onChanged();
            return this;
        }

        public Builder clearDevicename() {
            this.devicename_ = Device.getDefaultInstance().getDevicename();
            onChanged();
            return this;
        }

        public Builder clearDiskspace() {
            this.diskspace_ = 0L;
            onChanged();
            return this;
        }

        public Builder clearDnd() {
            this.dnd_ = false;
            onChanged();
            return this;
        }

        public Builder clearFreemem() {
            this.freemem_ = 0L;
            onChanged();
            return this;
        }

        public Builder clearGpuname() {
            this.gpuname_ = Device.getDefaultInstance().getGpuname();
            onChanged();
            return this;
        }

        public Builder clearGpuvendor() {
            this.gpuvendor_ = Device.getDefaultInstance().getGpuvendor();
            onChanged();
            return this;
        }

        public Builder clearHeadset() {
            this.headset_ = false;
            onChanged();
            return this;
        }

        public Builder clearHeadsetname() {
            this.headsetname_ = Device.getDefaultInstance().getHeadsetname();
            onChanged();
            return this;
        }

        public Builder clearIfv() {
            this.ifv_ = Device.getDefaultInstance().getIfv();
            onChanged();
            return this;
        }

        public Builder clearInputlanguage() {
            this.inputlanguage_ = q0.f10776d;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder clearJailbreak() {
            this.jailbreak_ = false;
            onChanged();
            return this;
        }

        public Builder clearLastbootup() {
            this.lastbootup_ = 0L;
            onChanged();
            return this;
        }

        public Builder clearNetworkRoaming() {
            if (this.networkRoamingBuilder_ == null) {
                this.networkRoaming_ = null;
                onChanged();
            } else {
                this.networkRoaming_ = null;
                this.networkRoamingBuilder_ = null;
            }
            return this;
        }

        public Builder clearRingmute() {
            this.ringmute_ = false;
            onChanged();
            return this;
        }

        public Builder clearScreenbright() {
            this.screenbright_ = 0.0f;
            onChanged();
            return this;
        }

        public Builder clearSimCarrier() {
            if (this.simCarrierBuilder_ == null) {
                this.simCarrier_ = null;
                onChanged();
            } else {
                this.simCarrier_ = null;
                this.simCarrierBuilder_ = null;
            }
            return this;
        }

        public Builder clearSimCountry() {
            if (this.simCountryBuilder_ == null) {
                this.simCountry_ = null;
                onChanged();
            } else {
                this.simCountry_ = null;
                this.simCountryBuilder_ = null;
            }
            return this;
        }

        public Builder clearTime() {
            this.time_ = 0L;
            onChanged();
            return this;
        }

        public Builder clearTimezone() {
            this.timezone_ = Device.getDefaultInstance().getTimezone();
            onChanged();
            return this;
        }

        public Builder clearTotaldisk() {
            this.totaldisk_ = 0L;
            onChanged();
            return this;
        }

        public Builder clearTotalmem() {
            this.totalmem_ = 0L;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public String getAccess() {
            Object obj = this.access_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.access_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public ByteString getAccessBytes() {
            Object obj = this.access_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.access_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public boolean getAirplane() {
            return this.airplane_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public int getApilevel() {
            return this.apilevel_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public int getAtts() {
            return this.atts_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public com.explorestack.protobuf.adcom.Context.Device.AudioContext getAudioContext() {
            e2<com.explorestack.protobuf.adcom.Context.Device.AudioContext, com.explorestack.protobuf.adcom.Context.Device.AudioContext.Builder, com.explorestack.protobuf.adcom.Context.Device.AudioContextOrBuilder> e2Var = this.audioContextBuilder_;
            if (e2Var != null) {
                return (com.explorestack.protobuf.adcom.Context.Device.AudioContext) e2Var.e();
            }
            com.explorestack.protobuf.adcom.Context.Device.AudioContext audioContext = this.audioContext_;
            return audioContext == null ? com.explorestack.protobuf.adcom.Context.Device.AudioContext.getDefaultInstance() : audioContext;
        }

        public com.explorestack.protobuf.adcom.Context.Device.AudioContext.Builder getAudioContextBuilder() {
            onChanged();
            return (com.explorestack.protobuf.adcom.Context.Device.AudioContext.Builder) getAudioContextFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public com.explorestack.protobuf.adcom.Context.Device.AudioContextOrBuilder getAudioContextOrBuilder() {
            e2<com.explorestack.protobuf.adcom.Context.Device.AudioContext, com.explorestack.protobuf.adcom.Context.Device.AudioContext.Builder, com.explorestack.protobuf.adcom.Context.Device.AudioContextOrBuilder> e2Var = this.audioContextBuilder_;
            if (e2Var != null) {
                return (com.explorestack.protobuf.adcom.Context.Device.AudioContextOrBuilder) e2Var.f();
            }
            com.explorestack.protobuf.adcom.Context.Device.AudioContext audioContext = this.audioContext_;
            return audioContext == null ? com.explorestack.protobuf.adcom.Context.Device.AudioContext.getDefaultInstance() : audioContext;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public float getBatterylevel() {
            return this.batterylevel_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public boolean getBatterysaver() {
            return this.batterysaver_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public String getBmIfv() {
            Object obj = this.bmIfv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bmIfv_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public ByteString getBmIfvBytes() {
            Object obj = this.bmIfv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bmIfv_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public boolean getCharging() {
            return this.charging_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public com.explorestack.protobuf.adcom.Context.Device.Connection getConnection() {
            e2<com.explorestack.protobuf.adcom.Context.Device.Connection, com.explorestack.protobuf.adcom.Context.Device.Connection.Builder, com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder> e2Var = this.connectionBuilder_;
            if (e2Var != null) {
                return (com.explorestack.protobuf.adcom.Context.Device.Connection) e2Var.e();
            }
            com.explorestack.protobuf.adcom.Context.Device.Connection connection = this.connection_;
            return connection == null ? com.explorestack.protobuf.adcom.Context.Device.Connection.getDefaultInstance() : connection;
        }

        public com.explorestack.protobuf.adcom.Context.Device.Connection.Builder getConnectionBuilder() {
            onChanged();
            return (com.explorestack.protobuf.adcom.Context.Device.Connection.Builder) getConnectionFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder getConnectionOrBuilder() {
            e2<com.explorestack.protobuf.adcom.Context.Device.Connection, com.explorestack.protobuf.adcom.Context.Device.Connection.Builder, com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder> e2Var = this.connectionBuilder_;
            if (e2Var != null) {
                return (com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder) e2Var.f();
            }
            com.explorestack.protobuf.adcom.Context.Device.Connection connection = this.connection_;
            return connection == null ? com.explorestack.protobuf.adcom.Context.Device.Connection.getDefaultInstance() : connection;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public String getCpuname() {
            Object obj = this.cpuname_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.cpuname_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public ByteString getCpunameBytes() {
            Object obj = this.cpuname_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.cpuname_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public String getCpuvendor() {
            Object obj = this.cpuvendor_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.cpuvendor_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public ByteString getCpuvendorBytes() {
            Object obj = this.cpuvendor_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.cpuvendor_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public boolean getDarkmode() {
            return this.darkmode_;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Device_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public String getDevicename() {
            Object obj = this.devicename_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.devicename_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public ByteString getDevicenameBytes() {
            Object obj = this.devicename_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.devicename_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public long getDiskspace() {
            return this.diskspace_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public boolean getDnd() {
            return this.dnd_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public long getFreemem() {
            return this.freemem_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public String getGpuname() {
            Object obj = this.gpuname_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.gpuname_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public ByteString getGpunameBytes() {
            Object obj = this.gpuname_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.gpuname_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public String getGpuvendor() {
            Object obj = this.gpuvendor_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.gpuvendor_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public ByteString getGpuvendorBytes() {
            Object obj = this.gpuvendor_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.gpuvendor_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public boolean getHeadset() {
            return this.headset_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public String getHeadsetname() {
            Object obj = this.headsetname_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.headsetname_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public ByteString getHeadsetnameBytes() {
            Object obj = this.headsetname_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.headsetname_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public String getIfv() {
            Object obj = this.ifv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ifv_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public ByteString getIfvBytes() {
            Object obj = this.ifv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ifv_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public String getInputlanguage(int i10) {
            return this.inputlanguage_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public ByteString getInputlanguageBytes(int i10) {
            return this.inputlanguage_.getByteString(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public int getInputlanguageCount() {
            return this.inputlanguage_.size();
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public boolean getJailbreak() {
            return this.jailbreak_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public long getLastbootup() {
            return this.lastbootup_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public BoolValue getNetworkRoaming() {
            e2<BoolValue, BoolValue.Builder, i> e2Var = this.networkRoamingBuilder_;
            if (e2Var != null) {
                return (BoolValue) e2Var.e();
            }
            BoolValue boolValue = this.networkRoaming_;
            return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
        }

        public BoolValue.Builder getNetworkRoamingBuilder() {
            onChanged();
            return (BoolValue.Builder) getNetworkRoamingFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public i getNetworkRoamingOrBuilder() {
            e2<BoolValue, BoolValue.Builder, i> e2Var = this.networkRoamingBuilder_;
            if (e2Var != null) {
                return (i) e2Var.f();
            }
            BoolValue boolValue = this.networkRoaming_;
            return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public boolean getRingmute() {
            return this.ringmute_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public float getScreenbright() {
            return this.screenbright_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public StringValue getSimCarrier() {
            e2<StringValue, StringValue.Builder, h2> e2Var = this.simCarrierBuilder_;
            if (e2Var != null) {
                return (StringValue) e2Var.e();
            }
            StringValue stringValue = this.simCarrier_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        public StringValue.Builder getSimCarrierBuilder() {
            onChanged();
            return (StringValue.Builder) getSimCarrierFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public h2 getSimCarrierOrBuilder() {
            e2<StringValue, StringValue.Builder, h2> e2Var = this.simCarrierBuilder_;
            if (e2Var != null) {
                return (h2) e2Var.f();
            }
            StringValue stringValue = this.simCarrier_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public StringValue getSimCountry() {
            e2<StringValue, StringValue.Builder, h2> e2Var = this.simCountryBuilder_;
            if (e2Var != null) {
                return (StringValue) e2Var.e();
            }
            StringValue stringValue = this.simCountry_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        public StringValue.Builder getSimCountryBuilder() {
            onChanged();
            return (StringValue.Builder) getSimCountryFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public h2 getSimCountryOrBuilder() {
            e2<StringValue, StringValue.Builder, h2> e2Var = this.simCountryBuilder_;
            if (e2Var != null) {
                return (h2) e2Var.f();
            }
            StringValue stringValue = this.simCountry_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public long getTime() {
            return this.time_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public String getTimezone() {
            Object obj = this.timezone_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.timezone_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public ByteString getTimezoneBytes() {
            Object obj = this.timezone_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.timezone_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public long getTotaldisk() {
            return this.totaldisk_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public long getTotalmem() {
            return this.totalmem_;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public boolean hasAudioContext() {
            return (this.audioContextBuilder_ == null && this.audioContext_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public boolean hasConnection() {
            return (this.connectionBuilder_ == null && this.connection_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public boolean hasNetworkRoaming() {
            return (this.networkRoamingBuilder_ == null && this.networkRoaming_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public boolean hasSimCarrier() {
            return (this.simCarrierBuilder_ == null && this.simCarrier_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public boolean hasSimCountry() {
            return (this.simCountryBuilder_ == null && this.simCountry_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Device_fieldAccessorTable.d(Device.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeAudioContext(com.explorestack.protobuf.adcom.Context.Device.AudioContext audioContext) {
            e2<com.explorestack.protobuf.adcom.Context.Device.AudioContext, com.explorestack.protobuf.adcom.Context.Device.AudioContext.Builder, com.explorestack.protobuf.adcom.Context.Device.AudioContextOrBuilder> e2Var = this.audioContextBuilder_;
            if (e2Var == null) {
                com.explorestack.protobuf.adcom.Context.Device.AudioContext audioContext2 = this.audioContext_;
                if (audioContext2 != null) {
                    this.audioContext_ = com.explorestack.protobuf.adcom.Context.Device.AudioContext.newBuilder(audioContext2).mergeFrom(audioContext).buildPartial();
                } else {
                    this.audioContext_ = audioContext;
                }
                onChanged();
            } else {
                e2Var.g(audioContext);
            }
            return this;
        }

        public Builder mergeConnection(com.explorestack.protobuf.adcom.Context.Device.Connection connection) {
            e2<com.explorestack.protobuf.adcom.Context.Device.Connection, com.explorestack.protobuf.adcom.Context.Device.Connection.Builder, com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder> e2Var = this.connectionBuilder_;
            if (e2Var == null) {
                com.explorestack.protobuf.adcom.Context.Device.Connection connection2 = this.connection_;
                if (connection2 != null) {
                    this.connection_ = com.explorestack.protobuf.adcom.Context.Device.Connection.newBuilder(connection2).mergeFrom(connection).buildPartial();
                } else {
                    this.connection_ = connection;
                }
                onChanged();
            } else {
                e2Var.g(connection);
            }
            return this;
        }

        public Builder mergeNetworkRoaming(BoolValue boolValue) {
            e2<BoolValue, BoolValue.Builder, i> e2Var = this.networkRoamingBuilder_;
            if (e2Var == null) {
                BoolValue boolValue2 = this.networkRoaming_;
                if (boolValue2 != null) {
                    this.networkRoaming_ = BoolValue.newBuilder(boolValue2).mergeFrom(boolValue).buildPartial();
                } else {
                    this.networkRoaming_ = boolValue;
                }
                onChanged();
            } else {
                e2Var.g(boolValue);
            }
            return this;
        }

        public Builder mergeSimCarrier(StringValue stringValue) {
            e2<StringValue, StringValue.Builder, h2> e2Var = this.simCarrierBuilder_;
            if (e2Var == null) {
                StringValue stringValue2 = this.simCarrier_;
                if (stringValue2 != null) {
                    this.simCarrier_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.simCarrier_ = stringValue;
                }
                onChanged();
            } else {
                e2Var.g(stringValue);
            }
            return this;
        }

        public Builder mergeSimCountry(StringValue stringValue) {
            e2<StringValue, StringValue.Builder, h2> e2Var = this.simCountryBuilder_;
            if (e2Var == null) {
                StringValue stringValue2 = this.simCountry_;
                if (stringValue2 != null) {
                    this.simCountry_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.simCountry_ = stringValue;
                }
                onChanged();
            } else {
                e2Var.g(stringValue);
            }
            return this;
        }

        public Builder setAccess(String str) {
            str.getClass();
            this.access_ = str;
            onChanged();
            return this;
        }

        public Builder setAccessBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.access_ = byteString;
            onChanged();
            return this;
        }

        public Builder setAirplane(boolean z10) {
            this.airplane_ = z10;
            onChanged();
            return this;
        }

        public Builder setApilevel(int i10) {
            this.apilevel_ = i10;
            onChanged();
            return this;
        }

        public Builder setAtts(int i10) {
            this.atts_ = i10;
            onChanged();
            return this;
        }

        public Builder setAudioContext(com.explorestack.protobuf.adcom.Context.Device.AudioContext audioContext) {
            e2<com.explorestack.protobuf.adcom.Context.Device.AudioContext, com.explorestack.protobuf.adcom.Context.Device.AudioContext.Builder, com.explorestack.protobuf.adcom.Context.Device.AudioContextOrBuilder> e2Var = this.audioContextBuilder_;
            if (e2Var == null) {
                audioContext.getClass();
                this.audioContext_ = audioContext;
                onChanged();
            } else {
                e2Var.i(audioContext);
            }
            return this;
        }

        public Builder setBatterylevel(float f10) {
            this.batterylevel_ = f10;
            onChanged();
            return this;
        }

        public Builder setBatterysaver(boolean z10) {
            this.batterysaver_ = z10;
            onChanged();
            return this;
        }

        public Builder setBmIfv(String str) {
            str.getClass();
            this.bmIfv_ = str;
            onChanged();
            return this;
        }

        public Builder setBmIfvBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.bmIfv_ = byteString;
            onChanged();
            return this;
        }

        public Builder setCharging(boolean z10) {
            this.charging_ = z10;
            onChanged();
            return this;
        }

        public Builder setConnection(com.explorestack.protobuf.adcom.Context.Device.Connection connection) {
            e2<com.explorestack.protobuf.adcom.Context.Device.Connection, com.explorestack.protobuf.adcom.Context.Device.Connection.Builder, com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder> e2Var = this.connectionBuilder_;
            if (e2Var == null) {
                connection.getClass();
                this.connection_ = connection;
                onChanged();
            } else {
                e2Var.i(connection);
            }
            return this;
        }

        public Builder setCpuname(String str) {
            str.getClass();
            this.cpuname_ = str;
            onChanged();
            return this;
        }

        public Builder setCpunameBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.cpuname_ = byteString;
            onChanged();
            return this;
        }

        public Builder setCpuvendor(String str) {
            str.getClass();
            this.cpuvendor_ = str;
            onChanged();
            return this;
        }

        public Builder setCpuvendorBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.cpuvendor_ = byteString;
            onChanged();
            return this;
        }

        public Builder setDarkmode(boolean z10) {
            this.darkmode_ = z10;
            onChanged();
            return this;
        }

        public Builder setDevicename(String str) {
            str.getClass();
            this.devicename_ = str;
            onChanged();
            return this;
        }

        public Builder setDevicenameBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.devicename_ = byteString;
            onChanged();
            return this;
        }

        public Builder setDiskspace(long j10) {
            this.diskspace_ = j10;
            onChanged();
            return this;
        }

        public Builder setDnd(boolean z10) {
            this.dnd_ = z10;
            onChanged();
            return this;
        }

        public Builder setFreemem(long j10) {
            this.freemem_ = j10;
            onChanged();
            return this;
        }

        public Builder setGpuname(String str) {
            str.getClass();
            this.gpuname_ = str;
            onChanged();
            return this;
        }

        public Builder setGpunameBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.gpuname_ = byteString;
            onChanged();
            return this;
        }

        public Builder setGpuvendor(String str) {
            str.getClass();
            this.gpuvendor_ = str;
            onChanged();
            return this;
        }

        public Builder setGpuvendorBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.gpuvendor_ = byteString;
            onChanged();
            return this;
        }

        public Builder setHeadset(boolean z10) {
            this.headset_ = z10;
            onChanged();
            return this;
        }

        public Builder setHeadsetname(String str) {
            str.getClass();
            this.headsetname_ = str;
            onChanged();
            return this;
        }

        public Builder setHeadsetnameBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.headsetname_ = byteString;
            onChanged();
            return this;
        }

        public Builder setIfv(String str) {
            str.getClass();
            this.ifv_ = str;
            onChanged();
            return this;
        }

        public Builder setIfvBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.ifv_ = byteString;
            onChanged();
            return this;
        }

        public Builder setInputlanguage(int i10, String str) {
            str.getClass();
            ensureInputlanguageIsMutable();
            this.inputlanguage_.set(i10, str);
            onChanged();
            return this;
        }

        public Builder setJailbreak(boolean z10) {
            this.jailbreak_ = z10;
            onChanged();
            return this;
        }

        public Builder setLastbootup(long j10) {
            this.lastbootup_ = j10;
            onChanged();
            return this;
        }

        public Builder setNetworkRoaming(BoolValue boolValue) {
            e2<BoolValue, BoolValue.Builder, i> e2Var = this.networkRoamingBuilder_;
            if (e2Var == null) {
                boolValue.getClass();
                this.networkRoaming_ = boolValue;
                onChanged();
            } else {
                e2Var.i(boolValue);
            }
            return this;
        }

        public Builder setRingmute(boolean z10) {
            this.ringmute_ = z10;
            onChanged();
            return this;
        }

        public Builder setScreenbright(float f10) {
            this.screenbright_ = f10;
            onChanged();
            return this;
        }

        public Builder setSimCarrier(StringValue stringValue) {
            e2<StringValue, StringValue.Builder, h2> e2Var = this.simCarrierBuilder_;
            if (e2Var == null) {
                stringValue.getClass();
                this.simCarrier_ = stringValue;
                onChanged();
            } else {
                e2Var.i(stringValue);
            }
            return this;
        }

        public Builder setSimCountry(StringValue stringValue) {
            e2<StringValue, StringValue.Builder, h2> e2Var = this.simCountryBuilder_;
            if (e2Var == null) {
                stringValue.getClass();
                this.simCountry_ = stringValue;
                onChanged();
            } else {
                e2Var.i(stringValue);
            }
            return this;
        }

        public Builder setTime(long j10) {
            this.time_ = j10;
            onChanged();
            return this;
        }

        public Builder setTimezone(String str) {
            str.getClass();
            this.timezone_ = str;
            onChanged();
            return this;
        }

        public Builder setTimezoneBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.timezone_ = byteString;
            onChanged();
            return this;
        }

        public Builder setTotaldisk(long j10) {
            this.totaldisk_ = j10;
            onChanged();
            return this;
        }

        public Builder setTotalmem(long j10) {
            this.totalmem_ = j10;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
        public w1 getInputlanguageList() {
            return this.inputlanguage_.getUnmodifiableView();
        }

        private Builder() {
            this.ifv_ = "";
            this.bmIfv_ = "";
            this.inputlanguage_ = q0.f10776d;
            this.devicename_ = "";
            this.access_ = "";
            this.headsetname_ = "";
            this.cpuname_ = "";
            this.cpuvendor_ = "";
            this.gpuname_ = "";
            this.gpuvendor_ = "";
            this.timezone_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Device build() {
            Device deviceBuildPartial = buildPartial();
            if (deviceBuildPartial.isInitialized()) {
                return deviceBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) deviceBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Device buildPartial() {
            Device device = new Device(this);
            device.ifv_ = this.ifv_;
            device.bmIfv_ = this.bmIfv_;
            if ((this.bitField0_ & 1) != 0) {
                this.inputlanguage_ = this.inputlanguage_.getUnmodifiableView();
                this.bitField0_ &= -2;
            }
            device.inputlanguage_ = this.inputlanguage_;
            device.diskspace_ = this.diskspace_;
            device.totaldisk_ = this.totaldisk_;
            device.ringmute_ = this.ringmute_;
            device.charging_ = this.charging_;
            device.headset_ = this.headset_;
            device.batterylevel_ = this.batterylevel_;
            device.batterysaver_ = this.batterysaver_;
            device.darkmode_ = this.darkmode_;
            device.airplane_ = this.airplane_;
            device.dnd_ = this.dnd_;
            device.devicename_ = this.devicename_;
            device.time_ = this.time_;
            device.screenbright_ = this.screenbright_;
            device.jailbreak_ = this.jailbreak_;
            device.lastbootup_ = this.lastbootup_;
            device.access_ = this.access_;
            device.headsetname_ = this.headsetname_;
            device.totalmem_ = this.totalmem_;
            device.atts_ = this.atts_;
            device.cpuname_ = this.cpuname_;
            device.cpuvendor_ = this.cpuvendor_;
            device.gpuname_ = this.gpuname_;
            device.gpuvendor_ = this.gpuvendor_;
            device.timezone_ = this.timezone_;
            device.freemem_ = this.freemem_;
            device.apilevel_ = this.apilevel_;
            e2<StringValue, StringValue.Builder, h2> e2Var = this.simCarrierBuilder_;
            if (e2Var == null) {
                device.simCarrier_ = this.simCarrier_;
            } else {
                device.simCarrier_ = (StringValue) e2Var.a();
            }
            e2<StringValue, StringValue.Builder, h2> e2Var2 = this.simCountryBuilder_;
            if (e2Var2 == null) {
                device.simCountry_ = this.simCountry_;
            } else {
                device.simCountry_ = (StringValue) e2Var2.a();
            }
            e2<BoolValue, BoolValue.Builder, i> e2Var3 = this.networkRoamingBuilder_;
            if (e2Var3 == null) {
                device.networkRoaming_ = this.networkRoaming_;
            } else {
                device.networkRoaming_ = (BoolValue) e2Var3.a();
            }
            e2<com.explorestack.protobuf.adcom.Context.Device.Connection, com.explorestack.protobuf.adcom.Context.Device.Connection.Builder, com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder> e2Var4 = this.connectionBuilder_;
            if (e2Var4 == null) {
                device.connection_ = this.connection_;
            } else {
                device.connection_ = (com.explorestack.protobuf.adcom.Context.Device.Connection) e2Var4.a();
            }
            e2<com.explorestack.protobuf.adcom.Context.Device.AudioContext, com.explorestack.protobuf.adcom.Context.Device.AudioContext.Builder, com.explorestack.protobuf.adcom.Context.Device.AudioContextOrBuilder> e2Var5 = this.audioContextBuilder_;
            if (e2Var5 == null) {
                device.audioContext_ = this.audioContext_;
            } else {
                device.audioContext_ = (com.explorestack.protobuf.adcom.Context.Device.AudioContext) e2Var5.a();
            }
            onBuilt();
            return device;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Device mo164getDefaultInstanceForType() {
            return Device.getDefaultInstance();
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
            this.ifv_ = "";
            this.bmIfv_ = "";
            this.inputlanguage_ = q0.f10776d;
            this.bitField0_ &= -2;
            this.diskspace_ = 0L;
            this.totaldisk_ = 0L;
            this.ringmute_ = false;
            this.charging_ = false;
            this.headset_ = false;
            this.batterylevel_ = 0.0f;
            this.batterysaver_ = false;
            this.darkmode_ = false;
            this.airplane_ = false;
            this.dnd_ = false;
            this.devicename_ = "";
            this.time_ = 0L;
            this.screenbright_ = 0.0f;
            this.jailbreak_ = false;
            this.lastbootup_ = 0L;
            this.access_ = "";
            this.headsetname_ = "";
            this.totalmem_ = 0L;
            this.atts_ = 0;
            this.cpuname_ = "";
            this.cpuvendor_ = "";
            this.gpuname_ = "";
            this.gpuvendor_ = "";
            this.timezone_ = "";
            this.freemem_ = 0L;
            this.apilevel_ = 0;
            if (this.simCarrierBuilder_ == null) {
                this.simCarrier_ = null;
            } else {
                this.simCarrier_ = null;
                this.simCarrierBuilder_ = null;
            }
            if (this.simCountryBuilder_ == null) {
                this.simCountry_ = null;
            } else {
                this.simCountry_ = null;
                this.simCountryBuilder_ = null;
            }
            if (this.networkRoamingBuilder_ == null) {
                this.networkRoaming_ = null;
            } else {
                this.networkRoaming_ = null;
                this.networkRoamingBuilder_ = null;
            }
            if (this.connectionBuilder_ == null) {
                this.connection_ = null;
            } else {
                this.connection_ = null;
                this.connectionBuilder_ = null;
            }
            if (this.audioContextBuilder_ == null) {
                this.audioContext_ = null;
            } else {
                this.audioContext_ = null;
                this.audioContextBuilder_ = null;
            }
            return this;
        }

        public Builder setAudioContext(com.explorestack.protobuf.adcom.Context.Device.AudioContext.Builder builder) {
            e2<com.explorestack.protobuf.adcom.Context.Device.AudioContext, com.explorestack.protobuf.adcom.Context.Device.AudioContext.Builder, com.explorestack.protobuf.adcom.Context.Device.AudioContextOrBuilder> e2Var = this.audioContextBuilder_;
            if (e2Var == null) {
                this.audioContext_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setConnection(com.explorestack.protobuf.adcom.Context.Device.Connection.Builder builder) {
            e2<com.explorestack.protobuf.adcom.Context.Device.Connection, com.explorestack.protobuf.adcom.Context.Device.Connection.Builder, com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder> e2Var = this.connectionBuilder_;
            if (e2Var == null) {
                this.connection_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setNetworkRoaming(BoolValue.Builder builder) {
            e2<BoolValue, BoolValue.Builder, i> e2Var = this.networkRoamingBuilder_;
            if (e2Var == null) {
                this.networkRoaming_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setSimCarrier(StringValue.Builder builder) {
            e2<StringValue, StringValue.Builder, h2> e2Var = this.simCarrierBuilder_;
            if (e2Var == null) {
                this.simCarrier_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setSimCountry(StringValue.Builder builder) {
            e2<StringValue, StringValue.Builder, h2> e2Var = this.simCountryBuilder_;
            if (e2Var == null) {
                this.simCountry_ = builder.build();
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
            if (message instanceof Device) {
                return mergeFrom((Device) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Device device) {
            if (device == Device.getDefaultInstance()) {
                return this;
            }
            if (!device.getIfv().isEmpty()) {
                this.ifv_ = device.ifv_;
                onChanged();
            }
            if (!device.getBmIfv().isEmpty()) {
                this.bmIfv_ = device.bmIfv_;
                onChanged();
            }
            if (!device.inputlanguage_.isEmpty()) {
                if (this.inputlanguage_.isEmpty()) {
                    this.inputlanguage_ = device.inputlanguage_;
                    this.bitField0_ &= -2;
                } else {
                    ensureInputlanguageIsMutable();
                    this.inputlanguage_.addAll(device.inputlanguage_);
                }
                onChanged();
            }
            if (device.getDiskspace() != 0) {
                setDiskspace(device.getDiskspace());
            }
            if (device.getTotaldisk() != 0) {
                setTotaldisk(device.getTotaldisk());
            }
            if (device.getRingmute()) {
                setRingmute(device.getRingmute());
            }
            if (device.getCharging()) {
                setCharging(device.getCharging());
            }
            if (device.getHeadset()) {
                setHeadset(device.getHeadset());
            }
            if (device.getBatterylevel() != 0.0f) {
                setBatterylevel(device.getBatterylevel());
            }
            if (device.getBatterysaver()) {
                setBatterysaver(device.getBatterysaver());
            }
            if (device.getDarkmode()) {
                setDarkmode(device.getDarkmode());
            }
            if (device.getAirplane()) {
                setAirplane(device.getAirplane());
            }
            if (device.getDnd()) {
                setDnd(device.getDnd());
            }
            if (!device.getDevicename().isEmpty()) {
                this.devicename_ = device.devicename_;
                onChanged();
            }
            if (device.getTime() != 0) {
                setTime(device.getTime());
            }
            if (device.getScreenbright() != 0.0f) {
                setScreenbright(device.getScreenbright());
            }
            if (device.getJailbreak()) {
                setJailbreak(device.getJailbreak());
            }
            if (device.getLastbootup() != 0) {
                setLastbootup(device.getLastbootup());
            }
            if (!device.getAccess().isEmpty()) {
                this.access_ = device.access_;
                onChanged();
            }
            if (!device.getHeadsetname().isEmpty()) {
                this.headsetname_ = device.headsetname_;
                onChanged();
            }
            if (device.getTotalmem() != 0) {
                setTotalmem(device.getTotalmem());
            }
            if (device.getAtts() != 0) {
                setAtts(device.getAtts());
            }
            if (!device.getCpuname().isEmpty()) {
                this.cpuname_ = device.cpuname_;
                onChanged();
            }
            if (!device.getCpuvendor().isEmpty()) {
                this.cpuvendor_ = device.cpuvendor_;
                onChanged();
            }
            if (!device.getGpuname().isEmpty()) {
                this.gpuname_ = device.gpuname_;
                onChanged();
            }
            if (!device.getGpuvendor().isEmpty()) {
                this.gpuvendor_ = device.gpuvendor_;
                onChanged();
            }
            if (!device.getTimezone().isEmpty()) {
                this.timezone_ = device.timezone_;
                onChanged();
            }
            if (device.getFreemem() != 0) {
                setFreemem(device.getFreemem());
            }
            if (device.getApilevel() != 0) {
                setApilevel(device.getApilevel());
            }
            if (device.hasSimCarrier()) {
                mergeSimCarrier(device.getSimCarrier());
            }
            if (device.hasSimCountry()) {
                mergeSimCountry(device.getSimCountry());
            }
            if (device.hasNetworkRoaming()) {
                mergeNetworkRoaming(device.getNetworkRoaming());
            }
            if (device.hasConnection()) {
                mergeConnection(device.getConnection());
            }
            if (device.hasAudioContext()) {
                mergeAudioContext(device.getAudioContext());
            }
            mergeUnknownFields(((j0) device).unknownFields);
            onChanged();
            return this;
        }

        private Builder(j0.c cVar) {
            super(cVar);
            this.ifv_ = "";
            this.bmIfv_ = "";
            this.inputlanguage_ = q0.f10776d;
            this.devicename_ = "";
            this.access_ = "";
            this.headsetname_ = "";
            this.cpuname_ = "";
            this.cpuvendor_ = "";
            this.gpuname_ = "";
            this.gpuvendor_ = "";
            this.timezone_ = "";
            maybeForceBuilderInitialization();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
            Device device = null;
            try {
                try {
                    Device device2 = (Device) Device.PARSER.parsePartialFrom(nVar, yVar);
                    if (device2 != null) {
                        mergeFrom(device2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    Device device3 = (Device) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        device = device3;
                        if (device != null) {
                            mergeFrom(device);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (device != null) {
                    mergeFrom(device);
                }
                throw th;
            }
        }
    }

    public static Device getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Device_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Device parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Device) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Device parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<Device> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Device)) {
            return super.equals(obj);
        }
        Device device = (Device) obj;
        if (!getIfv().equals(device.getIfv()) || !getBmIfv().equals(device.getBmIfv()) || !getInputlanguageList().equals(device.getInputlanguageList()) || getDiskspace() != device.getDiskspace() || getTotaldisk() != device.getTotaldisk() || getRingmute() != device.getRingmute() || getCharging() != device.getCharging() || getHeadset() != device.getHeadset() || Float.floatToIntBits(getBatterylevel()) != Float.floatToIntBits(device.getBatterylevel()) || getBatterysaver() != device.getBatterysaver() || getDarkmode() != device.getDarkmode() || getAirplane() != device.getAirplane() || getDnd() != device.getDnd() || !getDevicename().equals(device.getDevicename()) || getTime() != device.getTime() || Float.floatToIntBits(getScreenbright()) != Float.floatToIntBits(device.getScreenbright()) || getJailbreak() != device.getJailbreak() || getLastbootup() != device.getLastbootup() || !getAccess().equals(device.getAccess()) || !getHeadsetname().equals(device.getHeadsetname()) || getTotalmem() != device.getTotalmem() || getAtts() != device.getAtts() || !getCpuname().equals(device.getCpuname()) || !getCpuvendor().equals(device.getCpuvendor()) || !getGpuname().equals(device.getGpuname()) || !getGpuvendor().equals(device.getGpuvendor()) || !getTimezone().equals(device.getTimezone()) || getFreemem() != device.getFreemem() || getApilevel() != device.getApilevel() || hasSimCarrier() != device.hasSimCarrier()) {
            return false;
        }
        if ((hasSimCarrier() && !getSimCarrier().equals(device.getSimCarrier())) || hasSimCountry() != device.hasSimCountry()) {
            return false;
        }
        if ((hasSimCountry() && !getSimCountry().equals(device.getSimCountry())) || hasNetworkRoaming() != device.hasNetworkRoaming()) {
            return false;
        }
        if ((hasNetworkRoaming() && !getNetworkRoaming().equals(device.getNetworkRoaming())) || hasConnection() != device.hasConnection()) {
            return false;
        }
        if ((!hasConnection() || getConnection().equals(device.getConnection())) && hasAudioContext() == device.hasAudioContext()) {
            return (!hasAudioContext() || getAudioContext().equals(device.getAudioContext())) && this.unknownFields.equals(device.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public String getAccess() {
        Object obj = this.access_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.access_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public ByteString getAccessBytes() {
        Object obj = this.access_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.access_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public boolean getAirplane() {
        return this.airplane_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public int getApilevel() {
        return this.apilevel_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public int getAtts() {
        return this.atts_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public com.explorestack.protobuf.adcom.Context.Device.AudioContext getAudioContext() {
        com.explorestack.protobuf.adcom.Context.Device.AudioContext audioContext = this.audioContext_;
        return audioContext == null ? com.explorestack.protobuf.adcom.Context.Device.AudioContext.getDefaultInstance() : audioContext;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public com.explorestack.protobuf.adcom.Context.Device.AudioContextOrBuilder getAudioContextOrBuilder() {
        return getAudioContext();
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public float getBatterylevel() {
        return this.batterylevel_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public boolean getBatterysaver() {
        return this.batterysaver_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public String getBmIfv() {
        Object obj = this.bmIfv_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.bmIfv_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public ByteString getBmIfvBytes() {
        Object obj = this.bmIfv_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.bmIfv_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public boolean getCharging() {
        return this.charging_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public com.explorestack.protobuf.adcom.Context.Device.Connection getConnection() {
        com.explorestack.protobuf.adcom.Context.Device.Connection connection = this.connection_;
        return connection == null ? com.explorestack.protobuf.adcom.Context.Device.Connection.getDefaultInstance() : connection;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder getConnectionOrBuilder() {
        return getConnection();
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public String getCpuname() {
        Object obj = this.cpuname_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.cpuname_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public ByteString getCpunameBytes() {
        Object obj = this.cpuname_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.cpuname_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public String getCpuvendor() {
        Object obj = this.cpuvendor_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.cpuvendor_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public ByteString getCpuvendorBytes() {
        Object obj = this.cpuvendor_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.cpuvendor_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public boolean getDarkmode() {
        return this.darkmode_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public String getDevicename() {
        Object obj = this.devicename_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.devicename_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public ByteString getDevicenameBytes() {
        Object obj = this.devicename_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.devicename_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public long getDiskspace() {
        return this.diskspace_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public boolean getDnd() {
        return this.dnd_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public long getFreemem() {
        return this.freemem_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public String getGpuname() {
        Object obj = this.gpuname_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.gpuname_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public ByteString getGpunameBytes() {
        Object obj = this.gpuname_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.gpuname_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public String getGpuvendor() {
        Object obj = this.gpuvendor_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.gpuvendor_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public ByteString getGpuvendorBytes() {
        Object obj = this.gpuvendor_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.gpuvendor_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public boolean getHeadset() {
        return this.headset_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public String getHeadsetname() {
        Object obj = this.headsetname_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.headsetname_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public ByteString getHeadsetnameBytes() {
        Object obj = this.headsetname_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.headsetname_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public String getIfv() {
        Object obj = this.ifv_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.ifv_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public ByteString getIfvBytes() {
        Object obj = this.ifv_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.ifv_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public String getInputlanguage(int i10) {
        return this.inputlanguage_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public ByteString getInputlanguageBytes(int i10) {
        return this.inputlanguage_.getByteString(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public int getInputlanguageCount() {
        return this.inputlanguage_.size();
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public boolean getJailbreak() {
        return this.jailbreak_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public long getLastbootup() {
        return this.lastbootup_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public BoolValue getNetworkRoaming() {
        BoolValue boolValue = this.networkRoaming_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public i getNetworkRoamingOrBuilder() {
        return getNetworkRoaming();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<Device> getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public boolean getRingmute() {
        return this.ringmute_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public float getScreenbright() {
        return this.screenbright_;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getIfvBytes().isEmpty() ? j0.computeStringSize(1, this.ifv_) + 0 : 0;
        if (!getBmIfvBytes().isEmpty()) {
            iComputeStringSize += j0.computeStringSize(2, this.bmIfv_);
        }
        int iComputeStringSizeNoTag = 0;
        for (int i11 = 0; i11 < this.inputlanguage_.size(); i11++) {
            iComputeStringSizeNoTag += j0.computeStringSizeNoTag(this.inputlanguage_.getRaw(i11));
        }
        int size = iComputeStringSize + iComputeStringSizeNoTag + (getInputlanguageList().size() * 1);
        long j10 = this.diskspace_;
        if (j10 != 0) {
            size += CodedOutputStream.a0(4, j10);
        }
        long j11 = this.totaldisk_;
        if (j11 != 0) {
            size += CodedOutputStream.a0(5, j11);
        }
        boolean z10 = this.ringmute_;
        if (z10) {
            size += CodedOutputStream.e(6, z10);
        }
        boolean z11 = this.charging_;
        if (z11) {
            size += CodedOutputStream.e(7, z11);
        }
        boolean z12 = this.headset_;
        if (z12) {
            size += CodedOutputStream.e(8, z12);
        }
        float f10 = this.batterylevel_;
        if (f10 != 0.0f) {
            size += CodedOutputStream.r(9, f10);
        }
        boolean z13 = this.batterysaver_;
        if (z13) {
            size += CodedOutputStream.e(10, z13);
        }
        boolean z14 = this.darkmode_;
        if (z14) {
            size += CodedOutputStream.e(11, z14);
        }
        boolean z15 = this.airplane_;
        if (z15) {
            size += CodedOutputStream.e(12, z15);
        }
        boolean z16 = this.dnd_;
        if (z16) {
            size += CodedOutputStream.e(13, z16);
        }
        if (!getDevicenameBytes().isEmpty()) {
            size += j0.computeStringSize(14, this.devicename_);
        }
        long j12 = this.time_;
        if (j12 != 0) {
            size += CodedOutputStream.a0(15, j12);
        }
        float f11 = this.screenbright_;
        if (f11 != 0.0f) {
            size += CodedOutputStream.r(16, f11);
        }
        boolean z17 = this.jailbreak_;
        if (z17) {
            size += CodedOutputStream.e(17, z17);
        }
        long j13 = this.lastbootup_;
        if (j13 != 0) {
            size += CodedOutputStream.a0(18, j13);
        }
        if (!getAccessBytes().isEmpty()) {
            size += j0.computeStringSize(19, this.access_);
        }
        if (!getHeadsetnameBytes().isEmpty()) {
            size += j0.computeStringSize(20, this.headsetname_);
        }
        long j14 = this.totalmem_;
        if (j14 != 0) {
            size += CodedOutputStream.a0(21, j14);
        }
        int i12 = this.atts_;
        if (i12 != 0) {
            size += CodedOutputStream.Y(22, i12);
        }
        if (this.connection_ != null) {
            size += CodedOutputStream.G(23, getConnection());
        }
        if (this.audioContext_ != null) {
            size += CodedOutputStream.G(24, getAudioContext());
        }
        if (!getCpunameBytes().isEmpty()) {
            size += j0.computeStringSize(25, this.cpuname_);
        }
        if (!getCpuvendorBytes().isEmpty()) {
            size += j0.computeStringSize(26, this.cpuvendor_);
        }
        if (!getGpunameBytes().isEmpty()) {
            size += j0.computeStringSize(27, this.gpuname_);
        }
        if (!getGpuvendorBytes().isEmpty()) {
            size += j0.computeStringSize(28, this.gpuvendor_);
        }
        if (!getTimezoneBytes().isEmpty()) {
            size += j0.computeStringSize(29, this.timezone_);
        }
        long j15 = this.freemem_;
        if (j15 != 0) {
            size += CodedOutputStream.a0(30, j15);
        }
        int i13 = this.apilevel_;
        if (i13 != 0) {
            size += CodedOutputStream.Y(31, i13);
        }
        if (this.simCarrier_ != null) {
            size += CodedOutputStream.G(32, getSimCarrier());
        }
        if (this.simCountry_ != null) {
            size += CodedOutputStream.G(33, getSimCountry());
        }
        if (this.networkRoaming_ != null) {
            size += CodedOutputStream.G(34, getNetworkRoaming());
        }
        int serializedSize = size + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public StringValue getSimCarrier() {
        StringValue stringValue = this.simCarrier_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public h2 getSimCarrierOrBuilder() {
        return getSimCarrier();
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public StringValue getSimCountry() {
        StringValue stringValue = this.simCountry_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public h2 getSimCountryOrBuilder() {
        return getSimCountry();
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public long getTime() {
        return this.time_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public String getTimezone() {
        Object obj = this.timezone_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.timezone_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public ByteString getTimezoneBytes() {
        Object obj = this.timezone_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.timezone_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public long getTotaldisk() {
        return this.totaldisk_;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public long getTotalmem() {
        return this.totalmem_;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
    public final u2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public boolean hasAudioContext() {
        return this.audioContext_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public boolean hasConnection() {
        return this.connection_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public boolean hasNetworkRoaming() {
        return this.networkRoaming_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public boolean hasSimCarrier() {
        return this.simCarrier_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public boolean hasSimCountry() {
        return this.simCountry_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getIfv().hashCode()) * 37) + 2) * 53) + getBmIfv().hashCode();
        if (getInputlanguageCount() > 0) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getInputlanguageList().hashCode();
        }
        int i11 = (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 37) + 4) * 53) + l0.i(getDiskspace())) * 37) + 5) * 53) + l0.i(getTotaldisk())) * 37) + 6) * 53) + l0.d(getRingmute())) * 37) + 7) * 53) + l0.d(getCharging())) * 37) + 8) * 53) + l0.d(getHeadset())) * 37) + 9) * 53) + Float.floatToIntBits(getBatterylevel())) * 37) + 10) * 53) + l0.d(getBatterysaver())) * 37) + 11) * 53) + l0.d(getDarkmode())) * 37) + 12) * 53) + l0.d(getAirplane())) * 37) + 13) * 53) + l0.d(getDnd())) * 37) + 14) * 53) + getDevicename().hashCode()) * 37) + 15) * 53) + l0.i(getTime())) * 37) + 16) * 53) + Float.floatToIntBits(getScreenbright())) * 37) + 17) * 53) + l0.d(getJailbreak())) * 37) + 18) * 53) + l0.i(getLastbootup())) * 37) + 19) * 53) + getAccess().hashCode()) * 37) + 20) * 53) + getHeadsetname().hashCode()) * 37) + 21) * 53) + l0.i(getTotalmem())) * 37) + 22) * 53) + getAtts()) * 37) + 25) * 53) + getCpuname().hashCode()) * 37) + 26) * 53) + getCpuvendor().hashCode()) * 37) + 27) * 53) + getGpuname().hashCode()) * 37) + 28) * 53) + getGpuvendor().hashCode()) * 37) + 29) * 53) + getTimezone().hashCode()) * 37) + 30) * 53) + l0.i(getFreemem())) * 37) + 31) * 53) + getApilevel();
        if (hasSimCarrier()) {
            i11 = (((i11 * 37) + 32) * 53) + getSimCarrier().hashCode();
        }
        if (hasSimCountry()) {
            i11 = (((i11 * 37) + 33) * 53) + getSimCountry().hashCode();
        }
        if (hasNetworkRoaming()) {
            i11 = (((i11 * 37) + 34) * 53) + getNetworkRoaming().hashCode();
        }
        if (hasConnection()) {
            i11 = (((i11 * 37) + 23) * 53) + getConnection().hashCode();
        }
        if (hasAudioContext()) {
            i11 = (((i11 * 37) + 24) * 53) + getAudioContext().hashCode();
        }
        int iHashCode2 = (i11 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Device_fieldAccessorTable.d(Device.class, Builder.class);
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
        return new Device();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getIfvBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 1, this.ifv_);
        }
        if (!getBmIfvBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 2, this.bmIfv_);
        }
        for (int i10 = 0; i10 < this.inputlanguage_.size(); i10++) {
            j0.writeString(codedOutputStream, 3, this.inputlanguage_.getRaw(i10));
        }
        long j10 = this.diskspace_;
        if (j10 != 0) {
            codedOutputStream.e1(4, j10);
        }
        long j11 = this.totaldisk_;
        if (j11 != 0) {
            codedOutputStream.e1(5, j11);
        }
        boolean z10 = this.ringmute_;
        if (z10) {
            codedOutputStream.n0(6, z10);
        }
        boolean z11 = this.charging_;
        if (z11) {
            codedOutputStream.n0(7, z11);
        }
        boolean z12 = this.headset_;
        if (z12) {
            codedOutputStream.n0(8, z12);
        }
        float f10 = this.batterylevel_;
        if (f10 != 0.0f) {
            codedOutputStream.B0(9, f10);
        }
        boolean z13 = this.batterysaver_;
        if (z13) {
            codedOutputStream.n0(10, z13);
        }
        boolean z14 = this.darkmode_;
        if (z14) {
            codedOutputStream.n0(11, z14);
        }
        boolean z15 = this.airplane_;
        if (z15) {
            codedOutputStream.n0(12, z15);
        }
        boolean z16 = this.dnd_;
        if (z16) {
            codedOutputStream.n0(13, z16);
        }
        if (!getDevicenameBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 14, this.devicename_);
        }
        long j12 = this.time_;
        if (j12 != 0) {
            codedOutputStream.e1(15, j12);
        }
        float f11 = this.screenbright_;
        if (f11 != 0.0f) {
            codedOutputStream.B0(16, f11);
        }
        boolean z17 = this.jailbreak_;
        if (z17) {
            codedOutputStream.n0(17, z17);
        }
        long j13 = this.lastbootup_;
        if (j13 != 0) {
            codedOutputStream.e1(18, j13);
        }
        if (!getAccessBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 19, this.access_);
        }
        if (!getHeadsetnameBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 20, this.headsetname_);
        }
        long j14 = this.totalmem_;
        if (j14 != 0) {
            codedOutputStream.e1(21, j14);
        }
        int i11 = this.atts_;
        if (i11 != 0) {
            codedOutputStream.c1(22, i11);
        }
        if (this.connection_ != null) {
            codedOutputStream.L0(23, getConnection());
        }
        if (this.audioContext_ != null) {
            codedOutputStream.L0(24, getAudioContext());
        }
        if (!getCpunameBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 25, this.cpuname_);
        }
        if (!getCpuvendorBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 26, this.cpuvendor_);
        }
        if (!getGpunameBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 27, this.gpuname_);
        }
        if (!getGpuvendorBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 28, this.gpuvendor_);
        }
        if (!getTimezoneBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 29, this.timezone_);
        }
        long j15 = this.freemem_;
        if (j15 != 0) {
            codedOutputStream.e1(30, j15);
        }
        int i12 = this.apilevel_;
        if (i12 != 0) {
            codedOutputStream.c1(31, i12);
        }
        if (this.simCarrier_ != null) {
            codedOutputStream.L0(32, getSimCarrier());
        }
        if (this.simCountry_ != null) {
            codedOutputStream.L0(33, getSimCountry());
        }
        if (this.networkRoaming_ != null) {
            codedOutputStream.L0(34, getNetworkRoaming());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static Builder newBuilder(Device device) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(device);
    }

    public static Device parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    @Override // io.bidmachine.protobuf.sdk.DeviceOrBuilder
    public w1 getInputlanguageList() {
        return this.inputlanguage_;
    }

    private Device(j0.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Device parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (Device) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static Device parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public Device mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Device parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Device() {
        this.memoizedIsInitialized = (byte) -1;
        this.ifv_ = "";
        this.bmIfv_ = "";
        this.inputlanguage_ = q0.f10776d;
        this.devicename_ = "";
        this.access_ = "";
        this.headsetname_ = "";
        this.cpuname_ = "";
        this.cpuvendor_ = "";
        this.gpuname_ = "";
        this.gpuvendor_ = "";
        this.timezone_ = "";
    }

    public static Device parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    public static Device parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    public static Device parseFrom(InputStream inputStream) throws IOException {
        return (Device) j0.parseWithIOException(PARSER, inputStream);
    }

    public static Device parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (Device) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    public static Device parseFrom(n nVar) throws IOException {
        return (Device) j0.parseWithIOException(PARSER, nVar);
    }

    public static Device parseFrom(n nVar, y yVar) throws IOException {
        return (Device) j0.parseWithIOException(PARSER, nVar, yVar);
    }

    private Device(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                            this.ifv_ = nVar.J();
                            continue;
                        case 18:
                            this.bmIfv_ = nVar.J();
                            continue;
                        case 26:
                            String strJ = nVar.J();
                            boolean z12 = (z11 ? 1 : 0) & true;
                            z11 = z11;
                            if (!z12) {
                                this.inputlanguage_ = new q0();
                                z11 = (z11 ? 1 : 0) | true;
                            }
                            this.inputlanguage_.add(strJ);
                            continue;
                        case 32:
                            this.diskspace_ = nVar.M();
                            continue;
                        case 40:
                            this.totaldisk_ = nVar.M();
                            continue;
                        case 48:
                            this.ringmute_ = nVar.q();
                            continue;
                        case 56:
                            this.charging_ = nVar.q();
                            continue;
                        case 64:
                            this.headset_ = nVar.q();
                            continue;
                        case 77:
                            this.batterylevel_ = nVar.w();
                            continue;
                        case 80:
                            this.batterysaver_ = nVar.q();
                            continue;
                        case 88:
                            this.darkmode_ = nVar.q();
                            continue;
                        case 96:
                            this.airplane_ = nVar.q();
                            continue;
                        case 104:
                            this.dnd_ = nVar.q();
                            continue;
                        case 114:
                            this.devicename_ = nVar.J();
                            continue;
                        case 120:
                            this.time_ = nVar.M();
                            continue;
                        case OMSDK_JS_WRITE_FAILED_VALUE:
                            this.screenbright_ = nVar.w();
                            continue;
                        case PRIVACY_URL_ERROR_VALUE:
                            this.jailbreak_ = nVar.q();
                            continue;
                        case 144:
                            this.lastbootup_ = nVar.M();
                            continue;
                        case 154:
                            this.access_ = nVar.J();
                            continue;
                        case 162:
                            this.headsetname_ = nVar.J();
                            continue;
                        case 168:
                            this.totalmem_ = nVar.M();
                            continue;
                        case 176:
                            this.atts_ = nVar.L();
                            continue;
                        case 186:
                            com.explorestack.protobuf.adcom.Context.Device.Connection connection = this.connection_;
                            com.explorestack.protobuf.adcom.Context.Device.Connection.Builder builder = connection != null ? connection.toBuilder() : null;
                            com.explorestack.protobuf.adcom.Context.Device.Connection connection2 = (com.explorestack.protobuf.adcom.Context.Device.Connection) nVar.A(com.explorestack.protobuf.adcom.Context.Device.Connection.parser(), yVar);
                            this.connection_ = connection2;
                            if (builder != null) {
                                builder.mergeFrom(connection2);
                                this.connection_ = builder.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 194:
                            com.explorestack.protobuf.adcom.Context.Device.AudioContext audioContext = this.audioContext_;
                            com.explorestack.protobuf.adcom.Context.Device.AudioContext.Builder builder2 = audioContext != null ? audioContext.toBuilder() : null;
                            com.explorestack.protobuf.adcom.Context.Device.AudioContext audioContext2 = (com.explorestack.protobuf.adcom.Context.Device.AudioContext) nVar.A(com.explorestack.protobuf.adcom.Context.Device.AudioContext.parser(), yVar);
                            this.audioContext_ = audioContext2;
                            if (builder2 != null) {
                                builder2.mergeFrom(audioContext2);
                                this.audioContext_ = builder2.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 202:
                            this.cpuname_ = nVar.J();
                            continue;
                        case 210:
                            this.cpuvendor_ = nVar.J();
                            continue;
                        case MRAID_JS_DOES_NOT_EXIST_VALUE:
                            this.gpuname_ = nVar.J();
                            continue;
                        case PRIVACY_ICON_FALLBACK_ERROR_VALUE:
                            this.gpuvendor_ = nVar.J();
                            continue;
                        case 234:
                            this.timezone_ = nVar.J();
                            continue;
                        case 240:
                            this.freemem_ = nVar.M();
                            continue;
                        case 248:
                            this.apilevel_ = nVar.L();
                            continue;
                        case 258:
                            StringValue stringValue = this.simCarrier_;
                            StringValue.Builder builder3 = stringValue != null ? stringValue.toBuilder() : null;
                            StringValue stringValue2 = (StringValue) nVar.A(StringValue.parser(), yVar);
                            this.simCarrier_ = stringValue2;
                            if (builder3 != null) {
                                builder3.mergeFrom(stringValue2);
                                this.simCarrier_ = builder3.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 266:
                            StringValue stringValue3 = this.simCountry_;
                            StringValue.Builder builder4 = stringValue3 != null ? stringValue3.toBuilder() : null;
                            StringValue stringValue4 = (StringValue) nVar.A(StringValue.parser(), yVar);
                            this.simCountry_ = stringValue4;
                            if (builder4 != null) {
                                builder4.mergeFrom(stringValue4);
                                this.simCountry_ = builder4.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 274:
                            BoolValue boolValue = this.networkRoaming_;
                            BoolValue.Builder builder5 = boolValue != null ? boolValue.toBuilder() : null;
                            BoolValue boolValue2 = (BoolValue) nVar.A(BoolValue.parser(), yVar);
                            this.networkRoaming_ = boolValue2;
                            if (builder5 != null) {
                                builder5.mergeFrom(boolValue2);
                                this.networkRoaming_ = builder5.buildPartial();
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
                    this.inputlanguage_ = this.inputlanguage_.getUnmodifiableView();
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if ((z11 ? 1 : 0) & true) {
            this.inputlanguage_ = this.inputlanguage_.getUnmodifiableView();
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }
}
