package com.example.btmview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Cart_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        Button btn_gotoAdd=(Button)findViewById(R.id.btn_gotoAdd);
        btn_gotoAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), cart2_Activity.class);
                startActivity(intent);

            }
        });




        //여기부터 복붙
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navi);
        bottomNavigationView.setSelectedItemId(R.id.Cart);  //아이콘 선택된거 표시하는거임. 아이콘 이름 넣어줘야됩니다.


        //초기 화면을 home으로 즉, FrameLayout(main_frame)에 fragement_home.xml 띄우기
        //     getSupportFragmentManager().beginTransaction().add(R.id.main_frame, new home()).commit();

        //네비게이션 뷰 아이템 누르면 이동하는거
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int itemId = item.getItemId();

                if (itemId == R.id.home) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    finish();
                    return true;
                     //자기 페이지에 해당하는 if문에 리턴 트루만 남기기.
                } else if (itemId == R.id.Recipe) {
                    startActivity(new Intent(getApplicationContext(), Recipe_Acitvity.class));
                    finish();
                    return true;
                } else if (itemId == R.id.Cart) {
                    return true;
                }else if (itemId == R.id.Community) {
                    startActivity(new Intent(getApplicationContext(), Community_Acitvity.class));
                    finish();
                    return true;
                }else if (itemId == R.id.Profile) {
                    startActivity(new Intent(getApplicationContext(), Profile_Activity.class));
                    finish();
                    return true;
                }
                return false;
            }
        });
    }
}