package kz.tezdet.training.android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by daulet on 8/12/15.
 */
public class PresentedActivity extends AppCompatActivity {

    public static final int REQUEST_CODE_PRESENTED = 1 ;

    EditText editText ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presented);

        editText = (EditText)findViewById(R.id.editName) ;
    }

    public void onBackPresented(View v){
        Intent intent = new Intent() ;
        String name = editText.getText().toString() ;
        intent.putExtra("name", name) ;
        setResult(RESULT_OK, intent);
        finish();
    }
}
