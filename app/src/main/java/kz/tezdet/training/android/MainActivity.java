package kz.tezdet.training.android;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private TextView txtName ;
    private TextView txtUserLanguage ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = (TextView)findViewById(R.id.txtName) ;
        txtUserLanguage = (TextView)findViewById(R.id.txtUserLanguage) ;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(resultCode == RESULT_OK){
            switch(requestCode){
                case PresentedActivity.REQUEST_CODE_PRESENTED:
                    String name = data.getStringExtra("name") ;
                    txtName.setText(name);
                    break ;
                case LanguageActivity.REQUEST_CODE_LANGUAGE:
                    String language = data.getStringExtra("language") ;
                    txtUserLanguage.setText(language);
                    break ;
            }
        } else
            Toast.makeText(this, "Error!!!", Toast.LENGTH_SHORT).show();
    }

    public void onButtonSelect(View v){
        Intent intent ;
        switch (v.getId()){

            case R.id.btnPresented:
                intent = new Intent(this, PresentedActivity.class) ;
                startActivityForResult(intent, PresentedActivity.REQUEST_CODE_PRESENTED);
                break ;

            case R.id.btnLanguage:
                intent = new Intent(this, LanguageActivity.class) ;
                startActivityForResult(intent, LanguageActivity.REQUEST_CODE_LANGUAGE);
                break ;
        }
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
