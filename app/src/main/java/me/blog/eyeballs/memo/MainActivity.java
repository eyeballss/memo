package me.blog.eyeballs.memo;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {
    FloatingActionButton fab;
    ListView memoListView;
    MemoListViewAdapter memoListViewadaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        addItem("sample");



    }

    private void init() {

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlertDialog();
            }
        });

        //list view
        memoListView = (ListView)findViewById(R.id.memoListView);
        memoListViewadaptor = new MemoListViewAdapter(this);
        memoListView.setAdapter(memoListViewadaptor);

    }

    private void addItem(String str){
        memoListViewadaptor.addItem(str);
        memoListViewadaptor.notifyDataSetChanged();
    }

    private void showAlertDialog() {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);

        alert.setTitle("Title");
        alert.setMessage("Message");

        // Set an EditText view to get user input
        final EditText input = new EditText(this);
        alert.setView(input);

        alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                String value = input.getText().toString();
                value.toString();
                // Do something with value!
                addItem(value);
            }
        });


        alert.setNegativeButton("Cancel",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        // Canceled.
                    }
                });

        alert.show();
    }

}