package me.blog.eyeballs.memo;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class MemoListViewAdapter extends BaseAdapter{
    Activity context;
    ArrayList<String> abc;
    public MemoListViewAdapter(Activity context){
        this.context=context;
        abc = new ArrayList<String>();
    }

    public void addItem(String str){
        abc.add(str);
    }


    @Override
    public int getCount() {
        return abc.size();
    }

    @Override
    public Object getItem(int i) {
        return abc.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        MemoListViewItem returnView = null;
        if(view==null) returnView = new MemoListViewItem(context);
        else returnView = (MemoListViewItem) view;

        returnView.set(abc.get(i));
        return returnView;

    }
}
