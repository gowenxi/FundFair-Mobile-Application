package android.gowenxi.fundfair.fundfairv1;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Wen Xi on 7/4/2017.
 */

public class StockAdapter extends RecyclerView.Adapter<StockAdapter.StockViewHolder> {

    ArrayList<Stock> stock = new ArrayList<Stock>();
    public StockAdapter(ArrayList<Stock> stock)
    {
        this.stock = stock;
    }
    @Override
    public StockViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_layout,parent,false);
        StockViewHolder stockViewHolder = new StockViewHolder(view);
        return stockViewHolder;
    }

    @Override
    public void onBindViewHolder(StockViewHolder holder, int position) {

        Stock sto = stock.get(position);
        holder.stock_image.setImageResource(sto.getImage_id());
        holder.stock_name.setText(sto.getName());
    }

    @Override
    public int getItemCount() {
        return stock.size();
    }

    public static class StockViewHolder extends RecyclerView.ViewHolder
    {
        ImageView stock_image;
        TextView stock_name;
        public StockViewHolder(View view)
        {
            super(view);
            stock_image = (ImageView)view.findViewById(R.id.stock_image);
            stock_name = (TextView)view.findViewById(R.id.stock_name);
        }
    }
}
