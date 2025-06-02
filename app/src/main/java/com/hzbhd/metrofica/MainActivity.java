package com.hzbhd.metrofica;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.hzbhd.R;
import com.hzbhd.metrofica.canbus.CanbusMsgSender;
import com.hzbhd.metrofica.canbus.CanbusMsgServiceSwm;
import com.hzbhd.metrofica.log.LogMessage;
import com.hzbhd.metrofica.log.LoggerUI;
import com.hzbhd.metrofica.proxy.mcu.core.MCUMainManager;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class MainActivity extends AppCompatActivity {
    private String[] steeringModes;
    private TextView valueTextView;
    private boolean swmServiceRunning;

    private int currentIndex = 0;
   /*private BroadcastReceiver logReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String log = intent.getStringExtra("log");
            // Aquí agregás el log a tu contenedor visual

        }
    };*/

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onLogUpdate(LogMessage logMessage) {
        addLogLineToUI(logMessage);
    }

    private void addLogLineToUI(LogMessage log) {
        TextView newLogLine = new TextView(this);
        newLogLine.setText(log.getMessage());
        if ("ERROR".equalsIgnoreCase(log.getType())) {
            newLogLine.setTextColor(Color.parseColor("#FF3333"));
        } else {
            newLogLine.setTextColor(Color.WHITE);
        }

        newLogLine.setTextSize(TypedValue.COMPLEX_UNIT_SP, 19);
        LinearLayout logContainer = findViewById(R.id.logs_container);
        logContainer.addView(newLogLine);
        ScrollView scrollView = findViewById(R.id.scrollable_logs);
        scrollView.fullScroll(View.FOCUS_DOWN);
        //scrollView.post(() -;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EventBus.getDefault().register(this);
        setContentView(R.layout.activity_main);
        valueTextView = findViewById(R.id.power_steering_value);
        steeringModes = getResources().getStringArray(R.array.steering_modes);
        Button iniciarButton = findViewById(R.id.btn_start_service);
        Button mcuTestButton = findViewById(R.id.btn_test_mcu);
        LinearLayout logContainer = findViewById(R.id.logs_container);
        logContainer.removeAllViews();
        iniciarButton.setOnClickListener(v -> {
            if (isServiceRunning(this, CanbusMsgServiceSwm.class)) {
                swmServiceRunning = false;
                stopService(new Intent(this, CanbusMsgServiceSwm.class));
                LoggerUI.d("MainActivity", "Destruyendo el servicio CanbusMsgServiceSwm");
                iniciarButton.setText("ENCENDER SERVICIO");
                return;
            }
            startService(new Intent(this, CanbusMsgServiceSwm.class));
            LoggerUI.d("MainActivity", "Iniciando CanbusMsgServiceSwm");
            iniciarButton.setText("APAGAR SERVICIO");
            swmServiceRunning = true;
        });
        mcuTestButton.setOnClickListener(v -> {
            LoggerUI.d("MCUTEST", "Testing MCU");
            int powerStatus = MCUMainManager.getInstance().getPowerStatus();
            LoggerUI.d("MCUTEST", "Power Status: " + powerStatus);

            byte value = (byte) ((currentIndex == 0) ? 1 : 0);  // Aplica lógica inversa como en el viejo
            byte[] msg = new byte[]{22, 13, value};
            // Enviar el mensaje
            CanbusMsgSender.sendMsg(msg);

        });
        ImageView btnLeft = findViewById(R.id.power_steering_left_button);
        ImageView btnRight = findViewById(R.id.power_steering_right_button);
        btnLeft.setOnClickListener(v -> {
            currentIndex = (currentIndex - 1 + steeringModes.length) % steeringModes.length;
            updateText(currentIndex);
            sendToMcu(steeringModes[currentIndex]);
        });

        btnRight.setOnClickListener(v -> {
            currentIndex = (currentIndex + 1) % steeringModes.length;
            updateText(currentIndex);
            sendToMcu(steeringModes[currentIndex]);
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


    }

    public boolean isServiceRunning(Context context, Class<?> serviceClass) {
        ActivityManager manager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        if (manager == null) return false;

        for (ActivityManager.RunningServiceInfo service : manager.getRunningServices(Integer.MAX_VALUE)) {
            if (serviceClass.getName().equals(service.service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    @Override
    protected void onResume() {
        super.onResume();
//        EventBus.getDefault().register(this);
        // LocalBroadcastManager.getInstance(this).registerReceiver(logReceiver, new IntentFilter("com.hzbhd.LOG_UPDATE_SWM"));
    }

    @Override
    protected void onPause() {
        super.onPause();
        //   EventBus.getDefault().unregister(this);
        // LocalBroadcastManager.getInstance(this).unregisterReceiver(logReceiver);
    }

    @Override
    protected void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    private void sendToMcu(String mode) {
        // Aquí envías la selección al MCU via AIDL
        Log.d("MCU", "Enviando modo: " + mode);
        // Ejemplo: mcuService.setSteeringMode(mode);
    }

    private void updateText(int index) {
        valueTextView.setText(steeringModes[currentIndex] + " [" + index + "]");
    }
}