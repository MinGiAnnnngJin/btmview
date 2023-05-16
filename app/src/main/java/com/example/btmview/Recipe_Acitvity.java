package com.example.btmview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Recipe_Acitvity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dish);

        //여기서 부터 복붙!!!
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navi);
        bottomNavigationView.setSelectedItemId(R.id.Recipe);  //아이콘 선택된거 표시하는거임. 승윤이 home은home으로, profile은 profile로 바꾸고  재희선배는 community로 바꾸기.

        //네비게이션 뷰 아이템 누르면 이동하는거
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int itemId = item.getItemId();

                if (itemId == R.id.home) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));    //승윤이 home페이지 할 때 는 retur true만 남기고 다 지우기. 바로 밑에 코드 dish if문 처럼., 재희선배는 냅두기.
                    finish();
                    return true;
                    //자기 페이지에 해당하는 if문에 리턴 트루만 남기기.
                } else if (itemId == R.id.Recipe) {
                    return true;
                } else if (itemId == R.id.Cart) {
                    startActivity(new Intent(getApplicationContext(), Cart_Activity.class));
                    finish();
                    return true;
                }else if (itemId == R.id.Community) {
                    startActivity(new Intent(getApplicationContext(), Community_Acitvity.class));   //재희선배는 retur true만 남기고 다 지우기. 위에 코드 dish if문 처럼., 승윤이는 냅두기.
                    finish();
                    return true;
                }else if (itemId == R.id.Profile) {
                    startActivity(new Intent(getApplicationContext(), Profile_Activity.class));  //승윤이 profile 페이지 할 때 는 retur true만 남기고 다 지우기. 위에 코드 dish if문 처럼., 재희선배는 냅두기.
                    finish();
                    return true;
                }
                return false;
            }
        });
        //여기까지 복붙하세요
    }
}