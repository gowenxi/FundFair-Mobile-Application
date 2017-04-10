package android.gowenxi.fundfair.fundfairv1;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Facebook extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);

        Button showDialog = (Button)findViewById(R.id.btnBuy);
        showDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Facebook.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_buy,null);
                final EditText etLot = (EditText) mView.findViewById(R.id.etLot);
                Button mConfirm = (Button) mView.findViewById(R.id.buyConfirm);
                final Button mCheckPortfolio = (Button) mView.findViewById(R.id.checkPortfolio);

                mConfirm.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        if(!etLot.getText().toString().isEmpty() && etLot.getText().toString().equals("5"))
                        {
                            Toast.makeText(Facebook.this,"Transaction Successful",Toast.LENGTH_SHORT).show();
                            mCheckPortfolio.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            Toast.makeText(Facebook.this,"Insufficient cash",Toast.LENGTH_SHORT).show();
                        }
                    }
                });

                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();
            }
        });
    }
}
