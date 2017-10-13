package testglide.victory.com.testglide;

import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.module.GlideModule;

/**
 * 作者： Victory
 * 创建时间：  2017/10/13
 * 邮箱：cuiyongtao520@163.com
 * QQ：949021037
 * 说明：
 */

public class GlideConfiguration implements GlideModule{
    @Override
    public void applyOptions(Context context, GlideBuilder builder) {
        builder.setDecodeFormat(DecodeFormat.PREFER_ARGB_8888); //修改Bitmap格式为ARGB_8888
    }
    @Override
    public void registerComponents(Context context, Glide glide) {

    }
}