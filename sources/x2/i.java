package x2;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* JADX INFO: compiled from: ComponentRegistrarProcessor.java */
/* JADX INFO: loaded from: classes4.dex */
public interface i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f27966a = new i() { // from class: x2.h
        @Override // x2.i
        public final List a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar.getComponents();
        }
    };

    List<c<?>> a(ComponentRegistrar componentRegistrar);
}
