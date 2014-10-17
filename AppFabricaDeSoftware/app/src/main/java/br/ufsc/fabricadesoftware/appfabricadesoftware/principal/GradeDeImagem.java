package br.ufsc.fabricadesoftware.appfabricadesoftware.principal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by Thiago Raulino Dal Pont on 17/10/2014.
 */
public class GradeDeImagem extends ImageView {
    public GradeDeImagem(Context context) {
        super(context);
    }

    public GradeDeImagem(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public GradeDeImagem(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
    }


}
