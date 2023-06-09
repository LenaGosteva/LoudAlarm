package com.example.loudalarm.Activities;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.loudalarm.App;
import com.example.loudalarm.AuthController.DBController;
import com.example.loudalarm.Fragments.AddFragment;
import com.example.loudalarm.Fragments.HomeFragment;
import com.example.loudalarm.Fragments.SettingsFragment;
import com.example.loudalarm.R;
import com.example.loudalarm.Room.AlarmDAO;
import com.example.loudalarm.Room.AlarmEntity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.database.DataSnapshot;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    public AlarmDAO alarmDatabaseDAO;
    List<AlarmEntity> alarms;

    DBController authController;

    public BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener =
            item -> {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        new Thread(() -> {
                            alarmDatabaseDAO = App.getDatabase().alarmDAO();
                            alarms = alarmDatabaseDAO.getAll();
                            if (alarms.size() == 0) {
                                alarms.add(new AlarmEntity());
                            }
                            runOnUiThread(() -> {
                                        loadFragment(HomeFragment.newInstance(alarms));
                                    }
                            );
                        }).start();
                        return true;
                    case R.id.navigation_settings:
                        loadFragment(SettingsFragment.newInstance((App.getDefaultMusicUri())));
                        return true;
                    case R.id.navigation_add:
                        Log.e("ADD_ID", App.getDefaultMusicUri() + "");
                        loadFragment(AddFragment.newInstance(new AlarmEntity(App.getDefaultMusicUri() + "")));
                        return true;
                }
                return false;
            };


    public void loadFragment(Fragment fragment) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fl_content, fragment);
        ft.commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setTheme(App.getThemes()[App.getDatabaseSP().getIndexOfTheme()]);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        authController = new DBController();
        new Thread(() -> {
            alarmDatabaseDAO = App.getDatabase().alarmDAO();
            if (authController.isAuth()) {

                authController.getAlarmsFromDb(task -> {
                    if (task.isSuccessful()) {
                        new Thread(() -> {
                            alarmDatabaseDAO.clear();
                            for (DataSnapshot e : task.getResult().getChildren()) {
                                alarmDatabaseDAO.save(e.getValue(AlarmEntity.class));
                                Log.e("rduyfgih", alarmDatabaseDAO.getAll().toArray().length + " ");
                            }
                            alarms = alarmDatabaseDAO.getAll();

                            runOnUiThread(() -> {
                                loadFragment(HomeFragment.newInstance(alarms));
                            });
                        }).start();
                    } else {
                        alarms = alarmDatabaseDAO.getAll();
                        runOnUiThread(() -> {
                            loadFragment(HomeFragment.newInstance(alarms));
                        });
                    }
                });
            } else {
                alarms = alarmDatabaseDAO.getAll();
                runOnUiThread(() -> {

                    loadFragment(HomeFragment.newInstance(alarms));
                });
            }

        }).start();

        BottomNavigationView navigation = findViewById(R.id.nav_view);
        navigation.setSelectedItemId(R.id.navigation_home);
        navigation.setItemHorizontalTranslationEnabled(false);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}