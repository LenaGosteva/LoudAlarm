package com.example.loudalarm.Activities;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.loudalarm.Adapters.ThemeAdapter;
import com.example.loudalarm.App;
import com.example.loudalarm.R;
import com.example.loudalarm.databinding.ActivityThemeBinding;

public class ThemeActivity extends AppCompatActivity {
    TextView[] dots;
    ActivityThemeBinding binding;
    ThemeAdapter themeAdapter;
    int[] images = {
            R.drawable.background,
            R.drawable.background_1,
            R.drawable.background_light,
            R.drawable.background_light_3,
            R.drawable.background_light_2,
            R.drawable.background_violet_dark
    };
    int[] themes = {
            R.style.Background,
            R.style.Background_1,
            R.style.Background_light,
            R.style.Background_light_3,
            R.style.Background_light_2,
            R.style.Background_violet_dark,
    };

    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            setUpIndicator(position);

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setTheme(App.getThemes()[App.getIndexOfTheme()]);

        binding = ActivityThemeBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding.nameOfChangedTheme.setText(App.getNamesOfThemes().get(binding.slideViewPager.getCurrentItem()));

        binding.backBtn.setOnClickListener(v -> {
            binding.slideViewPager.setCurrentItem(images.length - 1);

        });

        binding.nextbtn.setOnClickListener(v -> {
            if (getItem(0) < images.length - 1) {
                binding.slideViewPager.setCurrentItem(getItem(1), true);
            } else {
                binding.slideViewPager.setCurrentItem(0);
            }
        });

        binding.changeButton.setOnClickListener(v -> {
            showDialogInfo(this, "Изменение темы", "Перезапустить приложение для смены фона?");

        });

        themeAdapter = new ThemeAdapter(this, images);

        binding.slideViewPager.setAdapter(themeAdapter);

        setUpIndicator(0);
        binding.slideViewPager.addOnPageChangeListener(viewListener);
    }

    private void showDialogInfo(Context context, String title, String info) {

        dialog = new Dialog(context);
        dialog.setContentView(R.layout.alert_info_two);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        TextView textView = dialog.findViewById(R.id.text);
        textView.setText(info);

        TextView title_view = dialog.findViewById(R.id.title);
        title_view.setText(title);

        Button ok = dialog.findViewById(R.id.button_ok), not = dialog.findViewById(R.id.button_not);


        not.setOnClickListener(not_ -> {
                    dialog.dismiss();
                }
        );
        ok.setOnClickListener(not_ -> {
                    App.getDatabaseSP().saveIndexOfTheme(binding.slideViewPager.getCurrentItem());
                    dialog.dismiss();
                    Intent i = new Intent(this, SplashActivity.class);
                    startActivity(i);
                    finish();
                }
        );


        dialog.show();
    }

    public void setUpIndicator(int position) {
        dots = new TextView[images.length];
        binding.indicatorLayout.removeAllViews();

        for (int i = 0; i < dots.length; i++) {
            dots[i] = new TextView(this);
            dots[i].setText(Html.fromHtml("&#8226"));
            dots[i].setTextSize(35);
            dots[i].setTextColor(getResources().getColor(R.color.main_text_and_icons_color, getApplicationContext().getTheme()));
            binding.indicatorLayout.addView(dots[i]);
            binding.nameOfChangedTheme.setText(App.getNamesOfThemes().get(binding.slideViewPager.getCurrentItem()));

        }

        dots[position].setTextColor(getResources().getColor(R.color.teal_200, getApplicationContext().getTheme()));
    }

    private int getItem(int i) {
        return binding.slideViewPager.getCurrentItem() + i;
    }

}