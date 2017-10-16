package co.jagdishchoudhary.accountkitsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.facebook.accountkit.AccountKitError;

public class ErrorActivity extends AppCompatActivity {
    static final String HELLO_TOKEN_ACTIVITY_ERROR_EXTRA =
            "HELLO_TOKEN_ACTIVITY_ERROR_EXTRA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_error);

        final AccountKitError error =
                getIntent().getParcelableExtra(HELLO_TOKEN_ACTIVITY_ERROR_EXTRA);
        Toast.makeText(this, error.toString(), Toast.LENGTH_SHORT).show();

    }
}
