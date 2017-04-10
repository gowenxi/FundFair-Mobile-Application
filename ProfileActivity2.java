package android.gowenxi.fundfair.fundfairv1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {
    //firebaseauthobject
    private FirebaseAuth firebaseAuth;

    //viewobjects
    private TextView textViewUserEmail;
    private Button buttonLogout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


//initializingfirebaseauthenticationobject
        firebaseAuth = FirebaseAuth.getInstance();

//iftheuserisnotloggedin
//thatmeanscurrentuserwillreturnnull
        if (firebaseAuth.getCurrentUser() == null) {
//closingthisactivity
            finish();
//startingloginactivity
            startActivity(new Intent(this, LoginActivity.class));
        }

//gettingcurrentuser
        FirebaseUser user = firebaseAuth.getCurrentUser();

//initializingviews
        textViewUserEmail = (TextView) findViewById(R.id.textViewUserEmail);
        buttonLogout = (Button) findViewById(R.id.buttonLogout);

//displayingloggedinusername
        textViewUserEmail.setText("Welcome" + user.getEmail());

//addinglistenertobutton
        buttonLogout.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
//iflogoutispressed
        if (view == buttonLogout) {
//loggingouttheuser
            firebaseAuth.signOut();
//closingactivity
            finish();
//startingloginactivity
            startActivity(new Intent(this, LoginActivity.class));
        }
    }
}
