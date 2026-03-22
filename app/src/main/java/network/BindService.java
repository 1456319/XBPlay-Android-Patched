package network;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Binder;

public class BindService extends Service {
    public class MyBinder extends Binder {
        public BindService getService() {
            return BindService.this;
        }
    }

    private final IBinder mBinder = new MyBinder();
    public boolean ready = false;

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    public void powerOn(String liveId) {}
    public void powerOff() {}
    public void sendSystemInputCommand(byte[] button) {}
    public void sendSystemInputSequence(byte[][] seq, int speed) {}
    public void discover() {}
    public void connect() {}
    public void openChannels() {}
    public String getLiveId() { return ""; }
    public void setListener(Interfaces.SmartglassEvents listener) {}
}
