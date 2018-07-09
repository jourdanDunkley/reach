package ctrl_it.reach;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class LoginActivity extends AppCompatActivity {

    private Button login_button, sign_up_button;
    private EditText email_input, password_input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login_button = findViewById(R.id.login_button);
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent0 = new Intent(view.getContext(), DriverDashboardActivity.class);
                startActivity(intent0);
            }
        });

        sign_up_button = findViewById(R.id.sign_up_button);

    }
}
