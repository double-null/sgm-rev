package o7;

import com.explorestack.protobuf.w1;
import io.bidmachine.protobuf.rendering.Rendering;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k6.l0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.b0;
import kotlin.collections.u;
import kotlin.jvm.internal.t;
import pb.d0;
import pb.e0;
import pb.f0;

/* JADX INFO: compiled from: BidMachineProtoUtils.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: compiled from: BidMachineProtoUtils.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[f0.values().length];
            try {
                iArr[f0.OnImpression.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f0.OnBillableImpression.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f0.OnClick.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f0.OnMute.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[f0.OnUnMute.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[f0.OnPause.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[f0.OnResume.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[f0.OnSkip.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[f0.OnClose.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[f0.OnStart.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[f0.OnFirstQuartile.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[f0.OnMidpoint.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[f0.OnThirdQuartile.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[f0.OnComplete.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[f0.OnProgress.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[f0.OnUseCustomClose.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[f0.OnScheduled.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[f0.OnNavigate.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[f0.OnExpand.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[f0.OnCollapse.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[f0.OnClickResolved.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[e0.values().length];
            try {
                iArr2[e0.Track.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[e0.Open.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[e0.NotifyOpen.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[e0.Skip.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[e0.Close.ordinal()] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[e0.Mute.ordinal()] = 6;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[e0.UnMute.ordinal()] = 7;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[e0.Repeat.ordinal()] = 8;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[e0.Show.ordinal()] = 9;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr2[e0.Hide.ordinal()] = 10;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr2[e0.Progress.ordinal()] = 11;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr2[e0.Schedule.ordinal()] = 12;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr2[e0.Start.ordinal()] = 13;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr2[e0.LockVisibility.ordinal()] = 14;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr2[e0.UnlockVisibility.ordinal()] = 15;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr2[e0.SimulateClick.ordinal()] = 16;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr2[e0.OpenPrivacySheet.ordinal()] = 17;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr2[e0.ToggleStateGroups.ordinal()] = 18;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr2[e0.Expand.ordinal()] = 19;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr2[e0.Collapse.ordinal()] = 20;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr2[e0.RequestPermission.ordinal()] = 21;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr2[e0.ReportClick.ordinal()] = 22;
            } catch (NoSuchFieldError unused43) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final Rendering.Phase.Event.Task a(d0 d0Var) {
        t.f(d0Var, "<this>");
        Rendering.Phase.Event.Task.Builder builderAddAllStateGroups = Rendering.Phase.Event.Task.newBuilder().setName(f(d0Var.a())).setTarget(d0Var.c()).addAllStateGroups(d0Var.b());
        t.e(builderAddAllStateGroups, "newBuilder()\n        .se…lStateGroups(stateGroups)");
        Object objD = d0Var.d();
        if (objD != null) {
            builderAddAllStateGroups.setValue(objD.toString());
        }
        Rendering.Phase.Event.Task taskBuild = builderAddAllStateGroups.build();
        t.e(taskBuild, "taskBuilder.build()");
        return taskBuild;
    }

    public static final d0 b(Rendering.Phase.Event.Task task) {
        e0 e0VarP;
        t.f(task, "<this>");
        if (task == Rendering.Phase.Event.Task.getDefaultInstance() || (e0VarP = l0.p(task.getName())) == null) {
            return null;
        }
        String target = task.getTarget();
        t.e(target, "target");
        String value = task.getValue();
        w1 stateGroupsList = task.getStateGroupsList();
        t.e(stateGroupsList, "stateGroupsList");
        return new d0(e0VarP, target, value, b0.p0(stateGroupsList));
    }

    public static final List<Rendering.Phase.Event.Task> c(List<d0> list) {
        t.f(list, "<this>");
        ArrayList arrayList = new ArrayList(u.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a((d0) it.next()));
        }
        return arrayList;
    }

    public static final List<d0> d(List<Rendering.Phase.Event.Task> list) {
        t.f(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            d0 d0VarB = b((Rendering.Phase.Event.Task) it.next());
            if (d0VarB != null) {
                arrayList.add(d0VarB);
            }
        }
        return arrayList;
    }

    public static final Rendering.Phase.Event.EventName e(f0 f0Var) {
        t.f(f0Var, "<this>");
        switch (a.$EnumSwitchMapping$0[f0Var.ordinal()]) {
            case 1:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_IMPRESSION;
            case 2:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_BILLABLE_IMPRESSION;
            case 3:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_CLICK;
            case 4:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_MUTE;
            case 5:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_UNMUTE;
            case 6:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_PAUSE;
            case 7:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_RESUME;
            case 8:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_SKIP;
            case 9:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_CLOSE;
            case 10:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_START;
            case 11:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_FIRST_QUARTILE;
            case 12:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_MIDPOINT;
            case 13:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_THIRD_QUARTILE;
            case 14:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_COMPLETE;
            case 15:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_PROGRESS;
            case 16:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_USE_CUSTOM_CLOSE;
            case 17:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_SCHEDULED;
            case 18:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_NAVIGATE;
            case 19:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_EXPAND;
            case 20:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_COLLAPSE;
            case 21:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_CLICK_RESOLVED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final Rendering.Phase.Event.Task.TaskName f(e0 e0Var) {
        t.f(e0Var, "<this>");
        switch (a.$EnumSwitchMapping$1[e0Var.ordinal()]) {
            case 1:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_TRACK;
            case 2:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_OPEN;
            case 3:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_NOTIFY_OPEN;
            case 4:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_SKIP;
            case 5:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_CLOSE;
            case 6:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_MUTE;
            case 7:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_UNMUTE;
            case 8:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_REPEAT;
            case 9:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_SHOW;
            case 10:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_HIDE;
            case 11:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_PROGRESS;
            case 12:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_SCHEDULE;
            case 13:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_START;
            case 14:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_LOCK_VISIBILITY;
            case 15:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_UNLOCK_VISIBILITY;
            case 16:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_SIMULATE_CLICK;
            case 17:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_PRIVACY_SHEET;
            case 18:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_TOGGLE_STATE_GROUPS;
            case 19:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_EXPAND;
            case 20:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_COLLAPSE;
            case 21:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_REQUEST_PERMISSION;
            case 22:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_REPORT_CLICK;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
