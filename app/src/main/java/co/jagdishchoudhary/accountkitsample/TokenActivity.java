package co.jagdishchoudhary.accountkitsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.facebook.accountkit.Account;
import com.facebook.accountkit.AccountKit;
import com.facebook.accountkit.AccountKitCallback;
import com.facebook.accountkit.AccountKitError;
import com.facebook.accountkit.PhoneNumber;

public class TokenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_token);
    }
    @Override
    protected void onResume() {
        super.onResume();

        AccountKit.getCurrentAccount(new AccountKitCallback<Account>() {
            @Override
            public void onSuccess(Account account) {
                Toast.makeText(TokenActivity.this, account.getId().toString(), Toast.LENGTH_SHORT).show();

                final PhoneNumber number = account.getPhoneNumber();

                Toast.makeText(TokenActivity.this, number == null ? null : number.toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError(AccountKitError accountKitError) {

            }
        });
    }
}
