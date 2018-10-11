package b15.rjt.com.mvp.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import b15.rjt.com.mvp.R;
import b15.rjt.com.mvp.data.TodoNote;

public class LoginActivity extends AppCompatActivity implements LoginContract.View{
LoginContract.Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        presenter = new LoginPresenter(this);
    }

    public void clickHandler(View view) {
        switch (view.getId()){
            case R.id.buttonlogin:
                TodoNote note = new TodoNote("note","subnote");
                //mr presenter someone clicked the login btn and this was the data in edittexts
                presenter.onLoginClicked(note);
                break;
            case R.id.buttoncancel:
                // i need to get data from db
                presenter.onButtonClicked();
                break;
        }
    }

    @Override
    public void showToast() {
        Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showNote(TodoNote note) {
        TextView textView = findViewById(R.id.textview);
        textView.setText(note.getTitle()+"\n"+note.getSubTitle());
    }
}
