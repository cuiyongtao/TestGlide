package testglide.victory.com.testglide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class MainActivity extends AppCompatActivity {

    private ImageView mivTestImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mivTestImage=(ImageView) findViewById(R.id.ivTestImage);
        Glide.with(this).load("你的图片地址").diskCacheStrategy(DiskCacheStrategy.SOURCE).into(mivTestImage);
    }
}
