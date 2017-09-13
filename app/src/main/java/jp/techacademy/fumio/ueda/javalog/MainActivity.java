package jp.techacademy.fumio.ueda.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("章雄", 24 ,"Java");     // 名前を章雄、年齢24歳で、Javaについて考える、Humanのインスタンスを作る

        human.say();
        human.think();
    }

}