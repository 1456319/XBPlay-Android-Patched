package network;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Binder;

/**
 * A fallback implementation of BindService to ensure compilation while local streaming operates.
 * Since the external backend is down and this feature was primarily for remote network bindings,
 * these stub methods prevent application crashes on devices where the service cannot be legitimately resolved.
 */
public class BindService extends Service {
    public class MyBinder extends Binder {
        public BindService getService() {
            return BindService.this;
        }
    }

    private final IBinder mBinder = new MyBinder();
    public boolean ready = true; // Set to true to allow UI to proceed instead of blocking

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    public void powerOn(String liveId) {
        // Logging could be added here, but no network operations are performed
    }
    public void powerOff() {
    }
    public void sendSystemInputCommand(byte[] button) {
    }
    public void sendSystemInputSequence(byte[][] seq, int speed) {
    }
    public void discover() {
    }
    public void connect() {
    }
    public void openChannels() {
    }
    public String getLiveId() {
        return "local_fallback_id";
    }
    public void setListener(Interfaces.SmartglassEvents listener) {
    }
}
