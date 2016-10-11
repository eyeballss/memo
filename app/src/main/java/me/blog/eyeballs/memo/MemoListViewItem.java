package me.blog.eyeballs.memo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MemoListViewItem extends LinearLayout {

    TextView itemTextView;

    public MemoListViewItem(Context context){
        super(context);
        init(context);
    }
    public MemoListViewItem(Context context, AttributeSet attrs){
        super(context, attrs);
        init(context);
    }

    private void init(Context context){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.memo_list_view_item, this, true);

        itemTextView= (TextView)findViewById(R.id.itemTextView);

    }

    public void set(String str){
        itemTextView.setText(str);

    }

}
