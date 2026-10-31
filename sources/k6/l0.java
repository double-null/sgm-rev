package k6;

import io.bidmachine.protobuf.rendering.Rendering;
import pb.d1;
import pb.h1;
import pb.v0;

/* JADX INFO: compiled from: AdaptiveRenderingParams.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class l0 {

    /* JADX INFO: compiled from: AdaptiveRenderingParams.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;

        static {
            int[] iArr = new int[Rendering.Orientation.values().length];
            try {
                iArr[Rendering.Orientation.ORIENTATION_PORTRAIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Rendering.Orientation.ORIENTATION_LANDSCAPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Rendering.Orientation.ORIENTATION_SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Rendering.Orientation.ORIENTATION_INVALID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Rendering.Orientation.UNRECOGNIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Rendering.CacheType.values().length];
            try {
                iArr2[Rendering.CacheType.CACHE_TYPE_FULL_LOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Rendering.CacheType.CACHE_TYPE_PARTIAL_LOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Rendering.CacheType.CACHE_TYPE_STREAM_LOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[Rendering.CacheType.CACHE_TYPE_INVALID.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[Rendering.CacheType.UNRECOGNIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Rendering.Phase.ViewComponent.ViewComponentType.values().length];
            try {
                iArr3[Rendering.Phase.ViewComponent.ViewComponentType.VIEW_COMPONENT_TYPE_MRAID.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[Rendering.Phase.ViewComponent.ViewComponentType.VIEW_COMPONENT_TYPE_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[Rendering.Phase.ViewComponent.ViewComponentType.VIEW_COMPONENT_TYPE_IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[Rendering.Phase.ViewComponent.ViewComponentType.VIEW_COMPONENT_TYPE_LABEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[Rendering.Phase.ViewComponent.ViewComponentType.VIEW_COMPONENT_TYPE_COUNTDOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[Rendering.Phase.ViewComponent.ViewComponentType.VIEW_COMPONENT_TYPE_PROGRESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.values().length];
            try {
                iArr4[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_CENTER_X.ordinal()] = 5;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr4[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_CENTER_Y.ordinal()] = 6;
            } catch (NoSuchFieldError unused22) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[Rendering.Image.ScaleType.values().length];
            try {
                iArr5[Rendering.Image.ScaleType.SCALE_TYPE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[Rendering.Image.ScaleType.SCALE_TYPE_TO_FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[Rendering.Image.ScaleType.SCALE_TYPE_ASPECT_FILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr5[Rendering.Image.ScaleType.SCALE_TYPE_ASPECT_FIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused26) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[Rendering.Phase.Event.EventName.values().length];
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_IMPRESSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_BILLABLE_IMPRESSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_CLICK.ordinal()] = 3;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_PROGRESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_NAVIGATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_MUTE.ordinal()] = 6;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_UNMUTE.ordinal()] = 7;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_PAUSE.ordinal()] = 8;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_RESUME.ordinal()] = 9;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_SKIP.ordinal()] = 10;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_CLOSE.ordinal()] = 11;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_START.ordinal()] = 12;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_FIRST_QUARTILE.ordinal()] = 13;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_MIDPOINT.ordinal()] = 14;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_THIRD_QUARTILE.ordinal()] = 15;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_COMPLETE.ordinal()] = 16;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_USE_CUSTOM_CLOSE.ordinal()] = 17;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_SCHEDULED.ordinal()] = 18;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_EXPAND.ordinal()] = 19;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_COLLAPSE.ordinal()] = 20;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_CLICK_RESOLVED.ordinal()] = 21;
            } catch (NoSuchFieldError unused47) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[Rendering.Phase.Event.Task.TaskName.values().length];
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_MUTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_UNMUTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_TRACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_CLOSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_SKIP.ordinal()] = 6;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_OPEN.ordinal()] = 7;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_SHOW.ordinal()] = 8;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_HIDE.ordinal()] = 9;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_PROGRESS.ordinal()] = 10;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_SCHEDULE.ordinal()] = 11;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_LOCK_VISIBILITY.ordinal()] = 12;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_UNLOCK_VISIBILITY.ordinal()] = 13;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_NOTIFY_OPEN.ordinal()] = 14;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_SIMULATE_CLICK.ordinal()] = 15;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_PRIVACY_SHEET.ordinal()] = 16;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_REPEAT.ordinal()] = 17;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_TOGGLE_STATE_GROUPS.ordinal()] = 18;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_EXPAND.ordinal()] = 19;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_COLLAPSE.ordinal()] = 20;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_REQUEST_PERMISSION.ordinal()] = 21;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_REPORT_CLICK.ordinal()] = 22;
            } catch (NoSuchFieldError unused69) {
            }
            $EnumSwitchMapping$6 = iArr7;
        }
    }

    public static final long j(Rendering.AdaptiveAnimation.Timing timing) {
        kotlin.jvm.internal.t.f(timing, "<this>");
        return kd.c.b(timing.getDuration() * ((double) 1000));
    }

    public static final pb.b k(final Rendering.Phase.ViewComponent.ViewComponentType viewComponentType) {
        if (viewComponentType == null) {
            return null;
        }
        switch (a.$EnumSwitchMapping$2[viewComponentType.ordinal()]) {
            case 1:
                return pb.b.Mraid;
            case 2:
                return pb.b.Video;
            case 3:
                return pb.b.Image;
            case 4:
                return pb.b.Label;
            case 5:
                return pb.b.Countdown;
            case 6:
                return pb.b.Progress;
            default:
                io.bidmachine.core.a.g(new qc.b() { // from class: k6.f0
                    @Override // qc.b
                    public final Object get() {
                        return l0.l(viewComponentType);
                    }
                });
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String l(Rendering.Phase.ViewComponent.ViewComponentType viewComponentType) {
        return "Unsupported ViewComponentType - " + viewComponentType.name();
    }

    public static final pb.u m(final Rendering.CacheType cacheType) {
        if (cacheType == null) {
            return null;
        }
        int i10 = a.$EnumSwitchMapping$1[cacheType.ordinal()];
        if (i10 == 1) {
            return pb.u.FullLoad;
        }
        if (i10 == 2) {
            return pb.u.PartialLoad;
        }
        if (i10 == 3) {
            return pb.u.StreamLoad;
        }
        if (i10 == 4 || i10 == 5) {
            io.bidmachine.core.a.d(new qc.b() { // from class: k6.d0
                @Override // qc.b
                public final Object get() {
                    return l0.n(cacheType);
                }
            });
            return null;
        }
        io.bidmachine.core.a.g(new qc.b() { // from class: k6.e0
            @Override // qc.b
            public final Object get() {
                return l0.o(cacheType);
            }
        });
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String n(Rendering.CacheType cacheType) {
        return "Unsupported CacheType - " + cacheType.name();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String o(Rendering.CacheType cacheType) {
        return "Unsupported CacheType - " + cacheType.name();
    }

    public static final pb.e0 p(final Rendering.Phase.Event.Task.TaskName taskName) {
        if (taskName == null) {
            return null;
        }
        switch (a.$EnumSwitchMapping$6[taskName.ordinal()]) {
            case 1:
                return pb.e0.Start;
            case 2:
                return pb.e0.Mute;
            case 3:
                return pb.e0.UnMute;
            case 4:
                return pb.e0.Track;
            case 5:
                return pb.e0.Close;
            case 6:
                return pb.e0.Skip;
            case 7:
                return pb.e0.Open;
            case 8:
                return pb.e0.Show;
            case 9:
                return pb.e0.Hide;
            case 10:
                return pb.e0.Progress;
            case 11:
                return pb.e0.Schedule;
            case 12:
                return pb.e0.LockVisibility;
            case 13:
                return pb.e0.UnlockVisibility;
            case 14:
                return pb.e0.NotifyOpen;
            case 15:
                return pb.e0.SimulateClick;
            case 16:
                return pb.e0.OpenPrivacySheet;
            case 17:
                return pb.e0.Repeat;
            case 18:
                return pb.e0.ToggleStateGroups;
            case 19:
                return pb.e0.Expand;
            case 20:
                return pb.e0.Collapse;
            case 21:
                return pb.e0.RequestPermission;
            case 22:
                return pb.e0.ReportClick;
            default:
                io.bidmachine.core.a.g(new qc.b() { // from class: k6.c0
                    @Override // qc.b
                    public final Object get() {
                        return l0.q(taskName);
                    }
                });
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String q(Rendering.Phase.Event.Task.TaskName taskName) {
        return "Unsupported TaskName - " + taskName.name();
    }

    public static final pb.f0 r(final Rendering.Phase.Event.EventName eventName) {
        if (eventName == null) {
            return null;
        }
        switch (a.$EnumSwitchMapping$5[eventName.ordinal()]) {
            case 1:
                return pb.f0.OnImpression;
            case 2:
                return pb.f0.OnBillableImpression;
            case 3:
                return pb.f0.OnClick;
            case 4:
                return pb.f0.OnProgress;
            case 5:
                return pb.f0.OnNavigate;
            case 6:
                return pb.f0.OnMute;
            case 7:
                return pb.f0.OnUnMute;
            case 8:
                return pb.f0.OnPause;
            case 9:
                return pb.f0.OnResume;
            case 10:
                return pb.f0.OnSkip;
            case 11:
                return pb.f0.OnClose;
            case 12:
                return pb.f0.OnStart;
            case 13:
                return pb.f0.OnFirstQuartile;
            case 14:
                return pb.f0.OnMidpoint;
            case 15:
                return pb.f0.OnThirdQuartile;
            case 16:
                return pb.f0.OnComplete;
            case 17:
                return pb.f0.OnUseCustomClose;
            case 18:
                return pb.f0.OnScheduled;
            case 19:
                return pb.f0.OnExpand;
            case 20:
                return pb.f0.OnCollapse;
            case 21:
                return pb.f0.OnClickResolved;
            default:
                io.bidmachine.core.a.g(new qc.b() { // from class: k6.i0
                    @Override // qc.b
                    public final Object get() {
                        return l0.s(eventName);
                    }
                });
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String s(Rendering.Phase.Event.EventName eventName) {
        return "Unsupported EventName - " + eventName.name();
    }

    public static final v0 t(final Rendering.Orientation orientation) {
        if (orientation == null) {
            return null;
        }
        int i10 = a.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i10 == 1) {
            return v0.Portrait;
        }
        if (i10 == 2) {
            return v0.Landscape;
        }
        if (i10 == 3) {
            return null;
        }
        if (i10 == 4 || i10 == 5) {
            io.bidmachine.core.a.d(new qc.b() { // from class: k6.g0
                @Override // qc.b
                public final Object get() {
                    return l0.u(orientation);
                }
            });
            return null;
        }
        io.bidmachine.core.a.g(new qc.b() { // from class: k6.h0
            @Override // qc.b
            public final Object get() {
                return l0.v(orientation);
            }
        });
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String u(Rendering.Orientation orientation) {
        return "Unsupported Orientation - " + orientation.name();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String v(Rendering.Orientation orientation) {
        return "Unsupported Orientation - " + orientation.name();
    }

    public static final d1 w(final Rendering.Image.ScaleType scaleType) {
        if (scaleType == null) {
            return null;
        }
        int i10 = a.$EnumSwitchMapping$4[scaleType.ordinal()];
        if (i10 == 1) {
            return d1.None;
        }
        if (i10 == 2) {
            return d1.ToFill;
        }
        if (i10 == 3) {
            return d1.AspectFill;
        }
        if (i10 == 4) {
            return d1.AspectFit;
        }
        io.bidmachine.core.a.g(new qc.b() { // from class: k6.k0
            @Override // qc.b
            public final Object get() {
                return l0.x(scaleType);
            }
        });
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String x(Rendering.Image.ScaleType scaleType) {
        return "Unsupported ScaleType - " + scaleType.name();
    }

    public static final h1 y(final Rendering.Phase.ViewComponent.Layout.Constraint.Anchor anchor) {
        if (anchor == null) {
            return null;
        }
        switch (a.$EnumSwitchMapping$3[anchor.ordinal()]) {
            case 1:
                return h1.Left;
            case 2:
                return h1.Right;
            case 3:
                return h1.f24099d;
            case 4:
                return h1.Bottom;
            case 5:
                return h1.CenterX;
            case 6:
                return h1.CenterY;
            default:
                io.bidmachine.core.a.g(new qc.b() { // from class: k6.j0
                    @Override // qc.b
                    public final Object get() {
                        return l0.z(anchor);
                    }
                });
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String z(Rendering.Phase.ViewComponent.Layout.Constraint.Anchor anchor) {
        return "Unsupported Anchor for SideType - " + anchor.name();
    }
}
