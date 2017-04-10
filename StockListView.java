package android.gowenxi.fundfair.fundfairv1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class StockListView extends AppCompatActivity {

    String stock[] = {
            "Alibaba Group Holding Ltd (NYSE:BABA)",
            "Apple Inc (NASDAQ:AAPL)",
            "BPI Energy Holdings Inc (NYSE:BP)",
            "Facebook Inc (NASDAQ:FB)",
            "Ford Motor Co. (NYSE:F)",
            "HSBC Holdings PLC (NYSE:HSBC)",
            "LVMH Moet Hennessy Louis Vuitton SE (LVMHF)",
            "McDonald's Corp (NYSE:MCD)",
            "Prudential Financial Inc (NYSE:PRU)",
            "Starbucks Corp (NASDAQ:SBUX)"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock_list_view);

        ListView listview = (ListView) findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, stock);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String stock = (String) adapterView.getItemAtPosition(i);
                Toast.makeText(view.getContext(), "You have selected " + stock, Toast.LENGTH_SHORT).show();

                if (i == 0)
                {
                    Intent a = new Intent(view.getContext(),Alibaba.class);
                    startActivity(a);
                }

                if(i==1)
                {
                    Intent a = new Intent(view.getContext(),Apple.class);
                    startActivity(a);
                }

                if(i==2)
                {
                    Intent a = new Intent(view.getContext(),Bpi.class);
                    startActivity(a);
                }

                if(i==3)
                {
                    Intent a = new Intent(view.getContext(),Facebook.class);
                    startActivity(a);
                }


            }
        });
    }

}
