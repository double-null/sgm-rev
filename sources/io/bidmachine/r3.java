package io.bidmachine;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.util.Size;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.BoolValue;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.adcom.ConnectionType;
import com.explorestack.protobuf.adcom.DeviceType;
import com.explorestack.protobuf.adcom.OS;
import io.bidmachine.protobuf.RequestTokenPayload;
import io.bidmachine.protobuf.sdk.Device;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: DeviceParams.java */
/* JADX INFO: loaded from: classes4.dex */
final class r3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p2 f20401a;

    public r3(p2 p2Var) {
        this.f20401a = p2Var;
    }

    private Device.Builder f(Context context, ga.d dVar) {
        try {
            Device.Builder builderNewBuilder = Device.newBuilder();
            h(context, builderNewBuilder, dVar);
            return builderNewBuilder;
        } catch (Throwable unused) {
            return null;
        }
    }

    private com.explorestack.protobuf.adcom.Context.Device.Builder g(Context context, TargetingParams targetingParams, TargetingParams targetingParams2, ga.d dVar, ConnectionType connectionType) {
        try {
            com.explorestack.protobuf.adcom.Context.Device.Builder builderNewBuilder = com.explorestack.protobuf.adcom.Context.Device.newBuilder();
            i(context, builderNewBuilder, targetingParams, targetingParams2, dVar, connectionType);
            return builderNewBuilder;
        } catch (Throwable unused) {
            return null;
        }
    }

    private void h(Context context, final Device.Builder builder, ga.d dVar) throws Throwable {
        b2 b2VarE = b2.e();
        String strJ = b2VarE.j();
        Objects.requireNonNull(builder);
        io.bidmachine.core.h.A(strJ, new Executable() { // from class: io.bidmachine.r2
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setIfv((String) obj);
            }
        });
        builder.setBmIfv(b2VarE.K(context));
        Set<String> setE = oc.d.e(context);
        if (!setE.isEmpty()) {
            builder.addAllInputlanguage(setE);
        }
        io.bidmachine.core.h.B(oc.d.s(context), new Executable() { // from class: io.bidmachine.s2
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setCharging(((Boolean) obj).booleanValue());
            }
        });
        io.bidmachine.core.h.B(oc.b.d(context), new Executable() { // from class: io.bidmachine.t2
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setHeadset(((Boolean) obj).booleanValue());
            }
        });
        Double dA = oc.d.a(context);
        if (dA != null) {
            builder.setBatterylevel(dA.floatValue());
        }
        io.bidmachine.core.h.B(oc.d.r(context), new Executable() { // from class: io.bidmachine.u2
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setBatterysaver(((Boolean) obj).booleanValue());
            }
        });
        builder.setDarkmode(oc.d.t(context));
        io.bidmachine.core.h.B(oc.d.q(context), new Executable() { // from class: io.bidmachine.v2
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setAirplane(((Boolean) obj).booleanValue());
            }
        });
        io.bidmachine.core.h.B(oc.d.u(context), new Executable() { // from class: io.bidmachine.w2
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setDnd(((Boolean) obj).booleanValue());
            }
        });
        if (dVar.c()) {
            io.bidmachine.core.h.A(oc.d.c(context), new Executable() { // from class: io.bidmachine.x2
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builder.setDevicename((String) obj);
                }
            });
            this.f20401a.b(context, builder, oc.d.b(context));
        }
        Double dK = oc.d.k(context);
        if (dK != null) {
            builder.setScreenbright(dK.floatValue());
        }
        builder.setLastbootup(SystemClock.elapsedRealtime());
        Set<String> setC = oc.b.c(context);
        if (setC != null && !setC.isEmpty()) {
            io.bidmachine.core.h.B(setC.iterator().next(), new Executable() { // from class: io.bidmachine.y2
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builder.setHeadsetname((String) obj);
                }
            });
        }
        builder.setApilevel(Build.VERSION.SDK_INT);
        builder.setTime(io.bidmachine.core.c.a());
        io.bidmachine.core.h.A(io.bidmachine.core.c.b(), new Executable() { // from class: io.bidmachine.z2
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setTimezone((String) obj);
            }
        });
        DeviceInfo deviceInfoObtain = DeviceInfo.obtain(context);
        Long availableDiskSpaceInMB = deviceInfoObtain.getAvailableDiskSpaceInMB();
        if (availableDiskSpaceInMB != null) {
            builder.setDiskspace(availableDiskSpaceInMB.intValue());
        }
        Long totalDiskSpaceInMB = deviceInfoObtain.getTotalDiskSpaceInMB();
        if (totalDiskSpaceInMB != null) {
            builder.setTotaldisk(totalDiskSpaceInMB.intValue());
        }
        builder.setJailbreak(deviceInfoObtain.isDeviceRooted());
        io.bidmachine.core.h.B(deviceInfoObtain.getAudio().c(context), new Executable() { // from class: io.bidmachine.a3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setRingmute(((Boolean) obj).booleanValue());
            }
        });
        Float fB = deviceInfoObtain.getAudio().b(context);
        if (fB != null) {
            builder.setAudioContext(com.explorestack.protobuf.adcom.Context.Device.AudioContext.newBuilder().setVolumelevel(fB.floatValue()).build());
        }
        deviceInfoObtain.updateHwInfo(context);
        io.bidmachine.core.h.B(deviceInfoObtain.getRam().c(), new Executable() { // from class: io.bidmachine.c3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setTotalmem(((Long) obj).longValue());
            }
        });
        io.bidmachine.core.h.B(deviceInfoObtain.getRam().b(), new Executable() { // from class: io.bidmachine.j3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setFreemem(((Long) obj).longValue());
            }
        });
        io.bidmachine.core.h.A(deviceInfoObtain.getCpu().c(), new Executable() { // from class: io.bidmachine.k3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setCpuname((String) obj);
            }
        });
        io.bidmachine.core.h.A(deviceInfoObtain.getCpu().d(), new Executable() { // from class: io.bidmachine.l3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setCpuvendor((String) obj);
            }
        });
        io.bidmachine.core.h.A(deviceInfoObtain.getGpu().f(), new Executable() { // from class: io.bidmachine.m3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setGpuname((String) obj);
            }
        });
        io.bidmachine.core.h.A(deviceInfoObtain.getGpu().g(), new Executable() { // from class: io.bidmachine.n3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setGpuvendor((String) obj);
            }
        });
        io.bidmachine.core.h.A(deviceInfoObtain.simCarrier, new Executable() { // from class: io.bidmachine.o3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                r3.j(builder, (String) obj);
            }
        });
        io.bidmachine.core.h.A(deviceInfoObtain.simCountry, new Executable() { // from class: io.bidmachine.p3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                r3.k(builder, (String) obj);
            }
        });
        io.bidmachine.core.h.B(deviceInfoObtain.isNetworkInRoaming, new Executable() { // from class: io.bidmachine.q3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                r3.l(builder, (Boolean) obj);
            }
        });
    }

    private void i(Context context, final com.explorestack.protobuf.adcom.Context.Device.Builder builder, TargetingParams targetingParams, TargetingParams targetingParams2, ga.d dVar, ConnectionType connectionType) {
        DeviceInfo deviceInfoObtain = DeviceInfo.obtain(context);
        builder.setType(deviceInfoObtain.isTablet ? DeviceType.DEVICE_TYPE_TABLET : DeviceType.DEVICE_TYPE_PHONE_DEVICE);
        builder.setOs(OS.OS_ANDROID);
        builder.setOsv(oc.d.h());
        builder.setPxratio(deviceInfoObtain.screenDensity);
        builder.setPpi(deviceInfoObtain.screenDpi);
        Size sizeY = io.bidmachine.core.h.y(context);
        builder.setW(sizeY.getWidth());
        builder.setH(sizeY.getHeight());
        builder.setIfa(AdvertisingDataManager.a(context, !dVar.a()));
        builder.setLmt(AdvertisingDataManager.b());
        if (dVar.c()) {
            if (connectionType == null) {
                connectionType = oc.d.b(context);
            }
            builder.setContype(connectionType);
            builder.setMake(oc.d.f());
            io.bidmachine.core.h.A(UserAgentManager.getUserAgent(context), new Executable() { // from class: io.bidmachine.b3
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builder.setUa((String) obj);
                }
            });
            io.bidmachine.core.h.B(deviceInfoObtain.model, new Executable() { // from class: io.bidmachine.d3
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builder.setModel((String) obj);
                }
            });
            io.bidmachine.core.h.B(deviceInfoObtain.getHWV(), new Executable() { // from class: io.bidmachine.e3
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builder.setHwv((String) obj);
                }
            });
            io.bidmachine.core.h.A(Locale.getDefault().getLanguage(), new Executable() { // from class: io.bidmachine.f3
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builder.setLang((String) obj);
                }
            });
            io.bidmachine.core.h.A(deviceInfoObtain.phoneMCCMNC, new Executable() { // from class: io.bidmachine.g3
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builder.setMccmnc((String) obj);
                }
            });
            io.bidmachine.core.h.A(deviceInfoObtain.phoneCarrier, new Executable() { // from class: io.bidmachine.h3
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builder.setCarrier((String) obj);
                }
            });
            this.f20401a.a(context, builder, connectionType);
        }
        if (dVar.b()) {
            builder.setGeo(oc.h.c(context, targetingParams.getDeviceLocation(), targetingParams2.getDeviceLocation(), true));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j(Device.Builder builder, String str) {
        builder.setSimCarrier(StringValue.of(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k(Device.Builder builder, String str) {
        builder.setSimCountry(StringValue.of(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(Device.Builder builder, Boolean bool) {
        builder.setNetworkRoaming(BoolValue.of(bool.booleanValue()));
    }

    void d(Context context, com.explorestack.protobuf.adcom.Context.Builder builder, TargetingParams targetingParams, TargetingParams targetingParams2, ga.d dVar, ConnectionType connectionType) {
        com.explorestack.protobuf.adcom.Context.Device.Builder builderG = g(context, targetingParams, targetingParams2, dVar, connectionType);
        if (builderG != null) {
            Device.Builder builderF = f(context, dVar);
            if (builderF != null) {
                builderG.addExtProto(Any.pack(builderF.build()));
            }
            builder.setDevice(builderG);
        }
    }

    void e(Context context, final RequestTokenPayload.Builder builder, ga.d dVar) {
        Device.Builder builderF = f(context, dVar);
        Objects.requireNonNull(builder);
        io.bidmachine.core.h.B(builderF, new Executable() { // from class: io.bidmachine.i3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setDeviceData((Device.Builder) obj);
            }
        });
    }
}
