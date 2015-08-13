package kz.tezdet.training.android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by daulet on 8/12/15.
 */
public class LanguageActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_LANGUAGE = 2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
    }

    public void onSelectLanguage(View v){
        Intent intent ;

        switch (v.getId()){
            case R.id.btnEnglish:
                intent = new Intent() ;
                intent.putExtra("language", "English") ;
                setResult(RESULT_OK, intent);
                finish();
                break ;

            case R.id.btnQazaq:
                intent = new Intent() ;
                intent.putExtra("language", "Қазақша") ;
                setResult(RESULT_OK, intent);
                finish();
                break ;
        }
    }
}
